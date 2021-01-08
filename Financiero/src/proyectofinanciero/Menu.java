/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinanciero;

import static java.awt.Frame.MAXIMIZED_BOTH;

/**
 *
 * @author pci
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public static DetalleCompra dc;
    public static Proveedores p;
    public static Marca m;
    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
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

        jMenu1 = new javax.swing.JMenu();
        backg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(102, 153, 255));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sesion (1).png"))); // NOI18N
        jMenu2.setText("Log in");

        jMenu10.setText("Iniciar Sesión");
        jMenu2.add(jMenu10);

        jMenu11.setText("Nuevo Usuario");
        jMenu2.add(jMenu11);

        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inv(1).png"))); // NOI18N
        jMenu5.setText("Inventario");

        jMenu20.setText("Proveedores");
        jMenu20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu20MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu20);

        jMenu18.setText("Categorias");
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu18);

        jMenu19.setText("Marcas");
        jMenu19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu19MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu19);

        jMenu7.setText("Compras");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu7);

        jMenu21.setText("Productos");
        jMenu21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu21MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu21);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados (1)_1.png"))); // NOI18N
        jMenu3.setText("Empleados");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/af2.png"))); // NOI18N
        jMenu4.setText("Activo Fijo");

        jMenu8.setText("Catálogo de Códigos");
        jMenu4.add(jMenu8);

        jMenu16.setText("Bienes");
        jMenu4.add(jMenu16);

        jMenu12.setText("Depreciación");
        jMenu4.add(jMenu12);

        jMenuBar1.add(jMenu4);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente_(1)_1.png"))); // NOI18N
        jMenu13.setText("Clientes");
        jMenuBar1.add(jMenu13);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.jpg"))); // NOI18N
        jMenu9.setText("Ventas");
        jMenuBar1.add(jMenu9);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5b862755be2ecabf81698a5f1795572c(1).png"))); // NOI18N
        jMenu15.setText("Cuentas por cobrar");

        jMenu17.setText("Abonos a cuenta");
        jMenu15.add(jMenu17);

        jMenuBar1.add(jMenu15);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda2_1.png"))); // NOI18N
        jMenu14.setText("Ayuda");
        jMenuBar1.add(jMenu14);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backg, javax.swing.GroupLayout.PREFERRED_SIZE, 952, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backg, javax.swing.GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        dc = new DetalleCompra();
        dc.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu20MouseClicked
        // TODO add your handling code here:
        p = new Proveedores();
        p.setVisible(true);
    }//GEN-LAST:event_jMenu20MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        Empleados emp = new Empleados();
        emp.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu19MouseClicked
        // TODO add your handling code here:
        m = new Marca();
        m.setVisible(true);
    }//GEN-LAST:event_jMenu19MouseClicked

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        // TODO add your handling code here:
        Category cat = new Category();
        cat.setVisible(true);
    }//GEN-LAST:event_jMenu18MouseClicked

    private void jMenu21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu21MouseClicked
        // TODO add your handling code here:
        Productos p = new Productos();
        p.setVisible(true);
    }//GEN-LAST:event_jMenu21MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backg;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
