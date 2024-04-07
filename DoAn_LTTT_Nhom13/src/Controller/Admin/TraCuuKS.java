/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceService.IKhaiSinhService;
import Models.KhaiSinhModel;
import ServiceImplement.KhaiSinhServiceImpl;

/**
 *
 * @author Admin
 */
public class TraCuuKS extends javax.swing.JPanel {

    IKhaiSinhService khaiSinhService = new KhaiSinhServiceImpl();
    KhaiSinhModel khaiSinhModel = new KhaiSinhModel();
    public TraCuuKS(String search) {
        initComponents();
        khaiSinhModel = khaiSinhService.findByCCCD(search);
        
        tf_hoten.setText(khaiSinhModel.getHoTenKS());
        tf_maks.setText(khaiSinhModel.getMaKS());
        tf_gioitinh.setText(khaiSinhModel.getGioiTinh());
        tf_ngaysinh.setText(String.valueOf(khaiSinhModel.getNgaySinh()));
        tf_noisinh.setText(khaiSinhModel.getNoiSinh());
        tf_quoctich.setText(khaiSinhModel.getQuocTich());
        tf_dantoc.setText(khaiSinhModel.getDanToc());
        tf_quequan.setText(khaiSinhModel.getQueQuan());
        tf_cccdcha.setText(khaiSinhModel.getCha());
        tf_cccdme.setText(khaiSinhModel.getMe());
        tf_ngaydangky.setText(String.valueOf(khaiSinhModel.getNgayDk()));
        tf_cccdnguoikhaisinh.setText(khaiSinhModel.getNguoiKhaiSinh());
        tf_quanhe.setText(khaiSinhModel.getQuanHe());
        tf_noidangky.setText(khaiSinhModel.getNoiDk());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_hoten = new Swing.TextField();
        tf_maks = new Swing.TextField();
        tf_noisinh = new Swing.TextField();
        tf_gioitinh = new Swing.TextField();
        tf_ngaysinh = new Swing.TextField();
        tf_quequan = new Swing.TextField();
        tf_dantoc = new Swing.TextField();
        tf_quoctich = new Swing.TextField();
        tf_cccdcha = new Swing.TextField();
        tf_cccdme = new Swing.TextField();
        tf_ngaydangky = new Swing.TextField();
        tf_cccdnguoikhaisinh = new Swing.TextField();
        tf_quanhe = new Swing.TextField();
        tf_noidangky = new Swing.TextField();

        tf_hoten.setLabelText("Họ tên");

        tf_maks.setLabelText("Mã khai sinh");

        tf_noisinh.setLabelText("Nơi sinh");

        tf_gioitinh.setLabelText("Giới tính");

        tf_ngaysinh.setLabelText("Ngày sinh");

        tf_quequan.setLabelText("Quê quán");

        tf_dantoc.setLabelText("Dân tộc");

        tf_quoctich.setLabelText("Quốc tịch");

        tf_cccdcha.setLabelText("CCCD Cha");

        tf_cccdme.setLabelText("CCCD Me");

        tf_ngaydangky.setLabelText("Ngày đăng ký");

        tf_cccdnguoikhaisinh.setLabelText("CCCD người khai sinh");

        tf_quanhe.setLabelText("Quan hệ");

        tf_noidangky.setLabelText("Nơi đăng ký");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_maks, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_quoctich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cccdcha, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cccdnguoikhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cccdme, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_quanhe, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(tf_ngaydangky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_maks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quoctich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdnguoikhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quanhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.TextField tf_cccdcha;
    private Swing.TextField tf_cccdme;
    private Swing.TextField tf_cccdnguoikhaisinh;
    private Swing.TextField tf_dantoc;
    private Swing.TextField tf_gioitinh;
    private Swing.TextField tf_hoten;
    private Swing.TextField tf_maks;
    private Swing.TextField tf_ngaydangky;
    private Swing.TextField tf_ngaysinh;
    private Swing.TextField tf_noidangky;
    private Swing.TextField tf_noisinh;
    private Swing.TextField tf_quanhe;
    private Swing.TextField tf_quequan;
    private Swing.TextField tf_quoctich;
    // End of variables declaration//GEN-END:variables
}