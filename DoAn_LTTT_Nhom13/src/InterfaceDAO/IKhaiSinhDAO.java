/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.KhaiSinhModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IKhaiSinhDAO {
    List<KhaiSinhModel> findAll();
    KhaiSinhModel findOne(String maKS);
    boolean insert(KhaiSinhModel model);
    boolean update(KhaiSinhModel model);
    boolean delete(String maKS);
}
