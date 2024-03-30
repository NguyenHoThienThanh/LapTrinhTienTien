/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

public class KhaiSinhModel {
    private int ID;
    private String MaKS;
    private String HoTenKS;
    private String GioiTinh;
    private Date NgaySinh;
    private String NoiSinh;
    private String DanToc;
    private String QuocTich;
    private String QueQuan;
    private String Cha;
    private String Me;
    private String NguoiKhaiSinh;
    private String QuanHe;
    private Date NgayDk;
    private String NoiDk;
    private int TrangThai;

    // Constructor
    public KhaiSinhModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public KhaiSinhModel(int ID, String MaKS, String HoTenKS, String GioiTinh, Date NgaySinh, String NoiSinh, String DanToc, String QuocTich, String QueQuan, String Cha, String Me, String NguoiKhaiSinh, String QuanHe, Date NgayDk, String NoiDk, int TrangThai) {
        this.ID = ID;
        this.MaKS = MaKS;
        this.HoTenKS = HoTenKS;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.NoiSinh = NoiSinh;
        this.DanToc = DanToc;
        this.QuocTich = QuocTich;
        this.QueQuan = QueQuan;
        this.Cha = Cha;
        this.Me = Me;
        this.NguoiKhaiSinh = NguoiKhaiSinh;
        this.QuanHe = QuanHe;
        this.NgayDk = NgayDk;
        this.NoiDk = NoiDk;
        this.TrangThai = TrangThai;
    }
    
    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaKS() {
        return MaKS;
    }

    public void setMaKS(String maKS) {
        MaKS = maKS;
    }

    public String getHoTenKS() {
        return HoTenKS;
    }

    public void setHoTenKS(String hoTenKS) {
        HoTenKS = hoTenKS;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        NoiSinh = noiSinh;
    }

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String danToc) {
        DanToc = danToc;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
        QuocTich = quocTich;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public String getCha() {
        return Cha;
    }

    public void setCha(String cha) {
        Cha = cha;
    }

    public String getMe() {
        return Me;
    }

    public void setMe(String me) {
        Me = me;
    }

    public String getNguoiKhaiSinh() {
        return NguoiKhaiSinh;
    }

    public void setNguoiKhaiSinh(String nguoiKhaiSinh) {
        NguoiKhaiSinh = nguoiKhaiSinh;
    }

    public String getQuanHe() {
        return QuanHe;
    }

    public void setQuanHe(String quanHe) {
        QuanHe = quanHe;
    }

    public Date getNgayDk() {
        return NgayDk;
    }

    public void setNgayDk(Date ngayDk) {
        NgayDk = ngayDk;
    }

    public String getNoiDk() {
        return NoiDk;
    }

    public void setNoiDk(String noiDk) {
        NoiDk = noiDk;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }
}
