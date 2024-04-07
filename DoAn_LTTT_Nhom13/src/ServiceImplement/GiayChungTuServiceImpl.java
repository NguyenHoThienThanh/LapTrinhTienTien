/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.GiayChungTuDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.IGiayChungTuDAO;
import InterfaceService.IGiayChungTuService;
import Models.GiayChungTuModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GiayChungTuServiceImpl implements IGiayChungTuService{

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    IGiayChungTuDAO giayChungTuDAO = new GiayChungTuDAOImpl();
    @Override
    public List<GiayChungTuModel> findAll() {
        return giayChungTuDAO.findAll();
    }

    @Override
    public GiayChungTuModel findOneByMaCT(String MaCT) {
        return giayChungTuDAO.findOneByMaCT(MaCT);
    }

    @Override
    public boolean insert(GiayChungTuModel model) {
        return giayChungTuDAO.insert(model);
    }

    @Override
    public boolean update(GiayChungTuModel model) {
        GiayChungTuModel gct = giayChungTuDAO.findOneByMaCT(model.getMaCT());
        gct.setID(model.getID());
        gct.setMaCT(model.getMaCT());
        gct.setCCCD(model.getCCCD());
        gct.setNgayMat(model.getNgayMat());
        gct.setNoiMat(model.getNoiMat());
        gct.setNguyenNhan(model.getNguyenNhan());
        gct.setTrangThai(model.getTrangThai());
        return giayChungTuDAO.update(model);
    }

    @Override
    public boolean delete(String MaCT) {
        return giayChungTuDAO.delete(MaCT);
    }

    @Override
    public GiayChungTuModel findAllGCT(String CCCD) {
        String query = "select MaCT, GiayChungTu.CCCD, HoTen,NgaySinh, NgayMat, NoiMat, NguyenNhan from GiayChungTu join (select CCCD, NgaySinh, HoTen from KhaiSinh join CongDan on KhaiSinh.MaKS = CongDan.MaKS) Q on GiayChungTu.CCCD = Q.CCCD Where GiayChungTu.CCCD = ?";
        GiayChungTuModel gct = new GiayChungTuModel();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                gct.setMaCT(rs.getString("MaCT"));
                gct.setCCCD(rs.getString("CCCD"));
                gct.setHoTen(rs.getString("HoTen"));
                gct.setNgaySinh(rs.getDate("NgaySinh"));
                gct.setNgayMat(rs.getDate("NgayMat"));
                gct.setNoiMat(rs.getString("NoiMat"));
                gct.setNguyenNhan(rs.getString("NguyenNhan"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gct;
    }
    
}
