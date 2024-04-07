/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.GiayChungTuModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IGiayChungTuService {
    List<GiayChungTuModel> findAll();
    GiayChungTuModel findOneByMaCT(String MaCT);
    boolean insert(GiayChungTuModel model);
    boolean update(GiayChungTuModel model);
    boolean delete(String MaCT);
    GiayChungTuModel findAllGCT(String CCCD);
    
}
