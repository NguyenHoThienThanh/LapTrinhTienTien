/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IGiayChungTuDAO;
import Models.GiayChungTuModel;
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
public class GiayChungTuDAOImpl implements IGiayChungTuDAO{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public List<GiayChungTuModel> findAll() {
        String query = "select * from GiayChungTu where TrangThai = 1";
        List<GiayChungTuModel> listGiayChungTu = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                GiayChungTuModel giayChungTu = new GiayChungTuModel();
                giayChungTu.setID(rs.getInt(1));
                giayChungTu.setMaCT(rs.getString(2));
                giayChungTu.setCCCD(rs.getString(3));
                giayChungTu.setNgayMat(rs.getDate(4));
                giayChungTu.setNoiMat(rs.getString(5));
                giayChungTu.setNguyenNhan(rs.getString(6));
                giayChungTu.setTrangThai(rs.getInt(7));
                listGiayChungTu.add(giayChungTu);
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listGiayChungTu;
    }
    
    
    @Override
    public GiayChungTuModel findOneByMaCT (String MaCT){
        String query = "select * from GiayChungTu where MaCT =? ";
        GiayChungTuModel giayChungTu = new GiayChungTuModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaCT);
            rs = ps.executeQuery();
            while(rs.next()){
                giayChungTu.setID(rs.getInt(1));
                giayChungTu.setMaCT(rs.getString(2));
                giayChungTu.setCCCD(rs.getString(3));
                giayChungTu.setNgayMat(rs.getDate(4));
                giayChungTu.setNoiMat(rs.getString(5));
                giayChungTu.setNguyenNhan(rs.getString(6));
                giayChungTu.setTrangThai(rs.getInt(7));
                
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return giayChungTu;
    }

    @Override
    public boolean insert(GiayChungTuModel giayChungTu) {
        String query ="INSERT INTO GiayChungTu (CCCD, NgayMat, NoiMat, NguyenNhan, TrangThai) VALUES (?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, giayChungTu.getCCCD());
            ps.setDate(2, (Date) giayChungTu.getNgayMat());
            ps.setString(3, giayChungTu.getNoiMat());
            ps.setString(4, giayChungTu.getNguyenNhan());
            ps.setInt(5, giayChungTu.getTrangThai());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(GiayChungTuModel giayChungTu) {
        String query ="UPDATE GiayChungTu SET CCCD = ?, NgayMat = ?, NoiMat = ?, NguyenNhan = ?, TrangThai = ? WHERE MaCT = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, giayChungTu.getCCCD());
            ps.setDate(2, (Date) giayChungTu.getNgayMat());
            ps.setString(3, giayChungTu.getNoiMat());
            ps.setString(4, giayChungTu.getNguyenNhan());
            ps.setInt(5, giayChungTu.getTrangThai());
            ps.setString(6, giayChungTu.getMaCT());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaCT) {
        String query = "DELETE GiayChungTu WHERE MaCT = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaCT);
            ps.executeUpdate();
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
