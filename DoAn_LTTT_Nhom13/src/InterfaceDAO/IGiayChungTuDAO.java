/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceDAO;

import Models.GiayChungTuModel;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface IGiayChungTuDAO {
    List<GiayChungTuModel> findAll();
    GiayChungTuModel findOneByMaCT(String MaCT);
    boolean insert(GiayChungTuModel model);
    boolean update(GiayChungTuModel model);
    boolean delete(String MaCT);
}
