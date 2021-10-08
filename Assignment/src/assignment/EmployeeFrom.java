package assignment;

import assignment.model.Employee;
import assignment.model.EmployeeInterface;
import assignment.model.QLEmployee;
import assignment.thread.OclockThread;
import assignment.thread.ShareData;
import assignment.validation.Validation;
import java.awt.Color;
import static java.lang.String.format;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeFrom extends javax.swing.JFrame {

    private ShareData data;
    private EmployeeInterface ql;
    private DefaultTableModel tblModel;
    private int position = 0;

    public EmployeeFrom() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtStaffId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lblRecord = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("                                                                                        QUẢN LÝ NHÂN VIÊN");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("MÃ NHÂN VIÊN");

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 255, 255))); // NOI18N

        btnNew.setBackground(new java.awt.Color(153, 102, 255));
        btnNew.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(153, 102, 255));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 102, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(153, 102, 255));
        btnFind.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("FIND");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setBackground(new java.awt.Color(153, 102, 255));
        btnOpen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOpen.setForeground(new java.awt.Color(255, 255, 255));
        btnOpen.setText("OPEN");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 102, 255));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addComponent(btnFind)
                    .addComponent(btnOpen)
                    .addComponent(btnExit)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnExit, btnFind, btnNew, btnOpen, btnSave});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addGap(18, 18, 18)
                .addComponent(btnOpen)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnExit, btnFind, btnNew, btnOpen, btnSave});

        txtStaffId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("HỌ VÀ TÊN");

        txtFullname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("NGÀY SINH");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("EMAIL");

        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("LƯƠNG");

        btnFirst.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        lblRecord.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(204, 0, 51));
        lblRecord.setText("Record: 1 of 10");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("(dd/mm/yyyy)");

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 102, 51));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("00:00:00 AM");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("(abc@exam.com)");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("( >5000000)");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("(Your Name)");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("(PH00000)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDate))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtStaffId)))))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(95, 95, 95)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast)
                        .addGap(18, 18, 18)
                        .addComponent(lblRecord)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrevious});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel3, lblTime});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirst)
                            .addComponent(btnPrevious)
                            .addComponent(btnNext)
                            .addComponent(btnLast)
                            .addComponent(lblRecord))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        tblEmployees.setBackground(new java.awt.Color(255, 204, 204));
        tblEmployees.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblEmployees.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblEmployees.setForeground(new java.awt.Color(0, 0, 51));
        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "NGÀY SINH", "EMAIL", "LƯƠNG"
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
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        OclockThread oclock = new OclockThread(lblTime);
        data = new ShareData(this, jPanel2);
        data.start();
        oclock.start();
        ql = new QLEmployee();
        ql.openFile();
        fillTable();
        selectFrom(0);


    }//GEN-LAST:event_formWindowOpened

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        save();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        resetFrom();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        selectFrom(index());
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        if (findById()) {
            return;
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        position = 0;
        selectFrom(position);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        position = ql.countEmployee() - 1;
        selectFrom(position);
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        position++;
        if (position >= ql.countEmployee() - 1) {
            position = ql.countEmployee() - 1;
        }
        selectFrom(position);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        position--;
        if (position < 1) {
            position = 0;
        }
        selectFrom(position);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (Question("Bạn có muốn thoát không?")) {
            return;
        }
        ql.saveFile();
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        ql.openFile();
        fillTable();
    }//GEN-LAST:event_btnOpenActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeFrom().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtStaffId;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        tblModel = (DefaultTableModel) tblEmployees.getModel();
        tblModel.setRowCount(0);

        List<Employee> lst = ql.getEmployeeList();
        for (Employee e : lst) {
            Object[] rowData = {e.getId(), e.getName(),
                e.getAge(), e.getDate(), e.getEmail(),
                format("%.2f", e.getSalary())};
            tblEmployees.setRowHeight(30);
            tblEmployees.setAutoResizeMode(tblEmployees.AUTO_RESIZE_OFF);
            tblEmployees.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblEmployees.getColumnModel().getColumn(1).setPreferredWidth(152);
            tblEmployees.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblEmployees.getColumnModel().getColumn(3).setPreferredWidth(116);
            tblEmployees.getColumnModel().getColumn(4).setPreferredWidth(130);
            tblEmployees.getColumnModel().getColumn(5).setPreferredWidth(130);
            tblModel.addRow(rowData);
        }

    }

    private void resetFrom() {
        txtStaffId.setText("");
        txtStaffId.setBackground(Color.white);
        txtStaffId.setEditable(true);
        txtFullname.setText("");
        txtFullname.setBackground(Color.white);
        txtDate.setText("");
        txtDate.setBackground(Color.white);
        txtEmail.setText("");
        txtEmail.setBackground(Color.white);
        txtSalary.setText("");
        txtSalary.setBackground(Color.white);
        position = -1;
        lblRecord.setText("Record: " + (position + 1) + " of " + ql.countEmployee());
        btnFirst.setEnabled(true);
        btnPrevious.setEnabled(true);
        btnLast.setEnabled(true);
        btnNext.setEnabled(true);

    }

    private void selectFrom(int index) {
        Employee e;
        try {
            e = (Employee) ql.getEmployeeByPosition(index);
            txtStaffId.setText(e.getId());
            txtStaffId.setEditable(false);
            txtFullname.setText(e.getName());
            txtDate.setText(e.getDate());
            txtEmail.setText(e.getEmail());
            txtSalary.setText(String.valueOf(format("%.2f", e.getSalary())));
            if (index <= 0) {
                btnFirst.setEnabled(false);
                btnPrevious.setEnabled(false);
                btnLast.setEnabled(true);
                btnNext.setEnabled(true);
            } else if (index >= ql.countEmployee() - 1) {
                btnFirst.setEnabled(true);
                btnPrevious.setEnabled(true);
                btnLast.setEnabled(false);
                btnNext.setEnabled(false);
            } else {
                btnFirst.setEnabled(true);
                btnPrevious.setEnabled(true);
                btnLast.setEnabled(true);
                btnNext.setEnabled(true);
            }
            lblRecord.setText("Record: " + (index + 1) + " of " + ql.countEmployee());

        } catch (Exception ee) {
            ee.printStackTrace();
            JOptionPane.showMessageDialog(this, "File chưa có dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            lblRecord.setText("Record: " + 0 + " of " + ql.countEmployee());
        }
    }

    private boolean validation() {
        if (Validation.iEmpty(txtStaffId, "Id không được để trống!")) {
            return true;
        };

        if (Validation.isNotId(txtStaffId, "Sai định dạng ID")) {
            return true;
        };

        if (Validation.iEmpty(txtFullname, "Họ tên không được để trống!")) {
            return true;
        };

        if (Validation.isNotName(txtFullname, "Sai định dạng tên!")) {
            return true;
        };

        if (Validation.iEmpty(txtDate, "Ngày sinh không được để trống!")) {
            return true;
        };

        if (Validation.isNotDOB(txtDate, "Ngày sinh phải đúng định dạng và 16 < tuổi < 55!")) {
            return true;
        };

        if (Validation.iEmpty(txtEmail, "Email không được để trống!")) {
            return true;
        };

        if (Validation.isNotEmail(txtEmail, "Sai định dạng email!")) {
            return true;
        };

        if (Validation.iEmpty(txtSalary, "Lương không được để trống!")) {
            return true;
        };

        if (Validation.isNotNumber(txtSalary, "Lương phải đúng định dạng và luong > 5 triệu!")) {
            return true;
        };

        return false;
    }

    private Employee getEmployee() {
        Employee e = new Employee();
        e.setId(txtStaffId.getText());
        e.setName(txtFullname.getText());
        e.setDate(txtDate.getText());
        e.setEmail(txtEmail.getText());
        e.setSalary(Double.parseDouble(txtSalary.getText()));
        return e;
    }

    private int index() {
        int index = tblEmployees.getSelectedRow();
        return index;
    }

    private boolean Question(String mess) {
        int choice = JOptionPane.showConfirmDialog(this, mess, "Question", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
            return true;
        }

        return false;
    }

    private boolean save() {
        if (validation()) {
            return true;
        }
        if (Question("Bạn có muốn cập nhật / thêm mới?")) {
            return true;
        }
        Employee e = getEmployee();
        if (ql.save(e) >= 0) {
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
        }
        fillTable();
        resetFrom();
        return false;
    }

    private boolean delete() {
        if (Validation.iEmpty(txtStaffId, "Vui lòng nhập ID cần xóa!")) {
            return true;
        }
        String id = txtStaffId.getText();
        if (ql.findById(id) < 0) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên không có trong hệ thống", "Error", JOptionPane.ERROR_MESSAGE);
            resetFrom();
            txtStaffId.requestFocus();
            return true;
        }
        if (Question("Bạn có muốn xóa nhân viên này?")) {
            return true;
        }
        ql.delete(id);
        JOptionPane.showMessageDialog(this, "Xóa thành công");
        fillTable();
        resetFrom();
        return false;
    }

    private boolean findById() {
        if (Validation.iEmpty(txtStaffId, "Vui lòng nhập ID cần tìm!")) {
            return true;
        }
        String id = txtStaffId.getText();
        if (ql.findById(id) < 0) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên không có trong hệ thống", "Error", JOptionPane.ERROR_MESSAGE);
            resetFrom();
            txtStaffId.requestFocus();
            return true;
        }
        selectFrom(ql.findById(id));
        return false;
    }

}
