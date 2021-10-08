/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinh Van
 */
public class Lab3_B1 extends javax.swing.JFrame {

    private StudentInterface ql;

    private DefaultTableModel tblModel;

    public Lab3_B1() {

        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMark = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxMajor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtHocLuc = new javax.swing.JTextField();
        chkBonus = new javax.swing.JCheckBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        btnSXName = new javax.swing.JButton();
        btnSXMarks = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sinh viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Quản lý sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã sinh viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ĐIỂM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("NGÀNH");

        cbxMajor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ứng dụng phần mềm", "Thiết kế web", "Lập trình máy tính", "Thiết kế đồ họa" }));
        cbxMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMajorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("HỌC LỰC");

        txtHocLuc.setAutoscrolls(false);
        txtHocLuc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        chkBonus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkBonus.setText("Có phần thưởng?");

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("XOÁ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCapNhat.setText("CẬP NHẬT");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnNhapMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNhapMoi.setText("NHẬP MỚI");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "HỌ VÀ TÊN", "ĐIỂM", "NGÀNH", "HỌC LỰC", "THƯỞNG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        btnSXName.setText("Sắp xếp theo tên");
        btnSXName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSXNameActionPerformed(evt);
            }
        });

        btnSXMarks.setText("Sắp xếp theo điểm");
        btnSXMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSXMarksActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("HỌ VÀ TÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chkBonus)
                                                .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnThem)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnXoa)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnCapNhat)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnNhapMoi))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(txtMark, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtStudentId)
                                                .addComponent(txtFullname)))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(471, 471, 471)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSXName)
                        .addGap(18, 18, 18)
                        .addComponent(btnSXMarks)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMark, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addComponent(chkBonus)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnNhapMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSXName)
                    .addComponent(btnSXMarks))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMajorActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        resetFrom();

    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        add();

    }//GEN-LAST:event_btnThemActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked

        selectFrom();
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed

        update();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSXNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSXNameActionPerformed
        sapXep("name");

    }//GEN-LAST:event_btnSXNameActionPerformed

    private void btnSXMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSXMarksActionPerformed
        // TODO add your handling code here:
        sapXep("mark");

    }//GEN-LAST:event_btnSXMarksActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        initTable();
        fillTable();
        resetFrom();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Lab3_B1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab3_B1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab3_B1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab3_B1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab3_B1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSXMarks;
    private javax.swing.JButton btnSXName;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxMajor;
    private javax.swing.JCheckBox chkBonus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtHocLuc;
    private javax.swing.JTextField txtMark;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        List<Student> list;
        tblModel = (DefaultTableModel) tblSinhVien.getModel();
        tblModel.setRowCount(0);
        list = ql.getList();
        for (Student st : list) {
            String bonus = st.isBonus() ? "Có" : "Không";
            tblModel.addRow(new Object[]{st.getMaSV(), st.getName(), st.getMajor(), st.getMarks(), st.getGrade(), bonus});
        }

    }

    private void initTable() {
        ql = new QLStudent();
        ql.insert(new Student("PH01", "Nguyễn Tiến Võ", "Ứng dụng phần mềm", 9));
        ql.insert(new Student("PH02", "Đặng Kim Cúc", "Lập trình máy tính", 8));
        ql.insert(new Student("PH03", "Nguyễn Thị Hà", "Thiết kế web", 4));
        ql.insert(new Student("PH04", "Vũ Kim Chi", "Lập trình mobile", 6));
        ql.insert(new Student("PH05", "Nguyễn Hoàng Cát Minh", "Thiết kế dồ hoạ", 7.5));
    }

    private void resetFrom() {
        txtStudentId.setText("");
        txtStudentId.setBackground(Color.white);
        txtStudentId.setEditable(true);
        txtFullname.setText("");
        txtFullname.setBackground(Color.white);
        txtMark.setText("");
        txtMark.setBackground(Color.white);
        txtHocLuc.setText("");
        chkBonus.setSelected(false);
        txtHocLuc.setEditable(false);
        cbxMajor.setSelectedIndex(0);
    }

    private void selectFrom() {
        List<Student> list;
        list = ql.getList();
        Student st = list.get(viTri());
        txtStudentId.setText(st.getMaSV());
        txtStudentId.setEditable(false);
        txtFullname.setText(st.getName());
        txtMark.setText(st.getMarks() + "");
        cbxMajor.setSelectedItem(st.getMajor());
        txtHocLuc.setText(st.getGrade());
        if (st.isBonus() == true) {
            chkBonus.setSelected(true);
        } else {
            chkBonus.setSelected(false);
        }
    }

    private void sapXep(String chon) {
        ql.sortList(chon);
        fillTable();
    }

    private boolean validatename() {
        String id = txtStudentId.getText().trim();
        String name = txtFullname.getText().trim();
        String txtdiem = txtMark.getText().trim();
        if (name.length() == 0 && txtdiem.length() == 0 && id.length() == 0) {
            JOptionPane.showMessageDialog(this, "Mã sinh viên, tên và điểm không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            txtStudentId.setBackground(Color.yellow);
            txtFullname.setBackground(Color.yellow);
            txtMark.setBackground(Color.yellow);
            return true;
        }
        if (id.length() == 0) {
            JOptionPane.showMessageDialog(this, "Tên không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            txtStudentId.setBackground(Color.yellow);
            return true;
        } else {
            txtStudentId.setBackground(Color.white);
        }

        if (name.length() == 0) {
            JOptionPane.showMessageDialog(this, "Tên không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            txtFullname.setBackground(Color.yellow);
            return true;
        } else {
            txtFullname.setBackground(Color.white);
        }

        if (txtdiem.length() == 0) {
            JOptionPane.showMessageDialog(this, "Điểm không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            txtMark.setBackground(Color.yellow);
            return true;
        } else {
            txtMark.setBackground(Color.white);
        }
        try {
            double diem = Double.parseDouble(txtdiem);
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Điểm phải nằm trong khoảng 0 - 10!", "Error", JOptionPane.ERROR_MESSAGE);
                txtMark.setBackground(Color.yellow);
                return true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Điểm phải là số thực!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    private boolean question(String mess) {
        int choice = JOptionPane.showConfirmDialog(this, mess, "Question", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
            return true;
        }
        return false;
    }

    private void message(String mess, int choice) {
        if (choice == 1) {
            JOptionPane.showMessageDialog(this, mess);
        } else {
            JOptionPane.showMessageDialog(this, mess, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int viTri() {
        int viTri = tblSinhVien.getSelectedRow();
        return viTri;
    }

    private void add() {
        List<Student> list;
        if (validatename()) {
            return;
        }
        String maSV = txtStudentId.getText().trim();
        list = ql.getList();
        for (Student st : list) {
            if (maSV.equalsIgnoreCase(st.getMaSV())) {
                message("Mã sinh viên này đã có trong hệ thống", 2);
                return;
            }
        }

        Student st = new Student();
        st.setMaSV(txtStudentId.getText());
        st.setName(txtFullname.getText());
        st.setMajor(cbxMajor.getSelectedItem().toString());
        st.setMarks(Double.parseDouble(txtMark.getText()));
        if (question("Bạn có muốn thêm sinh viên này?")) {
            return;
        }
        ql.insert(st);
        message("Thêm thành công!", 1);
        fillTable();
        resetFrom();
    }

    private void update() {
        if (viTri() == -1) {
            message("Chọn sinh viên muốn update trên table", 2);
            return;
        }
        if (validatename()) {
            return;
        }
        String maSV = txtStudentId.getText();
        String name = txtFullname.getText();
        String major = cbxMajor.getSelectedItem().toString();
        double diem = Double.parseDouble(txtMark.getText());
        if (question("Bạn muốn cập nhật sinh viên này?")) {
            return;
        }
        ql.update(viTri(), new Student(maSV, name, major, diem));
        message("Update thành công!", 1);
        fillTable();
        resetFrom();
    }

    private void delete() {
        List<Student> list;
        if (viTri() == -1) {
            message("Chọn sinh viên muốn xóa", 2);
            return;
        }
        if (question("Bạn muốn xóa sinh viên này?")) {
            return;
        }

        list = ql.getList();
        list.remove(viTri());
        fillTable();
        message("Xóa thành công", 1);
        resetFrom();

    }
}
