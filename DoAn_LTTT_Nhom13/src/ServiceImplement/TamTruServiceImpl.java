/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.TamTruDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.ITamTruDAO;
import InterfaceService.ITamTruService;
import Models.DonTamTru;
import Models.TamTruModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TamTruServiceImpl implements ITamTruService {

    ITamTruDAO tamTruDAO = new TamTruDAOImpl();

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<TamTruModel> findAll() {
        return tamTruDAO.findAll();
    }

    @Override
    public TamTruModel findOne(String maTT) {
        return tamTruDAO.findOne(maTT);
    }

    @Override
    public boolean insert(TamTruModel model) {
        return tamTruDAO.insert(model);
    }

    @Override
    public boolean update(TamTruModel model) {
        TamTruModel tt = tamTruDAO.findOne(model.getMaTT());
        tt.setID(model.getID());
        tt.setMaTT(model.getMaTT());
        tt.setCCCD(model.getCCCD());
        tt.setNgaydk(model.getNgaydk());
        tt.setNoidk(model.getNoidk());
        tt.setNgayden(model.getNgayden());
        tt.setNgaydi(model.getNgaydi());
        tt.setLydo(model.getLydo());
        tt.setTrangThai(model.getTrangThai());
        return tamTruDAO.update(tt);
    }

    @Override
    public boolean delete(String maTT) {
        return tamTruDAO.delete(maTT);
    }

    @Override
    public List<DonTamTru> findAllTT(String CCCD) {
        String query = "select * from Tamtru join CongDan on Tamtru.Cccd = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS Where TamTru.TrangThai = 1 and Tamtru.Cccd = ?";
        List<DonTamTru> listDonTamTru = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                DonTamTru dtt = new DonTamTru();
                dtt.setMaTT(rs.getString("MaTT"));
                dtt.setHoTen(rs.getString("HoTen"));
                dtt.setNgaySinh(rs.getDate("NgaySinh"));
                dtt.setCCCD(rs.getString("Cccd"));
                dtt.setNoiCap(rs.getString("NcCccd"));
                dtt.setNgayCap(rs.getDate("NgcCccd"));
                dtt.setNgayDen(rs.getDate("Ngayden"));
                dtt.setNgayDi(rs.getDate("Ngaydi"));
                dtt.setNgayDk(rs.getDate("Ngaydk"));
                dtt.setLiDo(rs.getString("Lydo"));
                dtt.setNoiDangKy(rs.getString("NoiDk"));
                listDonTamTru.add(dtt);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listDonTamTru;
    }

    @Override
    public int ifExists(String CCCD) {
        String query = "select count(*) as SoLuong  "
                + "from Tamtru where Cccd = ?  "
                + "and TrangThai = 1";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, CCCD);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("SoLuong");
                } else {
                    return 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    @Override
    public List<TamTruModel> findAllChuaDuyet() {
        String query = "select Tamtru.ID, Tamtru.MaTT, Tamtru.CCCD, Tamtru.Ngaydk, Tamtru.Noidk, Tamtru.Ngayden, Tamtru.Ngaydi, Tamtru.Lydo, Tamtru.TrangThai, CongDan.HoTen, KhaiSinh.NgaySinh, KhaiSinh.GioiTinh, CongDan.NcCccd, CongDan.NgcCccd, CongDan.SDT, CongDan.Email from Tamtru  join CongDan  on Tamtru.Cccd = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS join (select datediff(day, Tamtru.Ngaydk, GETDATE()) as Han, MaTT as Ma from Tamtru)Q on Tamtru.MaTT = Q.Ma Where Tamtru.TrangThai = 2 and Han <= 730 order by Tamtru.ID ASC";
        List<TamTruModel> listTamTru = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                TamTruModel tamTru = new TamTruModel();
                tamTru.setID(rs.getInt(1));
                tamTru.setMaTT(rs.getString(2));
                tamTru.setCCCD(rs.getString(3));
                tamTru.setNgaydk(rs.getDate(4));
                tamTru.setNoidk(rs.getString(5));
                tamTru.setNgayden(rs.getDate(6));
                tamTru.setNgaydi(rs.getDate(7));
                tamTru.setLydo(rs.getString(8));
                tamTru.setTrangThai(rs.getInt(9));
                tamTru.setHoTen(rs.getString(10));
                tamTru.setNgaySinh(rs.getDate(11));
                tamTru.setGioiTinh(rs.getString(12));
                tamTru.setNcCccd(rs.getString(13));
                tamTru.setNgcCccd(rs.getDate(14));
                tamTru.setSDT(rs.getString(15));
                tamTru.setEmail(rs.getString(16));
                listTamTru.add(tamTru);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTamTru;
    }

    @Override
    public TamTruModel findOneChuaDuyet(String maTT) {
        TamTruModel tamTru = new TamTruModel();
        String query = "select * from TamTru where MaTT=? and TrangThai =2";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maTT);
            rs = ps.executeQuery();
            while (rs.next()) {
                tamTru.setID(rs.getInt(1));
                tamTru.setMaTT(rs.getString(2));
                tamTru.setCCCD(rs.getString(3));
                tamTru.setNgaydk(rs.getDate(4));
                tamTru.setNoidk(rs.getString(5));
                tamTru.setNgayden(rs.getDate(6));
                tamTru.setNgaydi(rs.getDate(7));
                tamTru.setLydo(rs.getString(8));
                tamTru.setTrangThai(rs.getInt(9));
            }
            conn.close();
        } catch (Exception ex) {

        }
        return tamTru;
    }
}
