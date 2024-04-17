/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.ITamVangDAO;
import Models.DonTamVangUser;
import Models.TamVangModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUAN
 */
public class TamVangDAOImpl implements ITamVangDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

   @Override
    public List<TamVangModel> findAll() {
        String query = "SELECT Tamvang.ID, MaTV, Tamvang.CCCD, Tamvang.Ngaydk, Ncdi, Ncden, Ngaydi, Ngayve, Lydo, Tamvang.TrangThai, HoTen, NgaySinh, CongDan.NgcCccd, CongDan.NcCccd FROM Tamvang "
                + "INNER JOIN CongDan ON Tamvang.CCCD = CongDan.CCCD "
                + "INNER JOIN KhaiSinh ON CongDan.MaKS = KhaiSinh.MaKS "
                + "AND Tamvang.TrangThai = 1 ORDER BY Tamvang.ID ASC";
        List<TamVangModel> listTamVang = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                TamVangModel tamVang = new TamVangModel();
                tamVang.setID(rs.getInt(1));
                tamVang.setMaTV(rs.getString(2));
                tamVang.setCCCD(rs.getString(3));
                tamVang.setNgaydk(rs.getDate(4));
                tamVang.setNcdi(rs.getString(5));
                tamVang.setNcden(rs.getString(6));
                tamVang.setNgaydi(rs.getDate(7));
                tamVang.setNgayve(rs.getDate(8));
                tamVang.setLydo(rs.getString(9));
                tamVang.setTrangThai(rs.getInt(10));
                tamVang.setHoTen(rs.getString(11));
                tamVang.setNgaySinh(rs.getDate(12));
                tamVang.setNgayCapCCCD(rs.getDate(13));
                tamVang.setNoiCapCCCD(rs.getString(14));
                listTamVang.add(tamVang);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listTamVang;
    }

    @Override
    public TamVangModel findOneByMaTV(String MaTV) {
        String query = "SELECT * FROM Tamvang WHERE MaTV = ?";
        TamVangModel tamVang = new TamVangModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaTV);
            rs = ps.executeQuery();
            while (rs.next()) {
                tamVang.setID(rs.getInt(1));
                tamVang.setMaTV(rs.getString(2));
                tamVang.setCCCD(rs.getString(3));
                tamVang.setNgaydk(rs.getDate(4));
                tamVang.setNcdi(rs.getString(5));
                tamVang.setNcden(rs.getString(6));
                tamVang.setNgaydi(rs.getDate(7));
                tamVang.setNgayve(rs.getDate(8));
                tamVang.setLydo(rs.getString(9));
                tamVang.setTrangThai(rs.getInt(10));
            }
            conn.close();
        } catch (Exception e) {

        }
        return tamVang;
    }

    @Override
    public boolean insert(TamVangModel tamVang) {
        String query = "INSERT INTO Tamvang (CCCD, Ngaydk, Ncden, Ncdi , Ngaydi, Ngayve, Lydo, TrangThai) VALUES(?,?,?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tamVang.getCCCD());
            ps.setDate(2, (Date) tamVang.getNgaydk());
            ps.setString(3, tamVang.getNcden());
            ps.setString(4, tamVang.getNcdi());
            ps.setDate(5, (Date) tamVang.getNgaydi());
            ps.setDate(6, (Date) tamVang.getNgayve());
            ps.setString(7, tamVang.getLydo());
            ps.setInt(8, tamVang.getTrangThai());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(TamVangModel tamVang) {
        String query = "UPDATE Tamvang SET CCCD =?, Ngaydk =?, Ncdi=?, Ncden=?, Ngaydi=?, Ngayve=?, Lydo=?, TrangThai=? WHERE MaTV = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tamVang.getCCCD());
            ps.setDate(2, (Date) tamVang.getNgaydk());
            ps.setString(3, tamVang.getNcdi());
            ps.setString(4, tamVang.getNcden());
            ps.setDate(5, (Date) tamVang.getNgaydi());
            ps.setDate(6, (Date) tamVang.getNgayve());
            ps.setString(7, tamVang.getLydo());
            ps.setInt(8, tamVang.getTrangThai());
            ps.setString(9, tamVang.getMaTV());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaTV) {
        String query = "UPDATE Tamvang SET TrangThai = 0 WHERE MaTV = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaTV);
            ps.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean insertUser(DonTamVangUser tamVang) {
        String query = "INSERT INTO Tamvang (CCCD, Ngaydk, Ncdi, Ncden, Ngaydi, Ngayve, Lydo, TrangThai) VALUES(?,?,?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tamVang.getCCCD());
            ps.setDate(2, new java.sql.Date(tamVang.getNgayDk().getTime()));
            ps.setString(3, tamVang.getNoiChuyenDi());
            ps.setString(4, tamVang.getNoiChuyenDen());
            ps.setDate(5, new java.sql.Date(tamVang.getNgayDi().getTime()));
            ps.setDate(6, new java.sql.Date(tamVang.getNgayVe().getTime()));
            ps.setString(7, tamVang.getLydo());
            ps.setInt(8,1);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
