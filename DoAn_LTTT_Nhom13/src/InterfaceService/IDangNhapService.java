/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.DangNhapModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IDangNhapService {
    List<DangNhapModel> findAll();
    DangNhapModel findOne(String userName);
    boolean insert (DangNhapModel dangNhap);
    boolean update (DangNhapModel dangNhap);
    boolean delete (String userName);
    boolean isUsernameExists(String username);
    boolean isPasswordExists(String username, String password);
}
