/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.CongDanModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ICongDanDAO {
    List<CongDanModel> findAll();
    CongDanModel findOne(String CCCD);
    CongDanModel findOneWithoutAdd(String CCCD);
    boolean insert(CongDanModel model);
    boolean update(CongDanModel model);
    boolean delete(String CCCD);
}
