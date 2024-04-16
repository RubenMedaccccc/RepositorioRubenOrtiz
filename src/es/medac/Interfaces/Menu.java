package es.medac.Interfaces;

/**
 *
 * @author Rubén Ortiz Yedra
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        textoBoton2 = new javax.swing.JLabel();
        textoBoton3 = new javax.swing.JLabel();
        Titulo_Menu = new javax.swing.JLabel();
        boton1Menu = new javax.swing.JButton();
        boton2Menu = new javax.swing.JButton();
        boton3Menu = new javax.swing.JButton();
        textoBoton1 = new javax.swing.JLabel();
        Fondo_Titulo_Menu = new javax.swing.JLabel();
        Lupa1 = new javax.swing.JLabel();
        Lupa2 = new javax.swing.JLabel();
        Lupa3 = new javax.swing.JLabel();
        Fondo_Menu = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/Lupa.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoBoton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoBoton2.setText("Sistema");
        getContentPane().add(textoBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        textoBoton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoBoton3.setText("Formulário");
        getContentPane().add(textoBoton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        Titulo_Menu.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        Titulo_Menu.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Menu.setText("SISTEMA DE REPORTE DE EMPLEADOS");
        getContentPane().add(Titulo_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 518, 51));

        boton1Menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton1Menu.setText("Informe");
        boton1Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1MenuActionPerformed(evt);
            }
        });
        getContentPane().add(boton1Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, 35));

        boton2Menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton2Menu.setText("SALIR");
        boton2Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2MenuActionPerformed(evt);
            }
        });
        getContentPane().add(boton2Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, 35));

        boton3Menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton3Menu.setText("RECIBO");
        boton3Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3MenuActionPerformed(evt);
            }
        });
        getContentPane().add(boton3Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 388, 110, -1));

        textoBoton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoBoton1.setText("Formulario");
        getContentPane().add(textoBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        Fondo_Titulo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/metal-fondo-468x346_1.jpg"))); // NOI18N
        Fondo_Titulo_Menu.setText("jLabel1");
        getContentPane().add(Fondo_Titulo_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 520, 60));

        Lupa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/Lupa.png"))); // NOI18N
        getContentPane().add(Lupa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        Lupa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/Lupa.png"))); // NOI18N
        getContentPane().add(Lupa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        Lupa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/Lupa.png"))); // NOI18N
        getContentPane().add(Lupa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        Fondo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/img_FpCiudad_Cabecera_Madrid_0.jpg"))); // NOI18N
        getContentPane().add(Fondo_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1MenuActionPerformed
        //Botón de ir al Informe
        this.setVisible(false);
        Informe_Empleado p = new Informe_Empleado();
        p.setVisible(true);
    }//GEN-LAST:event_boton1MenuActionPerformed

    private void boton3MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3MenuActionPerformed
        //Botón de ir al Recibo
        this.setVisible(false);
        Recibo_Empleado p2 = new Recibo_Empleado();
        p2.setVisible(true);
    }//GEN-LAST:event_boton3MenuActionPerformed

    private void boton2MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2MenuActionPerformed
        //Salír del programa
        System.exit(0);
    }//GEN-LAST:event_boton2MenuActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Menu;
    private javax.swing.JLabel Fondo_Titulo_Menu;
    private javax.swing.JLabel Lupa1;
    private javax.swing.JLabel Lupa2;
    private javax.swing.JLabel Lupa3;
    private javax.swing.JLabel Titulo_Menu;
    private javax.swing.JButton boton1Menu;
    private javax.swing.JButton boton2Menu;
    private javax.swing.JButton boton3Menu;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel textoBoton1;
    private javax.swing.JLabel textoBoton2;
    private javax.swing.JLabel textoBoton3;
    // End of variables declaration//GEN-END:variables
}
