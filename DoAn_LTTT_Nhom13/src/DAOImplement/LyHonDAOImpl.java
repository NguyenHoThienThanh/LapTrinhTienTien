/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.ILyHonDAO;
import Models.LyHonModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUAN
 */
public class LyHonDAOImpl implements ILyHonDAO{
Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public List<LyHonModel> findAll() {
        String query = "SELECT * FROM Lyhon WHERE TrangThai = 1";
        List<LyHonModel> listLyHon = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                LyHonModel lyHon = new LyHonModel();
                lyHon.setID(rs.getInt(1));
                lyHon.setMaLh(rs.getString(2));
                lyHon.setMaCnkh(rs.getString(3));
                lyHon.setCCCDNguoiNopDon(rs.getString(4));
                lyHon.setNoidk(rs.getString(5));
                lyHon.setNgaydk(rs.getDate(6));
                lyHon.setLydo(rs.getString(7));
                lyHon.setTrangThai(rs.getInt(8));
                listLyHon.add(lyHon);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listLyHon;
    }

    @Override
    public LyHonModel findOneByMaLH(String MaLH) {
        String query = "SELECT * FROM Lyhon WHERE MaLh = ?";
        LyHonModel lyHon = new LyHonModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaLH);
            rs = ps.executeQuery();
            while (rs.next()) {
                lyHon.setID(rs.getInt(1));
                lyHon.setMaLh(rs.getString(2));
                lyHon.setMaCnkh(rs.getString(3));
                lyHon.setCCCDNguoiNopDon(rs.getString(4));
                lyHon.setNoidk(rs.getString(5));
                lyHon.setNgaydk(rs.getDate(6));
                lyHon.setLydo(rs.getString(7));
                lyHon.setTrangThai(rs.getInt(8));
            }
            conn.close();
        } catch (Exception e) {

        }
        return lyHon;
    }

    @Override
    public boolean insert(LyHonModel lyHon) {
        String query = "insert into Lyhon(MaCnkh, CccdNguoiNopDon, Noidk, Ngaydk, Lydo, TrangThai) values(?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, lyHon.getMaCnkh());
            ps.setString(2, lyHon.getCCCDNguoiNopDon());
            ps.setString(3, lyHon.getNoidk());
            ps.setDate(4,(Date) lyHon.getNgaydk());
            ps.setString(5, lyHon.getLydo());
            ps.setInt(6, lyHon.getTrangThai());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(LyHonModel lyHon) {
       String query = "UPDATE Lyhon SET MaCnkh = ?, CccdNguoiNopDon = ?, Noidk = ?, Ngaydk = ?, Lydo = ?, TrangThai = ? WHERE MaLh = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, lyHon.getMaCnkh());
            ps.setString(2, lyHon.getCCCDNguoiNopDon());
            ps.setString(3, lyHon.getNoidk());
            ps.setDate(4,(Date) lyHon.getNgaydk());
            ps.setString(5, lyHon.getLydo());
            ps.setInt(6, lyHon.getTrangThai());
            ps.setString(7, lyHon.getMaLh());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaLH) {
        String query = "DELETE Lyhon WHERE MaLh = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaLH);
            ps.executeUpdate();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
}
