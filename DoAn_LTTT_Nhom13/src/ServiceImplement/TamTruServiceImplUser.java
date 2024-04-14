/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.TamTruDAOImplUser;
import InterfaceDAO.DBConnection;
import InterfaceDAO.ITamTruDAOUser;
import InterfaceService.ITamTruServiceUser;
import Models.DonTamTruUser;
import Models.TamTruModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class TamTruServiceImplUser implements ITamTruServiceUser{
    ITamTruDAOUser tamTruDAOUser = new TamTruDAOImplUser();
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<TamTruModel> findAll() {
        return tamTruDAOUser.findAll();
    }

    @Override
    public DonTamTruUser findOne(String maTT) {
        return tamTruDAOUser.findOne(maTT);
    }

    @Override
    public boolean insert(DonTamTruUser model) {
        return tamTruDAOUser.insert(model);
    }

    @Override
    public boolean update(DonTamTruUser model) {
        DonTamTruUser tt = tamTruDAOUser.findOne(model.getMaTT());
        tt.setMaTT(model.getMaTT());
        tt.setHoTen(model.getHoTen());
        tt.setGioiTinh(model.getGioiTinh());
        tt.setNgaySinh(model.getNgaySinh());
        tt.setNgayDk(model.getNgayDk());
        tt.setCCCD(model.getCCCD());
        tt.setNoiCap(model.getNoiCap());
        tt.setNgayCap(model.getNgayCap());
        tt.setSdt(model.getSdt());
        tt.setEmail(model.getEmail());
        tt.setLiDo(model.getLiDo());
        tt.setNgayDen(model.getNgayDen());
        tt.setNgayDi(model.getNgayDi());
        tt.setNoiDangKy(model.getNoiDangKy());
        return tamTruDAOUser.update(tt);
    }

    @Override
    public boolean delete(String maTT) {
        return tamTruDAOUser.delete(maTT);
    }

    @Override
    public List<DonTamTruUser> findAllTT(String CCCD) {
         String query = "select * from Tamtru join CongDan on Tamtru.Cccd = CongDan.CCCD join KhaiSinh on CongDan.MaKS = KhaiSinh.MaKS Where TamTru.TrangThai = 1 and Tamtru.Cccd = ?";
        List<DonTamTruUser> listDonTamTru = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                DonTamTruUser dtt = new DonTamTruUser();
                dtt.setMaTT(rs.getString("MaTT"));
                dtt.setHoTen(rs.getString("HoTen"));
                dtt.setNgaySinh(rs.getDate("NgaySinh"));
                dtt.setCCCD(rs.getString("Cccd"));
                dtt.setNoiCap(rs.getString("NcCccd"));
                dtt.setNgayCap(rs.getDate("NgcCccd"));
                dtt.setNgayDen(rs.getDate("NgayDen"));
                dtt.setNgayDi(rs.getDate("NgayDi"));
                dtt.setNgayDk(rs.getDate("NgayDk"));
                dtt.setLiDo(rs.getString("LyDo"));
                dtt.setNoiDangKy(rs.getString("NoiDk"));
                dtt.setGioiTinh(rs.getString("GioiTinh"));
                dtt.setSdt(rs.getString("SDT"));
                dtt.setEmail(rs.getString("Email"));
                listDonTamTru.add(dtt);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listDonTamTru;
    }
}
