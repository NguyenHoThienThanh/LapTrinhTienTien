/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import Models.ChungNhanKetHonModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import InterfaceDAO.IChungNhanKetHonDAO;
import Models.DonChungNhanKetHon;

/**
 *
 * @author TUAN
 */
public class ChungNhanKetHonDAOImpl implements IChungNhanKetHonDAO{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public List<ChungNhanKetHonModel> findAll() {
        String query = "SELECT * FROM Cnkh WHERE TrangThai = 1";
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
    public ChungNhanKetHonModel findOneByMaKH(String MaKH) {
        ChungNhanKetHonModel chungNhanKetHon = new ChungNhanKetHonModel();
        String query = "select * from Cnkh where MaCnkh=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaKH);
            rs = ps.executeQuery();
            while(rs.next()){
                chungNhanKetHon.setID(rs.getInt(1));
                chungNhanKetHon.setMaCnkh(rs.getString(2));
                chungNhanKetHon.setCCCDVo(rs.getString(3));
                chungNhanKetHon.setCCCDChong(rs.getString(4));
                chungNhanKetHon.setNoidk(rs.getString(5));
                chungNhanKetHon.setNgaydk(rs.getDate(6));
                chungNhanKetHon.setTrangThai(rs.getInt(7));
            }
            conn.close();
        }catch(Exception ex){
            
        } 
        return chungNhanKetHon;
    }

    @Override
    public boolean insert(ChungNhanKetHonModel chungNhanKetHon) {
        String query = "insert into Cnkh(CccdVo, CccdChong, Noidk, Ngaydk, TrangThai) values(?,?,?,?,?)";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, chungNhanKetHon.getCCCDVo());
            ps.setString(2, chungNhanKetHon.getCCCDChong());
            ps.setString(3, chungNhanKetHon.getNoidk());
            ps.setDate(4,(Date) chungNhanKetHon.getNgaydk());
            ps.setInt(5, chungNhanKetHon.getTrangThai());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(ChungNhanKetHonModel chungNhanKetHon) {
        String query = "UPDATE Cnkh SET CccdVo =?, CccdChong =?, Noidk=?, Ngaydk=?, TrangThai=? WHERE MaCnkh = ?";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, chungNhanKetHon.getCCCDVo());
            ps.setString(2, chungNhanKetHon.getCCCDChong());
            ps.setString(3, chungNhanKetHon.getNoidk());
            ps.setDate(4,(Date) chungNhanKetHon.getNgaydk());
            ps.setInt(5, chungNhanKetHon.getTrangThai());
            ps.setString(6, chungNhanKetHon.getMaCnkh());
            ps.executeUpdate();
            conn.close();
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String MaKH) {
        String query = "DELETE Cnkh WHERE MaCnkh = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, MaKH);
            ps.executeUpdate();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    @Override
    public ChungNhanKetHonModel findOneCNKH(String Giaytotuythanvo, String Giaytotuythanchong) {
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
            "	join HoKhau on QuanHe.MaHK = HoKhau.MaHK where QuanHe.TrangThai = 1)P on Cnkh.CccdVo = P.Giaytotuythanvo where Cnkh.TrangThai = 1 and (Giaytotuythanchong = ? or Giaytotuythanvo = ?)";

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
}
