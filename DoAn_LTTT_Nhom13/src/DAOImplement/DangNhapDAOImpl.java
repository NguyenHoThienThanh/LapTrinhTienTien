/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IDangNhapDAO;
import Models.DangNhapModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUAN
 */
public class DangNhapDAOImpl implements IDangNhapDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<DangNhapModel> findAll() {
        String query = "SELECT * FROM DangNhap";
        List<DangNhapModel> listDangNhap = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DangNhapModel dangNhap = new DangNhapModel();
                dangNhap.setQuyen(rs.getString(1));
                dangNhap.setTenDangNhap(rs.getString(2));
                dangNhap.setMatKhau(rs.getString(3));
                dangNhap.setTrangThai(rs.getInt(4));
                listDangNhap.add(dangNhap);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDangNhap;
    }

    @Override
    public DangNhapModel findOne(String userName) {
        String query = "SELECT * FROM DangNhap";
        DangNhapModel dangNhap = new DangNhapModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()) {
                dangNhap.setQuyen(rs.getString(1));
                dangNhap.setTenDangNhap(rs.getString(2));
                dangNhap.setMatKhau(rs.getString(3));
                dangNhap.setTrangThai(rs.getInt(4));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dangNhap;
    }

    @Override
    public boolean insert(DangNhapModel dangNhap) {
        String query = "INSERT INTO DangNhap (Quyen, TenDangNhap, MatKhau, TrangThai) VALUES (?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, dangNhap.getQuyen());
            ps.setString(2, dangNhap.getTenDangNhap());
            ps.setString(3, dangNhap.getMatKhau());
            ps.setInt(4, dangNhap.getTrangThai());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(DangNhapModel dangNhap) {
        String query = "UPDATE DangNhap SET Quyen = ?, TenDangNhap=?, MatKhau=?, TrangThai=?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, dangNhap.getQuyen());
            ps.setString(2, dangNhap.getTenDangNhap());
            ps.setString(3, dangNhap.getMatKhau());
            ps.setInt(4, dangNhap.getTrangThai());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String userName) {
        String query = "DELETE DangNhap WHERE TenDangNhap = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            ps.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
