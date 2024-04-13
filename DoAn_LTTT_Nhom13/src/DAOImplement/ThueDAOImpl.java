/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IThueDAO;
import Models.ThueModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUAN
 */
public class ThueDAOImpl implements IThueDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<ThueModel> findAll() {
        String query = "select Thue.ID, Masothue, HoTen, Coquanthue, SoCMT_CCCD, Ngaythaydoithongtingannhat, Thue.TrangThai from Thue "
                + "inner join CongDan on SoCMT_CCCD = CCCD "
                + "and Thue.TrangThai = 1 "
                + "order by Thue.ID ASC";
        List<ThueModel> listThue = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ThueModel thue = new ThueModel();
                thue.setID(rs.getInt(1));
                thue.setMasothue(rs.getString(2));
                thue.setHoten(rs.getString(3));
                thue.setCoquanthue(rs.getString(4));
                thue.setSoCMT_CCCD(rs.getString(5));
                thue.setNgaythaydoithongtingannhat(rs.getDate(6));
                thue.setTrangThai(rs.getInt(7));
                listThue.add(thue);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThue;
    }

    @Override
    public ThueModel findOneByMaSoThue(String MaSoThue) {
        String query = "SELECT * FROM Thue WHERE Masothue = ?";
        ThueModel thue = new ThueModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaSoThue);
            rs = ps.executeQuery();
            while (rs.next()) {
                thue.setID(rs.getInt(1));
                thue.setMasothue(rs.getString(2));
                thue.setCoquanthue(rs.getString(3));
                thue.setSoCMT_CCCD(rs.getString(4));
                thue.setNgaythaydoithongtingannhat(rs.getDate(5));
                thue.setTrangThai(rs.getInt(6));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return thue;
    }

    @Override
    public boolean insert(ThueModel thue) {
        String query = "INSERT INTO Thue (Coquanthue, SoCMT_CCCD, Ngaythaydoithongtingannhat, TrangThai) VALUES (?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, thue.getCoquanthue());
            ps.setString(2, thue.getSoCMT_CCCD());
            ps.setDate(3, (Date) thue.getNgaythaydoithongtingannhat());
            ps.setInt(4, thue.getTrangThai());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(ThueModel thue) {
        String query = "UPDATE Thue SET Coquanthue=?, SoCMT_CCCD=?, Ngaythaydoithongtingannhat =? , TrangThai =? WHERE Masothue = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, thue.getCoquanthue());
            ps.setString(2, thue.getSoCMT_CCCD());
            ps.setDate(3, (Date) thue.getNgaythaydoithongtingannhat());
            ps.setInt(4, thue.getTrangThai());
            ps.setString(5, thue.getMasothue());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaSoThue) {
        String query = "DELETE Thue WHERE Masothue = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaSoThue);
            ps.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
