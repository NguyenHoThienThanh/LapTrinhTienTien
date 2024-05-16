/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.ChungNhanKetHonModel;
import Models.DonChungNhanKetHon;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IChungNhanKetHonService {
    List<ChungNhanKetHonModel> findAll();
    ChungNhanKetHonModel findOneByMaKH (String MaKH);
    boolean insert (ChungNhanKetHonModel chungNhanKetHon);
    boolean update (ChungNhanKetHonModel chungNhanKetHonModel);
    boolean delete (String MaKH);
    List<DonChungNhanKetHon> findAllCNKH(String CCCDVo, String CCCDChong);
    List<ChungNhanKetHonModel> findAllChuaDuyet();
    ChungNhanKetHonModel findOneChuaDuyet(String Giaytotuythanvo, String Giaytotuythanchong) ;
    List<ChungNhanKetHonModel> findAllKetHon() ;
    int ifExists(String CCCDChong, String CCCCDVo);
    List<String> listYear();
}
