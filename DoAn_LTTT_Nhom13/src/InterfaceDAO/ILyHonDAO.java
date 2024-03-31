/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.LyHonModel;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface ILyHonDAO {

    List<LyHonModel> findAll();

    LyHonModel findOneByMaLH(String MaLH);

    boolean insert(LyHonModel lyHon);

    boolean update(LyHonModel lyHon);

    boolean delete(String MaLH);
}
