/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.ChungNhanKetHonModel;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface IChungNhanKetHonDAO {
    List<ChungNhanKetHonModel> findAll();
    ChungNhanKetHonModel findOneByMaKH (String MaKH);
    boolean insert (ChungNhanKetHonModel chungNhanKetHon);
    boolean update (ChungNhanKetHonModel chungNhanKetHonModel);
    boolean delete (String MaKH);
}
