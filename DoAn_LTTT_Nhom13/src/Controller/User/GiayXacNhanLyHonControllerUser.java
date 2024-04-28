package Controller.User;

import Controller.Admin.Login_RegisterController;
import DAOImplement.ChungNhanKetHonDAOImpl;
import DAOImplement.LyHonDAOImpl;
import InterfaceDAO.IChungNhanKetHonDAO;
import InterfaceDAO.ILyHonDAO;
import Models.ChungNhanKetHonModel;
import Models.LyHonModel;


public class GiayXacNhanLyHonControllerUser extends javax.swing.JPanel {
    public GiayXacNhanLyHonControllerUser() {
        initComponents();
        IChungNhanKetHonDAO chungNhanKetHonDAO = new ChungNhanKetHonDAOImpl();
        String currentUser = Login_RegisterController.AppContext.userName;
        ChungNhanKetHonModel cnkh = chungNhanKetHonDAO.findOneCNKH(currentUser, currentUser);
        
        ILyHonDAO lyHonDAO = new LyHonDAOImpl();
        LyHonModel lyHon = lyHonDAO.findOneByMaLH(currentUser);
        
        tf_maChungNhanLyHon.setText(lyHon.getMaLh());
        tf_maChungNhanLyHon.setText(lyHon.getMaCnkh());
        tf_hoTenChong.setText(lyHon.getHoTenChong());
        tf_hoTenVo.setText(lyHon.getHoTenVo());
        tf_cccdChong.setText(lyHon.getCCCDChong());
        tf_cccdVo.setText(lyHon.getCCCDVO());
        tf_ngayDangKyKetHon.setText(cnkh.getNgaydk().toString());
        tf_ngayLyHon.setText(lyHon.getNgaydk().toString());
        tf_noiDangKyKetHon.setText(lyHon.getNoidk());
        tf_lyDoLyHon.setText(lyHon.getLydo());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_hoTenChong = new Swing.TextField();
        tf_hoTenVo = new Swing.TextField();
        tf_maChungNhanLyHon = new Swing.TextField();
        tf_cccdChong = new Swing.TextField();
        tf_ngayDangKyKetHon = new Swing.TextField();
        tf_lyDoLyHon = new Swing.TextField();
        tf_noiDangKyKetHon = new Swing.TextField();
        tf_ngayLyHon = new Swing.TextField();
        tf_maChungNhanKetHon = new Swing.TextField();
        tf_cccdVo = new Swing.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("GIẤY XÁC NHẬN LY HÔN");

        tf_hoTenChong.setEditable(false);
        tf_hoTenChong.setLabelText("Họ và tên chồng");

        tf_hoTenVo.setEditable(false);
        tf_hoTenVo.setLabelText("Họ và tên vợ");

        tf_maChungNhanLyHon.setEditable(false);
        tf_maChungNhanLyHon.setLabelText("Mã chứng nhận ly hôn");

        tf_cccdChong.setEditable(false);
        tf_cccdChong.setLabelText("CCCD chồng");

        tf_ngayDangKyKetHon.setEditable(false);
        tf_ngayDangKyKetHon.setLabelText("Ngày đăng ký kết hôn");

        tf_lyDoLyHon.setEditable(false);
        tf_lyDoLyHon.setFocusable(false);
        tf_lyDoLyHon.setInheritsPopupMenu(true);
        tf_lyDoLyHon.setLabelText("Lý do ly hôn");

        tf_noiDangKyKetHon.setEditable(false);
        tf_noiDangKyKetHon.setLabelText("Nơi đăng ký");

        tf_ngayLyHon.setEditable(false);
        tf_ngayLyHon.setLabelText("Ngày ly hôn");

        tf_maChungNhanKetHon.setEditable(false);
        tf_maChungNhanKetHon.setLabelText("Mã chứng nhận kết hôn");

        tf_cccdVo.setEditable(false);
        tf_cccdVo.setLabelText("CCCD vợ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(tf_maChungNhanLyHon, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_cccdChong, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(tf_cccdVo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_hoTenChong, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_hoTenVo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_maChungNhanKetHon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_noiDangKyKetHon, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(tf_ngayDangKyKetHon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_ngayLyHon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_lyDoLyHon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_maChungNhanLyHon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_maChungNhanKetHon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hoTenChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hoTenVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngayLyHon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayDangKyKetHon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_lyDoLyHon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noiDangKyKetHon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private Swing.TextField tf_cccdChong;
    private Swing.TextField tf_cccdVo;
    private Swing.TextField tf_hoTenChong;
    private Swing.TextField tf_hoTenVo;
    private Swing.TextField tf_lyDoLyHon;
    private Swing.TextField tf_maChungNhanKetHon;
    private Swing.TextField tf_maChungNhanLyHon;
    private Swing.TextField tf_ngayDangKyKetHon;
    private Swing.TextField tf_ngayLyHon;
    private Swing.TextField tf_noiDangKyKetHon;
    // End of variables declaration//GEN-END:variables

}
