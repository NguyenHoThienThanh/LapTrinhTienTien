/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.DangNhapModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface IDangNhapDAO {
    List<DangNhapModel> findAll();
    DangNhapModel findOne(String userName);
    boolean insert (DangNhapModel dangNhap);
    boolean update (DangNhapModel dangNhap);
    boolean delete (String userName);
    String generateVerifyCode();
    boolean checkDuplicateCode(String verifyCode);
    boolean checkDuplicateEmail(String user);
    boolean doneVerify(String tenDangNhap) throws SQLException, Exception;
    boolean verifyCodeWithUser(String tenDangNhap, String code)throws SQLException, Exception;
}
