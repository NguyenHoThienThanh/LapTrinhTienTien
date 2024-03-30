
package ServiceImplement;

import DAOImplement.CongDanDAOImpl;
import InterfaceDAO.ICongDanDAO;
import InterfaceService.ICongDanService;
import Models.CongDanModel;
import java.util.List;

public class CongDanServiceImpl implements ICongDanService{

    ICongDanDAO congDanDao = new CongDanDAOImpl();
    @Override
    public List<CongDanModel> findAll() {
        return congDanDao.findAll();
    }

    @Override
    public CongDanModel findOne(String CCCD) {
        return congDanDao.findOne(CCCD);
    }

    @Override
    public boolean insert(CongDanModel model) {
        return congDanDao.insert(model);
    }

    @Override
    public boolean update(CongDanModel model) {
        CongDanModel cd = congDanDao.findOne(model.getCCCD());
        cd.setHoTen(model.getHoTen());
        cd.setNcCccd(model.getNcCccd());
        cd.setNgcCccd(model.getNgcCccd());
        cd.setMaKS(model.getMaKS());
        cd.setSDT(model.getSDT());
        cd.setEmail(model.getEmail());
        cd.setTrangThai(model.getTrangThai());
        return congDanDao.update(cd);
    }

    @Override
    public boolean delete(String CCCD) {
        return congDanDao.delete(CCCD);
    }
    
}
