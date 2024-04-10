/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceService;

import Models.DanhGiaModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IDanhGiaService {
    List<DanhGiaModel> findAll();
    DanhGiaModel findOneByMaDG (String CCCD);
    boolean insert (DanhGiaModel danhGia);
    boolean update (DanhGiaModel danhGia);
    boolean delete (String CCCD);
    List<DanhGiaModel> findAllDG();
    
}
