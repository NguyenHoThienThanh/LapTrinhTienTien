/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.ChungNhanKetHonDAOImpl;
import DAOImplement.KhaiSinhDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.IChungNhanKetHonDAO;
import InterfaceDAO.IKhaiSinhDAO;
import InterfaceService.IChungNhanKetHonService;
import Models.ChungNhanKetHonModel;

import Models.DonChungNhanKetHon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChungNhanKetHonServiceImpl implements IChungNhanKetHonService{
    
    IChungNhanKetHonDAO cnkhDAO = new ChungNhanKetHonDAOImpl();
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<ChungNhanKetHonModel> findAll() {
        return cnkhDAO.findAll();
    }

    @Override
    public ChungNhanKetHonModel findOneByMaKH(String MaKH) {
        return cnkhDAO.findOneByMaKH(MaKH);
    }

    @Override
    public boolean insert(ChungNhanKetHonModel chungNhanKetHon) {
        return cnkhDAO.insert(chungNhanKetHon);
    }

    @Override
    public boolean update(ChungNhanKetHonModel chungNhanKetHonModel) {
        ChungNhanKetHonModel cnkh = cnkhDAO.findOneByMaKH(chungNhanKetHonModel.getMaCnkh());
        cnkh.setID(chungNhanKetHonModel.getID());
        cnkh.setMaCnkh(chungNhanKetHonModel.getMaCnkh());
        cnkh.setCCCDVo(chungNhanKetHonModel.getCCCDVo());
        cnkh.setCCCDChong(chungNhanKetHonModel.getCCCDChong());
        cnkh.setNoidk(chungNhanKetHonModel.getNoidk());
        cnkh.setNgaydk(chungNhanKetHonModel.getNgaydk());
        cnkh.setTrangThai(chungNhanKetHonModel.getTrangThai());
        return cnkhDAO.update(cnkh);
    }

    @Override
    public boolean delete(String MaKH) {
        return cnkhDAO.delete(MaKH);
    }

    @Override
    public List<DonChungNhanKetHon> findAllCNKH(String CCCDVo, String CCCDChong) {
        String query = "select * from Cnkh join (select HoTen as Hotenchong, NgaySinh as Ngaysinhchong, DanToc as Dantocchong, QuocTich as Quoctichchong, DiaChi as Noicutruchong, CccdChong as Giaytotuythanchong, Cnkh.TrangThai from Cnkh join CongDan on Cnkh.CccdChong = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS  join QuanHe on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia join HoKhau on QuanHe.MaHK = HoKhau.MaHK where QuanHe.TrangThai = 1)Q on Cnkh.CccdChong = Q.Giaytotuythanchong join (select HoTen as Hotenvo, NgaySinh as Ngaysinhvo, DanToc as Dantocvo, QuocTich as Quoctichvo, DiaChi as Noicutruvo,CccdVo as Giaytotuythanvo from Cnkh join CongDan on Cnkh.CccdVo = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS join QuanHe on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia join HoKhau on QuanHe.MaHK = HoKhau.MaHK where QuanHe.TrangThai = 1)P on Cnkh.CccdVo = P.Giaytotuythanvo where Cnkh.TrangThai = 1 and (Giaytotuythanchong = ? or Giaytotuythanvo = ?)";
        List<DonChungNhanKetHon> listDonChungNhanKetHon = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCDVo);
            ps.setString(2, CCCDChong);
            rs = ps.executeQuery();
            while (rs.next()) {
                DonChungNhanKetHon dcnkh = new DonChungNhanKetHon();
                dcnkh.setCCCDChong(rs.getString("Giaytotuythanchong"));
                dcnkh.setCCCDVo(rs.getString("Giaytotuythanvo"));
                dcnkh.setNgaySinhChong(rs.getDate("Ngaysinhchong"));
                dcnkh.setQuocTichChong(rs.getString("Quoctichchong"));
                dcnkh.setNgaySinhVo(rs.getDate("Ngaysinhvo"));
                dcnkh.setQuocTichVo(rs.getString("Quoctichvo"));
                dcnkh.setDanTocChong(rs.getString("Dantocchong"));
                dcnkh.setDanTocVo(rs.getString("Dantocvo"));
                dcnkh.setHoTenChong(rs.getString("Hotenchong"));
                dcnkh.setHoTenVo(rs.getString("Hotenvo"));
                dcnkh.setNoiCuTruChong(rs.getString("Noicutruchong"));
                dcnkh.setNoiCuTruVo(rs.getString("Noicutruvo"));
                dcnkh.setMaCnkh(rs.getString("MaCnkh"));
                dcnkh.setNgaydk(rs.getDate("Ngaydk"));
                dcnkh.setNoidk(rs.getString("Noidk"));
                
                listDonChungNhanKetHon.add(dcnkh);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listDonChungNhanKetHon;
    }
    
    @Override
    public List<ChungNhanKetHonModel> findAllChuaDuyet() {
        String query = "SELECT * FROM Cnkh WHERE TrangThai = 2";
        List<ChungNhanKetHonModel> listChungNhanKetHon = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChungNhanKetHonModel chungNhanKetHon = new ChungNhanKetHonModel();
                chungNhanKetHon.setID(rs.getInt(1));
                chungNhanKetHon.setMaCnkh(rs.getString(2));
                chungNhanKetHon.setCCCDVo(rs.getString(3));
                chungNhanKetHon.setCCCDChong(rs.getString(4));
                chungNhanKetHon.setNoidk(rs.getString(5));
                chungNhanKetHon.setNgaydk(rs.getDate(6));
                chungNhanKetHon.setTrangThai(rs.getInt(7));
                listChungNhanKetHon.add(chungNhanKetHon);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listChungNhanKetHon;
    }
    
    
    @Override
    public ChungNhanKetHonModel findOneChuaDuyet(String Giaytotuythanvo, String Giaytotuythanchong) {
        ChungNhanKetHonModel dcnkh = new ChungNhanKetHonModel();
        String query = "select Giaytotuythanchong, Giaytotuythanvo, Ngaysinhchong, Quoctichchong, Ngaysinhvo, Quoctichvo, Dantocchong, Dantocvo, Hotenchong, Hotenvo, Noicutruchong, Noicutruvo, MaCnkh, Ngaydk, Noidk from Cnkh \n" +
            "	join (select HoTen as Hotenchong, NgaySinh as Ngaysinhchong, DanToc as Dantocchong, QuocTich as Quoctichchong, DiaChi as Noicutruchong, CccdChong as Giaytotuythanchong, Cnkh.TrangThai from Cnkh \n" +
            "	join CongDan on Cnkh.CccdChong = CongDan.CCCD \n" +
            "	join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS  \n" +
            "	join QuanHe on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia \n" +
            "	join HoKhau on QuanHe.MaHK = HoKhau.MaHK \n" +
            "	where QuanHe.TrangThai = 1)Q on Cnkh.CccdChong = Q.Giaytotuythanchong \n" +
            "	join (select HoTen as Hotenvo, NgaySinh as Ngaysinhvo, DanToc as Dantocvo, QuocTich as Quoctichvo, DiaChi as Noicutruvo,CccdVo as Giaytotuythanvo from Cnkh \n" +
            "	join CongDan on Cnkh.CccdVo = CongDan.CCCD \n" +
            "	join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS \n" +
            "	join QuanHe on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia \n" +
            "	join HoKhau on QuanHe.MaHK = HoKhau.MaHK where QuanHe.TrangThai = 1)P on Cnkh.CccdVo = P.Giaytotuythanvo where Cnkh.TrangThai = 2 and (Giaytotuythanchong = ? or Giaytotuythanvo = ?)";

        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, Giaytotuythanchong);
            ps.setString(2, Giaytotuythanvo);
            rs = ps.executeQuery();
            while (rs.next()) {
                dcnkh.setCCCDChong(rs.getString(1));
                dcnkh.setCCCDVo(rs.getString(2));
                dcnkh.setNgaySinhChong(rs.getDate(3));
                dcnkh.setQuocTichChong(rs.getString(4));
                dcnkh.setNgaySinhVo(rs.getDate(5));
                dcnkh.setQuocTichVo(rs.getString(6));
                dcnkh.setDanTocChong(rs.getString(7));
                dcnkh.setDanTocVo(rs.getString(8));
                dcnkh.setHoTenChong(rs.getString(9));
                dcnkh.setHoTenVo(rs.getString(10));
                dcnkh.setNoiCuTruChong(rs.getString(11));
                dcnkh.setNoiCuTruVo(rs.getString(12));
                dcnkh.setMaCnkh(rs.getString(13));
                dcnkh.setNgaydk(rs.getDate(14));
                dcnkh.setNoidk(rs.getString(15));
                
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return dcnkh;
    }
    
    
    @Override
    public List<ChungNhanKetHonModel> findAllKetHon() {
        String query = "select DISTINCT * from Cnkh join (select HoTen as Hotenchong, NgaySinh as Ngaysinhchong, DanToc as Dantocchong, QuocTich as Quoctichchong, DiaChi as Noicutruchong, CccdChong as Giaytotuythanchong, Cnkh.TrangThai from Cnkh join CongDan on Cnkh.CccdChong = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS  join QuanHe on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia join HoKhau on QuanHe.MaHK = HoKhau.MaHK where QuanHe.TrangThai = 1 and Cnkh.TrangThai = 1)Q on Cnkh.CccdChong = Q.Giaytotuythanchong join (select HoTen as Hotenvo, NgaySinh as Ngaysinhvo, DanToc as Dantocvo, QuocTich as Quoctichvo, DiaChi as Noicutruvo,CccdVo as Giaytotuythanvo from Cnkh join CongDan on Cnkh.CccdVo = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS join QuanHe on KhaiSinh.MaKS = QuanHe.KhaiSinhNguoiThamGia join HoKhau on QuanHe.MaHK = HoKhau.MaHK where QuanHe.TrangThai = 1 and Cnkh.TrangThai = 1)P on Cnkh.CccdVo = P.Giaytotuythanvo where Cnkh.TrangThai = 1 ";
        List<ChungNhanKetHonModel> listChungNhanKetHon = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChungNhanKetHonModel dcnkh = new ChungNhanKetHonModel();
                dcnkh.setCCCDChong(rs.getString("Giaytotuythanchong"));
                dcnkh.setCCCDVo(rs.getString("Giaytotuythanvo"));
                dcnkh.setNgaySinhChong(rs.getDate("Ngaysinhchong"));
                dcnkh.setQuocTichChong(rs.getString("Quoctichchong"));
                dcnkh.setNgaySinhVo(rs.getDate("Ngaysinhvo"));
                dcnkh.setQuocTichVo(rs.getString("Quoctichvo"));
                dcnkh.setDanTocChong(rs.getString("Dantocchong"));
                dcnkh.setDanTocVo(rs.getString("Dantocvo"));
                dcnkh.setHoTenChong(rs.getString("Hotenchong"));
                dcnkh.setHoTenVo(rs.getString("Hotenvo"));
                dcnkh.setNoiCuTruChong(rs.getString("Noicutruchong"));
                dcnkh.setNoiCuTruVo(rs.getString("Noicutruvo"));
                dcnkh.setMaCnkh(rs.getString("MaCnkh"));
                dcnkh.setNgaydk(rs.getDate("Ngaydk"));
                dcnkh.setNoidk(rs.getString("Noidk"));
                listChungNhanKetHon.add(dcnkh);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listChungNhanKetHon;
    }
}
