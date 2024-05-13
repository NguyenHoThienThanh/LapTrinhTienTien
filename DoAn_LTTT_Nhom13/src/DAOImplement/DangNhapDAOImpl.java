/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IDangNhapDAO;
import Models.DangNhapModel;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        String query = "SELECT * FROM DangNhap where Quyen = 'user' order by ID ASC";
        List<DangNhapModel> listDangNhap = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DangNhapModel dangNhap = new DangNhapModel();
                dangNhap.setID(rs.getInt(1));
                dangNhap.setQuyen(rs.getString(2));
                dangNhap.setTenDangNhap(rs.getString(3));
                dangNhap.setMatKhau(rs.getString(4));
                dangNhap.setEmail(rs.getString(5));
                dangNhap.setVerifyCode(rs.getString(6));
                dangNhap.setTrangThai(rs.getInt(7));
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
        String query = "SELECT * FROM DangNhap WHERE TenDangNhap =? and TrangThai = 1";
        DangNhapModel dangNhap = new DangNhapModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()) {
                dangNhap.setID(rs.getInt(1));
                dangNhap.setQuyen(rs.getString(2));
                dangNhap.setTenDangNhap(rs.getString(3));
                dangNhap.setMatKhau(rs.getString(4));
                dangNhap.setEmail(rs.getString(5));
                dangNhap.setVerifyCode(rs.getString(6));
                dangNhap.setTrangThai(rs.getInt(7));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dangNhap;
    }

    @Override
    public boolean insert(DangNhapModel dangNhap) {
        String query = "INSERT INTO DangNhap (Quyen, TenDangNhap, MatKhau, Email, VerifyCode, TrangThai) VALUES (?,?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, dangNhap.getQuyen());
            ps.setString(2, dangNhap.getTenDangNhap());
            ps.setString(3, dangNhap.getMatKhau());
            ps.setString(4, dangNhap.getEmail());
            ps.setString(5, dangNhap.getVerifyCode());
            ps.setInt(6, dangNhap.getTrangThai());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(DangNhapModel dangNhap) {
        String query = "UPDATE DangNhap SET Quyen = ?, TenDangNhap=?, MatKhau=?, TrangThai=? WHERE TenDangNhap =?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, dangNhap.getQuyen());
            ps.setString(2, dangNhap.getTenDangNhap());
            ps.setString(3, dangNhap.getMatKhau());
            ps.setInt(4, dangNhap.getTrangThai());
            ps.setString(5, dangNhap.getTenDangNhap());
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

    @Override
    public String generateVerifyCode() {
        DecimalFormat df = new DecimalFormat("000000");
        Random ran = new Random();
        String code = df.format(ran.nextInt(1000000));
        while (checkDuplicateCode(code)) {
            code = df.format(ran.nextInt(1000000));
        }
        return code;
    }

    @Override
    public boolean checkDuplicateCode(String verifyCode) {
        boolean duplicate = false;
        String query = "select TenDangNhap from DangNhap where VerifyCode = ? limit 1";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, verifyCode);
            rs = ps.executeQuery();
            if (rs.first()) {
                duplicate = true;
            }
            conn.close();
        } catch (Exception e) {
        }
        return duplicate;
    }

    @Override
    public boolean checkDuplicateEmail(String user) {
        boolean duplicate = false;
        String query = "select TenDangNhap from DangNhap where Email = ? and TrangThai = 1 limit 1";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            if (rs.first()) {
                duplicate = true;
            }
            conn.close();
        } catch (Exception e) {
        }
        return duplicate;
    }

    @Override
    public boolean doneVerify(String tenDangNhap) throws SQLException, Exception {
        String query = "UPDATE DangNhap SET VerifyCode = '', TrangThai= 1 WHERE TenDangNhap =?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tenDangNhap);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean verifyCodeWithUser(String tenDangNhap, String code) throws SQLException, Exception {
        boolean verify = false;
        String query = "select * from DangNhap where TenDangNhap = ? and VerifyCode = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tenDangNhap);
            ps.setString(2, code);
            rs = ps.executeQuery(); // Thực hiện truy vấn
            while (rs.next()) {
                verify = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close(); // Đóng ResultSet
            }
            if (ps != null) {
                ps.close(); // Đóng PreparedStatement
            }
            if (conn != null) {
                conn.close(); // Đóng Connection
            }
        }
        return verify;
    }

    @Override
    public DangNhapModel findOneByEmail(String email) {
        String query = "select * from DangNhap where Email = ? and TrangThai = 1";
        DangNhapModel dangNhap = new DangNhapModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                dangNhap.setID(rs.getInt(1));
                dangNhap.setQuyen(rs.getString(2));
                dangNhap.setTenDangNhap(rs.getString(3));
                dangNhap.setMatKhau(rs.getString(4));
                dangNhap.setEmail(rs.getString(5));
                dangNhap.setVerifyCode(rs.getString(6));
                dangNhap.setTrangThai(rs.getInt(7));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dangNhap;
    }

}
