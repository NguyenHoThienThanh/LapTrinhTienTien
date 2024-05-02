/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IKhaiSinhDAO;
import Models.KhaiSinhModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhaiSinhDAOImpl implements IKhaiSinhDAO{

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public List<KhaiSinhModel> findAll() {
        String query = "select * from KhaiSinh where TrangThai = 1 order by ID";
        List<KhaiSinhModel> listKhaiSinh = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                KhaiSinhModel khaiSinh = new KhaiSinhModel();
                khaiSinh.setID(rs.getInt(1));
                khaiSinh.setMaKS(rs.getString(2));
                khaiSinh.setHoTenKS(rs.getString(3));
                khaiSinh.setGioiTinh(rs.getString(4));
                khaiSinh.setNgaySinh(rs.getDate(5));
                khaiSinh.setNoiSinh(rs.getString(6));
                khaiSinh.setDanToc(rs.getString(7));
                khaiSinh.setQuocTich(rs.getString(8));
                khaiSinh.setQueQuan(rs.getString(9));
                khaiSinh.setCha(rs.getString(10));
                khaiSinh.setMe(rs.getString(11));
                khaiSinh.setNguoiKhaiSinh(rs.getString(12));
                khaiSinh.setQuanHe(rs.getString(13));
                khaiSinh.setNgayDk(rs.getDate(14));
                khaiSinh.setNoiDk(rs.getString(15));
                khaiSinh.setTrangThai(rs.getInt(16));
                listKhaiSinh.add(khaiSinh);
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listKhaiSinh;
    }

    @Override
    public KhaiSinhModel findOne(String maKS) {
        KhaiSinhModel khaiSinh = new KhaiSinhModel();
        String query = "select * from KhaiSinh where MaKS=? and TrangThai = 1";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maKS);
            rs = ps.executeQuery();
            while(rs.next()){
                khaiSinh.setID(rs.getInt(1));
                khaiSinh.setMaKS(rs.getString(2));
                khaiSinh.setHoTenKS(rs.getString(3));
                khaiSinh.setGioiTinh(rs.getString(4));
                khaiSinh.setNgaySinh(rs.getDate(5));
                khaiSinh.setNoiSinh(rs.getString(6));
                khaiSinh.setDanToc(rs.getString(7));
                khaiSinh.setQuocTich(rs.getString(8));
                khaiSinh.setQueQuan(rs.getString(9));
                khaiSinh.setCha(rs.getString(10));
                khaiSinh.setMe(rs.getString(11));
                khaiSinh.setNguoiKhaiSinh(rs.getString(12));
                khaiSinh.setQuanHe(rs.getString(13));
                khaiSinh.setNgayDk(rs.getDate(14));
                khaiSinh.setNoiDk(rs.getString(15));
                khaiSinh.setTrangThai(rs.getInt(16));
            }
            conn.close();
        }catch(Exception ex){
           
        } 
        return khaiSinh;
        
    }

    @Override
    public boolean insert(KhaiSinhModel model) {
        String query = "insert into KhaiSinh(HoTenKS, GioiTinh, NgaySinh, NoiSinh, DanToc, QuocTich, QueQuan, Cha, Me, NguoiKhaiSinh,QuanHe, NgayDk, NoiDk, TrangThai) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, model.getHoTenKS());
            ps.setString(2, model.getGioiTinh());
            ps.setDate(3, (Date) model.getNgaySinh());
            ps.setString(4, model.getNoiSinh());
            ps.setString(5, model.getDanToc());
            ps.setString(6, model.getQuocTich());
            ps.setString(7, model.getQueQuan());
            ps.setString(8, model.getCha());
            ps.setString(9, model.getMe());
            ps.setString(10, model.getNguoiKhaiSinh());
            ps.setString(11, model.getQuanHe());
            ps.setDate(12, (Date) model.getNgayDk());
            ps.setString(13, model.getNoiDk());
            ps.setInt(14, model.getTrangThai());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(KhaiSinhModel model) {
        String query = "update KhaiSinh set HoTenKS=?, GioiTinh=?, NgaySinh=?, NoiSinh=?, DanToc=?, QuocTich=?, QueQuan=?, "
                + "Cha=?, Me=?, NguoiKhaiSinh=?, QuanHe=?, NgayDk=?, NoiDk=?, TrangThai=? where MaKS=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, model.getHoTenKS());
            ps.setString(2, model.getGioiTinh());
            ps.setDate(3, (Date) model.getNgaySinh());
            ps.setString(4, model.getNoiSinh());
            ps.setString(5, model.getDanToc());
            ps.setString(6, model.getQuocTich());
            ps.setString(7, model.getQueQuan());
            ps.setString(8, model.getCha());
            ps.setString(9, model.getMe());
            ps.setString(10, model.getNguoiKhaiSinh());
            ps.setString(11, model.getQuanHe());
            ps.setDate(12, (Date) model.getNgayDk());
            ps.setString(13, model.getNoiDk());
            ps.setInt(14, model.getTrangThai());
            ps.setString(15, model.getMaKS());
            ps.executeUpdate();
            
            conn.close();
        }catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String maKS) {
        String query = "update KhaiSinh set TrangThai = 0 where MaKS = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maKS);
            ps.executeUpdate();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
}
