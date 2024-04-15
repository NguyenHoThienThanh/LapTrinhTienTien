package Controller.User;

import Controller.Admin.Login_RegisterController;
import InterfaceService.IKhaiSinhService;
import Models.KhaiSinhModel;
import ServiceImplement.KhaiSinhServiceImpl;


public class ThongTinKhaiSinhControllerUser extends javax.swing.JPanel {


    public ThongTinKhaiSinhControllerUser() {
        initComponents();
        IKhaiSinhService khaiSinhService = new KhaiSinhServiceImpl();
        String currentUser = Login_RegisterController.AppContext.userName;
        KhaiSinhModel ks = khaiSinhService.findByCCCD(currentUser);       
                
        tf_ngaySinh.setText(ks.getNgaySinh().toString());
        tf_noiSinh.setText(ks.getNoiSinh());
        tf_danToc.setText(ks.getDanToc());
        tf_queQuan.setText(ks.getQueQuan());
        tf_quocTich.setText(ks.getQuocTich());
        tf_maKhaiSinh.setText(ks.getMaKS());
        tf_hoTen.setText(ks.getHoTenKS());
        tf_ngaySinh.setText(ks.getNgaySinh().toString());
        tf_noiSinh.setText(ks.getNoiSinh());
        tf_danToc.setText(ks.getDanToc());
        tf_quocTich.setText(ks.getQuocTich());
        tf_queQuan.setText(ks.getQueQuan());
        tf_cccdCha.setText(ks.getCha());
        tf_cccdMe.setText(ks.getMe());
        tf_cccdNguoiKhaiSinh.setText(ks.getNguoiKhaiSinh());
        tf_quanHe.setText(ks.getQuanHe());
        tf_ngayDangKy.setText(ks.getNgayDk().toString());
        tf_noiDangKy.setText(ks.getNoiDk());
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_hoTen = new Swing.TextField();
        tf_noiSinh = new Swing.TextField();
        tf_ngaySinh = new Swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        tf_quocTich = new Swing.TextField();
        tf_danToc = new Swing.TextField();
        tf_queQuan = new Swing.TextField();
        tf_maKhaiSinh = new Swing.TextField();
        tf_cccdCha = new Swing.TextField();
        tf_cccdMe = new Swing.TextField();
        tf_cccdNguoiKhaiSinh = new Swing.TextField();
        tf_quanHe = new Swing.TextField();
        tf_ngayDangKy = new Swing.TextField();
        tf_noiDangKy = new Swing.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTen.setEditable(false);
        tf_hoTen.setLabelText("Họ và tên");

        tf_noiSinh.setEditable(false);
        tf_noiSinh.setLabelText("Nơi sinh");

        tf_ngaySinh.setEditable(false);
        tf_ngaySinh.setLabelText("Ngày sinh");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("THÔNG TIN KHAI SINH");

        tf_quocTich.setEditable(false);
        tf_quocTich.setLabelText("Quốc tịch");

        tf_danToc.setEditable(false);
        tf_danToc.setLabelText("Dân tộc");

        tf_queQuan.setEditable(false);
        tf_queQuan.setLabelText("Quê quán");

        tf_maKhaiSinh.setEditable(false);
        tf_maKhaiSinh.setLabelText("Mã khai sinh");

        tf_cccdCha.setEditable(false);
        tf_cccdCha.setLabelText("CCCD Cha");

        tf_cccdMe.setEditable(false);
        tf_cccdMe.setLabelText("CCCD Mẹ");

        tf_cccdNguoiKhaiSinh.setEditable(false);
        tf_cccdNguoiKhaiSinh.setLabelText("CCCD người khai sinh");

        tf_quanHe.setEditable(false);
        tf_quanHe.setLabelText("Quan Hệ");

        tf_ngayDangKy.setEditable(false);
        tf_ngayDangKy.setLabelText("Ngày đăng ký");

        tf_noiDangKy.setEditable(false);
        tf_noiDangKy.setLabelText("Nơi đăng ký");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_cccdCha, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(tf_cccdMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_quocTich, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(tf_cccdNguoiKhaiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_quanHe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_danToc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(tf_noiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_noiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_quanHe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdNguoiKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private Swing.TextField tf_cccdCha;
    private Swing.TextField tf_cccdMe;
    private Swing.TextField tf_cccdNguoiKhaiSinh;
    private Swing.TextField tf_danToc;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_maKhaiSinh;
    private Swing.TextField tf_ngayDangKy;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_noiDangKy;
    private Swing.TextField tf_noiSinh;
    private Swing.TextField tf_quanHe;
    private Swing.TextField tf_queQuan;
    private Swing.TextField tf_quocTich;
    // End of variables declaration//GEN-END:variables

}
