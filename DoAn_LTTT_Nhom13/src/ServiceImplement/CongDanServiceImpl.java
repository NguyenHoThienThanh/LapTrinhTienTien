package ServiceImplement;

import DAOImplement.CongDanDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.ICongDanDAO;
import InterfaceService.ICongDanService;
import Models.CongDanModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CongDanServiceImpl implements ICongDanService {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
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

    //Update TrangThai = 1
    @Override
    public boolean updateStatus(String CCCD) {
        String query = "UPDATE CongDan SET TrangThai = 1 WHERE CCCD = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //Check tồn tại số CCCD nào chưa
    @Override
    public boolean isCCCDIssued(String MaKS) {
        String query = "SELECT TrangThai FROM CongDan WHERE MaKS = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaKS);
            rs = ps.executeQuery();
            if (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                if(trangThai ==1 ){
                    return true;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            
        }
        return false;
    }

}
