/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceService.ITamTruService;
import Models.DonTamTru;
import ServiceImplement.TamTruServiceImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TraCuuTT extends javax.swing.JPanel {

    DefaultTableModel model;
    List<DonTamTru> listDonTamTru;
    ITamTruService tamTruService = new TamTruServiceImpl();
    
    public TraCuuTT(String search) {
        initComponents();
        listDonTamTru = tamTruService.findAllTT(search);
//        JOptionPane.showMessageDialog(panelTracuuGCNKH, search);
        model = (DefaultTableModel) tbl_tamtru.getModel();
        
        showTable();
    }

    private void showTable() {
        for (DonTamTru dtt : listDonTamTru) {
            model.addRow(new Object[]{dtt.getMaTT(), dtt.getNgayDk(), dtt.getNoiDangKy(), dtt.getHoTen(), dtt.getNgaySinh(), dtt.getCCCD(),
            dtt.getNoiCap(), dtt.getNgayCap(), dtt.getNgayDen(), dtt.getNgayDi(), dtt.getLiDo()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new Swing.Button();
        tf_matamtru = new Swing.TextField();
        tf_hoten = new Swing.TextField();
        tf_ngaysinh = new Swing.TextField();
        tf_cccd = new Swing.TextField();
        tf_noicap = new Swing.TextField();
        tf_ngaycap = new Swing.TextField();
        tf_ngayden = new Swing.TextField();
        tf_ngaydi = new Swing.TextField();
        tf_ngaydangky = new Swing.TextField();
        tf_lydo = new Swing.TextField();
        tf_noidangky = new Swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tamtru = new javax.swing.JTable();

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        tf_matamtru.setLabelText("Mã tạm trú");

        tf_hoten.setLabelText("Họ tên ");

        tf_ngaysinh.setLabelText("Ngày sinh");

        tf_cccd.setLabelText("CCCD");

        tf_noicap.setLabelText("Nơi cấp CCCD");

        tf_ngaycap.setLabelText("Ngày cấp");

        tf_ngayden.setLabelText("Ngày đến");

        tf_ngaydi.setLabelText("Ngày đi");

        tf_ngaydangky.setLabelText("Ngày đăng ký");

        tf_lydo.setLabelText("Lý do");

        tf_noidangky.setLabelText("Nơi đăng ký");

        jLabel1.setText("Lịch sử đơn");

        tbl_tamtru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tạm trú", "Ngày đăng ký", "Nơi đăng ký", "Họ tên", "Ngày sinh", "CCCD", "Nơi cấp CCCD", "Ngày cấp CCCD", "Ngày đến", "Ngày đi", "Ngày đăng ký"
            }
        ));
        tbl_tamtru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tamtruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tamtru);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_cccd, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(tf_matamtru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tf_ngayden, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(tf_ngaydi, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_hoten, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(tf_noicap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(tf_ngaycap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_matamtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noicap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaycap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngayden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_tamtruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tamtruMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tbl_tamtru.getModel();
        tf_matamtru.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 0).toString());
        tf_ngaydangky.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 1).toString());
        tf_noidangky.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 2).toString());
        tf_hoten.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 3).toString());
        tf_ngaysinh.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 4).toString());
        tf_cccd.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 5).toString());
        tf_noicap.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 6).toString());
        tf_ngaycap.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 7).toString());
        tf_ngayden.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 8).toString());
        tf_ngaydi.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 9).toString());
        tf_lydo.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 10).toString());
    }//GEN-LAST:event_tbl_tamtruMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_tamtru;
    private Swing.TextField tf_cccd;
    private Swing.TextField tf_hoten;
    private Swing.TextField tf_lydo;
    private Swing.TextField tf_matamtru;
    private Swing.TextField tf_ngaycap;
    private Swing.TextField tf_ngaydangky;
    private Swing.TextField tf_ngayden;
    private Swing.TextField tf_ngaydi;
    private Swing.TextField tf_ngaysinh;
    private Swing.TextField tf_noicap;
    private Swing.TextField tf_noidangky;
    // End of variables declaration//GEN-END:variables
}
