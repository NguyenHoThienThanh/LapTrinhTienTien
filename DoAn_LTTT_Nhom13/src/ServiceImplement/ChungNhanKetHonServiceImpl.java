/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.ChungNhanKetHonDAOImpl;
import InterfaceDAO.IChungNhanKetHonDAO;
import InterfaceService.IChungNhanKetHonService;
import Models.ChungNhanKetHonModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChungNhanKetHonServiceImpl implements IChungNhanKetHonService{
    
    IChungNhanKetHonDAO cnkhDAO = new ChungNhanKetHonDAOImpl();

    @Override
    public List<ChungNhanKetHonModel> findAll() {
        return cnkhDAO.findAll();
    }

    @Override
    public ChungNhanKetHonModel findOneByMaKH(String MaKH) {
        return cnkhDAO.findOneByMaKH(MaKH);
    }

    @Override
    public boolean insert(ChungNhanKetHonModel chungNhanKetHon) {
        return cnkhDAO.insert(chungNhanKetHon);
    }

    @Override
    public boolean update(ChungNhanKetHonModel chungNhanKetHonModel) {
        ChungNhanKetHonModel cnkh = cnkhDAO.findOneByMaKH(chungNhanKetHonModel.getMaCnkh());
        cnkh.setID(chungNhanKetHonModel.getID());
        cnkh.setMaCnkh(chungNhanKetHonModel.getMaCnkh());
        cnkh.setCCCDVo(chungNhanKetHonModel.getCCCDVo());
        cnkh.setCCCDChong(chungNhanKetHonModel.getCCCDChong());
        cnkh.setNoidk(chungNhanKetHonModel.getNoidk());
        cnkh.setNgaydk(chungNhanKetHonModel.getNgaydk());
        cnkh.setTrangThai(chungNhanKetHonModel.getTrangThai());
        return cnkhDAO.update(cnkh);
    }

    @Override
    public boolean delete(String MaKH) {
        return cnkhDAO.delete(MaKH);
    }
    
}
