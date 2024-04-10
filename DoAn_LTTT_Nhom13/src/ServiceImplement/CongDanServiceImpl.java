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

    //Check tồn tại số CCCD nào chưa
    @Override
    public boolean isCCCDIssued(String CCCD) {
        String query = "SELECT CCCD FROM CongDan WHERE CCCD = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, CCCD);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public CongDanModel findOneByMaKS(String MaKS) {
        CongDanModel congDan = new CongDanModel();
        String query = "Select CongDan.HoTen, CCCD, NcCccd, NgcCccd, KhaiSinh.MaKS, SDT, Email, CongDan.TrangThai, GioiTinh, NgaySinh, NoiSinh from CongDan, KhaiSinh where CongDan.MaKS = KhaiSinh.MaKS and KhaiSinh.TrangThai = 1 and KhaiSinh.MaKS=?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaKS);
            rs = ps.executeQuery();
            while (rs.next()) {
                congDan.setHoTen(rs.getString(1));
                congDan.setCCCD(rs.getString(2));
                congDan.setNcCccd(rs.getString(3));
                congDan.setNgcCccd(rs.getDate(4));
                congDan.setMaKS(rs.getString(5));
                congDan.setSDT(rs.getString(6));
                congDan.setEmail(rs.getString(7));
                congDan.setTrangThai(rs.getInt(8));
                congDan.setGioiTinh(rs.getString(9));
                congDan.setNgaySinh(rs.getDate(10));
                congDan.setNoiSinh(rs.getString(11));
            }
            conn.close();
        } catch (Exception ex) {

        }
        return congDan;
    }

    @Override
    public int countCCCD(String MaKS) {
        String query = "SELECT COUNT(CCCD) AS SoLuong "
                + "FROM CongDan "
                + "INNER JOIN KhaiSinh ON CongDan.MaKS = KhaiSinh.MaKS "
                + "WHERE CongDan.TrangThai = 1 AND KhaiSinh.TrangThai = 1 AND CongDan.MaKS = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, MaKS);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("SoLuong");
                } else {
                    return 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); 
            return -1;  
        }
    }

    @Override
    public boolean checkCCCDExist(String CCCD) {
        CongDanModel cd = congDanDao.findOne(CCCD);
        if (CCCD.equals(cd.getCCCD()) && cd.getTrangThai() == 1) {
            return true;
        } else {
            return false;
        }
    } 
    
    public static void main(String[] args) {
        ICongDanDAO dn = new CongDanDAOImpl();
        CongDanModel model = dn.findOne("083303008061");
        System.out.println(model.getHoTen());
    }
}


