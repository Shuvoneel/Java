/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author l2pc206m
 */
public class ProductPrice extends javax.swing.JFrame {
    
    String s11;

    /**
     * Creates new form ProductPrice
     */
    public ProductPrice() {
        initComponents();
        initDD();
    }
    
   public void initDD(){
        item.addItem("Select item");
        item.addItem("101");
        item.addItem("102");
        item.addItem("103");
        item.addItem("104");
        item.addItem("105");
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        up = new javax.swing.JTextField();
        stk = new javax.swing.JTextField();
        qnt = new javax.swing.JTextField();
        tp = new javax.swing.JTextField();
        item = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        idDelete = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monirul Islam");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Product ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Unit price:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Stock:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total price:");

        pn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        up.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        stk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        qnt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qntKeyReleased(evt);
            }
        });

        tp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        item.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemItemStateChanged(evt);
            }
        });
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(0, 51, 204));
        btnInsert.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 51));
        btnDelete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        idDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Input ID to delete row:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn)
                            .addComponent(up)
                            .addComponent(stk)
                            .addComponent(qnt)
                            .addComponent(tp)
                            .addComponent(item, 0, 228, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInsert)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnDelete))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","apcl123456");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO product(pid,pname,stock,uprice,quantity,tprice) VALUES(?,?,?,?,?,?)");
            
            String s1 = item.getSelectedItem().toString();
            int i = Integer.parseInt(s1);
            String s2 = stk.getText();
            int i2 = Integer.parseInt(s2);
            String s3 = up.getText();
            double i3 = Double.parseDouble(s3);
            String s4 = qnt.getText();
            int i4 = Integer.parseInt(s4);
            String s5 = tp.getText();
            double i5 = Double.parseDouble(s5);
            
            pstmt.setInt(1, i);
            pstmt.setString(2, pn.getText());
            pstmt.setInt(3, i2);
            pstmt.setDouble(4, i3);
            pstmt.setInt(5, i4);
            pstmt.setDouble(6, i5);
            
            int i6 = pstmt.executeUpdate();
            if(i6>0){
                JOptionPane.showMessageDialog(null, "Data inserted!");
            }else{
                JOptionPane.showMessageDialog(null, "Data not inserted!");
            }
            
            s11 = stk.getText();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void itemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemItemStateChanged
        // TODO add your handling code here:
        if(item.getSelectedItem().toString().equals("Select item")){
            item.setSelectedItem("Select item");
            pn.setText("");
            stk.setText("");
            up.setText("");
            qnt.setText("");
            tp.setText("");
        }else if(item.getSelectedItem().toString().equals("101")){
            pn.setText("Shirt");
            stk.setText("200");
            up.setText("900");
        }else if(item.getSelectedItem().toString().equals("102")){
            pn.setText("Pant");
            stk.setText("150");
            up.setText("1200");
        }else if(item.getSelectedItem().toString().equals("103")){
            pn.setText("Belt");
            stk.setText("130");
            up.setText("500");
        }else if(item.getSelectedItem().toString().equals("104")){
            pn.setText("Shoo");
            stk.setText("140");
            up.setText("2000");
        }else if(item.getSelectedItem().toString().equals("105")){
            pn.setText("Socks");
            stk.setText("160");
            up.setText("60");
        }
    }//GEN-LAST:event_itemItemStateChanged

    private void qntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qntKeyReleased
        // TODO add your handling code here:
        String s1 = up.getText();
        double d1 = Double.parseDouble(s1);
        String s2 = qnt.getText();
        double d2 = Double.parseDouble(s2);
        double d3 = d1*d2;
        String s3 = String.valueOf(d3);
        tp.setText(s3);
        
        //String s4 = stk.getText();
        int i1 = Integer.parseInt(s11);
        String s5 = qnt.getText();
        int i2 = Integer.parseInt(s5);
        int i3 = i1-i2;
        stk.setText(String.valueOf(i3));
    }//GEN-LAST:event_qntKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","apcl123456");
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM product WHERE pid=?");
            
            String s2 = idDelete.getText();
            int i2 = Integer.parseInt(s2);
            
            pstmt.setInt(1, i2);
            
            int i6 = pstmt.executeUpdate();
            if(i6>0){
                JOptionPane.showMessageDialog(null, "Data deleted!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void idDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDeleteActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

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
            java.util.logging.Logger.getLogger(ProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductPrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JTextField idDelete;
    private javax.swing.JComboBox<String> item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField qnt;
    private javax.swing.JTextField stk;
    private javax.swing.JTextField tp;
    private javax.swing.JTextField up;
    // End of variables declaration//GEN-END:variables
}
