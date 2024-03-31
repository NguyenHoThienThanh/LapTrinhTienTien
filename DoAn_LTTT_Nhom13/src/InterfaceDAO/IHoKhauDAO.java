/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.HoKhauModel;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface IHoKhauDAO {
    List<HoKhauModel> findAll();
    HoKhauModel findOneByMaHK (String MaHK);
    boolean insert (HoKhauModel hoKhau);
    boolean update (HoKhauModel hoKhau);
    boolean delete (String MaHK);
    
}
