/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.ThueDAOImpl;
import InterfaceDAO.IThueDAO;
import InterfaceService.IThueService;
import Models.ThueModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThueServiceImpl implements IThueService{

    IThueDAO thueDao = new ThueDAOImpl();
    @Override
    public List<ThueModel> findAll() {
        return thueDao.findAll();
    }

    @Override
    public ThueModel findOneByMaSoThue(String MaSoThue) {
        return thueDao.findOneByMaSoThue(MaSoThue);
    }

    @Override
    public boolean insert(ThueModel thue) {
        return thueDao.insert(thue);
    }

    @Override
    public boolean update(ThueModel thue) {
        ThueModel t = thueDao.findOneByMaSoThue(thue.getMasothue());
        t.setID(thue.getID());
        t.setMasothue(thue.getMasothue());
        t.setCoquanthue(t.getMasothue());
        t.setSoCMT_CCCD(t.getSoCMT_CCCD());
        t.setNgaythaydoithongtingannhat(t.getNgaythaydoithongtingannhat());
        t.setTrangThai(t.getTrangThai());
        return thueDao.update(t);
    }

    @Override
    public boolean delete(String MaSoThue) {
        return thueDao.delete(MaSoThue);
    }
    
}
