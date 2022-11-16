/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

public class pantallaMenu extends javax.swing.JFrame {


    public pantallaMenu() {
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
        jLabel2 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        imgPatolli2 = new javax.swing.JLabel();
        btnComoJugar = new javax.swing.JButton();
        imgPatolli = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla menu");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" PATOLLI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        btnJugar.setBackground(new java.awt.Color(0, 153, 255));
        btnJugar.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Jugar");
        btnJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJugarMouseClicked(evt);
            }
        });
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        jPanel1.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, 40));

        btnCreditos.setBackground(new java.awt.Color(0, 153, 255));
        btnCreditos.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnCreditos.setForeground(new java.awt.Color(255, 255, 255));
        btnCreditos.setText("Creditos");
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 120, 40));

        imgPatolli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1patolli.png"))); // NOI18N
        jPanel1.add(imgPatolli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 90, 80));

        btnComoJugar.setBackground(new java.awt.Color(0, 153, 255));
        btnComoJugar.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnComoJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnComoJugar.setText("Como jugar");
        btnComoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComoJugarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 120, 40));

        imgPatolli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1patolli.png"))); // NOI18N
        jPanel1.add(imgPatolli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 80));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoa.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 600, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PATOLLI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
      
    }//GEN-LAST:event_btnCreditosActionPerformed

    private void btnComoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComoJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComoJugarActionPerformed

    private void btnJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseClicked
        pantallaOpcionInvAnfi opcion = new pantallaOpcionInvAnfi();
        opcion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJugarMouseClicked

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
            java.util.logging.Logger.getLogger(pantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnComoJugar;
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel imgPatolli;
    private javax.swing.JLabel imgPatolli2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
