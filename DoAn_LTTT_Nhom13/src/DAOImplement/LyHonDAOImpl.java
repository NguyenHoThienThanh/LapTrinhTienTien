/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.ILyHonDAO;
import Models.DonChungNhanKetHon;
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
        String query = "SELECT lh.MaLh, lh.MaCnkh, lh.CccdNguoiNopDon, cd1.HoTen AS HoTenNguoiNopDon, cnkh.CccdVo, cd2.HoTen AS HoTenVo, cnkh.CccdChong, cd3.HoTen AS HoTenChong, lh.Ngaydk, lh.Noidk, lh.Lydo, lh.TrangThai FROM Lyhon lh JOIN Cnkh cnkh ON lh.MaCnkh = cnkh.MaCnkh JOIN CongDan cd1 ON lh.CccdNguoiNopDon = cd1.CCCD JOIN CongDan cd2 ON cnkh.CccdVo = cd2.CCCD JOIN CongDan cd3 ON cnkh.CccdChong = cd3.CCCD where lh.TrangThai = 1";
        List<LyHonModel> listLyHon = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
            LyHonModel lyHon = new LyHonModel(
                rs.getString("MaLh"),
                rs.getString("MaCnkh"),
                rs.getString("CccdNguoiNopDon"),
                rs.getString("HoTenNguoiNopDon"),
                rs.getString("CccdVo"),
                rs.getString("HoTenVo"),
                rs.getString("CccdChong"),
                rs.getString("HoTenChong"),
                rs.getDate("Ngaydk"),
                rs.getString("Noidk"),
                rs.getString("Lydo"),
                rs.getInt("TrangThai"));
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
    public LyHonModel findOneByMaCNKH(String MaCnkh) {
        String query = "SELECT * FROM Lyhon WHERE MaCnkh = ?";
        LyHonModel lyHon = new LyHonModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaCnkh);
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
    public DonChungNhanKetHon findOneByMaKH(String MaKH) {
        String query = "SELECT Cnkh.MaCnkh, Cnkh.CccdVo, Vo.HoTen AS HoTenVo, Cnkh.CccdChong, Chong.HoTen AS HoTenChong FROM Cnkh JOIN CongDan AS Vo ON Cnkh.CccdVo = Vo.CCCD JOIN CongDan AS Chong ON Cnkh.CccdChong = Chong.CCCD WHERE MaCnkh=? and Cnkh.TrangThai=1";
        DonChungNhanKetHon cnkh = new DonChungNhanKetHon();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaKH);
            rs = ps.executeQuery();
            while (rs.next()) {
                cnkh.setMaCnkh(rs.getString(1));
                cnkh.setCCCDVo(rs.getString(2));
                cnkh.setHoTenVo(rs.getString(3));
                cnkh.setCCCDChong(rs.getString(4));
                cnkh.setHoTenChong(rs.getString(5));
            }
            conn.close();
        } catch (Exception e) {

        }
        return cnkh;
    }

    @Override
    public boolean insert(LyHonModel lyHon) {
        String query = "insert into Lyhon(MaCnkh, CccdNguoiNopDon, Noidk, Ngaydk, Lydo, TrangThai) values(?,?,?,?,?,?)";
        //String query2 = "update Cnkh set TrangThai=0 where MaCnkh=?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            //ps = conn.prepareStatement(query2);
            ps.setString(1, lyHon.getMaCnkh());
            ps.setString(2, lyHon.getCCCDNguoiNopDon());
            ps.setString(3, lyHon.getNoidk());
            ps.setDate(4,(Date) lyHon.getNgaydk());
            ps.setString(5, lyHon.getLydo());
            ps.setInt(6, lyHon.getTrangThai());
            //ps.setString(7, lyHon.getMaCnkh());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(LyHonModel lyHon) {
       String query = "UPDATE Lyhon SET Noidk = ?, Ngaydk = ?, Lydo = ? WHERE MaLh = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, lyHon.getNoidk());
            ps.setDate(2,(Date) lyHon.getNgaydk());
            ps.setString(3, lyHon.getLydo());
            ps.setString(4, lyHon.getMaLh());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaLH) {
        String query = "UPDATE Lyhon SET TrangThai=0 WHERE MaLh = ?";
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
