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
    
}
