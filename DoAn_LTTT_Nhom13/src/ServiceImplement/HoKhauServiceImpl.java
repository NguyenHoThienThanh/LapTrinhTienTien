/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.HoKhauDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.IHoKhauDAO;
import InterfaceService.IHoKhauService;
import Models.HoKhauModel;
import Models.ThongTinHoKhau;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class HoKhauServiceImpl implements IHoKhauService {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    IHoKhauDAO hoKhauDAO = new HoKhauDAOImpl();

    @Override
    public List<HoKhauModel> findAll() {
        return hoKhauDAO.findAll();
    }

    @Override
    public HoKhauModel findOneByMaHK(String MaHK) {
        return hoKhauDAO.findOneByMaHK(MaHK);
    }

    @Override
    public boolean insert(HoKhauModel hoKhau) {
        return hoKhauDAO.insert(hoKhau);
    }

    @Override
    public boolean update(HoKhauModel hoKhau) {
        HoKhauModel hk = hoKhauDAO.findOneByMaHK(hoKhau.getMaHK());
        hk.setID(hoKhau.getID());
        hk.setMaHK(hoKhau.getMaHK());
        hk.setDiaChi(hoKhau.getDiaChi());
        hk.setKhaiSinhChuHo(hoKhau.getKhaiSinhChuHo());
        hk.setTrangThai(hoKhau.getTrangThai());
        return hoKhauDAO.update(hk);

    }

    @Override
    public boolean delete(String MaHK) {
        return hoKhauDAO.delete(MaHK);
    }

    @Override
    public List<ThongTinHoKhau> findAllHoKhau(String CCCD) {
        String query = "select CCCD as CCCDNguoiThan, HoTen as HoTenNguoiThan, SDT, NgaySinh, QuanHeVoiChuHo, MaHK from CongDan join (select MaKS, HoTenKS, GioiTinh, NgaySinh, MaHK, KhaiSinhNguoiThamGia, QuanHeVoiChuHo, DiaChi from KhaiSinh join (select T.MaHK, KhaiSinhNguoiThamGia, QuanHeVoiChuHo, DiaChi from QuanHe join (select MaHK, DiaChi, KhaiSinhChuHo from HoKhau where MaHK in (SELECT MaHK FROM QuanHe join CongDan on QuanHe.KhaiSinhNguoiThamGia = CongDan.MaKS WHERE QuanHe.TrangThai = 1 and CCCD = ?)) T on QuanHe.MaHK = T.MaHK) Q on Q.KhaiSinhNguoiThamGia = KhaiSinh.MaKS) C on C.KhaiSinhNguoiThamGia = CongDan.MaKS";
        List<ThongTinHoKhau> listThongTinHoKhau = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                ThongTinHoKhau tthk = new ThongTinHoKhau();
                tthk.setCCCDNguoiThan(rs.getString("CCCDNguoiThan"));
                tthk.setHoTenNguoiThan(rs.getString("HoTenNguoiThan"));
                tthk.setNgaySinh(rs.getDate("NgaySinh"));
                tthk.setQuanHeVoiChuHo(rs.getString("QuanHeVoiChuHo"));
                tthk.setMaHoKhau(rs.getString("MaHK"));
                listThongTinHoKhau.add(tthk);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listThongTinHoKhau;

    }

    @Override
    public ThongTinHoKhau findOneByCCCD(String CCCD) {
        String query = "select CCCD as CCCDChuHo, HoTen as HoTenChuHo, MaHK, DiaChi, HoTenNguoiThan as HoTenNguoiDangNhap, CCCDNguoiDangNhap, QuanHeVoiChuHo from CongDan join (select P.MaHK, DiaChi, KhaiSinhChuHo, TrangThai, HoTenKS as HoTenNguoiThan, GioiTinh, CCCD as CCCDNguoiDangNhap, QuanHeVoiChuHo from  HoKhau join (select MaHK, KhaiSinhNguoiThamGia, QuanHeVoiChuHo, HoTenKS, GioiTinh, CCCD from QuanHe join (select T.MaKS, HoTenKS, GioiTinh, CCCD from KhaiSinh join (select * from CongDan where CCCD = ? and TrangThai = 1) T on KhaiSinh.MaKS = T.MaKS) Q on Q.MaKS = QuanHe.KhaiSinhNguoiThamGia)P on P.MaHK = HoKhau.MaHK) R on R.KhaiSinhChuHo = CongDan.MaKS and R.TrangThai = 1";
        ThongTinHoKhau tthk = new ThongTinHoKhau();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                tthk.setCCCDChuHo(rs.getString("CCCDChuHo"));
                tthk.setHoTenChuHo(rs.getString("HoTenChuHo"));
                tthk.setMaHoKhau(rs.getString("MaHK"));
                tthk.setDiaChi(rs.getString("DiaChi"));
                tthk.setHoTenNguoiDangNhap(rs.getString("HoTenNguoiDangNhap"));
                tthk.setCCCDNguoiDangNhap(rs.getString("CCCDNguoiDangNhap"));
                tthk.setQuanHeVoiChuHo(rs.getString("QuanHeVoiChuHo"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tthk;

    }

    @Override
    public int existsHoKhauOrNot(String MaKS) {
        String query = "SELECT count(*) SoLuong "
                + "    FROM HoKhau hk "
                + "    INNER JOIN QuanHe qh ON hk.MaHK = qh.MaHK "
                + "    INNER JOIN CongDan cd ON qh.KhaiSinhNguoiThamGia = cd.MaKS "
                + "    WHERE cd.MaKS = ?";
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
    public HoKhauModel findOneByMaKS(String MaKS) {
        String query = "select HoKhau.ID, HoKhau.MaHK, KhaiSinh.MaKS, CCCD, HoTen,NgaySinh,  GioiTinh,  DiaChi, SDT, Email, HoKhau.TrangThai, QuanHeVoiChuHo   from QuanHe  "
                + "inner join KhaiSinh on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia  "
                + "inner join CongDan on KhaiSinh.MaKS = CongDan.MaKS "
                + "inner join HoKhau on HoKhau.MaHK = QuanHe.MaHK and HoKhau.TrangThai =1 "
                + "and KhaiSinh.MaKS = ?";
        HoKhauModel hoKhau = new HoKhauModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaKS);
            rs = ps.executeQuery();
            while (rs.next()) {
                hoKhau.setID(rs.getInt(1));
                hoKhau.setMaHK(rs.getString(2));
                hoKhau.setMaKS(rs.getString(3));
                hoKhau.setSoCCCD(rs.getString(4));
                hoKhau.setHoTen(rs.getString(5));
                hoKhau.setNgaySinh(rs.getDate(6));
                hoKhau.setGioiTinh(rs.getString(7));
                hoKhau.setDiaChi(rs.getString(8));
                hoKhau.setSDT(rs.getString(9));
                hoKhau.setEmail(rs.getString(10));
                hoKhau.setTrangThai(rs.getInt(11));
            }
            conn.close();
        } catch (Exception e) {

        }
        return hoKhau;
    }

    @Override
    public List<HoKhauModel> findAllHK() {
        String query = "  select HoKhau.ID, MaHK, HoTenKS, CCCD, DiaChi, KhaiSinhChuHo, HoKhau.TrangThai from HoKhau "
                + "  inner join KhaiSinh on HoKhau.KhaiSinhChuHo = KhaiSinh.MaKS "
                + "  inner join CongDan on KhaiSinh.MaKS = CongDan.MaKS"
                + "  and HoKhau.TrangThai = 1 order by HoKhau.ID ASC";
        List<HoKhauModel> listHoKhau = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                HoKhauModel tthk = new HoKhauModel();
                tthk.setID(rs.getInt(1));
                tthk.setMaHK(rs.getString(2));
                tthk.setHoTen(rs.getString(3));
                tthk.setSoCCCD(rs.getString(4));
                tthk.setDiaChi(rs.getString(5));
                tthk.setKhaiSinhChuHo(rs.getString(6));
                tthk.setTrangThai(rs.getInt(7));
                listHoKhau.add(tthk);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listHoKhau;
    }

    @Override
    public int ifExists(String MaKS) {
        String query = "  select count(*) SoLuong from HoKhau "
                + "  Where KhaiSinhChuHo = ? ";
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

}
