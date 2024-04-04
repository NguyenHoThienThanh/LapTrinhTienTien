/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.TamVangDAOImpl;
import InterfaceDAO.ITamVangDAO;
import InterfaceService.ITamVangService;
import Models.TamVangModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TamVangServiceImpl implements ITamVangService{
    
    ITamVangDAO tamVangDAO = new TamVangDAOImpl();

    @Override
    public List<TamVangModel> findAll() {
        return tamVangDAO.findAll();
    }

    @Override
    public TamVangModel findOneByMaTV(String MaTV) {
        return tamVangDAO.findOneByMaTV(MaTV);
    }

    @Override
    public boolean insert(TamVangModel tamVang) {
        return tamVangDAO.insert(tamVang);
    }

    @Override
    public boolean update(TamVangModel tamVang) {
        TamVangModel tv = tamVangDAO.findOneByMaTV(tamVang.getMaTV());
        tv.setID(tamVang.getID());
        tv.setMaTV(tamVang.getMaTV());
        tv.setCCCD(tamVang.getCCCD());
        tv.setNgaydk(tamVang.getNgaydk());
        tv.setNcdi(tamVang.getNcdi());
        tv.setNcden(tamVang.getNcden());
        tv.setNgaydi(tamVang.getNgaydi());
        tv.setNgayve(tamVang.getNgayve());
        tv.setLydo(tamVang.getLydo());
        tv.setTrangThai(tamVang.getTrangThai());
        return tamVangDAO.update(tv);
    }

    @Override
    public boolean delete(String MaTV) {
        return tamVangDAO.delete(MaTV);
    }
    
}
