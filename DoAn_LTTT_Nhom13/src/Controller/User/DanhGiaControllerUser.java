package Controller.User;

import Controller.Admin.Login_RegisterController;
import DAOImplement.CongDanDAOImpl;
import InterfaceService.IDanhGiaService;
import Models.CongDanModel;
import Models.DanhGiaModel;
import ServiceImplement.DanhGiaServiceImpl;
import javax.swing.JOptionPane;

public class DanhGiaControllerUser extends javax.swing.JPanel {
        String currentUser = Login_RegisterController.AppContext.userName;
        
        CongDanModel cd = new CongDanDAOImpl().findOneWithoutAdd(currentUser);
        
        IDanhGiaService danhGiaService = new DanhGiaServiceImpl();
        
    public DanhGiaControllerUser() {
        initComponents();      
        tf_cccddg.setText(cd.getCCCD());
        tf_hotendg.setText(cd.getHoTen());
    }

    private boolean validateDanhGia() {
        // Kiểm tra điều kiện đánh giá
        if (rating_tongQuanUser.getStar() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng đánh giá tổng quan.");
            return false;
        }

        if (rating_chinhXacUser.getStar() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng đánh giá mức độ chính xác.");
            return false;
        }

        if (rating_deDangUser.getStar() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng đánh giá mức độ dễ dùng.");
            return false;
        }

        if (rating_thuanTienUser.getStar() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng đánh giá mức độ thuận tiện.");
            return false;
        }

        if (rating_trucQuanUser.getStar() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng đánh giá mức độ trực quan.");
            return false;
        }

        if (tar_danhGiaUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đánh giá.");
            return false;
        }

        // Tất cả các điều kiện đều thỏa mãn
        return true;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_cccddg = new Swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        tf_hotendg = new Swing.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tar_danhGiaUser = new javax.swing.JTextArea();
        btn_guiPhanHoi = new Swing.Button();
        myTextField1 = new Swing.MyTextField();
        rating_thuanTienUser = new Star_Rating.StarRatingUser();
        rating_deDangUser = new Star_Rating.StarRatingUser();
        rating_trucQuanUser = new Star_Rating.StarRatingUser();
        rating_chinhXacUser = new Star_Rating.StarRatingUser();
        rating_tongQuanUser = new Star_Rating.StarRatingUser();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_cccddg.setEditable(false);
        tf_cccddg.setLabelText("CCCD");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PHẢN HỒI CỦA CÔNG DÂN VỀ DỊCH VỤ");

        tf_hotendg.setEditable(false);
        tf_hotendg.setLabelText("Họ tên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tổng quan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Thuận tiện");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Dễ dàng");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Chính xác");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Trực quan");

        tar_danhGiaUser.setColumns(20);
        tar_danhGiaUser.setRows(5);
        tar_danhGiaUser.setMargin(new java.awt.Insets(10, 15, 15, 10));
        jScrollPane1.setViewportView(tar_danhGiaUser);

        btn_guiPhanHoi.setBackground(new java.awt.Color(18, 99, 63));
        btn_guiPhanHoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_guiPhanHoi.setText("Gửi phản hồi");
        btn_guiPhanHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guiPhanHoiActionPerformed(evt);
            }
        });

        myTextField1.setEditable(false);
        myTextField1.setBackground(new java.awt.Color(255, 255, 255));
        myTextField1.setForeground(new java.awt.Color(255, 0, 0));
        myTextField1.setText("Nội dung phản hồi");
        myTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating_thuanTienUser, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rating_deDangUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(rating_trucQuanUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(rating_chinhXacUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(rating_tongQuanUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(tf_cccddg, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(tf_hotendg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(btn_guiPhanHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_hotendg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(myTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_cccddg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rating_tongQuanUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rating_thuanTienUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rating_deDangUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rating_chinhXacUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating_trucQuanUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_guiPhanHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guiPhanHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guiPhanHoiActionPerformed
        if (validateDanhGia()) {
            boolean hasRated = danhGiaService.hasRated(currentUser);
            if (hasRated) {
                JOptionPane.showMessageDialog(null, "Mỗi tài khoản chỉ được đánh giá một lần!");
            } else {
                DanhGiaModel dg = new DanhGiaModel();
                dg.setCCCD(tf_cccddg.getText());
                dg.setTongQuan(rating_tongQuanUser.getStar());
                dg.setChinhXac(rating_chinhXacUser.getStar());
                dg.setDeDang(rating_deDangUser.getStar());
                dg.setThuanTien(rating_thuanTienUser.getStar());
                dg.setTrucQuan(rating_trucQuanUser.getStar());
                dg.setDanhGia(tar_danhGiaUser.getText());

                boolean isInserted = danhGiaService.insert(dg);
                if (isInserted) {
                    JOptionPane.showMessageDialog(null, "Gửi đánh giá thành công!");
                    hasRated = true; // Đánh dấu tài khoản đã đánh giá
                } else {
                    JOptionPane.showMessageDialog(null, "Gửi đánh giá thất bại! Vui lòng kiểm tra lại thông tin đánh giá!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Gửi đánh giá thất bại! Vui lòng kiểm tra lại thông tin đánh giá!");
        }
        
        rating_tongQuanUser.setEnabled(false);
        rating_chinhXacUser.setEnabled(false);
        rating_deDangUser.setEnabled(false);
        rating_thuanTienUser.setEnabled(false);
        rating_trucQuanUser.setEnabled(false);
        tar_danhGiaUser.setEnabled(false);
    }//GEN-LAST:event_btn_guiPhanHoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_guiPhanHoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private Swing.MyTextField myTextField1;
    private Star_Rating.StarRatingUser rating_chinhXacUser;
    private Star_Rating.StarRatingUser rating_deDangUser;
    private Star_Rating.StarRatingUser rating_thuanTienUser;
    private Star_Rating.StarRatingUser rating_tongQuanUser;
    private Star_Rating.StarRatingUser rating_trucQuanUser;
    private javax.swing.JTextArea tar_danhGiaUser;
    private Swing.TextField tf_cccddg;
    private Swing.TextField tf_hotendg;
    // End of variables declaration//GEN-END:variables
}
