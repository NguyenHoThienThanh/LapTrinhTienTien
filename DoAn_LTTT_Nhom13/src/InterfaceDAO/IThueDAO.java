/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.ThueModel;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface IThueDAO {
    List<ThueModel> findAll();
    ThueModel findOneByMaSoThue (String MaSoThue);
    boolean insert (ThueModel thue);
    boolean update (ThueModel thue);
    boolean delete (String MaSoThue);
}
