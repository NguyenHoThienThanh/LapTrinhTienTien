/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;


import InterfaceService.IChungNhanKetHonService;
import Models.DonChungNhanKetHon;
import ServiceImplement.ChungNhanKetHonServiceImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;


public class TraCuuGCNKH extends javax.swing.JPanel {

    DefaultTableModel model;
    List<DonChungNhanKetHon> listDonChungNhanKetHon;
    IChungNhanKetHonService chungNhanKetHonService = new ChungNhanKetHonServiceImpl();
    
    public TraCuuGCNKH(String search) {
        initComponents();
        listDonChungNhanKetHon = chungNhanKetHonService.findAllCNKH(search, search);
        model = (DefaultTableModel) tbl_cnkh.getModel();
        
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        showTable();
    }

    private void showTable() {
        for (DonChungNhanKetHon dcnkh : listDonChungNhanKetHon) {
            model.addRow(new Object[]{dcnkh.getMaCnkh(), dcnkh.getCCCDVo(), dcnkh.getHoTenVo(), dcnkh.getNgaySinhVo(), dcnkh.getDanTocVo(), dcnkh.getQuocTichVo(), dcnkh.getNoiCuTruVo(),
            dcnkh.getCCCDChong(), dcnkh.getHoTenChong(), dcnkh.getNgaySinhChong(), dcnkh.getDanTocChong(), dcnkh.getQuocTichChong(), dcnkh.getNoiCuTruChong(), dcnkh.getNgaydk(), dcnkh.getNoidk()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cnkh = new javax.swing.JTable();
        btn_back = new button.MyButton();
        tf_ngaysinhchong = new Swing.TextField();
        tf_ngaydangky = new Swing.TextField();
        tf_quoctichchong = new Swing.TextField();
        tf_noidangky = new Swing.TextField();
        tf_ngaysinhvo = new Swing.TextField();
        tf_quoctichvo = new Swing.TextField();
        tf_dantocchong = new Swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        tf_giaytotuythanchong = new Swing.TextField();
        tf_dantocvo = new Swing.TextField();
        tf_giaytotuythanvo = new Swing.TextField();
        tf_noicutrucuachong = new Swing.TextField();
        tf_hotenchong = new Swing.TextField();
        tf_noicutrucuavo = new Swing.TextField();
        tf_hotenvo = new Swing.TextField();
        tf_macnkh = new Swing.TextField();

        tbl_cnkh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CNKH", "Giấy tờ tùy thân vợ", "Họ tên vợ", "Ngày sinh vợ", "Dân tộc vợ", "Quốc tịch vợ", "Nơi trú vợ", "Giấy tờ tùy thân chồng", "Họ tên chồng", "Ngày sinh chồng", "Dân tộc chồng", "Quốc tịch chồng", "Nơi cư trú chồng", "Ngày đăng kí kết hôn", "Nơi đăng ký kết hôn"
            }
        ));
        tbl_cnkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cnkhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cnkh);

        btn_back.setBackground(new java.awt.Color(255, 0, 0));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/previous.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.setBorderColor(new java.awt.Color(255, 0, 0));
        btn_back.setHideActionText(true);
        btn_back.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_back.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_back.setIconTextGap(2);
        btn_back.setMargin(new java.awt.Insets(2, 1, 3, 14));
        btn_back.setRadius(15);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        tf_ngaysinhchong.setLabelText("Ngày sinh chồng");

        tf_ngaydangky.setLabelText("Ngày đăng kí kết hôn");

        tf_quoctichchong.setLabelText("Quốc tịch chồng");

        tf_noidangky.setLabelText("Nơi đăng ký kết hôn");

        tf_ngaysinhvo.setLabelText("Ngày sinh vợ");

        tf_quoctichvo.setLabelText("Quốc tịch vợ");

        tf_dantocchong.setLabelText("Dân tộc chồng");

        jLabel1.setText("Lịch sử đơn");

        tf_giaytotuythanchong.setLabelText("Giấy tờ tùy thân của chồng");
        tf_giaytotuythanchong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_giaytotuythanchongActionPerformed(evt);
            }
        });

        tf_dantocvo.setLabelText("Dân tộc vợ");

        tf_giaytotuythanvo.setLabelText("Giấy tờ tùy thân của vợ");

        tf_noicutrucuachong.setLabelText("Nơi cư trú của chồng");

        tf_hotenchong.setLabelText("Họ tên chồng");

        tf_noicutrucuavo.setLabelText("Nơi cư trú của vợ");

        tf_hotenvo.setLabelText("Họ tên vợ");

        tf_macnkh.setLabelText("Mã CNKH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_ngaysinhchong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(tf_hotenchong, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_noicutrucuachong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_dantocchong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_giaytotuythanchong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(tf_quoctichchong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_hotenvo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_ngaysinhvo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_dantocvo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_quoctichvo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_giaytotuythanvo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(tf_noicutrucuavo, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(88, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_hotenchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(tf_ngaysinhchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(tf_hotenvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(tf_quoctichchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_quoctichvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_ngaysinhvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_dantocchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_giaytotuythanchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tf_dantocvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_giaytotuythanvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_noicutrucuachong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_noicutrucuavo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addContainerGap(535, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_cnkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cnkhMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tbl_cnkh.getModel();
        tf_macnkh.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 0).toString());
        tf_giaytotuythanvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 1).toString());
        tf_hotenvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 2).toString());
        tf_ngaysinhvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 3).toString());
        tf_dantocvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 4).toString());
        tf_quoctichvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 5).toString());
        tf_noicutrucuavo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 6).toString());
        tf_giaytotuythanchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 7).toString());
        tf_hotenchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 8).toString());
        tf_ngaysinhchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 9).toString());
        tf_dantocchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 10).toString());
        tf_quoctichchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(),11).toString());
        tf_noicutrucuachong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 12).toString());
        tf_ngaydangky.setText(model.getValueAt(tbl_cnkh.getSelectedRow(),13).toString());
        tf_noidangky.setText(model.getValueAt(tbl_cnkh.getSelectedRow(),14).toString());
    }//GEN-LAST:event_tbl_cnkhMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed

    private void tf_giaytotuythanchongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_giaytotuythanchongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_giaytotuythanchongActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_cnkh;
    private Swing.TextField tf_dantocchong;
    private Swing.TextField tf_dantocvo;
    private Swing.TextField tf_giaytotuythanchong;
    private Swing.TextField tf_giaytotuythanvo;
    private Swing.TextField tf_hotenchong;
    private Swing.TextField tf_hotenvo;
    private Swing.TextField tf_macnkh;
    private Swing.TextField tf_ngaydangky;
    private Swing.TextField tf_ngaysinhchong;
    private Swing.TextField tf_ngaysinhvo;
    private Swing.TextField tf_noicutrucuachong;
    private Swing.TextField tf_noicutrucuavo;
    private Swing.TextField tf_noidangky;
    private Swing.TextField tf_quoctichchong;
    private Swing.TextField tf_quoctichvo;
    // End of variables declaration//GEN-END:variables
}
