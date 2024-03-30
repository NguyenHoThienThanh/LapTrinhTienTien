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
public class TamTruDAOImpl implements ITamTruDAO{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<TamTruModel> findAll() {
        String query = "select * from TamTru where TrangThai = 1";
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
                listTamTru.add(tamTru);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listTamTru;
    }

    @Override
    public TamTruModel findOne(String maTT) {
        TamTruModel tamTru = new TamTruModel();
        String query = "select * from TamTru where MaTT=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maTT);
            rs = ps.executeQuery();
            while(rs.next()){
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
        }catch(Exception ex){
            
        } 
        return tamTru;
    }

    @Override
    public boolean insert(TamTruModel model) {
        String query = "insert into Tamtru(ID, MaTT, Cccd, Ngaydk, Noidk, Ngayden, Ngaydi, Lydo, TrangThai) values(?,?,?,?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, model.getID());
            ps.setString(2, model.getMaTT());
            ps.setString(3, model.getCCCD());
            ps.setDate(4,(Date) model.getNgaydk());
            ps.setString(5, model.getNoidk());
            ps.setDate(6, (Date) model.getNgayden());
            ps.setDate(7, (Date) model.getNgaydi());
            ps.setString(8, model.getLydo());
            ps.setInt(9, model.getTrangThai());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(TamTruModel model) {
        String query = "update Tamtru set ID=?, MaTT=?, Ngaydk=?, Noidk=?, Ngayden=?, Ngaydi=?, Lydo =?, TrangThai=? where CCCD=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, model.getID());
            ps.setString(2, model.getMaTT());
            ps.setDate(3, (Date) model.getNgaydk());
            ps.setString(4, model.getNoidk());
            ps.setDate(5, (Date) model.getNgayden());
            ps.setDate(6,(Date) model.getNgaydi());
            ps.setString(7, model.getLydo());
            ps.setInt(8, model.getTrangThai());
            ps.setString(9, model.getCCCD());
            ps.executeUpdate();
            conn.close();
        }catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String maTT) {
        return true;
    }
    
}
