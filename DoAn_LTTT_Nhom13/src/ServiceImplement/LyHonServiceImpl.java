/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.LyHonDAOImpl;
import InterfaceDAO.ILyHonDAO;
import InterfaceService.ILyHonService;
import Models.LyHonModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LyHonServiceImpl implements ILyHonService{

    
    ILyHonDAO lyHonDAO = new LyHonDAOImpl();
    @Override
    public List<LyHonModel> findAll() {
        return lyHonDAO.findAll();
    }

    @Override
    public LyHonModel findOneByMaLH(String MaLH) {
        return lyHonDAO.findOneByMaLH(MaLH);
    }

    @Override
    public boolean insert(LyHonModel lyHon) {
        return lyHonDAO.insert(lyHon);
    }

    @Override
    public boolean update(LyHonModel lyHon) {
        LyHonModel lh = lyHonDAO.findOneByMaLH(lyHon.getMaLh());
        lh.setID(lyHon.getID());
        lh.setMaLh(lyHon.getMaLh());
        lh.setMaCnkh(lyHon.getMaCnkh());
        lh.setCCCDNguoiNopDon(lyHon.getCCCDNguoiNopDon());
        lh.setNoidk(lh.getNoidk());
        lh.setNgaydk(lh.getNgaydk());
        lh.setLydo(lyHon.getLydo());
        lh.setTrangThai(lyHon.getTrangThai());
        return lyHonDAO.update(lh);
    }
    
    @Override
    public boolean delete(String MaLH) {
        return lyHonDAO.delete(MaLH);
    }
    
}
