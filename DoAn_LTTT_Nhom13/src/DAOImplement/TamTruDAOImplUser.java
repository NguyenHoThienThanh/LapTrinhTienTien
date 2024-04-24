/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.ITamTruDAOUser;
import Models.DonTamTruUser;
import Models.TamTruModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class TamTruDAOImplUser implements ITamTruDAOUser{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<DonTamTruUser> findAllTT(String CCCD) {
        String query = "SELECT * FROM Tamtru WHERE TrangThai = 1";
        List<DonTamTruUser> listTamTru = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DonTamTruUser tamTru = new DonTamTruUser();
                tamTru.setMaTT(rs.getString(1));
                tamTru.setHoTen(rs.getString(2));
                tamTru.setGioiTinh(rs.getString(3));
                tamTru.setNgaySinh(rs.getDate(4));
                tamTru.setNgayDk(rs.getDate(5));
                tamTru.setCCCD(rs.getString(6));
                tamTru.setNoiCap(rs.getString(7));
                tamTru.setNgayCap(rs.getDate(8));
                tamTru.setSdt(rs.getString(9));                
                tamTru.setEmail(rs.getString(10));
                tamTru.setLiDo(rs.getString(11));
                tamTru.setNgayDen(rs.getDate(12));
                tamTru.setNgayDi(rs.getDate(13));
                tamTru.setNoiDangKy(rs.getString(14));                
                listTamTru.add(tamTru);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listTamTru;
    }

    @Override
    public DonTamTruUser findOne(String maTT) {
        DonTamTruUser tamTru = new DonTamTruUser();
        String query = "SELECT Tamtru.MaTT, CongDan.HoTen, KhaiSinh.GioiTinh, KhaiSinh.NgaySinh, Tamtru.Ngaydk AS NgayDk, Tamtru.CCCD, CongDan.NcCccd AS NoiCap, CongDan.NgcCccd AS NgayCap, CongDan.SDT AS Sdt, CongDan.Email, Tamtru.Lydo, Tamtru.Ngayden AS NgayDen, Tamtru.Ngaydi AS NgayDi, Tamtru.Noidk AS NoiDangKy, Tamtru.TrangThai FROM Tamtru INNER JOIN CongDan ON Tamtru.CCCD = CongDan.CCCD LEFT JOIN KhaiSinh ON CongDan.MaKS = KhaiSinh.MaKS WHERE Tamtru.CCCD = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maTT);
            rs = ps.executeQuery();
            while(rs.next()){
                tamTru.setMaTT(rs.getString(1));
                tamTru.setHoTen(rs.getString(2));
                tamTru.setGioiTinh(rs.getString(3));
                tamTru.setNgaySinh(rs.getDate(4));
                tamTru.setNgayDk(rs.getDate(5));
                tamTru.setCCCD(rs.getString(6));
                tamTru.setNoiCap(rs.getString(7));
                tamTru.setNgayCap(rs.getDate(8));
                tamTru.setSdt(rs.getString(9));                
                tamTru.setEmail(rs.getString(10));
                tamTru.setLiDo(rs.getString(11));
                tamTru.setNgayDen(rs.getDate(12));
                tamTru.setNgayDi(rs.getDate(13));
                tamTru.setNoiDangKy(rs.getString(14));                

            }
            conn.close();
        }catch(Exception ex){
            
        } 
        return tamTru;
    }
    
    @Override
    public boolean insert(DonTamTruUser tamTru) {
        String query = "INSERT INTO Tamtru(Cccd, Ngaydk, Noidk, Ngayden, Ngaydi, Lydo, TrangThai) VALUES(?,?,?,?,?,?,?)";
        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(query)) {

            // Assuming the order of parameters in your query corresponds correctly to the object properties
            ps.setString(1, tamTru.getCCCD());
            ps.setDate(2, new java.sql.Date(tamTru.getNgayDk().getTime()));
            ps.setString(3, tamTru.getNoiDangKy());
            ps.setDate(4, new java.sql.Date(tamTru.getNgayDen().getTime()));
            ps.setDate(5, new java.sql.Date(tamTru.getNgayDi().getTime()));
            ps.setString(6, tamTru.getLiDo());
            ps.setInt(7, 1); // Assuming you have a getter for TrangThai

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
            return false;
        }
        return true;
    }


    @Override
    public boolean update(DonTamTruUser tamTru) {
        String query = "UPDATE Tamtru SET Ngaydk=?, Noidk=?, Ngayden=?, Ngaydi=?, Lydo =?, TrangThai=? WHERE MaTT=?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tamTru.getMaTT());
            ps.setString(2, tamTru.getHoTen());
            ps.setString(3, tamTru.getGioiTinh());
            ps.setDate(4, new java.sql.Date(tamTru.getNgaySinh().getTime()));
            ps.setDate(5, new java.sql.Date(tamTru.getNgayDk().getTime()));
            ps.setString(6, tamTru.getCCCD());
            ps.setString(7, tamTru.getNoiCap());
            ps.setDate(8, new java.sql.Date(tamTru.getNgayCap().getTime()));
            ps.setString(9, tamTru.getSdt());
            ps.setString(10, tamTru.getEmail());
            ps.setString(11, tamTru.getLiDo());
            ps.setDate(12, new java.sql.Date(tamTru.getNgayDen().getTime()));
            ps.setDate(13, new java.sql.Date(tamTru.getNgayDi().getTime()));
            ps.setString(14, tamTru.getNoiDangKy());
            ps.executeUpdate();
            conn.close();
        }catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String maTT) {
        String query = "DELETE Tamtru WHERE MaTT = ?";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maTT);
            ps.executeUpdate();
        }catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public List<TamTruModel> findAll() {
        String query = "SELECT * FROM Tamtru WHERE TrangThai = 1";
        List<TamTruModel> listTamTru = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                TamTruModel tamTru = new TamTruModel();
                tamTru.setID(rs.getInt(1));
                tamTru.setMaTT(rs.getString(2));
                tamTru.setCCCD(rs.getString(3));
                tamTru.setNgaydk(rs.getDate(4));
                tamTru.setNoidk(rs.getString(5));
                tamTru.setNgayden(rs.getDate(6));
                tamTru.setNgaydi(rs.getDate(7));
                tamTru.setLydo(rs.getString(8));
                tamTru.setTrangThai(rs.getInt(9));
                listTamTru.add(tamTru);
            }
            conn.close();
        } catch (Exception e) {

        }
        return listTamTru;
    }

}
