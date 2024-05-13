/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controller.Admin;

import Controller.User.HomeControllerUser;
import InterfaceService.IDangNhapService;
import Models.DangNhapModel;
import Models.ModelMessage;
import ServiceImplement.ServiceMail;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author Admin
 */
public class Login_RegisterController extends javax.swing.JFrame {

    private static String userName, passWord;
    private Animator animatorLogin;
    private Animator animatorRegister;
    private Animator animatorVerify;
    IDangNhapService dangNhapService = new ServiceImplement.DangNhapServiceImpl();

    private boolean signIn = true;

    public Login_RegisterController() {
        initComponents();
        getContentPane().setBackground(new Color(245, 245, 245));
        TimingTarget targetLogin = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (signIn) {
                    background1.setAnimate(fraction);
                } else {
                    background1.setAnimate(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (signIn) {
                    panelLogin.setVisible(false);
                    background1.setShowPaint(true);
                    panelRegister.setAlpha(0);
                    panelRegister.setVisible(true);
                    animatorRegister.start();
                } else {
                    enableLogin(true);
                    tf_username.grabFocus();
                }
            }

        };
        TimingTarget targetRegister = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (signIn) {
                    panelRegister.setAlpha(fraction);
                } else {
                    panelRegister.setAlpha(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (signIn == false) {
                    panelRegister.setVisible(false);
                    background1.setShowPaint(true);
                    panelVerify.setAlpha(0);
                    panelVerify.setVisible(true);
                    animatorVerify.start();
                }
            }

        };
        TimingTarget targetVerify = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (signIn) {
                    panelVerify.setAlpha(fraction);
                } else {
                    panelVerify.setAlpha(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (signIn == false) {
                    panelVerify.setVisible(false);
                    background1.setShowPaint(false);
                    background1.setAnimate(1);
                    panelLogin.setVisible(true);
                    animatorLogin.start();
                }
            }
        };

        lbl_taotaikhoan.setForeground(Color.BLUE);
        lbl_taotaikhoan.setText("<html><u>Đăng Ký Ngay</u></html>");
        lbl_taotaikhoan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lbl_taotaikhoan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl_taotaikhoanMouseClicked(null); // Simulate button click to switch to Register panel
            }
        });
        animatorLogin = new Animator(1500, targetLogin);
        animatorRegister = new Animator(500, targetRegister);
        animatorVerify = new Animator(1500, targetVerify);
        animatorLogin.setResolution(0);
        animatorRegister.setResolution(0);
        animatorVerify.setResolution(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new Swing.Background();
        panelLogin = new javax.swing.JPanel();
        jpanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_login = new Swing.Button();
        tf_username = new Swing.TextField();
        tf_password = new Swing.PasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_taotaikhoan = new javax.swing.JLabel();
        panelRegister = new Swing.PanelTransparent();
        jpanelRegister = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_signup = new Swing.Button();
        tf_registerusername = new Swing.TextField();
        tf_registerpassword = new Swing.PasswordField();
        tf_registerconfirmpassword = new Swing.PasswordField();
        tf_registeremail = new Swing.TextField();
        panelVerify = new Swing.PanelTransparent();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_code = new Swing.MyTextField();
        btn_OK = new button.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        background1.setBackground(new java.awt.Color(255, 255, 255));
        background1.setLayout(new java.awt.CardLayout());

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));

        jpanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jpanelLogin.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/logo.png"))); // NOI18N

        btn_login.setBackground(new java.awt.Color(157, 153, 255));
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setEffectColor(new java.awt.Color(255, 110, 110));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        tf_username.setLabelText("Username");
        tf_username.setLineColor(new java.awt.Color(255, 0, 0));
        tf_username.setOpaque(true);

        tf_password.setLabelText("Password");
        tf_password.setLineColor(new java.awt.Color(255, 0, 0));

        jLabel4.setText("Nếu chưa có tài khoản.");

        lbl_taotaikhoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_taotaikhoan.setText("Đăng ký ngay");
        lbl_taotaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_taotaikhoanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelLoginLayout = new javax.swing.GroupLayout(jpanelLogin);
        jpanelLogin.setLayout(jpanelLoginLayout);
        jpanelLoginLayout.setHorizontalGroup(
            jpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_taotaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpanelLoginLayout.createSequentialGroup()
                .addGroup(jpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLoginLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelLoginLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanelLoginLayout.setVerticalGroup(
            jpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLoginLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_taotaikhoan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jpanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jpanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        background1.add(panelLogin, "card2");

        panelRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelRegister.setOpaque(true);

        jpanelRegister.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/logo.png"))); // NOI18N

        btn_signup.setBackground(new java.awt.Color(157, 153, 255));
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setText("Sign Up");
        btn_signup.setEffectColor(new java.awt.Color(255, 110, 110));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        tf_registerusername.setLabelText("Username");

        tf_registerpassword.setLabelText("Password");

        tf_registerconfirmpassword.setLabelText("Confirm Password");

        tf_registeremail.setLabelText("Email");

        javax.swing.GroupLayout jpanelRegisterLayout = new javax.swing.GroupLayout(jpanelRegister);
        jpanelRegister.setLayout(jpanelRegisterLayout);
        jpanelRegisterLayout.setHorizontalGroup(
            jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRegisterLayout.createSequentialGroup()
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_registerpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_registerusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_registerconfirmpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_registeremail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelRegisterLayout.setVerticalGroup(
            jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRegisterLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(tf_registerusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_registerpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_registerconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_registeremail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jpanelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jpanelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        background1.add(panelRegister, "card4");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VerifyCode");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kiểm tra email để nhận mã xác nhận");

        btn_OK.setBackground(new java.awt.Color(21, 110, 71));
        btn_OK.setForeground(new java.awt.Color(255, 255, 255));
        btn_OK.setText("OK");
        btn_OK.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_OK.setBorderPainted(false);
        btn_OK.setColor(new java.awt.Color(21, 110, 71));
        btn_OK.setColorClick(new java.awt.Color(141, 240, 197));
        btn_OK.setColorOver(new java.awt.Color(61, 212, 146));
        btn_OK.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_OK.setIconTextGap(6);
        btn_OK.setRadius(30);
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(118, 118, 118))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_code, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelVerifyLayout = new javax.swing.GroupLayout(panelVerify);
        panelVerify.setLayout(panelVerifyLayout);
        panelVerifyLayout.setHorizontalGroup(
            panelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerifyLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        panelVerifyLayout.setVerticalGroup(
            panelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerifyLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        background1.add(panelVerify, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public class AppContext {

        public static String userName;
        public static String password;
    }
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        DangNhapModel model = dangNhapService.findOne(tf_username.getText());
        if (model.getTrangThai() == 0) {
            JOptionPane.showMessageDialog(null, "Công dân này đã mất");
            return;
        }
        if (!animatorLogin.isRunning()) {
            AppContext.userName = tf_username.getText().trim();
            AppContext.password = String.valueOf(tf_password.getPassword());
            boolean action = true;
            if (AppContext.userName.equals("")) {
                tf_username.setHelperText("Please input user name");
                tf_username.grabFocus();
                action = false;
            }
            if (AppContext.password.equals("")) {
                tf_password.setHelperText("Please input password");
                if (action) {
                    tf_password.grabFocus();
                }
                action = false;
            }
            if (action && dangNhapService.isPasswordExists(tf_username.getText(), String.valueOf(tf_password.getPassword()).trim()) && model.getQuyen().contains("admin")) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
                userName = tf_username.getText();
                HomeControllerAdmin homeController = new HomeControllerAdmin();
                homeController.setVisible(true);
                this.dispose();
                enableLogin(false);
            } else if (action && dangNhapService.isPasswordExists(tf_username.getText(), String.valueOf(tf_password.getPassword()).trim()) && model.getQuyen().contains("user")) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
                userName = tf_username.getText();
                HomeControllerUser homeController = new HomeControllerUser();
                homeController.setVisible(true);
                this.dispose();
                enableLogin(false);
            } else {
                JOptionPane.showMessageDialog(null, "Sai username hoặc password", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void enableLogin(boolean action) {
        tf_username.setEditable(action);
        tf_password.setEditable(action);
        btn_login.setEnabled(action);
    }

    private void clearLogin() {
        tf_username.setText("");
        tf_password.setText("");
        tf_password.setHelperText("");
        tf_username.setHelperText("");
    }

    private void clearRegister() {
        tf_registerusername.setText("");
        tf_registerpassword.setText("");
        tf_registerconfirmpassword.setText("");
        tf_registerusername.setHelperText("");
        tf_registerpassword.setHelperText("");
        tf_registerconfirmpassword.setHelperText("");

    }
    private void lbl_taotaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_taotaikhoanMouseClicked
        // TODO add your handling code here:
        if (!animatorLogin.isRunning()) {
            signIn = true;
            clearLogin();
            clearRegister();
            panelLogin.setVisible(false);
            animatorLogin.start();
            panelRegister.setVisible(true);
        }
    }//GEN-LAST:event_lbl_taotaikhoanMouseClicked

//    private void showMessage(Message.MessageType messageType, String message) {
//        Message ms = new Message();
//        ms.showMessage(messageType, message);
//        TimingTarget target = new TimingTargetAdapter() {
//            @Override
//            public void begin() {
//                if (ms.isShow()) {
//                    background1.add(ms, "pos 0.5a1-30", 0);
//                    ms.setVisible(true);
//                    background1.repaint();
//                }
//            }
//
//            @Override
//            public void timingEvent(float fraction) {
//                float f;
//                if (ms.isShow()) {
//                    f = 40 * (1f - fraction);
//
//                } else {
//                    f = 40 * fraction;
//                }
//                layout.setComponentConstraints(ms, "pos 0.5a1 " + (int) (f - 30));
//                background1.repaint();
//                background1.revalidate();
//            }
//
//            @Override
//            public void end() {
//                if (ms.isShow()) {
//                    background1.remove(ms);
//                    background1.repaint();
//                    background1.revalidate();
//                } else {
//                    ms.setShow(true);
//                }
//            }
//        };
//        Animator animator = new Animator(300, target);
//        animator.setResolution(0);
//        animator.setAcceleration(0.5f);
//        animator.setDeceleration(0.5f);
//        animator.start();
//    }

    private void sendMail(DangNhapModel model) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ModelMessage ms = new ServiceMail().sendMain(model.getEmail(), model.getVerifyCode());
                if (ms.isSuccess()) {
                    panelRegister.setVisible(false);
                    animatorVerify.start();
                    panelVerify.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(Login_RegisterController.this, "Có lỗi xảy ra khi gửi email:\n" + ms.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }).start();
    }
    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        boolean check = true;
        DangNhapModel model = new DangNhapModel();
        if (!animatorRegister.isRunning()) {
            String registerusername = tf_registerusername.getText().trim();
            String registerpassword = String.valueOf(tf_registerpassword.getPassword()).trim();
            String registerconfirmpassword = String.valueOf(tf_registerconfirmpassword.getPassword()).trim();
            String registerEmail = tf_registeremail.getText().trim();

            boolean action = true;

            // Kiểm tra xem các trường dữ liệu có trống không
            if (registerusername.equals("")) {
                tf_registerusername.setHelperText("Please input username");
                tf_registerusername.grabFocus();
                action = false;
            }
            if (registerpassword.equals("")) {
                tf_registerpassword.setHelperText("Please input password");
                if (action) {
                    tf_registerpassword.grabFocus();
                }
                action = false;
            }

            if (registerconfirmpassword.equals("")) {
                tf_registerconfirmpassword.setHelperText("Please confirm password");
                if (action) {
                    tf_registerconfirmpassword.grabFocus();
                }
                action = false;
            }

            // Kiểm tra xem username có đủ độ dài không
            if (action && (registerusername.length() != 12)) {
                tf_registerusername.setHelperText("Username must be CCCD and have 12 characters");
                tf_registerusername.grabFocus();
                action = false;
            }

            // Kiểm tra xem password và confirm password có giống nhau không
            if (action && !registerpassword.equals(registerconfirmpassword)) {
                tf_registerconfirmpassword.setHelperText("Password and confirm password must match");
                tf_registerconfirmpassword.grabFocus();
                action = false;
            }
            if (action && dangNhapService.checkDuplicateEmail(registerEmail)) {
                tf_registeremail.setHelperText("Email already exists");
                tf_registeremail.grabFocus();
                action = false;
            }
            List<DangNhapModel> list = dangNhapService.findAll();
            if ((action && list.isEmpty()) || (action && dangNhapService.isUsernameExists(tf_registerusername.getText()) == false)) {
                model.setQuyen("user");
                model.setTenDangNhap(tf_registerusername.getText().trim());
                model.setMatKhau(tf_registerpassword.getText().trim());
                model.setVerifyCode(dangNhapService.generateVerifyCode().trim());
                model.setEmail(tf_registeremail.getText().trim());
                model.setTrangThai(1);
                dangNhapService.insert(model);
                sendMail(model);
//                JOptionPane.showMessageDialog(null, "Đăng ký tài khoản thành công", "Thông báo",
//                        JOptionPane.INFORMATION_MESSAGE);
//                signIn = false;
//                animatorRegister.start();
            } else if (action && dangNhapService.isUsernameExists(tf_registerusername.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Tên đăng nhập đã tồn tại!!! Vui lòng nhập tên khác", "Cảnh báo",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        // TODO add your handling code here: 
        DangNhapModel dangNhapModel = dangNhapService.findOne(tf_registerusername.getText());
        try {
            if(dangNhapService.verifyCodeWithUser(dangNhapModel.getTenDangNhap(), tf_code.getText().trim())){
                dangNhapService.doneVerify(dangNhapModel.getTenDangNhap());
                JOptionPane.showMessageDialog(rootPane, dangNhapModel.getTenDangNhap());
                signIn = false;
                animatorVerify.start();     
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, dangNhapModel.getTenDangNhap() +  " " + tf_code.getText().trim() );
        }
    }//GEN-LAST:event_btn_OKActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(Login_RegisterController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_RegisterController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_RegisterController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_RegisterController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_RegisterController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Background background1;
    private button.MyButton btn_OK;
    private Swing.Button btn_login;
    private Swing.Button btn_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanelLogin;
    private javax.swing.JPanel jpanelRegister;
    private javax.swing.JLabel lbl_taotaikhoan;
    private javax.swing.JPanel panelLogin;
    private Swing.PanelTransparent panelRegister;
    private Swing.PanelTransparent panelVerify;
    private Swing.MyTextField tf_code;
    private Swing.PasswordField tf_password;
    private Swing.PasswordField tf_registerconfirmpassword;
    private Swing.TextField tf_registeremail;
    private Swing.PasswordField tf_registerpassword;
    private Swing.TextField tf_registerusername;
    private Swing.TextField tf_username;
    // End of variables declaration//GEN-END:variables
}
