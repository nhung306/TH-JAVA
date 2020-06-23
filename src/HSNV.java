
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class HSNV extends javax.swing.JFrame {

    public HSNV() {
        initComponents();
        groupButton();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        RadioButtonNam = new javax.swing.JRadioButton();
        RadioButtonNu = new javax.swing.JRadioButton();
        ComboBoxNganhHoc = new javax.swing.JComboBox<>();
        Checkbox = new javax.swing.JPanel();
        CBoxLamViecNhom = new javax.swing.JCheckBox();
        CBoxThuyetTrinh = new javax.swing.JCheckBox();
        CBoxGiaoTiep = new javax.swing.JCheckBox();
        btnDangky = new javax.swing.JButton();
        btnBoQua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Hồ sơ nhân viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Giới tính");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ngành học");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Kỹ năng");

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        RadioButtonNam.setText("Nam");

        RadioButtonNu.setText("Nữ");

        ComboBoxNganhHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboBoxNganhHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản trị kinh doanh", "Công nghệ thông tin", "Ngôn ngữ anh" }));

        Checkbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CBoxLamViecNhom.setText("Làm việc nhóm");

        CBoxThuyetTrinh.setText("Thuyết trình");

        CBoxGiaoTiep.setText("Giao tiếp");

        javax.swing.GroupLayout CheckboxLayout = new javax.swing.GroupLayout(Checkbox);
        Checkbox.setLayout(CheckboxLayout);
        CheckboxLayout.setHorizontalGroup(
            CheckboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckboxLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CheckboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBoxGiaoTiep)
                    .addComponent(CBoxThuyetTrinh)
                    .addComponent(CBoxLamViecNhom))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        CheckboxLayout.setVerticalGroup(
            CheckboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckboxLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CBoxLamViecNhom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBoxThuyetTrinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBoxGiaoTiep)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnDangky.setText("Đăng ký");
        btnDangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkyActionPerformed(evt);
            }
        });

        btnBoQua.setText("Bỏ qua");
        btnBoQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoQuaActionPerformed(evt);
            }
        });

        tableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Họ tên", "Giới tính", "Ngành học", "Kỹ năng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableNhanVien);
        if (tableNhanVien.getColumnModel().getColumnCount() > 0) {
            tableNhanVien.getColumnModel().getColumn(0).setMinWidth(3);
            tableNhanVien.getColumnModel().getColumn(0).setPreferredWidth(3);
            tableNhanVien.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadioButtonNam)
                                .addGap(30, 30, 30)
                                .addComponent(RadioButtonNu))
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDangky)
                        .addGap(39, 39, 39)
                        .addComponent(btnBoQua)
                        .addGap(24, 24, 24)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(RadioButtonNam)
                            .addComponent(RadioButtonNu))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ComboBoxNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDangky)
                            .addComponent(btnBoQua))))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkyActionPerformed
         try  
        { 
            
            String radioText= "";
            //radio button gioi tinh
            if(RadioButtonNam.isSelected()){
                radioText = RadioButtonNam.getText();
            }
            if(RadioButtonNu.isSelected()){
                radioText = RadioButtonNu.getText();
            }
            //combobox ngành học
            String itemText = (String)ComboBoxNganhHoc.getSelectedItem( );
            //check box kỹ năng 
            String cb= "";
            if(CBoxGiaoTiep.isSelected()){
                cb +=  " " + CBoxGiaoTiep.getText() + ", ";
            }
            if(CBoxLamViecNhom.isSelected()){
                cb +=  " " + CBoxLamViecNhom.getText() + ", ";
            }
            if(CBoxThuyetTrinh.isSelected()){
                cb +=  " " + CBoxThuyetTrinh.getText() + ", ";
            }
            
            if("".equals(txtTen.getText())) 
            { 
                throw new Exception("Vui lòng nhập đầy đủ thông tin!"); 
            } 
            
            int row = GetAccountRow(txtTen.getText());                    
            
            NhanVien temp = new NhanVien(txtTen.getText(), radioText, itemText, cb);                    
            DefaultTableModel model = (DefaultTableModel)tableNhanVien.getModel(); //lay model mac dinh tu jtable 
            if(row == -1)  //TH insert 
            {                      
                int STT = 1;  
                if(model.getRowCount()> 0) 
                { 
                    STT = (int) model.getValueAt(model.getRowCount()-1, 0); 
                    STT++; 
                }
                model.addRow(new Object[]{ STT , temp.Ten, temp.GioiTinh, temp.NganhHoc , temp.KyNang}); 
                JOptionPane.showMessageDialog(this, "Thêm Mới Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE); 
            } 
            //TH update  
            else
            {                 
                model.setValueAt(temp.GioiTinh, row, 2); 
                model.setValueAt(temp.NganhHoc, row, 3);
                model.setValueAt(temp.KyNang, row, 4);
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE); 
            } 
        }catch(Exception ex) 
        { 
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btnDangkyActionPerformed

    private void btnBoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoQuaActionPerformed
       txtTen.setText("");
       RadioButtonNu. setSelected(false);
       RadioButtonNam.setSelected(false);
       ComboBoxNganhHoc.setSelectedIndex(0);
       CBoxGiaoTiep.setSelected(false);
       CBoxLamViecNhom.setSelected(false);
       CBoxThuyetTrinh.setSelected(false);
    }//GEN-LAST:event_btnBoQuaActionPerformed

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
            java.util.logging.Logger.getLogger(HSNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HSNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HSNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HSNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HSNV().setVisible(true);
            }
        });
    }

    private int GetAccountRow(String Ten)
    {
        DefaultTableModel model = (DefaultTableModel)tableNhanVien.getModel();
        for (int i = 0;i< model.getRowCount(); i++) 
        {
            if(model.getValueAt(i, 1).toString().equals(Ten.trim()))
            return i; 
        }
        return -1;
    }
    
    private void groupButton( ) {

        ButtonGroup bg1 = new ButtonGroup( );
            bg1.add(RadioButtonNam);
            bg1.add(RadioButtonNu);
    }
    
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBoxGiaoTiep;
    private javax.swing.JCheckBox CBoxLamViecNhom;
    private javax.swing.JCheckBox CBoxThuyetTrinh;
    private javax.swing.JPanel Checkbox;
    private javax.swing.JComboBox<String> ComboBoxNganhHoc;
    private javax.swing.JRadioButton RadioButtonNam;
    private javax.swing.JRadioButton RadioButtonNu;
    private javax.swing.JButton btnBoQua;
    private javax.swing.JButton btnDangky;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNhanVien;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
