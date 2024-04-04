/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.QuanHeModel;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface IQuanHeDAO {
    List<QuanHeModel> findAll();
    QuanHeModel findOneByMaHK (String MaHK, String KhaiSinhNguoiThamGia);
    boolean insert (QuanHeModel quanHe);
    boolean update (QuanHeModel quanHe);
    boolean delete (String MaHK);
}
