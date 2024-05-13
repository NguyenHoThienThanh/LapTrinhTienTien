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
        cd.setTrangThai(1);
        cd.setHinhAnh(model.getHinhAnh());
        return congDanDao.update(cd);
    }

    @Override
    public boolean delete(String CCCD) {
        return congDanDao.delete(CCCD);
    }

    @Override
    public ThongTinCaNhan findTTCN(String CCCD) {
        String query = "SELECT CongDan.HoTen, KhaiSinh.GioiTinh, KhaiSinh.NgaySinh, KhaiSinh.NoiSinh, KhaiSinh.DanToc, KhaiSinh.QuocTich, KhaiSinh.QueQuan, CongDan.CCCD, HoKhau.DiaChi, CongDan.SDT, CongDan.Email, CongDan.HinhAnh FROM KhaiSinh JOIN CongDan ON KhaiSinh.MaKS = CongDan.MaKS JOIN QuanHe ON KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia JOIN HoKhau ON QuanHe.MaHK = HoKhau.MaHK WHERE QuanHe.TrangThai = 1 AND CongDan.CCCD = '?'";
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
                ttcn.setHinhAnh(rs.getBytes("HinhAnh"));
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
        String query = "Select CongDan.HoTen, CCCD, NcCccd, NgcCccd, KhaiSinh.MaKS, SDT, Email, CongDan.TrangThai, GioiTinh, NgaySinh, NoiSinh, HinhAnh from CongDan, KhaiSinh where CongDan.MaKS = KhaiSinh.MaKS and KhaiSinh.TrangThai = 1 and KhaiSinh.MaKS=?";
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
                congDan.setHinhAnh(rs.getBytes(12));
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
        CongDanModel cd = congDanDao.findOneWithoutAdd(CCCD);
        if (CCCD.equals(cd.getCCCD())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ICongDanDAO dn = new CongDanDAOImpl();
        CongDanModel model = dn.findOneWithoutAdd("092303008771");
        boolean rs = new CongDanServiceImpl().checkCCCDExist("083303008061");
        System.out.println(model.getHoTen() + " " + rs);
    }

    @Override
    public List<ThongTinCaNhan> getNgaySinh() {
        String query = " select NgaySinh from CongDan inner join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS";
        List<ThongTinCaNhan> listTTCN = new ArrayList<>();
        try {
            ThongTinCaNhan ttcn = new ThongTinCaNhan();
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ttcn.setNgaySinh(rs.getDate("NgaySinh"));
                listTTCN.add(ttcn);

            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTTCN;
    }

    @Override
    public ThongTinCaNhan findOneByCCCD(String CCCD) {
        String query = "select CCCD, HoTen, NgaySinh, DiaChi, DanToc, QuocTich, GioiTinh  from KhaiSinh\n"
                + "inner join QuanHe on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia\n"
                + "inner join HoKhau on HoKhau.MaHK = QuanHe.MaHK\n"
                + "inner join CongDan on KhaiSinh.MaKS = CongDan.MaKS\n"
                + "and CongDan.TrangThai = 1 and CongDan.CCCD = ?";
        ThongTinCaNhan ttcn = new ThongTinCaNhan();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                ttcn.setHoTen(rs.getString("HoTen"));
                ttcn.setNgaySinh(rs.getDate("NgaySinh"));
                ttcn.setDanToc(rs.getString("DanToc"));
                ttcn.setQuocTich(rs.getString("QuocTich"));
                ttcn.setCCCD(rs.getString("CCCD"));
                ttcn.setDiaChi(rs.getString("DiaChi"));
                ttcn.setGioiTinh(rs.getString("GioiTinh"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ttcn;
    }

    @Override
    public List<CongDanModel> filterByGender(String gender) {
        String query = "  select CongDan.MaKS, CCCD, HoTen, NgaySinh, GioiTinh, NoiSinh, NcCccd, NgcCccd, SDT, Email, CongDan.TrangThai  from CongDan\n"
                + "  inner join KhaiSinh on KhaiSinh.MaKS  = CongDan.MaKS\n"
                + "  where KhaiSinh.GioiTinh = ? and CongDan.TrangThai = 1\n"
                + "  order by ID ASC";
        List<CongDanModel> listCongDan = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, gender);
            rs = ps.executeQuery();
            while (rs.next()) {
                CongDanModel congDan = new CongDanModel();

                congDan.setMaKS(rs.getString(1));
                congDan.setCCCD(rs.getString(2));
                congDan.setHoTen(rs.getString(3));
                congDan.setNgaySinh(rs.getDate(4));
                congDan.setGioiTinh(rs.getString(5));
                congDan.setNoiSinh(rs.getString(6));
                congDan.setNcCccd(rs.getString(7));
                congDan.setNgcCccd(rs.getDate(8));
                congDan.setSDT(rs.getString(9));
                congDan.setEmail(rs.getString(10));
                congDan.setTrangThai(rs.getInt(11));

                listCongDan.add(congDan);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCongDan;
    }

    @Override
    public List<CongDanModel> filterByHomeTown(String hometown) {
        String query = " select CongDan.MaKS, CCCD, HoTen, NgaySinh, GioiTinh, QueQuan, NoiSinh, NcCccd, NgcCccd, SDT, Email, CongDan.TrangThai from CongDan\n"
                + "  inner join KhaiSinh on KhaiSinh.MaKS  = CongDan.MaKS\n"
                + "  where KhaiSinh.NoiSinh = ? and CongDan.TrangThai = 1\n"
                + "  order by ID ASC";
        List<CongDanModel> listCongDan = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, hometown);
            rs = ps.executeQuery();
            while (rs.next()) {
                CongDanModel congDan = new CongDanModel();
                congDan.setMaKS(rs.getString(1));
                congDan.setCCCD(rs.getString(2));
                congDan.setHoTen(rs.getString(3));
                congDan.setNgaySinh(rs.getDate(4));
                congDan.setGioiTinh(rs.getString(5));
                congDan.setQueQuan(rs.getString(6));
                congDan.setNoiSinh(rs.getString(7));
                congDan.setNcCccd(rs.getString(8));
                congDan.setNgcCccd(rs.getDate(9));
                congDan.setSDT(rs.getString(10));
                congDan.setEmail(rs.getString(11));
                congDan.setTrangThai(rs.getInt(12));

                listCongDan.add(congDan);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCongDan;
    }
}
