/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IChungNhanKetHon;
import Models.ChungNhanKetHonModel;
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
public class ChungNhanKetHonDAOImpl implements IChungNhanKetHon{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public List<ChungNhanKetHonModel> findAll() {
        String query = "SELECT * FROM Cnkh WHERE TrangThai = 1";
        List<ChungNhanKetHonModel> listChungNhanKetHon = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChungNhanKetHonModel chungNhanKetHon = new ChungNhanKetHonModel();
                chungNhanKetHon.setID(rs.getInt(1));
                chungNhanKetHon.setMaCnkh(rs.getString(2));
                chungNhanKetHon.setCCCDVo(rs.getString(3));
                chungNhanKetHon.setCCCDChong(rs.getString(4));
                chungNhanKetHon.setNoidk(rs.getString(5));
                chungNhanKetHon.setNgaydk(rs.getDate(6));
                chungNhanKetHon.setTrangThai(rs.getInt(7));
                listChungNhanKetHon.add(chungNhanKetHon);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listChungNhanKetHon;
    }

    @Override
    public ChungNhanKetHonModel findOneByMaKH(String MaKH) {
        ChungNhanKetHonModel chungNhanKetHon = new ChungNhanKetHonModel();
        String query = "select * from TamTru where MaCnkh=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaKH);
            rs = ps.executeQuery();
            while(rs.next()){
                chungNhanKetHon.setID(rs.getInt(1));
                chungNhanKetHon.setMaCnkh(rs.getString(2));
                chungNhanKetHon.setCCCDVo(rs.getString(3));
                chungNhanKetHon.setCCCDChong(rs.getString(4));
                chungNhanKetHon.setNoidk(rs.getString(5));
                chungNhanKetHon.setNgaydk(rs.getDate(6));
                chungNhanKetHon.setTrangThai(rs.getInt(7));
            }
            conn.close();
        }catch(Exception ex){
            
        } 
        return chungNhanKetHon;
    }

    @Override
    public boolean insert(ChungNhanKetHonModel chungNhanKetHon) {
        String query = "insert into Cnkh(CccdVo, CccdChong, Noidk, Ngaydk, TrangThai) values(?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, chungNhanKetHon.getCCCDVo());
            ps.setString(2, chungNhanKetHon.getCCCDChong());
            ps.setString(3, chungNhanKetHon.getNoidk());
            ps.setDate(4,(Date) chungNhanKetHon.getNgaydk());
            ps.setInt(5, chungNhanKetHon.getTrangThai());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(ChungNhanKetHonModel chungNhanKetHon) {
        String query = "UPDATE Cnkh SET CccdVo =?, CccdChong =?, Noidk=?, Ngaydk=?, TrangThai=? WHERE MaCnkh = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, chungNhanKetHon.getCCCDVo());
            ps.setString(2, chungNhanKetHon.getCCCDChong());
            ps.setString(3, chungNhanKetHon.getNoidk());
            ps.setDate(4,(Date) chungNhanKetHon.getNgaydk());
            ps.setInt(5, chungNhanKetHon.getTrangThai());
            ps.setString(6, chungNhanKetHon.getMaCnkh());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaKH) {
        String query = "DELETE Cnkh WHERE MaCnkh = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaKH);
            ps.executeUpdate();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
}
