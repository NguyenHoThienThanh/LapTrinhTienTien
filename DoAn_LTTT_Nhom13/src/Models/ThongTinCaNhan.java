/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Admin
 */
public class ThongTinCaNhan {

    private String HoTen;
    private String GioiTinh;
    private String CCCD;
    private Date NgaySinh;
    private String NoiSinh;
    private String QuocTich;
    private String DanToc;
    private String QueQuan;
    private String DiaChi;
    private String Sdt;
    private String Email;
    private byte[] HinhAnh;

    public ThongTinCaNhan(String HoTen, String GioiTinh, String CCCD, Date NgaySinh, String NoiSinh, String QuocTich, String DanToc, String QueQuan, String DiaChi, String Sdt, String Email, byte[] HinhAnh) {
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.CCCD = CCCD;
        this.NgaySinh = NgaySinh;
        this.NoiSinh = NoiSinh;
        this.QuocTich = QuocTich;
        this.DanToc = DanToc;
        this.QueQuan = QueQuan;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.Email = Email;
        this.HinhAnh = HinhAnh;
    }

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public ThongTinCaNhan() {
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
 
    
}
