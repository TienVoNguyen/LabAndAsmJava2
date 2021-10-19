
package luyentap2;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SPFrom extends javax.swing.JFrame implements Runnable{

    private DefaultTableModel tModel;
    private SPInterface ql;
    private List<SanPham> lst;
    
    public SPFrom() {
        initComponents();
        setLocationRelativeTo(this);
        Thread th = new Thread(this);
        th.start();
        this.ql = new QLSP();
        this.lst = new ArrayList<>();
        fillTable();
        resetFrom();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGtinhTrang = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxDanhMuc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        radConHang = new javax.swing.JRadioButton();
        radHetHang = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoaFrom = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        lbClock = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sản Phẩm");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Quản Lý Sản Phẩm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã SP");

        txtIDSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên SP");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Danh mục");

        cbxDanhMuc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxDanhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "SmartPhone" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tình trạng");

        btnGtinhTrang.add(radConHang);
        radConHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radConHang.setText("Còn hàng");

        btnGtinhTrang.add(radHetHang);
        radHetHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radHetHang.setText("Hết hàng");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Đơn giá");

        txtDonGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoaFrom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoaFrom.setText("Xóa From");
        btnXoaFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFromActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnGhi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGhi.setText("Ghi File");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnDoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDoc.setText("Đọc File");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        lbClock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbClock.setForeground(new java.awt.Color(255, 0, 51));
        lbClock.setText("00:00:00 aa");

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Danh mục", "Tình trạng", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radConHang)
                                                .addGap(18, 18, 18)
                                                .addComponent(radHetHang))
                                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(lbClock)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua)
                                .addGap(39, 39, 39)
                                .addComponent(btnXoa)
                                .addGap(31, 31, 31)
                                .addComponent(btnXoaFrom)
                                .addGap(50, 50, 50))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnGhi)
                        .addGap(39, 39, 39)
                        .addComponent(btnDoc)
                        .addGap(44, 44, 44)
                        .addComponent(btnExit)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDoc, btnExit, btnGhi, btnSua, btnThem, btnXoa, btnXoaFrom});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(radConHang)
                    .addComponent(radHetHang))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaFrom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnDoc)
                    .addComponent(btnExit))
                .addGap(26, 26, 26)
                .addComponent(lbClock)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        them();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        hienthi();
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        sua();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXoaFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFromActionPerformed
        resetFrom();
    }//GEN-LAST:event_btnXoaFromActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        ghiFile();
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        docFile();
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if(question("Ban co muon thoat?")) return;
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SPFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SPFrom.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGhi;
    private javax.swing.ButtonGroup btnGtinhTrang;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaFrom;
    private javax.swing.JComboBox<String> cbxDanhMuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbClock;
    private javax.swing.JRadioButton radConHang;
    private javax.swing.JRadioButton radHetHang;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtIDSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            try {
                Date now = new Date();
                String date = sdf.format(now);
                lbClock.setText(date);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SPFrom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
    private int viTri() {
        int viTri = tblSP.getSelectedRow();
        return viTri;
    }
    
    private void fillTable() {
        tModel = (DefaultTableModel) tblSP.getModel();
        tModel.setRowCount(0);
        this.lst = this.ql.getList();
        for (SanPham sp : lst) {
            String tinhTrang = sp.isTinhTrang() ? "Còn hàng" : "Hết hang";            
            Object[] addrow = {
            sp.getMaSP(), sp.getTenSP(), sp.getDanhMuc(), tinhTrang, sp.getDonGia()
        }; 
           tModel.addRow(addrow);
        }       
    }
    
    private void resetFrom() {
        txtTenSP.setText("");
        txtTenSP.setBackground(Color.white);
        txtDonGia.setText("");
        txtDonGia.setBackground(Color.white);
        txtIDSP.setText("");
        txtIDSP.setBackground(Color.white);
        radConHang.setSelected(true);
        cbxDanhMuc.setSelectedIndex(0);        
    }
    
    private void hienthi() {
        if(viTri() < 0) {
            return;
        }
        this.lst = ql.getList();
        SanPham sp = lst.get(viTri());
        txtIDSP.setText(sp.getMaSP());
        txtTenSP.setText(sp.getTenSP());
        txtDonGia.setText(sp.getDonGia() + "");
        cbxDanhMuc.setSelectedItem(sp.getDanhMuc());
        if(sp.isTinhTrang()) {
            radConHang.setSelected(true);
        }else {
            radHetHang.setSelected(true);
        }
    }
    
    private boolean them() {
        if(validation()) return true;
        String masp = txtIDSP.getText();
        String tensp = txtTenSP.getText();
        double dongia = Double.parseDouble(txtDonGia.getText());
        boolean tinhTrang = radConHang.isSelected();
        String danhmuc = (String) cbxDanhMuc.getSelectedItem();
        ql.them(new SanPham(masp, tensp, danhmuc, dongia, tinhTrang));
        JOptionPane.showMessageDialog(this, "Them thanh cong");
        fillTable();
        resetFrom();
        return false;
    }
    
    private boolean sua() {
        if(viTri() < 0) {
            JOptionPane.showMessageDialog(this, "Chon vi tri sua", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if(validation()) return true;
        String masp = txtIDSP.getText();
        String tensp = txtTenSP.getText();
        double dongia = Double.parseDouble(txtDonGia.getText());
        boolean tinhTrang = radConHang.isSelected();
        String danhmuc = (String) cbxDanhMuc.getSelectedItem();
        if(question("Ban co muon sua?")) return true;
        ql.sua(viTri(), new SanPham(masp, tensp, danhmuc, dongia, tinhTrang));
        JOptionPane.showMessageDialog(this, "Sua thanh cong");
        fillTable();
        resetFrom();
        return false;
    }
    
    private boolean xoa() {
         if(viTri() < 0) {
            JOptionPane.showMessageDialog(this, "Chon vi tri xoa", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if(validation()) return true;
        if(question("Ban co muon xoa?")) return true;
        ql.xoa(viTri());
        JOptionPane.showMessageDialog(this, "Xoa thanh cong");
        fillTable();
        resetFrom();
        return false;
    }
    
    private void ghiFile() {
        try {
            ql.ghiFile();
            JOptionPane.showMessageDialog(this, "Ghi thanh cong");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ghi file that bai", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void docFile() {
        try {
            ql.docFile();
            fillTable();
            JOptionPane.showMessageDialog(this, "Doc thanh cong");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Doc file that bai", "Error", JOptionPane.ERROR_MESSAGE);       
        }
    }
    
    private boolean validation() {
        if(txtIDSP.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhap ma sp", "Error", JOptionPane.ERROR_MESSAGE);
            txtIDSP.requestFocus();
            txtIDSP.setBackground(Color.yellow);
            return true;
        }else {
            txtIDSP.setBackground(Color.white);
        }
        
        if(txtTenSP.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhap ten sp", "Error", JOptionPane.ERROR_MESSAGE);
            txtTenSP.requestFocus();
            txtTenSP.setBackground(Color.yellow);
            return true;
        }else {
            txtTenSP.setBackground(Color.white);
        }
        
        if(txtDonGia.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhap gia sp", "Error", JOptionPane.ERROR_MESSAGE);
            txtDonGia.requestFocus();
            txtDonGia.setBackground(Color.yellow);
            return true;
        }else {
            txtDonGia.setBackground(Color.white);
        }
        try {
            double gia = Double.parseDouble(txtDonGia.getText());
            if(gia < 0) {
                JOptionPane.showMessageDialog(this, "Gia sp lon hon 0", "Error", JOptionPane.ERROR_MESSAGE);
                txtDonGia.requestFocus();
                txtDonGia.setBackground(Color.yellow);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sai dinh dang gia", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        
        return false;
    }
    
    public boolean question(String mess) {
        int choice = JOptionPane.showConfirmDialog(this, mess, "Question", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
            return true;
        }
        return false;
    }
}
