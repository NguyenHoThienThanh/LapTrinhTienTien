
package ServiceImplement;

import DAOImplement.DanhGiaDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.IDanhGiaDAO;
import InterfaceService.IDanhGiaService;
import Models.DanhGiaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DanhGiaServiceImpl implements IDanhGiaService{

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
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
    public boolean hasRated(String CCCD){
        return danhGiaDAO.hasRated(CCCD);
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

    @Override
    public List<DanhGiaModel> findAllDG() {
        String query = "select * from DanhGia join (select CCCD as CCCDNguoiDanhGia, HoTen from CongDan)Q on DanhGia.CCCD = Q.CCCDNguoiDanhGia";
        List<DanhGiaModel> listDanhGia = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DanhGiaModel dg = new DanhGiaModel();
                dg.setCCCD(rs.getString("CCCD"));
                dg.setDanhGia(rs.getString("DanhGia"));
                dg.setTongQuan(rs.getInt("Tongquan"));
                dg.setThuanTien(rs.getInt("Thuantien"));
                dg.setDeDang(rs.getInt("Dedang"));
                dg.setChinhXac(rs.getInt("Chinhxac"));
                dg.setTrucQuan(rs.getInt("Trucquan"));
                dg.setHoTen(rs.getString("HoTen"));
                listDanhGia.add(dg);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listDanhGia;
    }
    
}
