/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.TamVangDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.ITamVangDAO;
import InterfaceService.ITamVangService;
import Models.DonTamVangUser;
import Models.DonTamVang;
import Models.TamVangModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TamVangServiceImpl implements ITamVangService{
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    ITamVangDAO tamVangDAO = new TamVangDAOImpl();

    @Override
    public List<TamVangModel> findAll() {
        return tamVangDAO.findAll();
    }

    @Override
    public TamVangModel findOneByMaTV(String MaTV) {
        return tamVangDAO.findOneByMaTV(MaTV);
    }

    @Override
    public boolean insert(TamVangModel tamVang) {
        return tamVangDAO.insert(tamVang);
    }
    @Override
    public boolean insertUser(DonTamVangUser tamVang) {
        return tamVangDAO.insertUser(tamVang);
    }
    @Override
    public boolean update(TamVangModel tamVang) {
        TamVangModel tv = tamVangDAO.findOneByMaTV(tamVang.getMaTV());
        tv.setID(tamVang.getID());
        tv.setMaTV(tamVang.getMaTV());
        tv.setCCCD(tamVang.getCCCD());
        tv.setNgaydk(tamVang.getNgaydk());
        tv.setNcdi(tamVang.getNcdi());
        tv.setNcden(tamVang.getNcden());
        tv.setNgaydi(tamVang.getNgaydi());
        tv.setNgayve(tamVang.getNgayve());
        tv.setLydo(tamVang.getLydo());
        tv.setTrangThai(tamVang.getTrangThai());
        return tamVangDAO.update(tv);
    }

    @Override
    public boolean delete(String MaTV) {
        return tamVangDAO.delete(MaTV);
    }

    @Override
    public List<DonTamVang> findAllTV(String CCCD) {
        String query = "select * from Tamvang join CongDan on Tamvang.CCCD = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS Where TamVang.TrangThai = 1 and Tamvang.CCCD = ?";
        List<DonTamVang> listDonTamVang = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                DonTamVang dtv = new DonTamVang();
                dtv.setMaTV(rs.getString("MaTV"));
                dtv.setHoTen(rs.getString("HoTen"));
                dtv.setNoiChuyenDi(rs.getString("Ncdi"));
                dtv.setNoiChuyenDen(rs.getString("Ncden"));
                dtv.setNgaySinh(rs.getDate("NgaySinh"));
                dtv.setNoiCapCCCD(rs.getString("NcCccd"));
                dtv.setCCCD(rs.getString("CCCD"));
                dtv.setNgayDangKy(rs.getDate("Ngaydk"));
                dtv.setNgayDi(rs.getDate("Ngaydi"));
                dtv.setNgayVe(rs.getDate("Ngayve"));
                dtv.setLyDo(rs.getString("Lydo"));

                
                listDonTamVang.add(dtv);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listDonTamVang;
    }

    @Override
    public int ifExists(String CCCD) {
        String query = "select count(*) as SoLuong  "
                + "from Tamvang where Cccd = ?  "
                + "and TrangThai = 1";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, CCCD);
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
    public List<DonTamVangUser> findAllTVuser(String CCCD) {
        String query = "select * from Tamvang join CongDan on Tamvang.CCCD = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS Where TamVang.TrangThai = 1 and Tamvang.CCCD = ?";
        List<DonTamVangUser> listDonTamVang = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
            DonTamVangUser dtv = new DonTamVangUser();
            dtv.setMaTV(rs.getString("MaTV"));
            dtv.setHoTen(rs.getString("HoTen"));
            dtv.setGioiTinh(rs.getString("GioiTinh"));
            dtv.setNgaySinh(rs.getDate("NgaySinh"));
            dtv.setNgayDk(rs.getDate("Ngaydk"));
            dtv.setCCCD(rs.getString("CCCD"));
            dtv.setNoiCap(rs.getString("NcCccd"));
            dtv.setNgayCap(rs.getDate("NgcCccd"));
            dtv.setSdt(rs.getString("Sdt"));
            dtv.setEmail(rs.getString("Email"));
            dtv.setNoiChuyenDi(rs.getString("Ncdi"));
            dtv.setNoiChuyenDen(rs.getString("Ncden"));
            dtv.setNgayDi(rs.getDate("Ngaydi"));
            dtv.setNgayVe(rs.getDate("Ngayve"));
            dtv.setLydo(rs.getString("Lydo"));
            dtv.setTrangThai(rs.getInt("TrangThai"));
            listDonTamVang.add(dtv);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listDonTamVang;
    }
    
    @Override
    public List<TamVangModel> findAllChuaDuyet() {
        String query = "SELECT Tamvang.ID, MaTV, Tamvang.CCCD, Tamvang.Ngaydk, Ncdi, Ncden, Ngaydi, Ngayve, Lydo, Tamvang.TrangThai, HoTen, NgaySinh, CongDan.NgcCccd, CongDan.NcCccd FROM Tamvang "
                + "INNER JOIN CongDan ON Tamvang.CCCD = CongDan.CCCD "
                + "INNER JOIN KhaiSinh ON CongDan.MaKS = KhaiSinh.MaKS "
                + "AND Tamvang.TrangThai = 2 ORDER BY Tamvang.ID ASC";
        List<TamVangModel> listTamVang = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                TamVangModel tamVang = new TamVangModel();
                tamVang.setID(rs.getInt(1));
                tamVang.setMaTV(rs.getString(2));
                tamVang.setCCCD(rs.getString(3));
                tamVang.setNgaydk(rs.getDate(4));
                tamVang.setNcdi(rs.getString(5));
                tamVang.setNcden(rs.getString(6));
                tamVang.setNgaydi(rs.getDate(7));
                tamVang.setNgayve(rs.getDate(8));
                tamVang.setLydo(rs.getString(9));
                tamVang.setTrangThai(rs.getInt(10));
                tamVang.setHoTen(rs.getString(11));
                tamVang.setNgaySinh(rs.getDate(12));
                tamVang.setNgayCapCCCD(rs.getDate(13));
                tamVang.setNoiCapCCCD(rs.getString(14));
                listTamVang.add(tamVang);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listTamVang;
    }
    
    @Override
    public TamVangModel findOneChuaDuyet(String MaTV) {
        String query = "SELECT * FROM Tamvang WHERE MaTV = ? and TrangThai = 2";
        TamVangModel tamVang = new TamVangModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaTV);
            rs = ps.executeQuery();
            while (rs.next()) {
                tamVang.setID(rs.getInt(1));
                tamVang.setMaTV(rs.getString(2));
                tamVang.setCCCD(rs.getString(3));
                tamVang.setNgaydk(rs.getDate(4));
                tamVang.setNcdi(rs.getString(5));
                tamVang.setNcden(rs.getString(6));
                tamVang.setNgaydi(rs.getDate(7));
                tamVang.setNgayve(rs.getDate(8));
                tamVang.setLydo(rs.getString(9));
                tamVang.setTrangThai(rs.getInt(10));
            }
            conn.close();
        } catch (Exception e) {

        }
        return tamVang;
    }
    
    
}
