
package ServiceImplement;

import DAOImplement.DanhGiaDAOImpl;
import InterfaceDAO.IDanhGiaDAO;
import InterfaceService.IDanhGiaService;
import Models.DanhGiaModel;
import java.util.List;

public class DanhGiaServiceImpl implements IDanhGiaService{

    
    IDanhGiaDAO danhGiaDAO = new DanhGiaDAOImpl();
    @Override
    public List<DanhGiaModel> findAll() {
        return danhGiaDAO.findAll();
    }

    @Override
    public DanhGiaModel findOneByMaDG(String CCCD) {
        return danhGiaDAO.findOneByMaDG(CCCD);
    }

    @Override
    public boolean insert(DanhGiaModel danhGia) {
        return danhGiaDAO.insert(danhGia);
    }

    @Override
    public boolean update(DanhGiaModel danhGia) {
        DanhGiaModel dg = danhGiaDAO.findOneByMaDG(danhGia.getCCCD());
        dg.setCCCD(danhGia.getCCCD());
        dg.setDanhGia(danhGia.getDanhGia());
        dg.setTongQuan(danhGia.getTongQuan());
        dg.setThuanTien(danhGia.getThuanTien());
        dg.setDeDang(danhGia.getDeDang());
        dg.setChinhXac(danhGia.getChinhXac());
        dg.setTrucQuan(danhGia.getTrucQuan());
        return danhGiaDAO.update(dg);
    }

    @Override
    public boolean delete(String CCCD) {
        return danhGiaDAO.delete(CCCD);
    }
    
}
