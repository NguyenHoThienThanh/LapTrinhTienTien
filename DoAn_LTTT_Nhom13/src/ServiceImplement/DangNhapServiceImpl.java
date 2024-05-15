/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.DangNhapDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.IDangNhapDAO;
import InterfaceService.IDangNhapService;
import Models.DangNhapModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DangNhapServiceImpl implements IDangNhapService {

    IDangNhapDAO dangNhapDAO = new DangNhapDAOImpl();
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<DangNhapModel> findAll() {
        return dangNhapDAO.findAll();
    }

    @Override
    public DangNhapModel findOne(String userName) {
        return dangNhapDAO.findOne(userName);
    }

    @Override
    public boolean insert(DangNhapModel dangNhap) {
        return dangNhapDAO.insert(dangNhap);
    }

    @Override
    public boolean update(DangNhapModel dangNhap) {
        DangNhapModel dn = dangNhapDAO.findOne(dangNhap.getTenDangNhap());
        dn.setQuyen(dangNhap.getQuyen());
        dn.setMatKhau(dangNhap.getMatKhau());
        dn.setTrangThai(dangNhap.getTrangThai());
        return dangNhapDAO.update(dn);
    }

    @Override
    public boolean delete(String userName) {
        return dangNhapDAO.delete(userName);
    }

    @Override
    public boolean isUsernameExists(String username) {
        // Lấy thông tin người dùng từ cơ sở dữ liệu bằng cách gọi phương thức findOne
        DangNhapModel user = dangNhapDAO.findOne(username);
        // Nếu thông tin người dùng không null, tức là tên đăng nhập đã tồn tại
        if (user.getTenDangNhap() != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isPasswordExists(String username, String password) {
        DangNhapModel user = dangNhapDAO.findOne(username);
        if (user.getTenDangNhap() != null && user.getMatKhau() != null && user.getMatKhau().trim().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        IDangNhapDAO dn = new DangNhapDAOImpl();
        DangNhapModel model = new DangNhapModel();
        System.out.println(String.valueOf(dn.doneVerify("083203011806")));
        
    }

    @Override
    public String generateVerifyCode() {
        return dangNhapDAO.generateVerifyCode();
    }

    @Override
    public boolean checkDuplicateCode(String verifyCode) {
        return dangNhapDAO.checkDuplicateCode(verifyCode);
    }

    @Override
    public boolean checkDuplicateEmail(String user) {
        return dangNhapDAO.checkDuplicateEmail(user);
    }

    @Override
    public boolean doneVerify(String tenDangNhap) throws SQLException, Exception {
        return dangNhapDAO.doneVerify(tenDangNhap);
    }

    @Override
    public boolean verifyCodeWithUser(String tenDangNhap, String code) throws SQLException, Exception {
        return dangNhapDAO.verifyCodeWithUser(tenDangNhap, code);
    }

    @Override
    public DangNhapModel findOneByEmail(String email) {
        return dangNhapDAO.findOneByEmail(email);
    }

}
