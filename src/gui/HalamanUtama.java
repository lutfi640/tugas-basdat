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
public class HalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form Kategori
     */
    public HalamanUtama() {
        initComponents();
        add(jPanel1);
        add(jPanel2);
        jPanel1.setVisible(true);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BlanjaaBTN = new javax.swing.JLabel();
        CloseBTN = new javax.swing.JLabel();
        MinBTN = new javax.swing.JLabel();
        CartBTN = new javax.swing.JLabel();
        AkunBTN = new javax.swing.JLabel();
        LogoutBTN = new javax.swing.JLabel();
        BlackBar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ElektronikBTN = new javax.swing.JLabel();
        OlahragaBTN = new javax.swing.JLabel();
        FashionBTN = new javax.swing.JLabel();
        BukuBTN = new javax.swing.JLabel();
        RumahtanggaBTN = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        KategoriBTN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ElektronikBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElektronikBTNMouseClicked(evt);
            }
        });
        jPanel2.add(ElektronikBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 30));

        OlahragaBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlahragaBTNMouseClicked(evt);
            }
        });
        jPanel2.add(OlahragaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, 40));

        FashionBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FashionBTNMouseClicked(evt);
            }
        });
        jPanel2.add(FashionBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 120, 30));

        BukuBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BukuBTNMouseClicked(evt);
            }
        });
        jPanel2.add(BukuBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 90, 40));

        RumahtanggaBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RumahtanggaBTNMouseClicked(evt);
            }
        });
        jPanel2.add(RumahtanggaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 180, 40));

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1300, 730));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Home 2.png"))); // NOI18N
        jLabel8.setText("jLabel2");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KategoriBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KategoriBTNMouseClicked(evt);
            }
        });
        jPanel1.add(KategoriBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Home 1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

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
                            .addGap(1020, 1020, 1020)
                            .addComponent(CartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(150, 150, 150)
                            .addComponent(MinBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1090, 1090, 1090)
                            .addComponent(AkunBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1150, 1150, 1150)
                            .addComponent(LogoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(BlanjaaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1260, 1260, 1260)
                            .addComponent(CloseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BlackBar, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(CartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(MinBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(AkunBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(LogoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(BlanjaaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CloseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BlackBar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 730, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        HalamanUtama h = new HalamanUtama();
        h.setVisible(true);
        
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
//        LogoutPopUp.setVisible(true);
    }//GEN-LAST:event_LogoutBTNMouseClicked

    private void KategoriBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KategoriBTNMouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_KategoriBTNMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void RumahtanggaBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RumahtanggaBTNMouseClicked
        jPanel2.setVisible(false);
//        Rumahtangga.setVisible(true);
        Kategori kategori = new Kategori("Rumah Tangga");
        kategori.setVisible(true);
    }//GEN-LAST:event_RumahtanggaBTNMouseClicked

    private void BukuBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BukuBTNMouseClicked
        jPanel2.setVisible(false);
//        Buku.setVisible(true);
        Kategori kategori = new Kategori("Buku");
        kategori.setVisible(true);
    }//GEN-LAST:event_BukuBTNMouseClicked

    private void FashionBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FashionBTNMouseClicked
        jPanel2.setVisible(false);
//        Fashion.setVisible(true);
        Kategori kategori = new Kategori ("Fashion");
        kategori.setVisible(true);
    }//GEN-LAST:event_FashionBTNMouseClicked

    private void OlahragaBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlahragaBTNMouseClicked
        jPanel2.setVisible(false);
//        Olahraga.setVisible(true);
        Kategori kategori = new Kategori ("Olahraga");
        kategori.setVisible(true);
    }//GEN-LAST:event_OlahragaBTNMouseClicked

    private void ElektronikBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElektronikBTNMouseClicked
        jPanel2.setVisible(false);
//        Elektronik.setVisible(true);
        Kategori kategori = new Kategori ("Elektronik");
        kategori.setVisible(true);
    }//GEN-LAST:event_ElektronikBTNMouseClicked

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AkunBTN;
    private javax.swing.JLabel BlackBar;
    private javax.swing.JLabel BlanjaaBTN;
    private javax.swing.JLabel BukuBTN;
    private javax.swing.JLabel CartBTN;
    private javax.swing.JLabel CloseBTN;
    private javax.swing.JLabel ElektronikBTN;
    private javax.swing.JLabel FashionBTN;
    private javax.swing.JLabel KategoriBTN;
    private javax.swing.JLabel LogoutBTN;
    private javax.swing.JLabel MinBTN;
    private javax.swing.JLabel OlahragaBTN;
    private javax.swing.JLabel RumahtanggaBTN;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
