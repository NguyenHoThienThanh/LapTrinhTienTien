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
    public List<ThongKeModel> thongKeDKKSTheoThangTheoNam(String year) {
        List<ThongKeModel> listThongKe = new ArrayList<>();
        String query = "SELECT\n"
                + "  CASE WHEN MONTH(NgaySinh) = 1 THEN 'January'\n"
                + "       WHEN MONTH(NgaySinh) = 2 THEN 'February'\n"
                + "       WHEN MONTH(NgaySinh) = 3 THEN 'March'\n"
                + "       WHEN MONTH(NgaySinh) = 4 THEN 'April'\n"
                + "       WHEN MONTH(NgaySinh) = 5 THEN 'May'\n"
                + "       WHEN MONTH(NgaySinh) = 6 THEN 'June'\n"
                + "       WHEN MONTH(NgaySinh) = 7 THEN 'July'\n"
                + "       WHEN MONTH(NgaySinh) = 8 THEN 'August'\n"
                + "       WHEN MONTH(NgaySinh) = 9 THEN 'September'\n"
                + "       WHEN MONTH(NgaySinh) = 10 THEN 'October'\n"
                + "       WHEN MONTH(NgaySinh) = 11 THEN 'November'\n"
                + "       WHEN MONTH(NgaySinh) = 12 THEN 'December'\n"
                + "       ELSE 'Unknown'\n"
                + "  END AS Thang,\n"
                + "  COUNT(*) AS SoLuongDKKS\n"
                + "FROM KhaiSinh\n"
                + "WHERE YEAR(NgaySinh) = ?\n"
                + "GROUP BY MONTH(NgaySinh)\n"
                + "ORDER BY CASE WHEN MONTH(NgaySinh) = 1 THEN 12\n"
                + "       WHEN MONTH(NgaySinh) = 2 THEN 11\n"
                + "       WHEN MONTH(NgaySinh) = 3 THEN 10\n"
                + "       WHEN MONTH(NgaySinh) = 4 THEN 9\n"
                + "       WHEN MONTH(NgaySinh) = 5 THEN 8\n"
                + "       WHEN MONTH(NgaySinh) = 6 THEN 7\n"
                + "       WHEN MONTH(NgaySinh) = 7 THEN 6\n"
                + "       WHEN MONTH(NgaySinh) = 8 THEN 5\n"
                + "       WHEN MONTH(NgaySinh) = 9 THEN 4\n"
                + "       WHEN MONTH(NgaySinh) = 10 THEN 3\n"
                + "       WHEN MONTH(NgaySinh) = 11 THEN 2\n"
                + "       WHEN MONTH(NgaySinh) = 12 THEN 1\n"
                + "       ELSE 'Unknown'\n"
                + "END";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, year);
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

    public static void main(String[] args) {
        List<ThongKeModel> model = new ThongKeDAOImpl().thongKeDKKSTheoThangTheoNam("2003");
        for (ThongKeModel m : model) {
            System.out.println(m.getThang() + " " + m.getSoLuongKhaiSinh());
        }
    }

    @Override
    public List<ThongKeModel> thongKeChungTuTheoThangTheoNam(String year) {
        List<ThongKeModel> listThongKe = new ArrayList<>();
        String query = "SELECT\n"
                + "  CASE WHEN MONTH(NgayMat) = 1 THEN 'January'\n"
                + "       WHEN MONTH(NgayMat) = 2 THEN 'February'\n"
                + "       WHEN MONTH(NgayMat) = 3 THEN 'March'\n"
                + "       WHEN MONTH(NgayMat) = 4 THEN 'April'\n"
                + "       WHEN MONTH(NgayMat) = 5 THEN 'May'\n"
                + "       WHEN MONTH(NgayMat) = 6 THEN 'June'\n"
                + "       WHEN MONTH(NgayMat) = 7 THEN 'July'\n"
                + "       WHEN MONTH(NgayMat) = 8 THEN 'August'\n"
                + "       WHEN MONTH(NgayMat) = 9 THEN 'September'\n"
                + "       WHEN MONTH(NgayMat) = 10 THEN 'October'\n"
                + "       WHEN MONTH(NgayMat) = 11 THEN 'November'\n"
                + "       WHEN MONTH(NgayMat) = 12 THEN 'December'\n"
                + "       ELSE 'Unknown'\n"
                + "  END AS Thang,\n"
                + "  COUNT(*) AS SoLuongChungTu\n"
                + "FROM GiayChungTu\n"
                + "WHERE YEAR(NgayMat) = ?\n"
                + "GROUP BY MONTH(NgayMat)\n"
                + "ORDER BY CASE WHEN MONTH(NgayMat) = 1 THEN 12\n"
                + "       WHEN MONTH(NgayMat) = 2 THEN 11\n"
                + "       WHEN MONTH(NgayMat) = 3 THEN 10\n"
                + "       WHEN MONTH(NgayMat) = 4 THEN 9\n"
                + "       WHEN MONTH(NgayMat) = 5 THEN 8\n"
                + "       WHEN MONTH(NgayMat) = 6 THEN 7\n"
                + "       WHEN MONTH(NgayMat) = 7 THEN 6\n"
                + "       WHEN MONTH(NgayMat) = 8 THEN 5\n"
                + "       WHEN MONTH(NgayMat) = 9 THEN 4\n"
                + "       WHEN MONTH(NgayMat) = 10 THEN 3\n"
                + "       WHEN MONTH(NgayMat) = 11 THEN 2\n"
                + "       WHEN MONTH(NgayMat) = 12 THEN 1\n"
                + "       ELSE 'Unknown'\n"
                + "END";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, year);
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
    public List<ThongKeModel> thongKeKetHonTheoThangTheoNam(String year) {
        List<ThongKeModel> listThongKe = new ArrayList<>();
        String query = "SELECT\n"
                + "  CASE WHEN MONTH(Ngaydk) = 1 THEN 'January'\n"
                + "       WHEN MONTH(Ngaydk) = 2 THEN 'February'\n"
                + "       WHEN MONTH(Ngaydk) = 3 THEN 'March'\n"
                + "       WHEN MONTH(Ngaydk) = 4 THEN 'April'\n"
                + "       WHEN MONTH(Ngaydk) = 5 THEN 'May'\n"
                + "       WHEN MONTH(Ngaydk) = 6 THEN 'June'\n"
                + "       WHEN MONTH(Ngaydk) = 7 THEN 'July'\n"
                + "       WHEN MONTH(Ngaydk) = 8 THEN 'August'\n"
                + "       WHEN MONTH(Ngaydk) = 9 THEN 'September'\n"
                + "       WHEN MONTH(Ngaydk) = 10 THEN 'October'\n"
                + "       WHEN MONTH(Ngaydk) = 11 THEN 'November'\n"
                + "       WHEN MONTH(Ngaydk) = 12 THEN 'December'\n"
                + "       ELSE 'Unknown'\n"
                + "  END AS Thang,\n"
                + "  COUNT(*) AS SoLuongKetHon\n"
                + "FROM Cnkh\n"
                + "WHERE YEAR(Ngaydk) = ?\n"
                + "GROUP BY MONTH(Ngaydk)\n"
                + "ORDER BY CASE WHEN MONTH(Ngaydk) = 1 THEN 12\n"
                + "       WHEN MONTH(Ngaydk) = 2 THEN 11\n"
                + "       WHEN MONTH(Ngaydk) = 3 THEN 10\n"
                + "       WHEN MONTH(Ngaydk) = 4 THEN 9\n"
                + "       WHEN MONTH(Ngaydk) = 5 THEN 8\n"
                + "       WHEN MONTH(Ngaydk) = 6 THEN 7\n"
                + "       WHEN MONTH(Ngaydk) = 7 THEN 6\n"
                + "       WHEN MONTH(Ngaydk) = 8 THEN 5\n"
                + "       WHEN MONTH(Ngaydk) = 9 THEN 4\n"
                + "       WHEN MONTH(Ngaydk) = 10 THEN 3\n"
                + "       WHEN MONTH(Ngaydk) = 11 THEN 2\n"
                + "       WHEN MONTH(Ngaydk) = 12 THEN 1\n"
                + "       ELSE 'Unknown'\n"
                + "END";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, year);
            rs = ps.executeQuery();
            while (rs.next()) {
                ThongKeModel thongKe = new ThongKeModel();
                thongKe.setThang(rs.getString("Thang"));
                thongKe.setSoLuongKetHon(rs.getInt("SoLuongKetHon"));
                listThongKe.add(thongKe);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThongKe;
    }

    @Override
    public List<ThongKeModel> thongKeLyHonTheoThangTheoNam(String year) {
        List<ThongKeModel> listThongKe = new ArrayList<>();
        String query = "SELECT\n"
                + "  CASE WHEN MONTH(Ngaydk) = 1 THEN 'January'\n"
                + "       WHEN MONTH(Ngaydk) = 2 THEN 'February'\n"
                + "       WHEN MONTH(Ngaydk) = 3 THEN 'March'\n"
                + "       WHEN MONTH(Ngaydk) = 4 THEN 'April'\n"
                + "       WHEN MONTH(Ngaydk) = 5 THEN 'May'\n"
                + "       WHEN MONTH(Ngaydk) = 6 THEN 'June'\n"
                + "       WHEN MONTH(Ngaydk) = 7 THEN 'July'\n"
                + "       WHEN MONTH(Ngaydk) = 8 THEN 'August'\n"
                + "       WHEN MONTH(Ngaydk) = 9 THEN 'September'\n"
                + "       WHEN MONTH(Ngaydk) = 10 THEN 'October'\n"
                + "       WHEN MONTH(Ngaydk) = 11 THEN 'November'\n"
                + "       WHEN MONTH(Ngaydk) = 12 THEN 'December'\n"
                + "       ELSE 'Unknown'\n"
                + "  END AS Thang,\n"
                + "  COUNT(*) AS SoLuongLyHon\n"
                + "FROM Lyhon\n"
                + "WHERE YEAR(Ngaydk) = ?\n"
                + "GROUP BY MONTH(Ngaydk)\n"
                + "ORDER BY CASE WHEN MONTH(Ngaydk) = 1 THEN 12\n"
                + "       WHEN MONTH(Ngaydk) = 2 THEN 11\n"
                + "       WHEN MONTH(Ngaydk) = 3 THEN 10\n"
                + "       WHEN MONTH(Ngaydk) = 4 THEN 9\n"
                + "       WHEN MONTH(Ngaydk) = 5 THEN 8\n"
                + "       WHEN MONTH(Ngaydk) = 6 THEN 7\n"
                + "       WHEN MONTH(Ngaydk) = 7 THEN 6\n"
                + "       WHEN MONTH(Ngaydk) = 8 THEN 5\n"
                + "       WHEN MONTH(Ngaydk) = 9 THEN 4\n"
                + "       WHEN MONTH(Ngaydk) = 10 THEN 3\n"
                + "       WHEN MONTH(Ngaydk) = 11 THEN 2\n"
                + "       WHEN MONTH(Ngaydk) = 12 THEN 1\n"
                + "       ELSE 'Unknown'\n"
                + "END";
        try {
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, year);
            rs = ps.executeQuery();
            while (rs.next()) {
                ThongKeModel thongKe = new ThongKeModel();
                thongKe.setThang(rs.getString("Thang"));
                thongKe.setSoLuongLyHon(rs.getInt("SoLuongLyHon"));
                listThongKe.add(thongKe);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThongKe;
    }

}
