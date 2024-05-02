/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.QuanHeDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.IQuanHeDAO;
import InterfaceService.IQuanHeService;
import Models.QuanHeModel;
import Models.ThongTinHoKhau;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanHeServiceImpl implements IQuanHeService {

    IQuanHeDAO quanHeDAO = new QuanHeDAOImpl();

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<QuanHeModel> findAll() {
        return quanHeDAO.findAll();
    }

    @Override
    public QuanHeModel findOneByMaHK(String MaHK, String KhaiSinhNguoiThamGia) {
        return quanHeDAO.findOneByMaHK(MaHK, KhaiSinhNguoiThamGia);
    }

    @Override
    public boolean insert(QuanHeModel quanHe) {
        return quanHeDAO.insert(quanHe);
    }

    @Override
    public boolean update(QuanHeModel quanHe) {
        QuanHeModel qh = quanHeDAO.findOneByMaHK(quanHe.getMaHK(), quanHe.getKhaiSinhNguoiThamGia());
        qh.setMaHK(quanHe.getMaHK());
        qh.setKhaiSinhNguoiThamGia(quanHe.getKhaiSinhNguoiThamGia());
        qh.setQuanHeVoiChuHo(quanHe.getQuanHeVoiChuHo());
        qh.setTrangThai(quanHe.getTrangThai());
        return quanHeDAO.update(quanHe);
    }

    @Override
    public boolean delete(String MaHK) {
        return quanHeDAO.delete(MaHK);
    }

    @Override
    public QuanHeModel findOneByCCCD(String CCCD) {
        String query = "select MaHK, KhaiSinhNguoiThamGia, QuanHeVoiChuHo, QuanHe.TrangThai from QuanHe\n"
                + "inner join KhaiSinh on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia\n"
                + "inner join CongDan on CongDan.MaKS = KhaiSinh.MaKS\n"
                + "inner join GiayChungTu on CongDan.CCCD = GiayChungTu.CCCD\n"
                + "and GiayChungTu.CCCD = ?";
        QuanHeModel quanHe = new QuanHeModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                quanHe.setMaHK(rs.getString(1));
                quanHe.setKhaiSinhNguoiThamGia(rs.getString(2));
                quanHe.setQuanHeVoiChuHo(rs.getString(3));
                quanHe.setTrangThai(rs.getInt(4));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return quanHe;
    }

    @Override
    public boolean deleteByMaHK(String MaHK, String KhaiSinhNguoiThamGia) {
        String query = "update QuanHe set TrangThai = 0 WHERE MaHK= ? and KhaiSinhNguoiThamGia = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaHK);
            ps.setString(2, KhaiSinhNguoiThamGia);
            ps.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    @Override
    public List<ThongTinHoKhau> findAllByMaHK(String MaHK) {
        String query = "SELECT * FROM QuanHe WHERE MaHK =? ";
        List<ThongTinHoKhau> list = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaHK);
            rs = ps.executeQuery();
            while (rs.next()) {
                ThongTinHoKhau quanHe = new ThongTinHoKhau();
                quanHe.setQuanHeID(rs.getString(1));
                quanHe.setMaHoKhau(rs.getString(2));
                quanHe.setKhaiSinhNguoiThamGia(rs.getString(3));
                quanHe.setQuanHeVoiChuHo(rs.getString(4));
                quanHe.setTrangThai(rs.getInt(5));
                list.add(quanHe);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
