/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pratik
 */
public class ShowStaff extends javax.swing.JFrame {

    /**
     * Creates new form ShowStaff
     */
    public ShowStaff() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        idCb = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        nameCb = new javax.swing.JCheckBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        typeCB = new javax.swing.JCheckBox();
        genderCb = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        contactCb = new javax.swing.JCheckBox();
        idTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        contactTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        typeCb = new javax.swing.JComboBox<>();
        deptCb = new javax.swing.JCheckBox();
        deptTf = new javax.swing.JTextField();
        roomCb = new javax.swing.JCheckBox();
        roomTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idCb.setText("Id");
        idCb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                idCbStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("M");
        jRadioButton1.setEnabled(false);

        nameCb.setText("Name");
        nameCb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nameCbStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("F");
        jRadioButton2.setEnabled(false);

        typeCB.setText("Type");
        typeCB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                typeCBStateChanged(evt);
            }
        });

        genderCb.setText("Gender");
        genderCb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                genderCbStateChanged(evt);
            }
        });
        genderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("EnviroD", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Staff's Info");
        jLabel1.setOpaque(true);

        contactCb.setText("Contact");
        contactCb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                contactCbStateChanged(evt);
            }
        });
        contactCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactCbActionPerformed(evt);
            }
        });

        idTf.setEnabled(false);

        nameTf.setEnabled(false);

        contactTf.setEnabled(false);
        contactTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTfActionPerformed(evt);
            }
        });
        contactTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactTfKeyPressed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Type", "Gender", "Contact No.", "Dept", "Time ", "Days ", "Available", "Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmdExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmdExit.setText("Show");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        typeCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultant", "Nurse", "Intern" }));

        deptCb.setText("Dept");
        deptCb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                deptCbStateChanged(evt);
            }
        });

        deptTf.setEnabled(false);
        deptTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptTfActionPerformed(evt);
            }
        });

        roomCb.setText("Room");
        roomCb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                roomCbStateChanged(evt);
            }
        });

        roomTf.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idCb)
                            .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameCb)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeCB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(genderCb))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactCb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deptCb)
                                .addGap(56, 56, 56)
                                .addComponent(roomCb))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deptTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245)
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCb)
                    .addComponent(nameCb)
                    .addComponent(typeCB)
                    .addComponent(genderCb)
                    .addComponent(contactCb)
                    .addComponent(deptCb)
                    .addComponent(roomCb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(contactTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cmdExit)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idCbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_idCbStateChanged
        // TODO add your handling code here:
        if(idCb.isSelected())
        {
            idTf.setEnabled(true);
        }
        else
        {
            idTf.setEnabled(false);
        }
    }//GEN-LAST:event_idCbStateChanged

    private void nameCbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nameCbStateChanged
        // TODO add your handling code here:
        if(nameCb.isSelected())
        {
            nameTf.setEnabled(true);
        }
        else
        {
            nameTf.setEnabled(false);
        }
    }//GEN-LAST:event_nameCbStateChanged

    private void typeCBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_typeCBStateChanged
        // TODO add your handling code here:
        if(typeCB.isSelected())
        {
            jSpinner1.setEnabled(true);
        }
        else
        {
            jSpinner1.setEnabled(false);
        }
    }//GEN-LAST:event_typeCBStateChanged

    private void genderCbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_genderCbStateChanged
        // TODO add your handling code here:
        jRadioButton1.setEnabled(genderCb.isSelected());
        jRadioButton2.setEnabled(genderCb.isSelected());
    }//GEN-LAST:event_genderCbStateChanged

    private void contactCbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_contactCbStateChanged
        // TODO add your handling code here:
        if(contactCb.isSelected())
        {
            contactTf.setEnabled(true);
        }
        else
        {
            contactTf.setEnabled(false);
        }
    }//GEN-LAST:event_contactCbStateChanged

    private void contactCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactCbActionPerformed

    private void contactTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactTfKeyPressed
        // TODO add your handling code here:
        //        if(evt.getKeyChar()<'0' || evt.getKeyChar()>'9')
        //            evt.consume();
    }//GEN-LAST:event_contactTfKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Info.currentUserId.equals("U1"))
        {
            this.dispose();
            new LibHome().setVisible(true);
        }
        else
        {
            this.dispose();
            new UserHome().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        String query = "Select Id,concat(FirstName,' ',LastName),Age,Gender,ContactNo From Patient ";
        Boolean last=false;
        int f=0;
        if(idCb.isSelected())
        {
            if(last)
            query+=" and ";
            else
            query+=" where ";
            query+=" Id like '"+idTf.getText()+"%'";
            last=true;
        }
        if(nameCb.isSelected())
        {
            if(last)
            query+=" and ";
            else
            query+=" where ";
            query+=" concat(FirstName,' ',LastName) like'"+nameTf.getText()+"%' ";
            last=true;
        }
        if(typeCB.isSelected())
        {
            if(last)
            query+=" and ";
            else
            query+=" where ";
            query+=" Age="+jSpinner1.getValue()+" ";
            last=true;
        }
        if(genderCb.isSelected())
        {
            if(last)
            query+=" and ";
            else
            query+=" where ";
            String g="M";
            if(jRadioButton2.isSelected())
            g="F";
            query+=" Gender='"+g+"' ";
            last=true;
        }
        if(contactCb.isSelected())
        {
            if(last)
            query+=" and ";
            else
            query+=" where ";
            query+=" ContactNo like '"+contactTf.getText()+"%' ";
        }
        System.out.println(query);
        try
        {
            Connection myConn=null;
            Statement stat=null;
            ResultSet rs=null;
            myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS_0049",Info.user,Info.pass);
            stat=myConn.createStatement();

            rs = stat.executeQuery(query);

            while (rs.next()) {
                String a1 = rs.getString(1);
                String a2 = rs.getString(2);
                String a3 = rs.getString(3);
                String a4 = rs.getString(4);
                String a5 = rs.getString(5);
                model.addRow(new Object[] {a1,a2,a3,a4,a5});
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cmdExitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void genderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCbActionPerformed

    private void deptCbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_deptCbStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_deptCbStateChanged

    private void roomCbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_roomCbStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_roomCbStateChanged

    private void deptTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptTfActionPerformed

    private void contactTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTfActionPerformed

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
            java.util.logging.Logger.getLogger(ShowStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cmdExit;
    private javax.swing.JCheckBox contactCb;
    private javax.swing.JTextField contactTf;
    private javax.swing.JCheckBox deptCb;
    private javax.swing.JTextField deptTf;
    private javax.swing.JCheckBox genderCb;
    private javax.swing.JCheckBox idCb;
    private javax.swing.JTextField idTf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox nameCb;
    private javax.swing.JTextField nameTf;
    private javax.swing.JCheckBox roomCb;
    private javax.swing.JTextField roomTf;
    private javax.swing.JCheckBox typeCB;
    private javax.swing.JComboBox<String> typeCb;
    // End of variables declaration//GEN-END:variables
}
