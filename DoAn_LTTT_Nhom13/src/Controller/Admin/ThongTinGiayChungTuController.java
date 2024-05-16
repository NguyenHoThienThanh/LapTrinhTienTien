package Controller.Admin;

import DAOImplement.ChungNhanKetHonDAOImpl;
import InterfaceService.ICongDanService;
import InterfaceService.IGiayChungTuService;
import Models.ChungNhanKetHonModel;
import Models.CongDanModel;
import Models.GiayChungTuModel;
import Models.HoKhauModel;
import Models.KhaiSinhModel;
import Models.QuanHeModel;
import Models.TamTruModel;
import Models.TamVangModel;
import Models.ThongTinHoKhau;
import ServiceImplement.ChungNhanKetHonServiceImpl;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.GiayChungTuServiceImpl;
import ServiceImplement.HoKhauServiceImpl;
import ServiceImplement.KhaiSinhServiceImpl;
import ServiceImplement.QuanHeServiceImpl;
import ServiceImplement.TamTruServiceImpl;
import ServiceImplement.TamVangServiceImpl;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ThongTinGiayChungTuController extends javax.swing.JPanel {

    DefaultTableModel model;
    List<GiayChungTuModel> listGiayChungTu;
    IGiayChungTuService giayChungTuService = new GiayChungTuServiceImpl();

    public ThongTinGiayChungTuController() {
        initComponents();
        tbl_thongTinChungTu.fixTable(jScrollPane2);
        listGiayChungTu = giayChungTuService.findAll();
        model = (DefaultTableModel) tbl_thongTinChungTu.getModel();
        showTable();
        disableTextField();

    }

    private void showTable() {
        for (GiayChungTuModel giayChungTu : listGiayChungTu) {
            model.addRow(new Object[]{giayChungTu.getMaCT(), giayChungTu.getMaKS(), giayChungTu.getHoTen(), giayChungTu.getCCCD(), giayChungTu.getNgaySinh(), giayChungTu.getNgayMat(), giayChungTu.getNoiMat(), giayChungTu.getNguyenNhan()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_hoTen = new Swing.TextField();
        tf_maSoChungTu = new Swing.TextField();
        tf_ngaySinh = new Swing.TextField();
        tf_noiMat = new Swing.TextField();
        btn_sua = new Swing.Button();
        btn_xoa = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        btn_xoaDuLieu = new Swing.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongTinChungTu = new Swing.TableDark();
        btn_luuSua = new Swing.Button();
        btn_luuThem = new Swing.Button();
        btn_loadData = new button.MyButton();
        btn_them = new Swing.Button();
        tf_soCCCD = new Swing.TextField();
        tf_ngayMat = new Swing.TextField();
        tf_nguyenNhan = new Swing.TextField();
        tf_maKhaiSinh = new Swing.TextField();
        btn_xuatDanhSach = new Swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTen.setLabelText("Họ và tên");

        tf_maSoChungTu.setLabelText("Mã số chứng tử");

        tf_ngaySinh.setLabelText("Ngày sinh");

        tf_noiMat.setLabelText("Nơi mất");

        btn_sua.setBackground(new java.awt.Color(18, 99, 63));
        btn_sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_sua.setText("Sửa thông tin");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoa.setText("Xóa thông tin");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("THÔNG TIN CHỨNG TỬ");

        btn_xoaDuLieu.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoaDuLieu.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoaDuLieu.setText("Xóa dữ liệu");
        btn_xoaDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaDuLieuActionPerformed(evt);
            }
        });

        tbl_thongTinChungTu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Chứng Tử", "Mã Khai Sinh", "Họ Và Tên", "Số CCCD", "Ngày Sinh", "Ngày Mất", "Nơi Mất", "Nguyên Nhân"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thongTinChungTu.getTableHeader().setReorderingAllowed(false);
        tbl_thongTinChungTu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinChungTuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thongTinChungTu);
        if (tbl_thongTinChungTu.getColumnModel().getColumnCount() > 0) {
            tbl_thongTinChungTu.getColumnModel().getColumn(3).setPreferredWidth(50);
            tbl_thongTinChungTu.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        btn_luuSua.setBackground(new java.awt.Color(18, 99, 63));
        btn_luuSua.setForeground(new java.awt.Color(255, 255, 255));
        btn_luuSua.setText("Lưu sửa");
        btn_luuSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuSuaActionPerformed(evt);
            }
        });

        btn_luuThem.setBackground(new java.awt.Color(18, 99, 63));
        btn_luuThem.setForeground(new java.awt.Color(255, 255, 255));
        btn_luuThem.setText("Lưu thêm");
        btn_luuThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuThemActionPerformed(evt);
            }
        });

        btn_loadData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/icons8-upload-10.png"))); // NOI18N
        btn_loadData.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_loadData.setRadius(50);
        btn_loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadDataActionPerformed(evt);
            }
        });

        btn_them.setBackground(new java.awt.Color(18, 99, 63));
        btn_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_them.setText("Thêm thông tin");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        tf_soCCCD.setLabelText("Số CCCD");

        tf_ngayMat.setLabelText("Ngày mất");

        tf_nguyenNhan.setLabelText("Nguyên nhân");

        tf_maKhaiSinh.setLabelText("Mã khai sinh");

        btn_xuatDanhSach.setBackground(new java.awt.Color(18, 99, 63));
        btn_xuatDanhSach.setForeground(new java.awt.Color(255, 255, 255));
        btn_xuatDanhSach.setText("Xuất danh sách");
        btn_xuatDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatDanhSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_maSoChungTu, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tf_noiMat, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(tf_nguyenNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(tf_ngayMat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_xuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_maSoChungTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_nguyenNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_noiMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_xuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
        tbl_thongTinChungTu.clearSelection();
        disableTextField();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void tbl_thongTinChungTuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinChungTuMouseClicked
        model = (DefaultTableModel) tbl_thongTinChungTu.getModel();
        tf_maSoChungTu.setText(model.getValueAt(tbl_thongTinChungTu.getSelectedRow(), 0).toString());
        tf_maKhaiSinh.setText(model.getValueAt(tbl_thongTinChungTu.getSelectedRow(), 1).toString());
        tf_ngayMat.setText(model.getValueAt(tbl_thongTinChungTu.getSelectedRow(), 5).toString());
        tf_soCCCD.setText(model.getValueAt(tbl_thongTinChungTu.getSelectedRow(), 3).toString());
        tf_hoTen.setText(model.getValueAt(tbl_thongTinChungTu.getSelectedRow(), 2).toString());
        tf_ngaySinh.setText(model.getValueAt(tbl_thongTinChungTu.getSelectedRow(), 4).toString());
        tf_noiMat.setText(model.getValueAt(tbl_thongTinChungTu.getSelectedRow(), 6).toString());
        tf_nguyenNhan.setText(model.getValueAt(tbl_thongTinChungTu.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tbl_thongTinChungTuMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int selectedRow = tbl_thongTinChungTu.getSelectedRow();

        if (tbl_thongTinChungTu.getRowCount() <= 0) {
            JOptionPane dialog = new JOptionPane("Bảng không có dữ liệu!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (selectedRow < 0) {
            JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (selectedRow >= 0) {
            JPanel myPanel = new JPanel();
            int confirm = JOptionPane.showConfirmDialog(myPanel, "Bạn có chắc chắn muốn xóa?", "", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    String id = (String) tbl_thongTinChungTu.getValueAt(selectedRow, 0);
                    model.removeRow(selectedRow);
                    listGiayChungTu.remove(selectedRow);
                    if (new GiayChungTuServiceImpl().delete(id)) {
                        JOptionPane msg = new JOptionPane("Xóa thành công!", JOptionPane.INFORMATION_MESSAGE);
                        JDialog jMsg = msg.createDialog(null);
                        jMsg.setModal(true);
                        jMsg.setVisible(true);
                    } else {
                        JOptionPane msgFail = new JOptionPane("Xóa thất bại!", JOptionPane.ERROR_MESSAGE);
                        JDialog jMsgFail = msgFail.createDialog(null);
                        jMsgFail.setModal(true);
                        jMsgFail.setVisible(true);
                    }

                } catch (Exception e) {
                    JOptionPane msgFail = new JOptionPane("Xóa thất bại!", JOptionPane.ERROR_MESSAGE);
                    JDialog jMsgFail = msgFail.createDialog(null);
                    jMsgFail.setModal(true);
                    jMsgFail.setVisible(true);
                }
            }

            clear();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_luuThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThemActionPerformed
        if (tf_noiMat.getText().equals("") || tf_soCCCD.getText().equals("") || tf_hoTen.getText().equals("") || tf_ngayMat.getText().equals("") || tf_ngaySinh.getText().equals("") || tf_nguyenNhan.getText().equals("") || tf_maKhaiSinh.getText().equals("")) {
            JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }

        if (!isValidCCCD(tf_soCCCD.getText().trim())) {
            JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        GiayChungTuModel model = new GiayChungTuServiceImpl().findAllGCT(tf_soCCCD.getText().trim());
        if (model.getMaCT() != null) {
            JOptionPane dialog = new JOptionPane("Công dân này đã có chứng tử!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        GiayChungTuModel giayChungTu = new GiayChungTuModel();
        giayChungTu.setHoTen(tf_hoTen.getText());
        giayChungTu.setCCCD(tf_soCCCD.getText().trim());
        giayChungTu.setNoiMat(tf_noiMat.getText());
        giayChungTu.setNguyenNhan(tf_nguyenNhan.getText());
        giayChungTu.setMaKS(tf_maKhaiSinh.getText().trim());
        Date ngaySinhDate;
        try {
            ngaySinhDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinh.getText().trim());
            java.sql.Date ngaySinh = new java.sql.Date(ngaySinhDate.getTime());
            giayChungTu.setNgaySinh(ngaySinh);
        } catch (ParseException ex) {
            Logger.getLogger(ThongTinGiayChungTuController.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (isDateValidPresent(tf_ngayMat.getText().trim())) {
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayMat.getText().trim());
                java.sql.Date sqlDate;
                sqlDate = new java.sql.Date(utilDate.getTime());
                giayChungTu.setNgayMat(sqlDate);
            } else {
                JOptionPane dialog = new JOptionPane("Lỗi ngày tháng năm!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }

        } catch (ParseException ex) {
            return;
        }
        giayChungTu.setTrangThai(1);
        listGiayChungTu.add(giayChungTu);

        if (new GiayChungTuServiceImpl().insert(giayChungTu)) {
            JOptionPane dialog = new JOptionPane("Thêm thông tin thành công!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);

            TamTruModel tamTru = new TamTruServiceImpl().findOneByCCCD(giayChungTu.getCCCD());
            int countTamTru = new TamTruServiceImpl().ifExists(giayChungTu.getCCCD());
            if (countTamTru == 1) {
                new TamTruServiceImpl().delete(tamTru.getMaTT());
            }
            TamVangModel tamVang = new TamVangServiceImpl().findOneByCCCD(giayChungTu.getCCCD());
            int countTamVang = new TamVangServiceImpl().ifExists(giayChungTu.getCCCD());
            if (countTamVang == 1) {
                new TamVangServiceImpl().delete(tamVang.getMaTV());
            }
            ChungNhanKetHonModel ketHon = new ChungNhanKetHonDAOImpl().findOneCNKH_TrangThai(giayChungTu.getCCCD(), giayChungTu.getCCCD());
            if (ketHon.getMaCnkh() != null) {
                new ChungNhanKetHonServiceImpl().delete(ketHon.getMaCnkh());
            }
            CongDanModel congDan = new CongDanServiceImpl().findOne(giayChungTu.getCCCD());
            if (congDan.getTrangThai() == 1) {
                new CongDanServiceImpl().delete(giayChungTu.getCCCD());
            }
            KhaiSinhModel khaiSinh = new KhaiSinhServiceImpl().findByCCCD(giayChungTu.getCCCD());
            if (khaiSinh.getMaKS() != null) {
                new KhaiSinhServiceImpl().delete(khaiSinh.getMaKS());
            }
            QuanHeModel quanHe = new QuanHeServiceImpl().findOneByCCCD(giayChungTu.getCCCD());
            if (quanHe.getMaHK() != null) {
                new QuanHeServiceImpl().deleteByMaHK(quanHe.getMaHK(), quanHe.getKhaiSinhNguoiThamGia());
            }
            ThongTinHoKhau hoKhau = new HoKhauServiceImpl().findOneByCCCDChungTu(giayChungTu.getCCCD());

            if (hoKhau.getCCCDChuHo() != null && hoKhau.getCCCDChuHo().equals(giayChungTu.getCCCD())) {
                List<ThongTinHoKhau> list = new QuanHeServiceImpl().findAllByMaHK(hoKhau.getMaHoKhau());
                for (ThongTinHoKhau qh : list) {
                    if (list.size() == 1) {
                        QuanHeModel qhmodel = new QuanHeServiceImpl().findOneByMaHKAndQuanHeID(qh.getMaHoKhau(), qh.getQuanHeID());
                        if (qh.getTrangThai() == 1) {
                            HoKhauModel hkModel = new HoKhauServiceImpl().findOneByMaHK(qh.getMaHoKhau());
                            hkModel.setKhaiSinhChuHo(qh.getKhaiSinhNguoiThamGia());
                            new HoKhauServiceImpl().update(hkModel);
                            qhmodel.setQuanHeVoiChuHo("Chủ hộ");
                            qhmodel.setKhaiSinhNguoiThamGia(qh.getKhaiSinhNguoiThamGia());
                            new QuanHeServiceImpl().update(qhmodel);
                            break;
                        } else {
                            new HoKhauServiceImpl().delete(hoKhau.getMaHoKhau());
                        }
                    } else if (Integer.parseInt(qh.getQuanHeID()) > Integer.parseInt(hoKhau.getQuanHeID())) {
                        QuanHeModel qhmodel = new QuanHeServiceImpl().findOneByMaHKAndQuanHeID(qh.getMaHoKhau(), qh.getQuanHeID());
                        if (qh.getTrangThai() == 1) {
                            HoKhauModel hkModel = new HoKhauServiceImpl().findOneByMaHK(qh.getMaHoKhau());
                            hkModel.setKhaiSinhChuHo(qh.getKhaiSinhNguoiThamGia());
                            new HoKhauServiceImpl().update(hkModel);
                            qhmodel.setQuanHeVoiChuHo("Chủ hộ");
                            qhmodel.setKhaiSinhNguoiThamGia(qh.getKhaiSinhNguoiThamGia());
                            new QuanHeServiceImpl().update(qhmodel);
                            break;
                        }
                    }

                }
            }
        } else {
            JOptionPane dialog = new JOptionPane("Thêm thông tin thất bại!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        showResult();
        clear();
        disableTextField();


    }//GEN-LAST:event_btn_luuThemActionPerformed

    private void btn_loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadDataActionPerformed
        //clear();
        ICongDanService congDanService = new CongDanServiceImpl();
        try {

            if (congDanService.countCCCD(tf_maKhaiSinh.getText().trim()) == 0) {
                CongDanModel congDan = new CongDanModel();
                congDan = congDanService.findOneByMaKS(tf_maKhaiSinh.getText().trim());
                tf_hoTen.setText(congDan.getHoTen());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                tf_ngaySinh.setText(dateFormat.format(congDan.getNgaySinh()));
            } else if (congDanService.countCCCD(tf_maKhaiSinh.getText().trim()) == 1) {
                CongDanModel congDan = new CongDanModel();
                congDan = congDanService.findOneByMaKS(tf_maKhaiSinh.getText().trim());
                tf_soCCCD.setText(congDan.getCCCD());
                tf_hoTen.setText(congDan.getHoTen());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                tf_ngaySinh.setText(dateFormat.format(congDan.getNgaySinh()));
            }
            tf_maKhaiSinh.setEditable(true);
        } catch (Exception e) {
            JOptionPane dialog = new JOptionPane("Thông tin công dân không tồn tại!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }

    }//GEN-LAST:event_btn_loadDataActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (tbl_thongTinChungTu.getSelectedRow() < 0) {
            JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_maKhaiSinh.setEditable(false);
            tf_soCCCD.setEditable(false);
            tf_maSoChungTu.setEditable(false);
            tf_ngaySinh.setEditable(false);
            tf_hoTen.setEditable(false);
            tf_noiMat.setEditable(true);
            tf_nguyenNhan.setEditable(true);
            tf_ngayMat.setEditable(true);

        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuSuaActionPerformed
        try {
            int selectedRow = tbl_thongTinChungTu.getSelectedRow();
            if (tbl_thongTinChungTu.getRowCount() <= 0) {
                JOptionPane dialog = new JOptionPane("Bảng không có dữ liệu!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            } else if (selectedRow < 0) {
                JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            } else if (selectedRow >= 0) {
                if (tf_ngayMat.getText().equals("") || tf_noiMat.getText().equals("") || tf_nguyenNhan.getText().equals("")) {
                    JOptionPane dialog = new JOptionPane("Hãy điền đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                GiayChungTuModel giayChungTu = giayChungTuService.findOneByMaCT(tf_maSoChungTu.getText());
                giayChungTu.setMaKS(tf_maKhaiSinh.getText().trim());
                giayChungTu.setHoTen(tf_hoTen.getText());
                giayChungTu.setCCCD(tf_soCCCD.getText().trim());
                giayChungTu.setNoiMat(tf_noiMat.getText());
                giayChungTu.setNguyenNhan(tf_nguyenNhan.getText());
                Date ngaySinhDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinh.getText().trim());
                java.sql.Date ngaySinh = new java.sql.Date(ngaySinhDate.getTime());
                giayChungTu.setNgaySinh(ngaySinh);
                giayChungTu.setTrangThai(1);
                try {
                    if (isDateValidPresent(tf_ngayMat.getText().trim())) {
                        Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayMat.getText().trim());
                        java.sql.Date sqlDate;
                        sqlDate = new java.sql.Date(utilDate.getTime());
                        giayChungTu.setNgayMat(sqlDate);
                    } else {
                        JOptionPane dialog = new JOptionPane("Lỗi ngày tháng năm!", JOptionPane.WARNING_MESSAGE);
                        JDialog jDialog = dialog.createDialog(null);
                        jDialog.setModal(true);
                        jDialog.setVisible(true);
                        return;
                    }

                } catch (ParseException ex) {
                    return;
                }
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayMat.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String ngayMat = dateFormat.format(utilDate);
                if (new GiayChungTuServiceImpl().update(giayChungTu)) {
                    JOptionPane dialog = new JOptionPane("Sửa thành công!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(ngayMat, selectedRow, 5);
                    model.setValueAt(tf_noiMat.getText(), selectedRow, 6);
                    model.setValueAt(tf_nguyenNhan.getText(), selectedRow, 7);
                    model.fireTableDataChanged();
                } else {
                    JOptionPane dialog = new JOptionPane("Sửa thất bại!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        clear();
        disableTextField();
    }//GEN-LAST:event_btn_luuSuaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (tf_hoTen.getText().equals("") || tf_soCCCD.getText().equals("") || tf_ngaySinh.getText().equals("") || tf_maKhaiSinh.getText().trim().equals("")) {
            JOptionPane dialog = new JOptionPane("Vui lòng nhập thông tin mã giấy khai sinh và tải dữ liệu!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_maKhaiSinh.setEditable(false);
            tf_soCCCD.setEditable(false);
            tf_maSoChungTu.setEditable(false);
            tf_ngaySinh.setEditable(false);
            tf_hoTen.setEditable(false);
            tf_noiMat.setEditable(true);
            tf_nguyenNhan.setEditable(true);
            tf_ngayMat.setEditable(true);
        }


    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xuatDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatDanhSachActionPerformed
        if (tbl_thongTinChungTu.getRowCount() != 0) {
            String filePath = "D:\\DanhSachChungTu.xlsx";
            exportToExcel(filePath);
        } else {
            JOptionPane dialog = new JOptionPane("Bảng dữ liệu trống!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
    }//GEN-LAST:event_btn_xuatDanhSachActionPerformed

    private void exportToExcel(String filePath) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Danh sách chứng tử");

        Cell cell = null;
        XSSFRow roww = sheet.createRow(0);
        cell = roww.createCell(4, CellType.STRING);
        cell.setCellValue("DANH SÁCH CHỨNG TỬ");

        // Tiêu đề cột
        Row headerRow = sheet.createRow(2);
        headerRow.createCell(0).setCellValue("STT");
        headerRow.createCell(1).setCellValue("Mã Chứng Tử");
        headerRow.createCell(2).setCellValue("Mã Khai Sinh");
        headerRow.createCell(3).setCellValue("Họ Tên");
        headerRow.createCell(4).setCellValue("Số CCCD");
        headerRow.createCell(5).setCellValue("Ngày Sinh");
        headerRow.createCell(6).setCellValue("Ngày Mất");
        headerRow.createCell(7).setCellValue("Nơi Mất");
        headerRow.createCell(8).setCellValue("Nguyên Nhân");

        int sttCounter = 1;
        // Dữ liệu
        for (int i = 0; i < tbl_thongTinChungTu.getRowCount(); i++) {
            Row row = sheet.createRow(i + 3);
            row.createCell(0).setCellValue(sttCounter++);
            row.createCell(1).setCellValue((String) tbl_thongTinChungTu.getValueAt(i, 0));
            row.createCell(2).setCellValue((String) tbl_thongTinChungTu.getValueAt(i, 1));
            row.createCell(3).setCellValue((String) tbl_thongTinChungTu.getValueAt(i, 2));
            row.createCell(4).setCellValue((String) tbl_thongTinChungTu.getValueAt(i, 3));

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(tbl_thongTinChungTu.getValueAt(i, 4).toString());
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue(tbl_thongTinChungTu.getValueAt(i, 5).toString());
            row.createCell(7).setCellValue((String) tbl_thongTinChungTu.getValueAt(i, 6));
            row.createCell(8).setCellValue((String) tbl_thongTinChungTu.getValueAt(i, 7));

        }

        // Tự động điều chỉnh độ rộng cột
        for (int i = 0; i < tbl_thongTinChungTu.getColumnCount(); i++) {
            sheet.autoSizeColumn(i);
        }
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(null, "Xuất dữ liệu ra file Excel thành công");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất dữ liệu ra file Excel");
        }
    }

    public void showResult() {
//        listGiayChungTu = giayChungTuService.findAll();
//        GiayChungTuModel giayChungTu = listGiayChungTu.get(listGiayChungTu.size() - 1);
//        model.fireTableDataChanged();
//        model.addRow(new Object[]{giayChungTu.getMaCT(), giayChungTu.getMaKS(), giayChungTu.getHoTen(), giayChungTu.getCCCD(), giayChungTu.getNgaySinh(), giayChungTu.getNgayMat(), giayChungTu.getNoiMat(), giayChungTu.getNguyenNhan()});
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        listGiayChungTu = giayChungTuService.findAll();
        for (GiayChungTuModel giayChungTu : listGiayChungTu) {
            model.addRow(new Object[]{giayChungTu.getMaCT(), giayChungTu.getMaKS(), giayChungTu.getHoTen(), giayChungTu.getCCCD(), giayChungTu.getNgaySinh(), giayChungTu.getNgayMat(), giayChungTu.getNoiMat(), giayChungTu.getNguyenNhan()});

        }

    }

    private void clear() {
        tf_soCCCD.setText("");
        tf_hoTen.setText("");
        tf_ngaySinh.setText("");
        tf_ngayMat.setText("");
        tf_maSoChungTu.setText("");
        tf_noiMat.setText("");
        tf_nguyenNhan.setText("");
        tf_maKhaiSinh.setText("");
    }

    private void disableTextField() {
        tf_maKhaiSinh.setEditable(true);
        tf_soCCCD.setEditable(false);
        tf_hoTen.setEditable(false);
        tf_ngaySinh.setEditable(false);
        tf_maSoChungTu.setEditable(false);
        tf_noiMat.setEditable(false);
        tf_ngayMat.setEditable(false);
        tf_nguyenNhan.setEditable(false);
    }

    private static boolean isValidCCCD(String cccd) {
        String regex = "^[0-9]{12}$";
        if (!cccd.matches(regex)) {
            return false;
        }
        return cccd.charAt(0) == '0';
    }

    public static boolean isDateValid_1(String ngayStr) {

        if (!ngayStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        int year = Integer.parseInt(ngayStr.substring(0, 4));
        int month = Integer.parseInt(ngayStr.substring(5, 7));
        int day = Integer.parseInt(ngayStr.substring(8, 10));

        if (month < 1 || month
                > 12) {
            return false;
        }

        if (day < 1 || day
                > 31) {
            return false;
        }
        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    if (day > 29) {
                        return false;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) {
                    return false;
                }
                break;
        }

        return true;
    }

    private static boolean isDateValidPresent(String ngayCapCCCD) {

        if (!ngayCapCCCD.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        if (!isDateValid_1(ngayCapCCCD)) {
            return false;
        }
        Optional<LocalDate> ngayCapCCCDOptional = Optional.ofNullable(LocalDate.parse(ngayCapCCCD));

        if (ngayCapCCCDOptional.isEmpty()) {
            return false;
        }

        LocalDate ngayCapCCCDDate = ngayCapCCCDOptional.get();
        LocalDate today = LocalDate.now();
        if (ngayCapCCCDDate.isAfter(today)) {
            return false;
        }

        LocalDate threeYearsAgo = today.minusYears(10);
        if (ngayCapCCCDDate.isBefore(threeYearsAgo)) {
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btn_loadData;
    private Swing.Button btn_luuSua;
    private Swing.Button btn_luuThem;
    private Swing.Button btn_sua;
    private Swing.Button btn_them;
    private Swing.Button btn_xoa;
    private Swing.Button btn_xoaDuLieu;
    private Swing.Button btn_xuatDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private Swing.TableDark tbl_thongTinChungTu;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_maKhaiSinh;
    private Swing.TextField tf_maSoChungTu;
    private Swing.TextField tf_ngayMat;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_nguyenNhan;
    private Swing.TextField tf_noiMat;
    private Swing.TextField tf_soCCCD;
    // End of variables declaration//GEN-END:variables

}
