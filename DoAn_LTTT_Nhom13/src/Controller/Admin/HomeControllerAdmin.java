/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controller.Admin;

import InterfaceService.IDanhGiaService;
import Menu.MenuEvent;
import Models.DanhGiaModel;
import ServiceImplement.DanhGiaServiceImpl;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class HomeControllerAdmin extends javax.swing.JFrame {

    List<DanhGiaModel> listDanhGia = new ArrayList<>();
    
    IDanhGiaService danhGiaService = new DanhGiaServiceImpl();
    public HomeControllerAdmin() {
        initComponents();
        //starRatingStatistics();
        menu2.setMenuEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                showForm(new TrangChuController());
                if(index == 0){
                    showForm(new TrangChuController());
                }
                else if (index == 1 && subIndex == 1) {
                    showForm(new ThongTinCongDanController());
                } else if (index == 1 && subIndex == 2) {
                    showForm(new ThongTinKhaiSinhController());
                }else if(index == 1 && subIndex == 3){
                    showForm(new  ThongTinGiayChungTuController());
                }else if (index == 1 && subIndex == 4) {
                    showForm(new ThongTinThueController());
                } else if (index == 1 && subIndex == 5) {
                    showForm(new ThongTinHoKhauController());
                } else if (index == 1 && subIndex == 6) {
                    showForm(new ThongTinChiTietHoKhauController());
                } else if (index == 1 && subIndex == 7) {
                    showForm(new TamTruController());
                } else if (index == 1 && subIndex == 8) {
                    showForm(new TamVangController());
                } else if (index == 1 && subIndex == 9) {
                    showForm(new ThongTinKetHonController());
                } else if (index == 1 && subIndex == 10) {
                    showForm(new ThongTinLyHonController());
                } else if (index == 2) {
                    showForm(new TraCuuDonController());
                } else if (index == 3 && subIndex == 1) {
                    showForm(new ChartKhaiSinhController());
                } else if (index == 3 && subIndex == 2) {
                    showForm(new ChartChungTuController());
                } else if (index == 3 && subIndex == 3) {
                    showForm(new ChartKetHonController());
                } else if (index == 3 && subIndex == 4) {
                    showForm(new ChartLyHonController());
                } else if (index == 4) {
                    showForm(new DanhGiaController());
                }
            }
        });
    }

//    private void starRatingStatistics() {
//        double avg_rating_tongquan = 0;
//        double avg_rating_thuantien = 0;
//        double avg_rating_dedang = 0;
//        double avg_rating_chinhxac = 0;
//        double avg_rating_trucquan = 0;
//        listDanhGia = danhGiaService.findAll();
//        for (DanhGiaModel dg : listDanhGia) {
//            avg_rating_tongquan += dg.getTongQuan();
//            avg_rating_thuantien += dg.getThuanTien();
//            avg_rating_dedang += dg.getDeDang();
//            avg_rating_chinhxac += dg.getChinhXac();
//            avg_rating_trucquan += dg.getTrucQuan();
//        }
//        rating_tongquan.setStar((int) Math.round(avg_rating_tongquan / listDanhGia.size()));
//        rating_thuantien.setStar((int) Math.round(avg_rating_thuantien / listDanhGia.size()));
//        rating_dedang.setStar((int) Math.round(avg_rating_dedang / listDanhGia.size()));
//        rating_chinhxac.setStar((int) Math.round(avg_rating_chinhxac / listDanhGia.size()));
//        rating_trucquan.setStar((int) Math.round(avg_rating_trucquan / listDanhGia.size()));
//    }

    private void showForm(Component com) {
        panel.removeAll();
        panel.add(com);
        panel.repaint();
        panel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneWin111 = new Swing.ScrollPaneWin11();
        menu2 = new Menu.Menu();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_logout = new Swing.Button();
        panel = new javax.swing.JPanel();
        trangChuController1 = new Controller.Admin.TrangChuController();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        scrollPaneWin111.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setViewportView(menu2);

        header.setBackground(new java.awt.Color(21, 110, 71));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN");

        btn_logout.setBackground(new java.awt.Color(21, 110, 71));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout-custom (1).png"))); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(trangChuController1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn đăng xuất khỏi tài khoản?", "Exit Program Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            Login_RegisterController lg = new Login_RegisterController();
            lg.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeControllerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeControllerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeControllerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeControllerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeControllerAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_logout;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private Menu.Menu menu2;
    private javax.swing.JPanel panel;
    private Swing.ScrollPaneWin11 scrollPaneWin111;
    private Controller.Admin.TrangChuController trangChuController1;
    // End of variables declaration//GEN-END:variables
}
