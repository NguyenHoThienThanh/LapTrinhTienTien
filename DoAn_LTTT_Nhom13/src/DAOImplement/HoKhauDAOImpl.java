/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IHoKhauDAO;
import Models.HoKhauModel;
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
public class HoKhauDAOImpl implements IHoKhauDAO{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public List<HoKhauModel> findAll() {
        String query = "SELECT * FROM HoKhau WHERE TrangThai = 1";
        List<HoKhauModel> listHoKhau = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                HoKhauModel hoKhau = new HoKhauModel();
                hoKhau.setID(rs.getInt(1));
                hoKhau.setMaHK(rs.getString(2));
                hoKhau.setDiaChi(rs.getString(3));
                hoKhau.setKhaiSinhChuHo(rs.getString(4));
                hoKhau.setTrangThai(rs.getInt(5));
                listHoKhau.add(hoKhau);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listHoKhau;
    }

    @Override
    public HoKhauModel findOneByMaHK(String MaHK) {
        String query = "SELECT * FROM HoKhau WHERE MaHK = ?";
        HoKhauModel hoKhau = new HoKhauModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaHK);
            rs = ps.executeQuery();
            while (rs.next()) {
                hoKhau.setID(rs.getInt(1));
                hoKhau.setMaHK(rs.getString(2));
                hoKhau.setDiaChi(rs.getString(3));
                hoKhau.setKhaiSinhChuHo(rs.getString(4));
                hoKhau.setTrangThai(rs.getInt(5));
            }
            conn.close();
        } catch (Exception e) {

        }
        return hoKhau;
    }

    @Override
    public boolean insert(HoKhauModel hoKhau) {
         String query = "INSERT INTO HoKhau (DiaChi, KhaiSinhChuHo, TrangThai) VALUES (?,?,?) ";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, hoKhau.getDiaChi());
            ps.setString(2, hoKhau.getKhaiSinhChuHo());
            ps.setInt(3, hoKhau.getTrangThai());
            ps.executeUpdate();
        
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(HoKhauModel hoKhau) {
        String query = "UPDATE HoKhau SET DiaChi = ? , KhaiSinhChuHo = ?, TrangThai = ? WHERE MaHK =?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, hoKhau.getDiaChi());
            ps.setString(2, hoKhau.getKhaiSinhChuHo());
            ps.setInt(3, hoKhau.getTrangThai());
            ps.setString(4, hoKhau.getMaHK());
            ps.executeUpdate();
        
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaHK) {
        String query = "DELETE HoKhau WHERE MaHK = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaHK);
            ps.executeUpdate();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
}
