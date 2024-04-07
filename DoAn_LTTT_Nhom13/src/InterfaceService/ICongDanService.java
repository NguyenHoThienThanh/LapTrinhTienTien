/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.CongDanModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ICongDanService {
    List<CongDanModel> findAll();
    CongDanModel findOne(String CCCD);
    boolean insert(CongDanModel model);
    boolean update(CongDanModel model);
    boolean delete(String CCCD);
    boolean updateStatus(String CCCD);
    boolean isCCCDIssued(String CCCD);
}
