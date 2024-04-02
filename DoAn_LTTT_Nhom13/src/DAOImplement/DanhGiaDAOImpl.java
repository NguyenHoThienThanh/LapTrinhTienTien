/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IDanhGiaDAO;
import Models.DanhGiaModel;
import Models.GiayChungTuModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author TUAN
 */
public class DanhGiaDAOImpl implements IDanhGiaDAO
{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public List<DanhGiaModel> findAll() {
        String query = "SELECT * FROM DanhGia";
        List<DanhGiaModel> listDanhGia = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                DanhGiaModel danhGia = new DanhGiaModel();
                danhGia.setCCCD(rs.getString(1));
                danhGia.setDanhGia(rs.getString(2));
                danhGia.setTongQuan(rs.getInt(3));
                danhGia.setThuanTien(rs.getInt(4));
                danhGia.setDeDang(rs.getInt(5));
                danhGia.setChinhXac(rs.getInt(6));
                danhGia.setTrucQuan(rs.getInt(7));
                listDanhGia.add(danhGia);
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listDanhGia;
    }

    @Override
    public DanhGiaModel findOneByMaDG(String CCCD) {
        String query = "SELECT * FROM DanhGia WHERE CCCD = ?";
        DanhGiaModel danhGia = new DanhGiaModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while(rs.next()){
                danhGia.setCCCD(rs.getString(1));
                danhGia.setDanhGia(rs.getString(2));
                danhGia.setTongQuan(rs.getInt(3));
                danhGia.setThuanTien(rs.getInt(4));
                danhGia.setDeDang(rs.getInt(5));
                danhGia.setChinhXac(rs.getInt(6));
                danhGia.setTrucQuan(rs.getInt(7));
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return danhGia;
    }

    @Override
    public boolean insert(DanhGiaModel danhGia) {
        String query ="INSERT INTO DanhGia (CCCD, DanhGia, TongQuan, ThuanTien, DeDang, ChinhXac, TrucQuan) VALUES (?,?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, danhGia.getCCCD());
            ps.setString(2, danhGia.getDanhGia());
            ps.setInt(3, danhGia.getTongQuan());
            ps.setInt(4, danhGia.getThuanTien());
            ps.setInt(5, danhGia.getDeDang());
            ps.setInt(6, danhGia.getChinhXac());
            ps.setInt(7, danhGia.getTrucQuan());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(DanhGiaModel danhGia) {
        String query ="UPDATE DanhGia SET CCCD = ?, DanhGia =? , TongQuan=?, ThuanTien=?, DeDang=?, ChinhXac=?, TrucQuan=?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, danhGia.getCCCD());
            ps.setString(2, danhGia.getDanhGia());
            ps.setInt(3, danhGia.getTongQuan());
            ps.setInt(4, danhGia.getThuanTien());
            ps.setInt(5, danhGia.getDeDang());
            ps.setInt(6, danhGia.getChinhXac());
            ps.setInt(7, danhGia.getTrucQuan());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String CCCD) {
        String query = "DELETE DanhGia WHERE CCCD = ?";
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
