/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceService.IDanhGiaService;
import Models.DanhGiaModel;
import ServiceImplement.DanhGiaServiceImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class DanhGiaController extends javax.swing.JPanel {

    IDanhGiaService danhGiaService = new DanhGiaServiceImpl();
    List<DanhGiaModel> listDanhGia;
    private DefaultTableModel model;
    
    public DanhGiaController() {
        initComponents();
        
        listDanhGia = danhGiaService.findAllDG();
        model = (DefaultTableModel) tbl_danhgia.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        for (DanhGiaModel dg : listDanhGia) {
            model.addRow(new Object[]{dg.getCCCD(), dg.getHoTen(), dg.getTongQuan(), dg.getThuanTien(), dg.getDeDang(), dg.getChinhXac(), dg.getTrucQuan(), dg.getDanhGia()});
        }
        
        tf_cccddg.setText(listDanhGia.get(0).getCCCD());
        tf_hotendg.setText(listDanhGia.get(0).getHoTen());
        rating_tongquan.setStar(listDanhGia.get(0).getTongQuan());
        rating_thuantien.setStar(listDanhGia.get(0).getThuanTien());
        rating_dedang.setStar(listDanhGia.get(0).getDeDang());
        rating_chinhxac.setStar(listDanhGia.get(0).getChinhXac());
        rating_trucquan.setStar(listDanhGia.get(0).getTrucQuan());
        tar_danhgia.setText(listDanhGia.get(0).getDanhGia());
        
        tf_cccddg.setEditable(false);
        tf_hotendg.setEditable(false);
        tar_danhgia.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_cccddg = new Swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        tf_hotendg = new Swing.TextField();
        rating_tongquan = new Star_Rating.StarRating();
        rating_trucquan = new Star_Rating.StarRating();
        rating_thuantien = new Star_Rating.StarRating();
        rating_dedang = new Star_Rating.StarRating();
        rating_chinhxac = new Star_Rating.StarRating();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tar_danhgia = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_danhgia = new Swing.TableDark();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_cccddg.setLabelText("CCCD");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Đánh giá của công dân sau khi sử dụng dịch vụ");

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

        tar_danhgia.setColumns(20);
        tar_danhgia.setRows(5);
        tar_danhgia.setText("Phản hồi của công dân");
        tar_danhgia.setMargin(new java.awt.Insets(10, 15, 15, 10));
        jScrollPane1.setViewportView(tar_danhgia);

        tbl_danhgia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CCCD", "Họ tên", "Tổng quan", "Thuận tiện", "Dễ dàng", "Chính xác", "Trực quan", "Đánh giá"
            }
        ));
        tbl_danhgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_danhgiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_danhgia);

        jLabel7.setText("Nội dung đánh giá");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cccddg, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rating_thuantien, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rating_tongquan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rating_trucquan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rating_dedang, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rating_chinhxac, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_hotendg, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccddg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotendg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating_tongquan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating_thuantien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating_dedang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(rating_chinhxac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(rating_trucquan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_danhgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_danhgiaMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tbl_danhgia.getModel();
        tf_cccddg.setText(model.getValueAt(tbl_danhgia.getSelectedRow(), 0).toString());
        tf_hotendg.setText(model.getValueAt(tbl_danhgia.getSelectedRow(), 1).toString());
        rating_tongquan.setStar((int) model.getValueAt(tbl_danhgia.getSelectedRow(), 2));
        rating_thuantien.setStar((int) model.getValueAt(tbl_danhgia.getSelectedRow(), 3));
        rating_dedang.setStar((int) model.getValueAt(tbl_danhgia.getSelectedRow(), 4));
        rating_chinhxac.setStar((int) model.getValueAt(tbl_danhgia.getSelectedRow(), 5));
        rating_trucquan.setStar((int) model.getValueAt(tbl_danhgia.getSelectedRow(), 6));
        tar_danhgia.setText(model.getValueAt(tbl_danhgia.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tbl_danhgiaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private Star_Rating.StarRating rating_chinhxac;
    private Star_Rating.StarRating rating_dedang;
    private Star_Rating.StarRating rating_thuantien;
    private Star_Rating.StarRating rating_tongquan;
    private Star_Rating.StarRating rating_trucquan;
    private javax.swing.JTextArea tar_danhgia;
    private Swing.TableDark tbl_danhgia;
    private Swing.TextField tf_cccddg;
    private Swing.TextField tf_hotendg;
    // End of variables declaration//GEN-END:variables
}
