/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceDAO;

import Models.ThongKeModel;
import java.util.List;

/**
 *
 * @author TUAN
 */
public interface IThongKeDAO {
    public List<ThongKeModel> thongKeDKKSTheoThangTheoNam(String year);
    public List<ThongKeModel> thongKeChungTuTheoThangTheoNam(String year);
    public List<ThongKeModel> thongKeKetHonTheoThangTheoNam(String year);
    public List<ThongKeModel> thongKeLyHonTheoThangTheoNam(String year);
}
