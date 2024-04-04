/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.TamTruDAOImpl;
import InterfaceDAO.ITamTruDAO;
import InterfaceService.ITamTruService;
import Models.TamTruModel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TamTruServiceImpl implements ITamTruService{
    
    ITamTruDAO tamTruDAO = new TamTruDAOImpl();

    @Override
    public List<TamTruModel> findAll() {
        return tamTruDAO.findAll();
    }

    @Override
    public TamTruModel findOne(String maTT) {
        return tamTruDAO.findOne(maTT);
    }

    @Override
    public boolean insert(TamTruModel model) {
        return tamTruDAO.insert(model);
    }

    @Override
    public boolean update(TamTruModel model) {
        TamTruModel tt = tamTruDAO.findOne(model.getMaTT());
        tt.setID(model.getID());
        tt.setMaTT(model.getMaTT());
        tt.setCCCD(model.getCCCD());
        tt.setNgaydk(model.getNgaydk());
        tt.setNoidk(model.getNoidk());
        tt.setNgayden(model.getNgayden());
        tt.setNgaydi(model.getNgaydi());
        tt.setLydo(model.getLydo());
        tt.setTrangThai(model.getTrangThai());
        return tamTruDAO.update(tt);
    }

    @Override
    public boolean delete(String maTT) {
        return tamTruDAO.delete(maTT);
    }
    
}
