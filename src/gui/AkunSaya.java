/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author AtlantisSeeker
 */
public class AkunSaya extends javax.swing.JFrame {

    /**
     * Creates new form Kategori
     */    
    public AkunSaya() {       
        initComponents();
        LogoutPopUp.setVisible(false);
        add(MyAkun);
        MyAkun.setVisible(true);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoutPopUp = new javax.swing.JPanel();
        Ya = new javax.swing.JLabel();
        Tidak = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BlanjaaBTN = new javax.swing.JLabel();
        CloseBTN = new javax.swing.JLabel();
        MinBTN = new javax.swing.JLabel();
        CartBTN = new javax.swing.JLabel();
        AkunBTN = new javax.swing.JLabel();
        LogoutBTN = new javax.swing.JLabel();
        BlackBar = new javax.swing.JLabel();
        MyAkun = new javax.swing.JPanel();
        MyCartBTN = new javax.swing.JLabel();
        LogoutTombol = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LogoutPopUp.setOpaque(false);
        LogoutPopUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LogoutPopUp.add(Ya, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 110, 60));

        Tidak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TidakMouseClicked(evt);
            }
        });
        LogoutPopUp.add(Tidak, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 180, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Pop up Logout.png"))); // NOI18N
        LogoutPopUp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 1300, 800));

        BlanjaaBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlanjaaBTNMouseClicked(evt);
            }
        });

        CloseBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Close Button.png"))); // NOI18N

        MinBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Min Button.png"))); // NOI18N

        CartBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/CART BUTTON.png"))); // NOI18N
        CartBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartBTNMouseClicked(evt);
            }
        });

        AkunBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/AKUN BUTTON.png"))); // NOI18N
        AkunBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AkunBTNMouseClicked(evt);
            }
        });

        LogoutBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/LOGOUT BUTTON.png"))); // NOI18N
        LogoutBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBTNMouseClicked(evt);
            }
        });

        BlackBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Artboard 13.png"))); // NOI18N
        BlackBar.setText("jLabel1");

        MyAkun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MyCartBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Tombol My Cart.png"))); // NOI18N
        MyCartBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyCartBTNMouseClicked(evt);
            }
        });
        MyAkun.add(MyCartBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 230, 110));

        LogoutTombol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Tombol Logout Akun.png"))); // NOI18N
        LogoutTombol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutTombolMouseClicked(evt);
            }
        });
        MyAkun.add(LogoutTombol, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 230, 110));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Akun Saya.png"))); // NOI18N
        jLabel11.setText("jLabel2");
        MyAkun.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1301, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1260, 1260, 1260)
                            .addComponent(CloseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1090, 1090, 1090)
                            .addComponent(AkunBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1220, 1220, 1220)
                            .addComponent(MinBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1020, 1020, 1020)
                            .addComponent(CartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1150, 1150, 1150)
                            .addComponent(LogoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BlackBar, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(BlanjaaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MyAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 1301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LogoutPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 1301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CloseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(AkunBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(MinBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(CartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(LogoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BlackBar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(BlanjaaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 730, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MyAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LogoutPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BlanjaaBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlanjaaBTNMouseClicked
//        jPanel2.setVisible(false);
//        jPanel1.setVisible(true);
//        Elektronik.setVisible(false);
//        Olahraga.setVisible(false);
//        Fashion.setVisible(false);
//        Buku.setVisible(false);
//        Rumahtangga.setVisible(false);
//        MyAkun.setVisible(false);
//        MyCart.setVisible(false);
        
    }//GEN-LAST:event_BlanjaaBTNMouseClicked

    private void CartBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBTNMouseClicked
//        jPanel2.setVisible(false);
//        jPanel1.setVisible(false);
//        Elektronik.setVisible(false);
//        Olahraga.setVisible(false);
//        Fashion.setVisible(false);
//        Buku.setVisible(false);
//        Rumahtangga.setVisible(false);
//        MyAkun.setVisible(false);
//        MyCart.setVisible(true);
    }//GEN-LAST:event_CartBTNMouseClicked

    private void AkunBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AkunBTNMouseClicked
//        jPanel2.setVisible(false);
//        jPanel1.setVisible(false);
//        Elektronik.setVisible(false);
//        Olahraga.setVisible(false);
//        Fashion.setVisible(false);
//        Buku.setVisible(false);
//        Rumahtangga.setVisible(false);
//        MyAkun.setVisible(true);
//        MyCart.setVisible(false);
    }//GEN-LAST:event_AkunBTNMouseClicked

    private void LogoutBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBTNMouseClicked
        LogoutPopUp.setVisible(true);
    }//GEN-LAST:event_LogoutBTNMouseClicked

    private void MyCartBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyCartBTNMouseClicked
//        jPanel2.setVisible(false);
//        jPanel1.setVisible(false);
//        Elektronik.setVisible(false);
//        Olahraga.setVisible(false);
//        Fashion.setVisible(false);
//        Buku.setVisible(false);
//        Rumahtangga.setVisible(false);
//        MyAkun.setVisible(false);
//        MyCart.setVisible(true);
    }//GEN-LAST:event_MyCartBTNMouseClicked

    private void LogoutTombolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutTombolMouseClicked
//        LogoutPopUp.setVisible(true);
    }//GEN-LAST:event_LogoutTombolMouseClicked

    private void TidakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TidakMouseClicked
        LogoutPopUp.setVisible(false);
    }//GEN-LAST:event_TidakMouseClicked

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
            java.util.logging.Logger.getLogger(AkunSaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AkunSaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AkunSaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AkunSaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AkunSaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AkunBTN;
    private javax.swing.JLabel BlackBar;
    private javax.swing.JLabel BlanjaaBTN;
    private javax.swing.JLabel CartBTN;
    private javax.swing.JLabel CloseBTN;
    private javax.swing.JLabel LogoutBTN;
    private javax.swing.JPanel LogoutPopUp;
    private javax.swing.JLabel LogoutTombol;
    private javax.swing.JLabel MinBTN;
    private javax.swing.JPanel MyAkun;
    private javax.swing.JLabel MyCartBTN;
    private javax.swing.JLabel Tidak;
    private javax.swing.JLabel Ya;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}