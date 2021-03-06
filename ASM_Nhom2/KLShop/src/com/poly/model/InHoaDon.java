package com.poly.model;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.poly.utils.XImage;

/**
 *
 * @author admin
 */
public class InHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form InHoaDon
     */
    public InHoaDon() {
        initComponents();
        this.setIconImage(XImage.getAppIcon());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelHD = new javax.swing.JPanel();
        lblHd = new javax.swing.JLabel();
        panelBanHang2 = new javax.swing.JScrollPane();
        tblSanPham2 = new javax.swing.JTable();
        lblNgayBan = new javax.swing.JLabel();
        lblNgayBan1 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();
        lblThuNgan = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNgayBan2 = new javax.swing.JLabel();
        lblTongTienChu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KLShop - Hóa đơn bán hàng");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Xem trước khi in");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelHD.setBackground(new java.awt.Color(255, 255, 255));

        lblHd.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblHd.setForeground(new java.awt.Color(102, 102, 102));
        lblHd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHd.setText("HÓA ĐƠN BÁN HÀNG");

        panelBanHang2.setBackground(new java.awt.Color(255, 255, 255));
        panelBanHang2.setBorder(null);

        tblSanPham2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        tblSanPham2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblSanPham2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Co ca cola", "10 000", "10", "1000", "9000"},
                {"2", "Cà phê đen đá", "6000", "2", "1000", "11000"},
                {"3", "Trà đào", "12000", "1", "0", "12000"}
            },
            new String [] {
                "STT", "Tên sản phẩm", "Đơn giá", "Số lượng", "Giảm giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham2.setFocusable(false);
        tblSanPham2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblSanPham2.setRowHeight(30);
        tblSanPham2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblSanPham2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        panelBanHang2.setViewportView(tblSanPham2);
        if (tblSanPham2.getColumnModel().getColumnCount() > 0) {
            tblSanPham2.getColumnModel().getColumn(0).setResizable(false);
            tblSanPham2.getColumnModel().getColumn(0).setPreferredWidth(45);
            tblSanPham2.getColumnModel().getColumn(1).setResizable(false);
            tblSanPham2.getColumnModel().getColumn(2).setResizable(false);
            tblSanPham2.getColumnModel().getColumn(3).setResizable(false);
            tblSanPham2.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblSanPham2.getColumnModel().getColumn(4).setResizable(false);
            tblSanPham2.getColumnModel().getColumn(5).setResizable(false);
        }

        lblNgayBan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNgayBan.setText("Ngày bán :");

        lblNgayBan1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNgayBan1.setForeground(new java.awt.Color(255, 0, 0));
        lblNgayBan1.setText("Tổng cộng:");

        lblTongTien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 0, 0));
        lblTongTien.setText("20000 VND");

        lblMaHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMaHD.setText("Mã HD:");

        lblThuNgan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblThuNgan.setText("Thu ngân:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Xin hẹn gặp lại !");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Chân thành cảm ơn quý khách");

        lblNgayBan2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNgayBan2.setForeground(new java.awt.Color(255, 0, 0));
        lblNgayBan2.setText("Bằng chữ:");

        lblTongTienChu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTongTienChu.setForeground(new java.awt.Color(255, 0, 0));
        lblTongTienChu.setText("Hai mươi nghìn VND");

        javax.swing.GroupLayout panelHDLayout = new javax.swing.GroupLayout(panelHD);
        panelHD.setLayout(panelHDLayout);
        panelHDLayout.setHorizontalGroup(
            panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
            .addGroup(panelHDLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHDLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayBan1)
                            .addComponent(lblNgayBan2))
                        .addGap(18, 18, 18)
                        .addGroup(panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongTienChu))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHDLayout.createSequentialGroup()
                        .addGroup(panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelHDLayout.createSequentialGroup()
                                .addComponent(lblMaHD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblThuNgan))
                            .addGroup(panelHDLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(lblHd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(151, 151, 151))
                    .addGroup(panelHDLayout.createSequentialGroup()
                        .addGroup(panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBanHang2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayBan))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelHDLayout.setVerticalGroup(
            panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHDLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblNgayBan)
                .addGap(35, 35, 35)
                .addComponent(lblHd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaHD)
                    .addComponent(lblThuNgan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBanHang2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayBan1)
                    .addComponent(lblTongTien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayBan2)
                    .addComponent(lblTongTienChu))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );

        jPanel1.add(panelHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 840, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHDActionPerformed

    }//GEN-LAST:event_btnInHDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
         FlatArcIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHd;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblNgayBan;
    private javax.swing.JLabel lblNgayBan1;
    private javax.swing.JLabel lblNgayBan2;
    private javax.swing.JLabel lblThuNgan;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblTongTienChu;
    private javax.swing.JScrollPane panelBanHang2;
    private javax.swing.JPanel panelHD;
    private javax.swing.JTable tblSanPham2;
    // End of variables declaration//GEN-END:variables
}
