
package InterfaceService;

import Models.DangNhapModel;
import java.util.List;

public interface IDangNhapService {
    List<DangNhapModel> findAll();
    DangNhapModel findOne(String userName);
    boolean insert (DangNhapModel dangNhap);
    boolean update (DangNhapModel dangNhap);
    boolean delete (String userName);
    boolean isUsernameExists(String username);
    boolean isPasswordExists(String username, String password);
}
