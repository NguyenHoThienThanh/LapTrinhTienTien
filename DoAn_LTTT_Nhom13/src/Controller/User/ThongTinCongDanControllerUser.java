package Controller.User;

import Controller.Admin.Login_RegisterController;
import DAOImplement.CongDanDAOImpl;
import InterfaceService.ICongDanService;
import InterfaceService.IDangNhapService;
import Models.CongDanModel;
import Models.DangNhapModel;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.DangNhapServiceImpl;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class ThongTinCongDanControllerUser extends javax.swing.JPanel {
    String currentUser = Login_RegisterController.AppContext.userName;
    ICongDanService congDanService = new CongDanServiceImpl();
        
    CongDanModel cd = congDanService.findOne(currentUser);
        
    IDangNhapService dangNhapService = new DangNhapServiceImpl();
    DangNhapModel dn = dangNhapService.findOne(currentUser);
    
    public ThongTinCongDanControllerUser() {
        initComponents();
        CongDanModel cd = congDanService.findOne(currentUser);
        CongDanModel congDan = new CongDanDAOImpl().findOneWithoutAdd(currentUser);
        
        if(cd.getCCCD() != null){            
            tf_tenDangNhap.setText(dn.getTenDangNhap());
            tf_matKhau.setText(dn.getMatKhau().trim());
            tf_soCCCD.setText(cd.getCCCD());
            tf_email.setText(cd.getEmail());
            tf_gioiTinh.setText(cd.getGioiTinh());
            tf_hoTen.setText(cd.getHoTen());
            tf_ngayCapCCCD.setText(cd.getNgcCccd().toString());
            tf_ngaySinh.setText(cd.getNgaySinh().toString());
            tf_noiCapCCCD.setText(cd.getNcCccd());
            tf_noiSinh.setText(cd.getNoiSinh());
            tf_soDienThoai.setText(cd.getSDT());
            tf_danToc.setText(cd.getDanToc());
            tf_queQuan.setText(cd.getQueQuan());
            tf_quocTich.setText(cd.getQuocTich());
            tf_diaChi.setText(cd.getDiaChi());
        
        }
        else {
            tf_tenDangNhap.setText(dn.getTenDangNhap());
            tf_matKhau.setText(dn.getMatKhau().trim());
            tf_soCCCD.setText(congDan.getCCCD().trim());
            tf_email.setText(congDan.getEmail());
            tf_gioiTinh.setText(congDan.getGioiTinh());
            tf_hoTen.setText(congDan.getHoTen());
            tf_ngayCapCCCD.setText(congDan.getNgcCccd().toString());
            tf_ngaySinh.setText(congDan.getNgaySinh().toString());
            tf_noiCapCCCD.setText(congDan.getNcCccd());
            tf_noiSinh.setText(congDan.getNoiSinh());
            tf_soDienThoai.setText(congDan.getSDT());
            tf_danToc.setText(congDan.getDanToc());
            tf_queQuan.setText(congDan.getQueQuan());
            tf_quocTich.setText(congDan.getQuocTich());
            tf_diaChi.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_hoTen = new Swing.TextField();
        tf_gioiTinh = new Swing.TextField();
        tf_noiCapCCCD = new Swing.TextField();
        tf_soCCCD = new Swing.TextField();
        tf_email = new Swing.TextField();
        tf_noiSinh = new Swing.TextField();
        tf_ngayCapCCCD = new Swing.TextField();
        tf_soDienThoai = new Swing.TextField();
        tf_ngaySinh = new Swing.TextField();
        btn_doiMatKhau = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        tf_diaChi = new Swing.TextField();
        tf_quocTich = new Swing.TextField();
        tf_danToc = new Swing.TextField();
        tf_queQuan = new Swing.TextField();
        jLabel2 = new javax.swing.JLabel();
        tf_tenDangNhap = new Swing.TextField();
        btn_sua1 = new Swing.Button();
        tf_matKhau = new Swing.PasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(920, 540));

        tf_hoTen.setEditable(false);
        tf_hoTen.setLabelText("Họ và tên");

        tf_gioiTinh.setEditable(false);
        tf_gioiTinh.setLabelText("Giới tính");

        tf_noiCapCCCD.setEditable(false);
        tf_noiCapCCCD.setLabelText("Nơi cấp CCCD");

        tf_soCCCD.setEditable(false);
        tf_soCCCD.setLabelText("Số CCCD");

        tf_email.setLabelText("Email");

        tf_noiSinh.setEditable(false);
        tf_noiSinh.setLabelText("Nơi sinh");

        tf_ngayCapCCCD.setEditable(false);
        tf_ngayCapCCCD.setLabelText("Ngày cấp CCCD");

        tf_soDienThoai.setLabelText("Số điện thoại");

        tf_ngaySinh.setEditable(false);
        tf_ngaySinh.setLabelText("Ngày sinh");

        btn_doiMatKhau.setBackground(new java.awt.Color(18, 99, 63));
        btn_doiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        btn_doiMatKhau.setText("Đổi mật khẩu");
        btn_doiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doiMatKhauActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("THÔNG TIN TÀI KHOẢN");

        tf_diaChi.setLabelText("Địa chỉ");

        tf_quocTich.setEditable(false);
        tf_quocTich.setLabelText("Quốc tịch");

        tf_danToc.setEditable(false);
        tf_danToc.setLabelText("Dân tộc");

        tf_queQuan.setEditable(false);
        tf_queQuan.setLabelText("Quê quán");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("THÔNG TIN CÔNG DÂN");

        tf_tenDangNhap.setEditable(false);
        tf_tenDangNhap.setLabelText("Tên đăng nhập");

        btn_sua1.setBackground(new java.awt.Color(18, 99, 63));
        btn_sua1.setForeground(new java.awt.Color(255, 255, 255));
        btn_sua1.setText("Sửa thông tin");
        btn_sua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sua1ActionPerformed(evt);
            }
        });

        tf_matKhau.setEditable(false);
        tf_matKhau.setLabelText("Mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btn_sua1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_diaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_quocTich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_soCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tf_gioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(btn_doiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_matKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_doiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_quocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_doiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doiMatKhauActionPerformed
        showChangePasswordDialog();
    }//GEN-LAST:event_btn_doiMatKhauActionPerformed

    private void showChangePasswordDialog() {
    // Tạo hộp thoại đổi mật khẩu
    JPasswordField currentPasswordField = new JPasswordField();
    JPasswordField newPasswordField = new JPasswordField();
    JPasswordField confirmPasswordField = new JPasswordField();

    Object[] message = {
        "Mật khẩu cũ:", currentPasswordField,
        "Mật khẩu mới:", newPasswordField,
        "Xác nhận mật khẩu mới:", confirmPasswordField
    };

    int option = JOptionPane.showConfirmDialog(null, message, "Đổi mật khẩu", JOptionPane.OK_CANCEL_OPTION);

    // Xử lý sự kiện khi người dùng nhấn nút "OK"
    if (option == JOptionPane.OK_OPTION) {
        String currentPassword = new String(currentPasswordField.getPassword());
        String newPassword = new String(newPasswordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (!isCurrentPasswordMatched(currentPassword.trim())) {
            JOptionPane.showMessageDialog(null, "Mật khẩu cũ Không chính xác!");
            return;
        }
        // Kiểm tra tính hợp lệ của dữ liệu nhập vào
        if (isPasswordCurrent(newPassword, currentPassword)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu cũ không thể giống mật khẩu mới!");
            return;
        }

        if (!isValidPassword(newPassword)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu mới không hợp lệ!");
            return;
        }

        if (!isPasswordConfirmed(newPassword, confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Xác nhận mật khẩu mới không khớp!");
            return;
        }

        // Tiến hành đổi mật khẩu trong cơ sở dữ liệu
        boolean changed = changePassword(currentPassword, newPassword);

        if (changed) {
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thất bại!");
        }
    }
}

    private boolean isValidPassword(String newPassword) {
        // Kiểm tra tính hợp lệ của mật khẩu mới
        return newPassword.length() >= 6;
    }

    private boolean isPasswordCurrent(String currentPassword, String newPassword) {
        return currentPassword.trim().equals(newPassword);
    }

    private boolean isPasswordConfirmed(String newPassword, String confirmPassword) {
        return newPassword.equals(confirmPassword);
    }

    private boolean isCurrentPasswordMatched(String currentPassword) {
        currentUser = Login_RegisterController.AppContext.userName;

        // Kiểm tra tính chính xác của mật khẩu cũ
        return currentPassword.equals(dn.getMatKhau().trim());
    }

    private boolean changePassword(String currentPassword, String newPassword) {
        currentUser = Login_RegisterController.AppContext.userName;

        // Cập nhật mật khẩu mới
        dn.setMatKhau(newPassword);
        boolean updated = dangNhapService.update(dn);
        if (updated) {
            // Load lại mật khẩu vừa đổi từ cơ sở dữ liệu
            tf_matKhau.setText(dn.getMatKhau().trim());
            return true;
        } else {
            return false;
        }
    }
    private void btn_sua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sua1ActionPerformed
        String email = tf_email.getText();
        String soDienThoai = tf_soDienThoai.getText();
        String diaChi = tf_diaChi.getText();
        
        updateCongDanInfo(email, soDienThoai, diaChi);
    }//GEN-LAST:event_btn_sua1ActionPerformed
    private void updateCongDanInfo(String email, String soDienThoai, String diaChi) {
        
        // Kiểm tra số điện thoại và email hợp lệ trước khi cập nhật
        if (!isValidPhoneNumber(soDienThoai)) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không được để trống, Số điện thoại phải gồm 10 chữ số, Số điện thoại phải bắt đầu bằng số 0, Số điện thoại chỉ được chứa chữ số và không được âm!");
            return;
        }

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Email không được để trống, Email phải chứa ký tự '@', Phần tên miền của email (sau '@') phải chứa dấu chấm!");
            return;
        }
        
        if (!isValidAddress(diaChi)) {
        JOptionPane.showMessageDialog(null, "Địa chỉ không được để trống, Địa chỉ không được chứa ký tự đặc biệt");
        return;
    }
        
        // Cập nhật thông tin mới
        cd.setEmail(email);
        cd.setSDT(soDienThoai);
        cd.setDiaChi(diaChi);

        // Gọi phương thức cập nhật thông tin trong service
        boolean updated = congDanService.update(cd);

        if (updated) {
            // Thông báo cập nhật thành công
            JOptionPane.showMessageDialog(null, "Thông tin đã được cập nhật thành công!");
        } else {
            // Thông báo cập nhật thất bại
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra. Không thể cập nhật thông tin!");
            
        }
}
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Kiểm tra định dạng số điện thoại
        // Ví dụ: Số điện thoại gồm 10 chữ số và bắt đầu bằng số 0
        String phoneNumberRegex = "^0\\d{9}$";
        Pattern pattern = Pattern.compile(phoneNumberRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    
    public static boolean isValidEmail(String email) {
        // Kiểm tra định dạng email
        // Ví dụ: abc@example.com
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public static boolean isValidAddress(String address) {
        // Kiểm tra địa chỉ không được để trống
        if (address.isEmpty()) {
            return false;
        }

        // Kiểm tra địa chỉ có chứa ký tự đặc biệt hay không
        String specialCharacters = "!@#$%^&*()+=-[]{}|\\;:'\",.<>/?";
        for (char ch : specialCharacters.toCharArray()) {
            if (address.contains(String.valueOf(ch))) {
                return false;
            }
        }

        // Kiểm tra địa chỉ có chứa ký tự Unicode không hợp lệ
        String invalidUnicodeCharacters = "";
        for (char ch : invalidUnicodeCharacters.toCharArray()) {
            if (address.contains(String.valueOf(ch))) {
                return false;
            }
        }

        return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_doiMatKhau;
    private Swing.Button btn_sua1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Swing.TextField tf_danToc;
    private Swing.TextField tf_diaChi;
    private Swing.TextField tf_email;
    private Swing.TextField tf_gioiTinh;
    private Swing.TextField tf_hoTen;
    private Swing.PasswordField tf_matKhau;
    private Swing.TextField tf_ngayCapCCCD;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_noiCapCCCD;
    private Swing.TextField tf_noiSinh;
    private Swing.TextField tf_queQuan;
    private Swing.TextField tf_quocTich;
    private Swing.TextField tf_soCCCD;
    private Swing.TextField tf_soDienThoai;
    private Swing.TextField tf_tenDangNhap;
    // End of variables declaration//GEN-END:variables

}
