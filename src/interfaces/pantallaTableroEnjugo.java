/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;


public class pantallaTableroEnjugo extends javax.swing.JFrame {

    public pantallaTableroEnjugo() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnMoverFicha = new javax.swing.JButton();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        dado3 = new javax.swing.JLabel();
        dado4 = new javax.swing.JLabel();
        dado5 = new javax.swing.JLabel();
        txtUserAmarillo = new javax.swing.JTextField();
        txtCantidadRosa = new javax.swing.JTextField();
        txtCantidadAmarillo = new javax.swing.JTextField();
        txtCantidadRojo = new javax.swing.JTextField();
        txtCantidadVerde = new javax.swing.JTextField();
        txtUserVerde = new javax.swing.JTextField();
        txtSigueColor = new javax.swing.JTextField();
        txtUserRojo = new javax.swing.JTextField();
        txtuserRosa = new javax.swing.JTextField();
        UsuarioRojo = new javax.swing.JLabel();
        UsuaarioAmarillo = new javax.swing.JLabel();
        lblCantidadAmarillo = new javax.swing.JLabel();
        usuarioVerde = new javax.swing.JLabel();
        lblCantidadRosa = new javax.swing.JLabel();
        lblCantidadRojo = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        lblCantidadVerde = new javax.swing.JLabel();
        UsuarioRosa = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablero");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDado.setBackground(new java.awt.Color(0, 153, 255));
        btnDado.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        btnDado.setText("Tirar");
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 153, 255));
        btnSalir.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        btnMoverFicha.setBackground(new java.awt.Color(0, 153, 255));
        btnMoverFicha.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        btnMoverFicha.setText("Mover ficha");
        btnMoverFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverFichaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoverFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dadoBlanco.png"))); // NOI18N
        jPanel1.add(dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dadoPunto.png"))); // NOI18N
        jPanel1.add(dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dadoBlanco.png"))); // NOI18N
        jPanel1.add(dado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dadoPunto.png"))); // NOI18N
        jPanel1.add(dado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dadoPunto.png"))); // NOI18N
        jPanel1.add(dado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        txtUserAmarillo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserAmarillo.setText("color");
        txtUserAmarillo.setEnabled(false);
        txtUserAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserAmarilloActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 90, 20));

        txtCantidadRosa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadRosa.setText("000");
        txtCantidadRosa.setEnabled(false);
        txtCantidadRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadRosaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 20));

        txtCantidadAmarillo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadAmarillo.setText("000");
        txtCantidadAmarillo.setEnabled(false);
        txtCantidadAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadAmarilloActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 20));

        txtCantidadRojo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadRojo.setText("000");
        txtCantidadRojo.setEnabled(false);
        txtCantidadRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadRojoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 50, 20));

        txtCantidadVerde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadVerde.setText("000");
        txtCantidadVerde.setEnabled(false);
        txtCantidadVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVerdeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 50, 20));

        txtUserVerde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserVerde.setText("user");
        txtUserVerde.setEnabled(false);
        jPanel1.add(txtUserVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 90, 20));

        txtSigueColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSigueColor.setText("user");
        txtSigueColor.setEnabled(false);
        jPanel1.add(txtSigueColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 90, 20));

        txtUserRojo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserRojo.setText("user");
        txtUserRojo.setEnabled(false);
        jPanel1.add(txtUserRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 20));

        txtuserRosa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuserRosa.setText("user");
        txtuserRosa.setEnabled(false);
        jPanel1.add(txtuserRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 90, 20));

        UsuarioRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarioRojo.png"))); // NOI18N
        jPanel1.add(UsuarioRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        UsuaarioAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarioAmarillo.png"))); // NOI18N
        jPanel1.add(UsuaarioAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        lblCantidadAmarillo.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        lblCantidadAmarillo.setText("$");
        jPanel1.add(lblCantidadAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 20, -1));

        usuarioVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarioVerde.png"))); // NOI18N
        jPanel1.add(usuarioVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        lblCantidadRosa.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        lblCantidadRosa.setText("$");
        jPanel1.add(lblCantidadRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 20, -1));

        lblCantidadRojo.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        lblCantidadRojo.setText("Sigue");
        jPanel1.add(lblCantidadRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 50, -1));

        lblSiguiente.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        lblSiguiente.setText("$");
        jPanel1.add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 10, -1));

        lblCantidadVerde.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        lblCantidadVerde.setText("$");
        jPanel1.add(lblCantidadVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, -1));

        UsuarioRosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarioRosa.png"))); // NOI18N
        jPanel1.add(UsuarioRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondotablero.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoverFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverFichaActionPerformed

    }//GEN-LAST:event_btnMoverFichaActionPerformed

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed
      
    }//GEN-LAST:event_btnDadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCantidadRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadRosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadRosaActionPerformed

    private void txtCantidadAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadAmarilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadAmarilloActionPerformed

    private void txtCantidadVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVerdeActionPerformed

    private void txtCantidadRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadRojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadRojoActionPerformed

    private void txtUserAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserAmarilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserAmarilloActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(pantallaTableroEnjugo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(pantallaTableroEnjugo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(pantallaTableroEnjugo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(pantallaTableroEnjugo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new pantallaTableroEnjugo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel UsuaarioAmarillo;
    private javax.swing.JLabel UsuarioRojo;
    private javax.swing.JLabel UsuarioRosa;
    private javax.swing.JButton btnDado;
    private javax.swing.JButton btnMoverFicha;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JLabel dado5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidadAmarillo;
    private javax.swing.JLabel lblCantidadRojo;
    private javax.swing.JLabel lblCantidadRosa;
    private javax.swing.JLabel lblCantidadVerde;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JTextField txtCantidadAmarillo;
    private javax.swing.JTextField txtCantidadRojo;
    private javax.swing.JTextField txtCantidadRosa;
    private javax.swing.JTextField txtCantidadVerde;
    private javax.swing.JTextField txtSigueColor;
    private javax.swing.JTextField txtUserAmarillo;
    private javax.swing.JTextField txtUserRojo;
    private javax.swing.JTextField txtUserVerde;
    private javax.swing.JTextField txtuserRosa;
    private javax.swing.JLabel usuarioVerde;
    // End of variables declaration//GEN-END:variables
}
