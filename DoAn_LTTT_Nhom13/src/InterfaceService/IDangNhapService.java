
package InterfaceService;

import Models.DangNhapModel;
import java.sql.SQLException;
import java.util.List;

public interface IDangNhapService {
    List<DangNhapModel> findAll();
    DangNhapModel findOne(String userName);
    DangNhapModel findOneByEmail(String email);
    boolean insert (DangNhapModel dangNhap);
    boolean update (DangNhapModel dangNhap);
    boolean delete (String userName);
    boolean isUsernameExists(String username);
    boolean isPasswordExists(String username, String password);
    String generateVerifyCode();
    boolean checkDuplicateCode(String verifyCode);
    boolean checkDuplicateEmail(String user);
    boolean doneVerify(String tenDangNhap) throws SQLException, Exception;
    boolean verifyCodeWithUser(String tenDangNhap, String code)throws SQLException, Exception;
}
