package com.poly.model;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.poly.utils.XImage;

/**
 *
 * @author admin
 */
public class KhachHangJFrame extends javax.swing.JFrame {

    /**
     * Creates new form KhachHangJFrame
     */
    public KhachHangJFrame() {
        initComponents();
        this.setIconImage(XImage.getAppIcon());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        txtNamSinh = new com.toedter.calendar.JDateChooser();
        pnlDanhSach = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KLShop - Quản lý khách hàng");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("QUẢN LÝ KHÁCH HÀNG");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 41));

        jLabel3.setText("Chú ý các trường (*) là bắt buộc.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pnlCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        pnlCapNhat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("<html><p><strong style=\"color:red\">*</strong> Mã khách hàng:</p></htm>");
        pnlCapNhat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        pnlCapNhat.add(txtMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 370, 40));

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icon/Refresh.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        pnlCapNhat.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 150, 50));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        pnlCapNhat.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 130, 50));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        pnlCapNhat.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 130, 50));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        pnlCapNhat.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 130, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("<html><p><strong style=\"color:red\">*</strong> Giới tính:</p></htm>");
        jLabel7.setToolTipText("");
        pnlCapNhat.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        btgGioiTinh.add(rdoNu);
        rdoNu.setText("Nữ");
        pnlCapNhat.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 80, -1));

        btgGioiTinh.add(rdoNam);
        rdoNam.setText("Nam");
        pnlCapNhat.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("<html><p><strong style=\"color:red\">*</strong> Năm sinh:</p></htm>");
        pnlCapNhat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/img/customer.png"))); // NOI18N
        pnlCapNhat.add(lblHinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 260, 260));
        pnlCapNhat.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 340, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("<html><p><strong style=\"color:red\">*</strong> Tên khách hàng:</p></htm>");
        pnlCapNhat.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));
        pnlCapNhat.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 340, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("<html><p><strong style=\"color:red\">*</strong> Email:</p></htm>");
        pnlCapNhat.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));
        pnlCapNhat.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("<html><p><strong style=\"color:red\">*</strong> Số điện thoại:</p></htm>");
        pnlCapNhat.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("<html><p><strong style=\"color:red\">*</strong> Địa chỉ:</p></htm>");
        pnlCapNhat.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtDiaChi.setColumns(20);
        txtDiaChi.setLineWrap(true);
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        pnlCapNhat.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 580, 190));

        txtNamSinh.setToolTipText("");
        txtNamSinh.setDateFormatString("dd/MM/yyyy");
        pnlCapNhat.add(txtNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 370, 40));

        jTabbedPane1.addTab("CẬP NHẬT", pnlCapNhat);

        pnlDanhSach.setBackground(new java.awt.Color(255, 255, 255));
        pnlDanhSach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlDanhSach.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 640, -1));

        btnTimKiem.setText("Tìm");
        pnlDanhSach.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 90, -1));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2112", "2121", "2112", "121212", "21121", "12121", "121212"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "Năm sinh", "Giới tính", "Địa chỉ", "Email", "SĐT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblKhachHang);

        pnlDanhSach.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1010, -1));

        jTabbedPane1.addTab("DANH SÁCH", pnlDanhSach);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1040, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatArcIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKH;
    private com.toedter.calendar.JDateChooser txtNamSinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}