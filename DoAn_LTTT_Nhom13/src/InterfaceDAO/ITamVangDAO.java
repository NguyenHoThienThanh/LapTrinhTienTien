/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.TamVangModel;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface ITamVangDAO {
    List<TamVangModel> findAll();
    TamVangModel findOneByMaTV (String MaTV);
    boolean insert (TamVangModel tamVang);
    boolean update (TamVangModel tamVang);
    boolean delete (String MaTV);
}
