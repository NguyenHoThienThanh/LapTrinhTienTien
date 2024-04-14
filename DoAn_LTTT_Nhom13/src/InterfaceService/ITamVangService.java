/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.DonTamVang;
import Models.DonTamVangUser;
import Models.TamVangModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ITamVangService {
    List<TamVangModel> findAll();
    TamVangModel findOneByMaTV (String MaTV);
    boolean insert (TamVangModel tamVang);
    boolean insertUser (DonTamVangUser tamVang);
    boolean update (TamVangModel tamVang);
    boolean delete (String MaTV);
    List<DonTamVang> findAllTV(String CCCD);
    List<DonTamVangUser> findAllTVuser(String CCCD);    
}
