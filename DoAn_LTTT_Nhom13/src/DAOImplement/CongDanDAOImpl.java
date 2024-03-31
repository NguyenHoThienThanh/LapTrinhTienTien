/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.ICongDanDAO;
import Models.CongDanModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CongDanDAOImpl implements ICongDanDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<CongDanModel> findAll() {
        String query = "select * from CongDan where TrangThai = 1";
        List<CongDanModel> listCongDan = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                CongDanModel congDan = new CongDanModel();
                congDan.setCCCD(rs.getString(1));
                congDan.setHoTen(rs.getString(2));
                congDan.setNcCccd(rs.getString(3));
                congDan.setNgcCccd(rs.getDate(4));
                congDan.setMaKS(rs.getString(5));
                congDan.setSDT(rs.getString(6));
                congDan.setEmail(rs.getString(7));
                congDan.setTrangThai(rs.getInt(8));
                listCongDan.add(congDan);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listCongDan;
    }

    @Override
    public CongDanModel findOne(String CCCD) {
        CongDanModel congDan = new CongDanModel();
        String query = "select * from CongDan where CCCD=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while(rs.next()){
                congDan.setCCCD(rs.getString(1));
                congDan.setHoTen(rs.getString(2));
                congDan.setNcCccd(rs.getString(3));
                congDan.setNgcCccd(rs.getDate(4));
                congDan.setMaKS(rs.getString(5));
                congDan.setSDT(rs.getString(6));
                congDan.setEmail(rs.getString(7));
                congDan.setTrangThai(rs.getInt(8));
            }
            conn.close();
        }catch(Exception ex){
            
        } 
        return congDan;
        
    }

    @Override
    public boolean insert(CongDanModel model) {
        String query = "INSERT INTO CongDan(CCCD, HoTen, NcCccd, NgcCccd, MaKS, SDT, Email, TrangThai) values(?,?,?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, model.getCCCD());
            ps.setString(2, model.getHoTen());
            ps.setString(3, model.getNcCccd());
            ps.setDate(4, (Date) model.getNgcCccd());
            ps.setString(5, model.getMaKS());
            ps.setString(6, model.getSDT());
            ps.setString(7, model.getEmail());
            ps.setInt(8, model.getTrangThai());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(CongDanModel model) {
        String query = "update CongDan set HoTen=?, NcCccd=?, NgcCccd=?, MaKS=?, SDT=?, Email=?, TrangThai=? where CCCD=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, model.getHoTen());
            ps.setString(2, model.getNcCccd());
            ps.setDate(3, (Date) model.getNgcCccd());
            ps.setString(4, model.getMaKS());
            ps.setString(5, model.getSDT());
            ps.setString(6, model.getEmail());
            ps.setInt(7, model.getTrangThai());
            ps.setString(8, model.getCCCD());
            ps.executeUpdate();
            conn.close();
        }catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String CCCD) {
        String query = "Delete CongDan where CCCD = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            ps.executeUpdate();
        }catch(Exception e){
            return false;
        }
        return true;
    }

}