/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.ITamTruDAO;
import Models.TamTruModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TamTruDAOImpl implements ITamTruDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<TamTruModel> findAll() {
        String query = "select Tamtru.ID, Tamtru.MaTT, Tamtru.CCCD, Tamtru.Ngaydk, Tamtru.Noidk, Tamtru.Ngayden, Tamtru.Ngaydi, Tamtru.Lydo, Tamtru.TrangThai, CongDan.HoTen, KhaiSinh.NgaySinh, KhaiSinh.GioiTinh, CongDan.NcCccd, CongDan.NgcCccd, CongDan.SDT, CongDan.Email from Tamtru  join CongDan  on Tamtru.Cccd = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS join (select datediff(day, Tamtru.Ngaydk, GETDATE()) as Han, MaTT as Ma from Tamtru)Q on Tamtru.MaTT = Q.Ma Where TamTru.TrangThai = 1 and Han <= 730 order by Tamtru.ID ASC";
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
    public TamTruModel findOne(String maTT) {
        TamTruModel tamTru = new TamTruModel();
        String query = "select * from TamTru where MaTT=?";
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

    @Override
    public boolean insert(TamTruModel tamTru) {
        String query = "INSERT INTO Tamtru(Cccd, Ngaydk, Noidk, Ngayden, Ngaydi, Lydo, TrangThai) VALUES(?,?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tamTru.getCCCD());
            ps.setDate(2, (Date) tamTru.getNgaydk());
            ps.setString(3, tamTru.getNoidk());
            ps.setDate(4, (Date) tamTru.getNgayden());
            ps.setDate(5, (Date) tamTru.getNgaydi());
            ps.setString(6, tamTru.getLydo());
            ps.setInt(7, tamTru.getTrangThai());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(TamTruModel tamTru) {
        String query = "UPDATE Tamtru SET Ngaydk=?, Noidk=?, Ngayden=?, Ngaydi=?, Lydo =?, TrangThai=? WHERE MaTT=?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setDate(1, (Date) tamTru.getNgaydk());
            ps.setString(2, tamTru.getNoidk());
            ps.setDate(3, (Date) tamTru.getNgayden());
            ps.setDate(4, (Date) tamTru.getNgaydi());
            ps.setString(5, tamTru.getLydo());
            ps.setInt(6, tamTru.getTrangThai());
            ps.setString(7, tamTru.getMaTT());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String maTT) {
        String query = "UPDATE Tamtru SET TrangThai = 0 where MaTT =?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maTT);
            ps.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
