/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.KhaiSinhDAOImpl;
import InterfaceDAO.IKhaiSinhDAO;
import InterfaceService.IKhaiSinhService;
import Models.KhaiSinhModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhaiSinhServiceImpl implements IKhaiSinhService{
    
    IKhaiSinhDAO khaiSinhDAO = new KhaiSinhDAOImpl();

    @Override
    public List<KhaiSinhModel> findAll() {
        return khaiSinhDAO.findAll();
    }

    @Override
    public KhaiSinhModel findOne(String maKS) {
        return khaiSinhDAO.findOne(maKS);
    }

    @Override
    public boolean insert(KhaiSinhModel model) {
        return khaiSinhDAO.insert(model);
    }

    @Override
    public boolean update(KhaiSinhModel model) {
        KhaiSinhModel ks = khaiSinhDAO.findOne(model.getMaKS());
        ks.setHoTenKS(model.getHoTenKS());
        ks.setGioiTinh(model.getGioiTinh());
        ks.setNgaySinh(model.getNgaySinh());
        ks.setNoiSinh(model.getNoiSinh());
        ks.setDanToc(model.getDanToc());
        ks.setQuocTich(model.getQuocTich());
        ks.setQueQuan(model.getQueQuan());
        ks.setCha(model.getCha());
        ks.setMe(model.getMe());
        ks.setNguoiKhaiSinh(model.getNguoiKhaiSinh());
        ks.setQuanHe(model.getQuanHe());
        ks.setNgayDk(model.getNgayDk());
        ks.setNoiDk(model.getNoiDk());
        ks.setTrangThai(model.getTrangThai());
        return khaiSinhDAO.update(ks);
    }

    @Override
    public boolean delete(String maKS) {
        return khaiSinhDAO.delete(maKS);
    }
    
}
