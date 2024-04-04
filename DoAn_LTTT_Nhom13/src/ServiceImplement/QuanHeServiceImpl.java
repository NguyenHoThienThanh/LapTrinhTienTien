/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.QuanHeDAOImpl;
import InterfaceDAO.IQuanHeDAO;
import InterfaceService.IQuanHeService;
import Models.QuanHeModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanHeServiceImpl implements IQuanHeService{

    IQuanHeDAO quanHeDAO = new QuanHeDAOImpl();
    @Override
    public List<QuanHeModel> findAll() {
        return quanHeDAO.findAll();
    }

    @Override
    public QuanHeModel findOneByMaHK(String MaHK, String KhaiSinhNguoiThamGia) {
        return quanHeDAO.findOneByMaHK(MaHK, KhaiSinhNguoiThamGia);
    }

    @Override
    public boolean insert(QuanHeModel quanHe) {
        return quanHeDAO.insert(quanHe);
    }

    @Override
    public boolean update(QuanHeModel quanHe) {
        QuanHeModel qh = quanHeDAO.findOneByMaHK(quanHe.getMaHK(), quanHe.getKhaiSinhNguoiThamGia());
        qh.setMaHK(quanHe.getMaHK());
        qh.setKhaiSinhNguoiThamGia(quanHe.getKhaiSinhNguoiThamGia());
        qh.setQuanHeVoiChuHo(quanHe.getQuanHeVoiChuHo());
        qh.setTrangThai(quanHe.getTrangThai());
        return quanHeDAO.update(quanHe);
    }

    @Override
    public boolean delete(String MaHK) {
        return quanHeDAO.delete(MaHK);
    }
    
}
