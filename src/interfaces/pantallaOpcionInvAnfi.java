/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;


public class pantallaOpcionInvAnfi extends javax.swing.JFrame {

    public pantallaOpcionInvAnfi() {
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

        btnGrupoRadio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSigueinte = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        imgPatolli2 = new javax.swing.JLabel();
        btnRadioInvi = new javax.swing.JRadioButton();
        lblSeleccion = new javax.swing.JLabel();
        btnRadioAnfi = new javax.swing.JRadioButton();
        imgPatolli = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla inicio");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PATOLLI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        btnSigueinte.setBackground(new java.awt.Color(0, 153, 255));
        btnSigueinte.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnSigueinte.setForeground(new java.awt.Color(255, 255, 255));
        btnSigueinte.setText("Siguiente");
        btnSigueinte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSigueinteMouseClicked(evt);
            }
        });
        btnSigueinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigueinteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSigueinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 140, -1));

        lblNombre.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        lblNombre.setText("Nombre ");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 190, -1));

        imgPatolli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1patolli.png"))); // NOI18N
        jPanel1.add(imgPatolli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 90, 80));

        btnRadioInvi.setBackground(new java.awt.Color(0, 153, 255));
        btnGrupoRadio.add(btnRadioInvi);
        btnRadioInvi.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnRadioInvi.setText("Invitado");
        btnRadioInvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioInviActionPerformed(evt);
            }
        });
        jPanel1.add(btnRadioInvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        lblSeleccion.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        lblSeleccion.setText("Seleccione una opci??n");
        jPanel1.add(lblSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 340, -1));

        btnRadioAnfi.setBackground(new java.awt.Color(0, 153, 255));
        btnGrupoRadio.add(btnRadioAnfi);
        btnRadioAnfi.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnRadioAnfi.setText("Anfiltri??n");
        btnRadioAnfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioAnfiActionPerformed(evt);
            }
        });
        jPanel1.add(btnRadioAnfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        imgPatolli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1patolli.png"))); // NOI18N
        jPanel1.add(imgPatolli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoa.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 610, 360));

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

    private void btnSigueinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigueinteActionPerformed
      
    }//GEN-LAST:event_btnSigueinteActionPerformed

    private void btnSigueinteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSigueinteMouseClicked
         if (btnRadioAnfi.isSelected()) {
            pantallaCrearPartida config = new pantallaCrearPartida();
            config.setVisible(true);
            this.dispose();
        } else if (btnRadioInvi.isSelected()) {
            pantallaCodigo codigo = new pantallaCodigo();
            codigo.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSigueinteMouseClicked

    private void btnRadioInviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioInviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadioInviActionPerformed

    private void btnRadioAnfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioAnfiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadioAnfiActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(pantallaOpcionInvAnfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(pantallaOpcionInvAnfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(pantallaOpcionInvAnfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(pantallaOpcionInvAnfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new pantallaOpcionInvAnfi().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.ButtonGroup btnGrupoRadio;
    private javax.swing.JRadioButton btnRadioAnfi;
    private javax.swing.JRadioButton btnRadioInvi;
    private javax.swing.JButton btnSigueinte;
    private javax.swing.JLabel imgPatolli;
    private javax.swing.JLabel imgPatolli2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
