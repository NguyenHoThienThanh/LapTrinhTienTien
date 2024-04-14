/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.DonTamTruUser;
import Models.TamTruModel;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface ITamTruDAOUser {
    List<TamTruModel> findAll();
    DonTamTruUser findOne(String maTT);
    boolean insert(DonTamTruUser model);
    boolean update(DonTamTruUser model);
    boolean delete(String maTT);
    List<DonTamTruUser> findAllTT(String CCCD);
}
