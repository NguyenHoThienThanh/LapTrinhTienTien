/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.LyHonDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.ILyHonDAO;
import InterfaceService.ILyHonService;
import Models.DonChungNhanKetHon;
import Models.LyHonModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LyHonServiceImpl implements ILyHonService {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    ILyHonDAO lyHonDAO = new LyHonDAOImpl();

    @Override
    public List<LyHonModel> findAll() {
        return lyHonDAO.findAll();
    }

    @Override
    public LyHonModel findOneByMaLH(String MaLH) {
        return lyHonDAO.findOneByMaLH(MaLH);
    }

    @Override
    public boolean insert(LyHonModel lyHon) {
        return lyHonDAO.insert(lyHon);
    }

    @Override
    public boolean update(LyHonModel lyHon) {
        LyHonModel lh = lyHonDAO.findOneByMaLH(lyHon.getMaLh());
        lh.setID(lyHon.getID());
        lh.setMaLh(lyHon.getMaLh());
        lh.setMaCnkh(lyHon.getMaCnkh());
        lh.setCCCDNguoiNopDon(lyHon.getCCCDNguoiNopDon());
        lh.setNoidk(lh.getNoidk());
        lh.setNgaydk(lh.getNgaydk());
        lh.setLydo(lyHon.getLydo());
        return lyHonDAO.update(lh);
    }

    @Override
    public boolean delete(String MaLH) {
        return lyHonDAO.delete(MaLH);
    }

    @Override
    public List<LyHonModel> findAllLH(String CCCDVo, String CCCDChong) {
        String query = "select Lyhon.MaLh as Malyhon, Lyhon.MaCnkh as Makethon, HotenVo, P.CccdVo as CCCDVo, HotenChong, Q.CccdChong as CCCDChong, Lyhon.Noidk as Noidangky, Lyhon.Ngaydk as Ngaydangky, Lydo, CccdNguoiNopDon, Hotennguoinopdon, Lyhon.TrangThai from LyHon join Cnkh on Lyhon.MaCnkh = Cnkh.MaCnkh join (select HoTen as HotenChong, CccdChong from Cnkh join CongDan on Cnkh.CccdChong = CongDan.CCCD)Q on Cnkh.CccdChong = Q.CccdChong join (select HoTen as HotenVo, CccdVo from Cnkh join CongDan on Cnkh.CccdVo = CongDan.CCCD)P on Cnkh.CccdVo = P.CccdVo join (select Malh, Hoten as Hotennguoinopdon from CongDan join Lyhon on CongDan.CCCD = Lyhon.CccdNguoiNopDon) T on T.MaLh = Lyhon.MaLh where LyHon.TrangThai = 1 and (P.CccdVo = ?or Q.CccdChong = ?)";
        List<LyHonModel> listLyHon = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCDVo);
            ps.setString(2, CCCDChong);
            rs = ps.executeQuery();
            while (rs.next()) {
                LyHonModel lh = new LyHonModel();
                lh.setMaLh(rs.getString("Malyhon"));
                lh.setMaCnkh(rs.getString("Makethon"));
                lh.setHoTenNguoiNopDon(rs.getString("Hotennguoinopdon"));
                lh.setCCCDNguoiNopDon(rs.getString("CccdNguoiNopDon"));
                lh.setHoTenVo(rs.getString("HotenVo"));
                lh.setCCCDVO(rs.getString("CCCDVo"));
                lh.setHoTenChong(rs.getString("HotenChong"));
                lh.setCCCDChong(rs.getString("CCCDChong"));
                lh.setNoidk(rs.getString("Noidangky"));
                lh.setNgaydk(rs.getDate("Ngaydangky"));
                lh.setLydo(rs.getString("Lydo"));
                listLyHon.add(lh);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listLyHon;
    }

    @Override
    public DonChungNhanKetHon findOneByMaKH(String MaKH) {
        return lyHonDAO.findOneByMaKH(MaKH);
    }

    @Override
    public List<String> listYear() {
        List<String> year = new ArrayList<>();
        String query = "SELECT nam, COUNT(*) AS so_lan_xuat_hien\n"
                + "FROM (\n"
                + "    SELECT SUBSTRING(CONVERT(varchar, Ngaydk, 23), 1, 4) AS nam\n"
                + "    FROM Lyhon\n"
                + ") AS nam_table\n"
                + "GROUP BY nam\n"
                + "HAVING COUNT(*) >= 2\n"
                + "ORDER BY nam DESC;";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String a;
                a = rs.getString(1);
                year.add(a);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return year;
    }

}
