
package Controller.User;

import Controller.Admin.Login_RegisterController;
import InterfaceService.ICongDanService;
import Models.CongDanModel;
import ServiceImplement.CongDanServiceImpl;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class DonLyHonControllerUser extends javax.swing.JPanel {


    public DonLyHonControllerUser() {
        initComponents();
        ICongDanService congDanService = new CongDanServiceImpl();
        String currentUser = Login_RegisterController.AppContext.userName;
        CongDanModel cd = congDanService.findOne(currentUser);

        tf_soCCCD.setText(cd.getCCCD());
        tf_email.setText(cd.getEmail());
        tf_gioiTinh.setText(cd.getGioiTinh());
        tf_hoTen.setText(cd.getHoTen());
        tf_diaChi.setText(cd.getMaKS());
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


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        btn_sua = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        tf_diaChi = new Swing.TextField();
        tf_quocTich = new Swing.TextField();
        tf_danToc = new Swing.TextField();
        tf_queQuan = new Swing.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

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

        btn_sua.setBackground(new java.awt.Color(18, 99, 63));
        btn_sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_sua.setText("Sửa thông tin");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("THÔNG TIN CÔNG DÂN");

        tf_diaChi.setLabelText("Địa chỉ");

        tf_quocTich.setLabelText("Quốc tịch");

        tf_danToc.setLabelText("Dân tộc");

        tf_queQuan.setLabelText("Quê quán");

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
                        .addGap(395, 395, 395)
                        .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_diaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_soCCCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_quocTich, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_ngaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(tf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed

        String email = tf_email.getText();
        String soDienThoai = tf_soDienThoai.getText();
        String diaChi = tf_diaChi.getText();
        
        // Gọi phương thức cập nhật thông tin
        updateCongDanInfo(email, soDienThoai, diaChi);
    }//GEN-LAST:event_btn_suaActionPerformed
    private void updateCongDanInfo(String email, String soDienThoai, String diaChi) {
        ICongDanService congDanService = new CongDanServiceImpl();
        String currentUser = Login_RegisterController.AppContext.userName;
        CongDanModel cd = congDanService.findOne(currentUser);
        
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

        // Kiểm tra địa chỉ có chứa các từ cấu trúc không hợp lệ
        String[] invalidStructures = {"street", "road", "avenue", "lane", "building", "city", "town"};
        for (String invalidStructure : invalidStructures) {
            if (address.toLowerCase().contains(invalidStructure)) {
                return false;
            }
        }

        // Kiểm tra địa chỉ hợp lệ
        return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_sua;
    private javax.swing.JLabel jLabel1;
    private Swing.TextField tf_danToc;
    private Swing.TextField tf_diaChi;
    private Swing.TextField tf_email;
    private Swing.TextField tf_gioiTinh;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_ngayCapCCCD;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_noiCapCCCD;
    private Swing.TextField tf_noiSinh;
    private Swing.TextField tf_queQuan;
    private Swing.TextField tf_quocTich;
    private Swing.TextField tf_soCCCD;
    private Swing.TextField tf_soDienThoai;
    // End of variables declaration//GEN-END:variables

}