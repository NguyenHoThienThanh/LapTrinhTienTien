/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IQuanHeDAO;
import Models.QuanHeModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUAN
 */
public class QuanHeDAOImpl implements IQuanHeDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<QuanHeModel> findAll() {
        String query = "SELECT * FROM QuanHe WHERE TrangThai = 1 ";
        List<QuanHeModel> listQuanHe = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                QuanHeModel quanHe = new QuanHeModel();
                quanHe.setMaHK(rs.getString(1));
                quanHe.setKhaiSinhNguoiThamGia(rs.getString(2));
                quanHe.setQuanHeVoiChuHo(rs.getString(3));
                quanHe.setTrangThai(rs.getInt(4));
                listQuanHe.add(quanHe);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listQuanHe;
    }

    @Override
    public QuanHeModel findOneByMaHK(String MaHK, String KhaiSinhNguoiThamGia) {
        String query = "SELECT * FROM QuanHe WHERE MaHK =? ";
        QuanHeModel quanHe = new QuanHeModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaHK);
            ps.setString(2, KhaiSinhNguoiThamGia);
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
    public boolean insert(QuanHeModel quanHe) {
        String query = "INSERT INTO QuanHe (MaHK, KhaiSinhNguoiThamGia, QuanHeVoiChuHo, TrangThai) VALUES (?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, quanHe.getMaHK());
            ps.setString(2, quanHe.getKhaiSinhNguoiThamGia());
            ps.setString(3, quanHe.getQuanHeVoiChuHo());
            ps.setInt(4, quanHe.getTrangThai());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(QuanHeModel quanHe) {
        String query = "UPDATE QuanHe SET QuanHeVoiChuHo=?, TrangThai=? WHERE MaHK =? AND KhaiSinhNguoiThamGia=?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, quanHe.getQuanHeVoiChuHo());
            ps.setInt(2, quanHe.getTrangThai());
            ps.setString(3, quanHe.getMaHK());
            ps.setString(4, quanHe.getKhaiSinhNguoiThamGia());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaHK) {
        String query = "DELETE QuanHe WHERE MaHK= ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaHK);
            ps.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
