/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.ThueDAOImpl;
import InterfaceDAO.DBConnection;
import InterfaceDAO.IThueDAO;
import InterfaceService.IThueService;
import Models.ThueModel;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class ThueServiceImpl implements IThueService{

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    IThueDAO thueDao = new ThueDAOImpl();
    @Override
    public List<ThueModel> findAll() {
        return thueDao.findAll();
    }

    @Override
    public ThueModel findOneByMaSoThue(String MaSoThue) {
        return thueDao.findOneByMaSoThue(MaSoThue);
    }

    @Override
    public boolean insert(ThueModel thue) {
        return thueDao.insert(thue);
    }

    @Override
    public boolean update(ThueModel thue) {
        ThueModel t = thueDao.findOneByMaSoThue(thue.getMasothue());
        t.setID(thue.getID());
        t.setMasothue(thue.getMasothue());
        t.setCoquanthue(t.getMasothue());
        t.setSoCMT_CCCD(t.getSoCMT_CCCD());
        t.setNgaythaydoithongtingannhat(t.getNgaythaydoithongtingannhat());
        t.setTrangThai(t.getTrangThai());
        return thueDao.update(t);
    }

    @Override
    public boolean delete(String MaSoThue) {
        return thueDao.delete(MaSoThue);
    }

    @Override
    public ThueModel findOneByCCCD(String CCCD1, String CCCD2) {
        ThueModel thue = new ThueModel();
        String query = "SELECT *FROM Thue JOIN CongDan ON Thue.SoCMT_CCCD = CongDan.CCCD WHERE Thue.TrangThai = 1 AND Thue.SoCMT_CCCD = ? AND Thue.Ngaythaydoithongtingannhat = (SELECT MAX(Ngaythaydoithongtingannhat) FROM Thue WHERE SoCMT_CCCD = ?);";
        try{
            conn = DBConnection.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, CCCD1);
            ps.setString(2, CCCD2);
            rs = ps.executeQuery();
            while(rs.next()){
                thue.setMasothue(rs.getString("Masothue"));
                thue.setHoten(rs.getString("HoTen"));
                thue.setCoquanthue(rs.getString("Coquanthue"));
                thue.setNgaythaydoithongtingannhat(rs.getDate("Ngaythaydoithongtingannhat"));
            }
            conn.close();
        }catch(Exception ex){
            
        } 
        return thue;
    }
    
}
