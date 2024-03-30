/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceService;

import Models.KhaiSinhModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IKhaiSinhService {
    List<KhaiSinhModel> findAll();
    KhaiSinhModel findOne(String maKS);
    boolean insert(KhaiSinhModel model);
    boolean update(KhaiSinhModel model);
    boolean delete(String maKS);
}
