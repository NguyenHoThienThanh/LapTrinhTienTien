/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.CongDanModel;
import Models.ThongTinCaNhan;
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
    ThongTinCaNhan findTTCN(String CCCD);
    public boolean isCCCDIssued(String CCCD);

    boolean checkCCCDExist(String CCCD);

    CongDanModel findOneByMaKS(String MaKS);
    public int countCCCD(String MaKS);
    List<ThongTinCaNhan> getNgaySinh();
    ThongTinCaNhan findOneByCCCD(String CCCD);
    public List<CongDanModel> filterByGender(String gender);
}
