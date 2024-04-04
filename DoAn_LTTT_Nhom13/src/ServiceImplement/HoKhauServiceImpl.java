/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplement;

import DAOImplement.HoKhauDAOImpl;
import InterfaceDAO.IHoKhauDAO;
import InterfaceService.IHoKhauService;
import Models.HoKhauModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoKhauServiceImpl implements IHoKhauService{

    IHoKhauDAO hoKhauDAO = new HoKhauDAOImpl();
    @Override
    public List<HoKhauModel> findAll() {
        return hoKhauDAO.findAll();
    }

    @Override
    public HoKhauModel findOneByMaHK(String MaHK) {
        return hoKhauDAO.findOneByMaHK(MaHK);
    }

    @Override
    public boolean insert(HoKhauModel hoKhau) {
        return hoKhauDAO.insert(hoKhau);
    }

    @Override
    public boolean update(HoKhauModel hoKhau) {
        HoKhauModel hk = hoKhauDAO.findOneByMaHK(hoKhau.getMaHK());
        hk.setID(hoKhau.getID());
        hk.setMaHK(hoKhau.getMaHK());
        hk.setDiaChi(hoKhau.getDiaChi());
        hk.setKhaiSinhChuHo(hoKhau.getKhaiSinhChuHo());
        hk.setTrangThai(hoKhau.getTrangThai());
        return hoKhauDAO.update(hk);
        
    }

    @Override
    public boolean delete(String MaHK) {
        return hoKhauDAO.delete(MaHK);
    }
    
}
