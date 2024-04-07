/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import InterfaceDAO.DBConnection;
import InterfaceDAO.IThongKeDAO;
import Models.ThongKeModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUAN
 */
public class ThongKeDAOImpl implements IThongKeDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<ThongKeModel> thongKeDKKSTheoThang() {
        List<ThongKeModel> listThongKe = new ArrayList<>();
        String query = "SELECT CASE DATEPART(month, NgaySinh) "
                + "     WHEN 1 THEN 'January' "
                + "     WHEN 2 THEN 'February' "
                + "     WHEN 3 THEN 'March' "
                + "	WHEN 4 THEN 'April' "
                + "	WHEN 5 THEN 'May' "
                + "	WHEN 6 THEN 'June' "
                + "	WHEN 7 THEN 'July' "
                + "	WHEN 8 THEN 'August' "
                + "	WHEN 9 THEN 'September' "
                + "	WHEN 10 THEN 'October' "
                + "	WHEN 11 THEN 'November' "
                + "	WHEN 12 THEN 'December' "
                + "    ELSE 'Unknown' "
                + "END AS Thang, COUNT(*) AS SoLuongDKKS "
                + "FROM KhaiSinh "
                + "GROUP BY DATEPART(month, NgaySinh) "
                + "ORDER BY CASE DATEPART(month, NgaySinh)"
                + "         WHEN 1 THEN 12 "
                + "         WHEN 2 THEN 11 "
                + "         WHEN 3 THEN 10 "
                + "         WHEN 4 THEN 9 "
                + "         WHEN 5 THEN 8 "
                + "         WHEN 6 THEN 7 "
                + "         WHEN 7 THEN 6 "
                + "         WHEN 8 THEN 5 "
                + "         WHEN 9 THEN 4 "
                + "         WHEN 10 THEN 3 "
                + "         WHEN 11 THEN 2 "
                + "         WHEN 12 THEN 1 "
                + "         ELSE 13  "
                + "END";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ThongKeModel thongKe = new ThongKeModel();
                thongKe.setThang(rs.getString("Thang"));
                thongKe.setSoLuongKhaiSinh(rs.getInt("SoLuongDKKS"));
                listThongKe.add(thongKe);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThongKe;
    }

    @Override
    public List<ThongKeModel> thongKeChungTuTheoThang() {
        List<ThongKeModel> listThongKe = new ArrayList<>();
        String query = "SELECT CASE DATEPART(month, NgayMat) "
                + "     WHEN 1 THEN 'January' "
                + "     WHEN 2 THEN 'February' "
                + "     WHEN 3 THEN 'March' "
                + "	WHEN 4 THEN 'April' "
                + "	WHEN 5 THEN 'May' "
                + "	WHEN 6 THEN 'June' "
                + "	WHEN 7 THEN 'July' "
                + "	WHEN 8 THEN 'August' "
                + "	WHEN 9 THEN 'September' "
                + "	WHEN 10 THEN 'October' "
                + "	WHEN 11 THEN 'November' "
                + "	WHEN 12 THEN 'December' "
                + "    ELSE 'Unknown' "
                + "END AS Thang, COUNT(*) AS SoLuongChungTu "
                + "FROM GiayChungTu "
                + "GROUP BY DATEPART(month, NgayMat) "
                + "ORDER BY CASE DATEPART(month, NgayMat)"
                + "         WHEN 1 THEN 12 "
                + "         WHEN 2 THEN 11 "
                + "         WHEN 3 THEN 10 "
                + "         WHEN 4 THEN 9 "
                + "         WHEN 5 THEN 8 "
                + "         WHEN 6 THEN 7 "
                + "         WHEN 7 THEN 6 "
                + "         WHEN 8 THEN 5 "
                + "         WHEN 9 THEN 4 "
                + "         WHEN 10 THEN 3 "
                + "         WHEN 11 THEN 2 "
                + "         WHEN 12 THEN 1 "
                + "         ELSE 13  "
                + "END";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ThongKeModel thongKe = new ThongKeModel();
                thongKe.setThang(rs.getString("Thang"));
                thongKe.setSoLuongChungTu(rs.getInt("SoLuongChungTu"));
                listThongKe.add(thongKe);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThongKe;
    }

    @Override
    public List<ThongKeModel> thongKeKetHonTheoThang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ThongKeModel> thongKeLyHonTheoThang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
