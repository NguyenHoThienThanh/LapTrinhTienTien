/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceService.ILyHonService;
import Models.LyHonModel;
import ServiceImplement.LyHonServiceImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TraCuuLH extends javax.swing.JPanel {

    DefaultTableModel model;
    List<LyHonModel> listDonTamTru;
    ILyHonService lyHonService = new LyHonServiceImpl();
    
    public TraCuuLH(String search) {
        initComponents();
        listDonTamTru = lyHonService.findAllLH(search, search);
//        JOptionPane.showMessageDialog(panelTracuuGCNKH, search);
        model = (DefaultTableModel) tbl_lyhon.getModel();
        
        showTable();
    }

    private void showTable() {
        for (LyHonModel lh : listDonTamTru) {
            model.addRow(new Object[]{lh.getMaLh(), lh.getMaCnkh(), lh.getHoTenNguoiNopDon(), lh.getCCCDNguoiNopDon(), lh.getHoTenVo(), lh.getCCCDVO(),
            lh.getHoTenChong(), lh.getCCCDChong(), lh.getNoidk(), lh.getNgaydk(), lh.getLydo()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new Swing.Button();
        tf_malyhon = new Swing.TextField();
        tf_macnkh = new Swing.TextField();
        tf_hotennguoinopdon = new Swing.TextField();
        tf_cccdnguoinopdon = new Swing.TextField();
        tf_hotenvo = new Swing.TextField();
        tf_hotenchong = new Swing.TextField();
        tf_cccdvo = new Swing.TextField();
        tf_cccdchong = new Swing.TextField();
        tf_noidangky = new Swing.TextField();
        tf_ngaydangky = new Swing.TextField();
        tf_lydo = new Swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_lyhon = new javax.swing.JTable();

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        tf_malyhon.setLabelText("Mã ly hôn");

        tf_macnkh.setLabelText("Mã CNKH");

        tf_hotennguoinopdon.setLabelText("Họ tên người nộp đơn");

        tf_cccdnguoinopdon.setLabelText("CCCD người nộp đơn");

        tf_hotenvo.setLabelText("Họ tên vợ");

        tf_hotenchong.setLabelText("Họ tên chồng");

        tf_cccdvo.setLabelText("CCCD vợ");

        tf_cccdchong.setLabelText("CCCD chồng");

        tf_noidangky.setLabelText("Nơi đăng ký");

        tf_ngaydangky.setLabelText("Ngày đăng ký");

        tf_lydo.setLabelText("Lý do");

        jLabel1.setText("Lịch sử đơn");

        tbl_lyhon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ly hôn", "Mã CNKH", "Họ tên người nộp đơn", "CCCD người nộp đơn", "Họ tên vợ", "CCCD Vợ", "Họ tên chồng", "CCCD Chồng", "Nơi đăng ký", "Ngày đăng ký", "Lý do"
            }
        ));
        tbl_lyhon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_lyhonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_lyhon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_malyhon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_hotennguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_cccdnguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_hotenvo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cccdvo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_hotenchong, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                    .addComponent(tf_cccdchong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_malyhon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotennguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdnguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hotenvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed

    private void tbl_lyhonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_lyhonMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        model = (DefaultTableModel) tbl_lyhon.getModel();
        tf_malyhon.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 0).toString());
        tf_macnkh.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 1).toString());
        tf_hotennguoinopdon.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 2).toString());
        tf_cccdnguoinopdon.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 3).toString());
        tf_hotenvo.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 4).toString());
        tf_cccdvo.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 5).toString());
        tf_hotenchong.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 6).toString());
        tf_cccdchong.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 7).toString());
        tf_noidangky.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 8).toString());
        tf_ngaydangky.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 9).toString());
        tf_lydo.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 10).toString());
    }//GEN-LAST:event_tbl_lyhonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_lyhon;
    private Swing.TextField tf_cccdchong;
    private Swing.TextField tf_cccdnguoinopdon;
    private Swing.TextField tf_cccdvo;
    private Swing.TextField tf_hotenchong;
    private Swing.TextField tf_hotennguoinopdon;
    private Swing.TextField tf_hotenvo;
    private Swing.TextField tf_lydo;
    private Swing.TextField tf_macnkh;
    private Swing.TextField tf_malyhon;
    private Swing.TextField tf_ngaydangky;
    private Swing.TextField tf_noidangky;
    // End of variables declaration//GEN-END:variables
}
