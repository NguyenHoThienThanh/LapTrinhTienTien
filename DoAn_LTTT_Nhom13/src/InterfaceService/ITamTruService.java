/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.DonTamTru;
import Models.TamTruModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ITamTruService {
    List<TamTruModel> findAll();
    TamTruModel findOne(String maTT);
    boolean insert(TamTruModel model);
    boolean update(TamTruModel model);
    boolean delete(String maTT);
    List<DonTamTru> findAllTT(String CCCD);
    int ifExists(String CCCD);
    List<TamTruModel> findAllChuaDuyet();
    TamTruModel findOneChuaDuyet(String maTT);
}
