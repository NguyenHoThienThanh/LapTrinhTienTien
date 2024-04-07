/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceService.ICongDanService;
import Models.ThongTinCaNhan;
import ServiceImplement.CongDanServiceImpl;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TraCuuTTCD extends javax.swing.JPanel {

    ICongDanService congDanService = new CongDanServiceImpl();
    ThongTinCaNhan thongTinCaNhan = new ThongTinCaNhan();

    public TraCuuTTCD(String search) {
        initComponents();
        thongTinCaNhan = congDanService.findTTCN(search);
        
        JOptionPane.showMessageDialog(null, thongTinCaNhan.getCCCD());
        tf_hoten.setText(thongTinCaNhan.getHoTen());
        tf_gioitinh.setText(thongTinCaNhan.getGioiTinh());
        tf_cccd.setText(thongTinCaNhan.getCCCD());
        tf_ngaysinh.setText(String.valueOf(thongTinCaNhan.getNgaySinh()));
        tf_noisinh.setText(thongTinCaNhan.getNoiSinh());
        tf_quoctich.setText(thongTinCaNhan.getQuocTich());
        tf_dantoc.setText(thongTinCaNhan.getDanToc());
        tf_quequan.setText(thongTinCaNhan.getQueQuan());
        tf_diachi.setText(thongTinCaNhan.getDiaChi());
        tf_sodienthoai.setText(thongTinCaNhan.getSdt());
        tf_email.setText(thongTinCaNhan.getEmail());
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
        tf_gioitinh = new Swing.TextField();
        tf_cccd = new Swing.TextField();
        tf_ngaysinh = new Swing.TextField();
        tf_noisinh = new Swing.TextField();
        tf_quoctich = new Swing.TextField();
        tf_dantoc = new Swing.TextField();
        tf_quequan = new Swing.TextField();
        tf_diachi = new Swing.TextField();
        tf_sodienthoai = new Swing.TextField();
        tf_email = new Swing.TextField();

        setPreferredSize(new java.awt.Dimension(883, 832));

        tf_hoten.setLabelText("Họ và tên");

        tf_gioitinh.setLabelText("Giới tính");

        tf_cccd.setLabelText("CCCD");

        tf_ngaysinh.setLabelText("Ngày sinh");

        tf_noisinh.setLabelText("Nơi sinh");

        tf_quoctich.setLabelText("Quốc tịch");

        tf_dantoc.setLabelText("Dân tộc");

        tf_quequan.setLabelText("Quê quán");

        tf_diachi.setLabelText("Địa chỉ");

        tf_sodienthoai.setLabelText("Số điện thoại");

        tf_email.setLabelText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_noisinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_quoctich, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tf_dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(tf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(tf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quoctich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.TextField tf_cccd;
    private Swing.TextField tf_dantoc;
    private Swing.TextField tf_diachi;
    private Swing.TextField tf_email;
    private Swing.TextField tf_gioitinh;
    private Swing.TextField tf_hoten;
    private Swing.TextField tf_ngaysinh;
    private Swing.TextField tf_noisinh;
    private Swing.TextField tf_quequan;
    private Swing.TextField tf_quoctich;
    private Swing.TextField tf_sodienthoai;
    // End of variables declaration//GEN-END:variables
}