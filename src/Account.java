
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Account extends javax.swing.JFrame {

    public Account() {
        initComponents();
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
        txtSTK = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAccount = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Quản lý thông tin tài khoản");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 35, -1, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Số tài khoản");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 87, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên khách hàng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 127, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 167, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Số tiền");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 207, -1, -1));

        txtSTK.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getContentPane().add(txtSTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 87, 256, -1));

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getContentPane().add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 127, 256, -1));

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getContentPane().add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 165, 256, -1));

        txtSoTien.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getContentPane().add(txtSoTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 205, 256, -1));

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 260, -1, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 260, -1, -1));

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 260, -1, -1));

        TableAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã tài khoản", "Tên khách hàng", "Địa chỉ", "Số Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAccountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableAccount);
        if (TableAccount.getColumnModel().getColumnCount() > 0) {
            TableAccount.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 316, 533, 173));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tổng tiền");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0");
        txtTongTien.setEnabled(false);
        getContentPane().add(txtTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 191, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 610, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        try  
        { 
            if("".equals(txtSTK.getText()) || "".equals(txtTen.getText()) || "".equals(txtDiaChi.getText()) ) 
            { 
                throw new Exception("Vui lòng nhập đầy đủ thông tin!"); 
            } 
            int row = GetAccountRow(txtSTK.getText()); 
            //tao doi tuong Account temp  
            TaiKhoan temp = new TaiKhoan(txtSTK.getText(),txtTen.getText(), txtDiaChi.getText(),Double.parseDouble(txtSoTien.getText()) ); 
            DefaultTableModel model = (DefaultTableModel)TableAccount.getModel(); //lay model mac dinh tu jtable 
            if(row == -1)  //TH insert 
            {                      
                int STT = 1;  
                if(model.getRowCount()> 0) 
                { 
                    STT = (int) model.getValueAt(model.getRowCount()-1, 0); 
                    STT++; 
                }
                model.addRow(new Object[]{ STT , temp.STK, temp.Ten, temp.DiaChi , temp.SoTien}); 
                TongTien();
                JOptionPane.showMessageDialog(this, "Thêm Mới Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE); 
            } 
            else  //TH update  
            {                  
                model.setValueAt(temp.Ten, row, 2); 
                model.setValueAt(temp.DiaChi, row, 3); 
                model.setValueAt(temp.SoTien, row, 4);
                TongTien();
                JOptionPane.showMessageDialog(this, "Cập nhật tài khoản thành công!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE); 
            }         
        } 
        catch(Exception ex) 
        { 
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try 
        {
            int row = GetAccountRow(txtSTK.getText()); 
            if(row == -1) //TH insert
            {
                throw new Exception("Không tìm thấy số tài khoản cần xóa!");
            }
            else //TH remove 
            {
                //goi confirm message 
               
                int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
                // 0=yes, 1=no, 2=cancel
                if(input == 0) //th yes
                { 
                    DefaultTableModel model = (DefaultTableModel) 
                    TableAccount.getModel(); 

                    model.removeRow(row);  
                    TongTien();
                    for(int i= 0; i< TableAccount.getRowCount(); i++){
                        TableAccount.setValueAt(i+1, i, 0);
                    }
                    JOptionPane.showMessageDialog(this, "Xóa tài khoản thành công!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE); 
                    
                } 
            } 
        }catch(Exception ex)
        {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void TableAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAccountMouseClicked
        try{
            DefaultTableModel model = (DefaultTableModel) 
            TableAccount.getModel();
            int row = TableAccount.getSelectedRow(); 
            TaiKhoan temp = new TaiKhoan(model.getValueAt(row, 1).toString(),model.getValueAt(row, 2).toString(), model.getValueAt(row, 3).toString(), Double.parseDouble(model.getValueAt(row, 4).toString()));
            SetAccount(temp); //Hàm hiện thị thông tin 
        }
        catch(Exception ex)
        {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_TableAccountMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }
    private int GetAccountRow(String STK)
    {
        DefaultTableModel model = (DefaultTableModel)TableAccount.getModel();
        for (int i = 0;i< model.getRowCount(); i++) 
        {
            if(model.getValueAt(i, 1).toString().equals(STK.trim()))
            return i; 
        }
        return -1;
    }
        
    private void SetAccount(TaiKhoan temp)
    {
        txtSTK.setText(temp.STK);
        txtTen.setText(temp.Ten);
        txtDiaChi.setText(temp.DiaChi);
        txtSoTien.setText(String.valueOf(temp.SoTien));
    }
    private void TongTien(){
        
         double tong = 0;
         
         for(int i= 0; i< TableAccount.getRowCount(); i++){
             tong += Double.parseDouble(TableAccount.getValueAt(i, 4).toString());
         }
         txtTongTien.setText(Double.toString(tong));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAccount;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtSTK;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
