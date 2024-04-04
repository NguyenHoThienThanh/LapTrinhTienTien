/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.GiayChungTuDAOImpl;
import InterfaceDAO.IGiayChungTuDAO;
import InterfaceService.IGiayChungTuService;
import Models.GiayChungTuModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GiayChungTuServiceImpl implements IGiayChungTuService{

    
    IGiayChungTuDAO giayChungTuDAO = new GiayChungTuDAOImpl();
    @Override
    public List<GiayChungTuModel> findAll() {
        return giayChungTuDAO.findAll();
    }

    @Override
    public GiayChungTuModel findOneByMaCT(String MaCT) {
        return giayChungTuDAO.findOneByMaCT(MaCT);
    }

    @Override
    public boolean insert(GiayChungTuModel model) {
        return giayChungTuDAO.insert(model);
    }

    @Override
    public boolean update(GiayChungTuModel model) {
        GiayChungTuModel gct = giayChungTuDAO.findOneByMaCT(model.getMaCT());
        gct.setID(model.getID());
        gct.setMaCT(model.getMaCT());
        gct.setCCCD(model.getCCCD());
        gct.setNgayMat(model.getNgayMat());
        gct.setNoiMat(model.getNoiMat());
        gct.setNguyenNhan(model.getNguyenNhan());
        gct.setTrangThai(model.getTrangThai());
        return giayChungTuDAO.update(model);
    }

    @Override
    public boolean delete(String MaCT) {
        return giayChungTuDAO.delete(MaCT);
    }
    
}
