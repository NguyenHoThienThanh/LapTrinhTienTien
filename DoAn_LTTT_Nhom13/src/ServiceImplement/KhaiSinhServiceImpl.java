/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.KhaiSinhDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.IKhaiSinhDAO;
import InterfaceService.IKhaiSinhService;
import Models.KhaiSinhModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhaiSinhServiceImpl implements IKhaiSinhService{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    IKhaiSinhDAO khaiSinhDAO = new KhaiSinhDAOImpl();

    @Override
    public List<KhaiSinhModel> findAll() {
        return khaiSinhDAO.findAll();
    }

    @Override
    public KhaiSinhModel findOne(String maKS) {
        return khaiSinhDAO.findOne(maKS);
    }

    @Override
    public boolean insert(KhaiSinhModel model) {
        return khaiSinhDAO.insert(model);
    }

    @Override
    public boolean update(KhaiSinhModel model) {
        KhaiSinhModel ks = khaiSinhDAO.findOne(model.getMaKS());
        ks.setHoTenKS(model.getHoTenKS());
        ks.setGioiTinh(model.getGioiTinh());
        ks.setNgaySinh(model.getNgaySinh());
        ks.setNoiSinh(model.getNoiSinh());
        ks.setDanToc(model.getDanToc());
        ks.setQuocTich(model.getQuocTich());
        ks.setQueQuan(model.getQueQuan());
        ks.setCha(model.getCha());
        ks.setMe(model.getMe());
        ks.setNguoiKhaiSinh(model.getNguoiKhaiSinh());
        ks.setQuanHe(model.getQuanHe());
        ks.setNgayDk(model.getNgayDk());
        ks.setNoiDk(model.getNoiDk());
        ks.setTrangThai(model.getTrangThai());
        return khaiSinhDAO.update(ks);
    }

    @Override
    public boolean delete(String maKS) {
        return khaiSinhDAO.delete(maKS);
    }

    @Override
    public KhaiSinhModel findByCCCD(String CCCD) {
        KhaiSinhModel khaiSinh = new KhaiSinhModel();
        String query = "select * from KhaiSinh join CongDan on KhaiSinh.MaKS = CongDan.MaKS Where CongDan.CCCD = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while(rs.next()){
                khaiSinh.setMaKS(rs.getString("MaKS"));
                khaiSinh.setHoTenKS(rs.getString("HoTenKS"));
                khaiSinh.setGioiTinh(rs.getString("GioiTinh"));
                khaiSinh.setNgaySinh(rs.getDate("NgaySinh"));
                khaiSinh.setNoiSinh(rs.getString("NoiSinh"));
                khaiSinh.setDanToc(rs.getString("DanToc"));
                khaiSinh.setQuocTich(rs.getString("QuocTich"));
                khaiSinh.setQueQuan(rs.getString("QueQuan"));
                khaiSinh.setCha(rs.getString("Cha"));
                khaiSinh.setMe(rs.getString("Me"));
                khaiSinh.setNguoiKhaiSinh(rs.getString("NguoiKhaiSinh"));
                khaiSinh.setQuanHe(rs.getString("QuanHe"));
                khaiSinh.setNgayDk(rs.getDate("NgayDk"));
                khaiSinh.setNoiDk(rs.getString("NoiDk"));
            }
            conn.close();
        }catch(Exception ex){
            
        } 
        return khaiSinh;
    }
    
    @Override
    public List<KhaiSinhModel> findAllChuaDuyet() {
        String query = "select * from KhaiSinh where TrangThai = 2 order by ID ASC";
        List<KhaiSinhModel> listKhaiSinh = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                KhaiSinhModel khaiSinh = new KhaiSinhModel();
                khaiSinh.setID(rs.getInt(1));
                khaiSinh.setMaKS(rs.getString(2));
                khaiSinh.setHoTenKS(rs.getString(3));
                khaiSinh.setGioiTinh(rs.getString(4));
                khaiSinh.setNgaySinh(rs.getDate(5));
                khaiSinh.setNoiSinh(rs.getString(6));
                khaiSinh.setDanToc(rs.getString(7));
                khaiSinh.setQuocTich(rs.getString(8));
                khaiSinh.setQueQuan(rs.getString(9));
                khaiSinh.setCha(rs.getString(10));
                khaiSinh.setMe(rs.getString(11));
                khaiSinh.setNguoiKhaiSinh(rs.getString(12));
                khaiSinh.setQuanHe(rs.getString(13));
                khaiSinh.setNgayDk(rs.getDate(14));
                khaiSinh.setNoiDk(rs.getString(15));
                khaiSinh.setTrangThai(rs.getInt(16));
                listKhaiSinh.add(khaiSinh);
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listKhaiSinh;
    }
    
    
    @Override
    public KhaiSinhModel findOneChuaDuyet(String maKS) {
        KhaiSinhModel khaiSinh = new KhaiSinhModel();
        String query = "select * from KhaiSinh where MaKS=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maKS);
            rs = ps.executeQuery();
            while(rs.next()){
                khaiSinh.setID(rs.getInt(1));
                khaiSinh.setMaKS(rs.getString(2));
                khaiSinh.setHoTenKS(rs.getString(3));
                khaiSinh.setGioiTinh(rs.getString(4));
                khaiSinh.setNgaySinh(rs.getDate(5));
                khaiSinh.setNoiSinh(rs.getString(6));
                khaiSinh.setDanToc(rs.getString(7));
                khaiSinh.setQuocTich(rs.getString(8));
                khaiSinh.setQueQuan(rs.getString(9));
                khaiSinh.setCha(rs.getString(10));
                khaiSinh.setMe(rs.getString(11));
                khaiSinh.setNguoiKhaiSinh(rs.getString(12));
                khaiSinh.setQuanHe(rs.getString(13));
                khaiSinh.setNgayDk(rs.getDate(14));
                khaiSinh.setNoiDk(rs.getString(15));
                khaiSinh.setTrangThai(rs.getInt(16));
            }
            conn.close();
        }catch(Exception ex){
           
        } 
        return khaiSinh;
        
    }
}
