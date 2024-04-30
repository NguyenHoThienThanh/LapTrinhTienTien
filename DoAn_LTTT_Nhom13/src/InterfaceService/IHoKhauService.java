/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.HoKhauModel;
import Models.ThongTinHoKhau;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IHoKhauService {
    List<HoKhauModel> findAll();
    HoKhauModel findOneByMaHK (String MaHK);
    boolean insert (HoKhauModel hoKhau);
    boolean update (HoKhauModel hoKhau);
    boolean delete (String MaHK);
    List<ThongTinHoKhau> findAllHoKhau (String CCCD);
    List<ThongTinHoKhau> findAllHoKhauUser (String MaHK);
    ThongTinHoKhau findOneByCCCD(String CCCD);
    int existsHoKhauOrNot(String CCCD);
    HoKhauModel findOneByMaKS(String MaKS);
    List<HoKhauModel> findAllHK();
    int ifExists(String MaHK);
    HoKhauModel findOneHKByMaKS(String MaKS);
}
