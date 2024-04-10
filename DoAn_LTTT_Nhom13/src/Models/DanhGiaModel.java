/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class DanhGiaModel {
    private String CCCD;
    private String DanhGia;
    private int TongQuan;
    private int ThuanTien;
    private int DeDang;
    private int ChinhXac;
    private int TrucQuan;
    private String HoTen;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }



    // Constructor
    public DanhGiaModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public DanhGiaModel(String CCCD, String DanhGia, int TongQuan, int ThuanTien, int DeDang, int ChinhXac, int TrucQuan) {
        this.CCCD = CCCD;
        this.DanhGia = DanhGia;
        this.TongQuan = TongQuan;
        this.ThuanTien = ThuanTien;
        this.DeDang = DeDang;
        this.ChinhXac = ChinhXac;
        this.TrucQuan = TrucQuan;
    }

    
    // Getters and setters
    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getDanhGia() {
        return DanhGia;
    }

    public void setDanhGia(String danhGia) {
        DanhGia = danhGia;
    }

    public int getTongQuan() {
        return TongQuan;
    }

    public void setTongQuan(int tongQuan) {
        TongQuan = tongQuan;
    }

    public int getThuanTien() {
        return ThuanTien;
    }

    public void setThuanTien(int thuanTien) {
        ThuanTien = thuanTien;
    }

    public int getDeDang() {
        return DeDang;
    }

    public void setDeDang(int deDang) {
        DeDang = deDang;
    }

    public int getChinhXac() {
        return ChinhXac;
    }

    public void setChinhXac(int chinhXac) {
        ChinhXac = chinhXac;
    }

    public int getTrucQuan() {
        return TrucQuan;
    }

    public void setTrucQuan(int trucQuan) {
        TrucQuan = trucQuan;
    }
}
