
package ServiceImplement;

import DAOImplement.CongDanDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.ICongDanDAO;
import InterfaceService.ICongDanService;
import Models.CongDanModel;
import Models.ThongTinCaNhan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CongDanServiceImpl implements ICongDanService{
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

    @Override
    public ThongTinCaNhan findTTCN(String CCCD) {
        String query = "select HoTen, GioiTinh, NgaySinh, NoiSinh, DanToc, QuocTich, QueQuan, CCCD, DiaChi, SDT, Email from KhaiSinh join CongDan on KhaiSinh.MaKS = CongDan.MaKS join QuanHe on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia join HoKhau on QuanHe.MaHK = HoKhau.MaHK Where QuanHe.TrangThai = 1 and Cccd = ?";
        ThongTinCaNhan ttcn = new ThongTinCaNhan();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                ttcn.setHoTen(rs.getString("HoTen"));
                ttcn.setGioiTinh(rs.getString("GioiTinh"));
                ttcn.setNgaySinh(rs.getDate("NgaySinh"));
                ttcn.setNoiSinh(rs.getString("NoiSinh"));
                ttcn.setDanToc(rs.getString("DanToc"));
                ttcn.setQuocTich(rs.getString("QuocTich"));
                ttcn.setQueQuan(rs.getString("QueQuan"));
                ttcn.setCCCD(rs.getString("CCCD"));
                ttcn.setDiaChi(rs.getString("DiaChi"));
                ttcn.setSdt(rs.getString("SDT"));
                ttcn.setEmail(rs.getString("Email"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ttcn;
    }
    
}
