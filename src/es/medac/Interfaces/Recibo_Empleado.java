package es.medac.Interfaces;
import es.medac.ProyectoInterfaces.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Rubén Ortiz Yedra
 */
public class Recibo_Empleado extends javax.swing.JFrame {

    public Recibo_Empleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RE_DNI_Texto = new javax.swing.JLabel();
        RE_DNI_Campo = new javax.swing.JTextField();
        RE_Direccion_Texto = new javax.swing.JLabel();
        RE_Direccion_Campo = new javax.swing.JTextField();
        RE_Edad_Texto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RE_TextArea = new javax.swing.JTextArea();
        RE_Edad_Campo = new javax.swing.JTextField();
        RE_Estudios_Texto = new javax.swing.JLabel();
        RE_HorasTrabajadas_Texto = new javax.swing.JLabel();
        RE_Estudios_ComboBox = new javax.swing.JComboBox<>();
        RE_AñosExperiencia_Texto = new javax.swing.JLabel();
        RE_HorasTrabajadas_Campo = new javax.swing.JTextField();
        RE_AñosExperiencia_Campo = new javax.swing.JTextField();
        RE_PagoHora_Texto = new javax.swing.JLabel();
        RE_PagoHora_Campo = new javax.swing.JTextField();
        RE_Apellidos_Texto = new javax.swing.JLabel();
        RE_Recibo_Texto = new javax.swing.JLabel();
        RE_Apellidos_Campo = new javax.swing.JTextField();
        RE_Recibo_Campo = new javax.swing.JTextField();
        RE_Titulo = new javax.swing.JLabel();
        RE_Nombres_Texto = new javax.swing.JLabel();
        RE_Nombre_Campo = new javax.swing.JTextField();
        RE_Procesar_Boton = new javax.swing.JButton();
        RE_Limpiar_Boton = new javax.swing.JButton();
        RE_VolverMenu_Boton = new javax.swing.JButton();
        RE_Salir_Boton = new javax.swing.JButton();
        Fondo_Titulo_Menu = new javax.swing.JLabel();
        IMPRIMIR_BOTON = new javax.swing.JButton();
        RE_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RE_DNI_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_DNI_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_DNI_Texto.setText("DNI:  ");
        getContentPane().add(RE_DNI_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 111, -1, -1));

        RE_DNI_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_DNI_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_DNI_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, -1));

        RE_Direccion_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_Direccion_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_Direccion_Texto.setText("Dirección:  ");
        getContentPane().add(RE_Direccion_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 145, -1, -1));

        RE_Direccion_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Direccion_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Direccion_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 80, -1));

        RE_Edad_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_Edad_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_Edad_Texto.setText("Edad:  ");
        getContentPane().add(RE_Edad_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 173, -1, -1));

        RE_TextArea.setBackground(new java.awt.Color(20, 72, 69));
        RE_TextArea.setColumns(20);
        RE_TextArea.setForeground(new java.awt.Color(255, 255, 255));
        RE_TextArea.setRows(5);
        jScrollPane1.setViewportView(RE_TextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 263, 350, 220));

        RE_Edad_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Edad_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Edad_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, -1));

        RE_Estudios_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_Estudios_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_Estudios_Texto.setText("Estudios:  ");
        getContentPane().add(RE_Estudios_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 204, -1, -1));

        RE_HorasTrabajadas_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_HorasTrabajadas_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_HorasTrabajadas_Texto.setText("Horas Trabajadas:  ");
        getContentPane().add(RE_HorasTrabajadas_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 111, -1, -1));

        RE_Estudios_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "E.S.O", "Grado Medio", "Grado Superior", "Universidad" }));
        RE_Estudios_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Estudios_ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Estudios_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 90, -1));

        RE_AñosExperiencia_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_AñosExperiencia_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_AñosExperiencia_Texto.setText("Años de Experiencias:  ");
        getContentPane().add(RE_AñosExperiencia_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 77, -1, -1));

        RE_HorasTrabajadas_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_HorasTrabajadas_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_HorasTrabajadas_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 80, -1));

        RE_AñosExperiencia_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_AñosExperiencia_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_AñosExperiencia_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 80, -1));

        RE_PagoHora_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_PagoHora_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_PagoHora_Texto.setText("Pago por hora:  ");
        getContentPane().add(RE_PagoHora_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 145, -1, -1));

        RE_PagoHora_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_PagoHora_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_PagoHora_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 80, -1));

        RE_Apellidos_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_Apellidos_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_Apellidos_Texto.setText("Apellidos:  ");
        getContentPane().add(RE_Apellidos_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 77, -1, -1));

        RE_Recibo_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_Recibo_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_Recibo_Texto.setText("Recibo:  ");
        getContentPane().add(RE_Recibo_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 173, -1, -1));

        RE_Apellidos_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Apellidos_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Apellidos_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, -1));

        RE_Recibo_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Recibo_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Recibo_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 80, -1));

        RE_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RE_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        RE_Titulo.setText("EMPLEADO RECIBO:");
        getContentPane().add(RE_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 190, 28));

        RE_Nombres_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_Nombres_Texto.setForeground(new java.awt.Color(255, 255, 255));
        RE_Nombres_Texto.setText("Nombres:  ");
        getContentPane().add(RE_Nombres_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        RE_Nombre_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Nombre_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Nombre_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 46, 80, -1));

        RE_Procesar_Boton.setBackground(new java.awt.Color(59, 16, 59));
        RE_Procesar_Boton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        RE_Procesar_Boton.setForeground(new java.awt.Color(255, 255, 255));
        RE_Procesar_Boton.setText("PROCESAR");
        RE_Procesar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Procesar_BotonActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Procesar_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 130, 40));

        RE_Limpiar_Boton.setBackground(new java.awt.Color(102, 102, 102));
        RE_Limpiar_Boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_Limpiar_Boton.setForeground(new java.awt.Color(255, 255, 255));
        RE_Limpiar_Boton.setText("LIMPIAR");
        RE_Limpiar_Boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RE_Limpiar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Limpiar_BotonActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Limpiar_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 130, 30));

        RE_VolverMenu_Boton.setBackground(new java.awt.Color(102, 102, 102));
        RE_VolverMenu_Boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_VolverMenu_Boton.setForeground(new java.awt.Color(255, 255, 255));
        RE_VolverMenu_Boton.setText("VOLVER MENU");
        RE_VolverMenu_Boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RE_VolverMenu_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_VolverMenu_BotonActionPerformed(evt);
            }
        });
        getContentPane().add(RE_VolverMenu_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 130, 30));

        RE_Salir_Boton.setBackground(new java.awt.Color(102, 102, 102));
        RE_Salir_Boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RE_Salir_Boton.setForeground(new java.awt.Color(255, 255, 255));
        RE_Salir_Boton.setText("SALIR");
        RE_Salir_Boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RE_Salir_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_Salir_BotonActionPerformed(evt);
            }
        });
        getContentPane().add(RE_Salir_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 130, 30));

        Fondo_Titulo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/metal-fondo-468x346_1.jpg"))); // NOI18N
        Fondo_Titulo_Menu.setText("jLabel1");
        getContentPane().add(Fondo_Titulo_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        IMPRIMIR_BOTON.setBackground(new java.awt.Color(102, 102, 0));
        IMPRIMIR_BOTON.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        IMPRIMIR_BOTON.setForeground(new java.awt.Color(255, 255, 255));
        IMPRIMIR_BOTON.setText("IMPRIMIR");
        IMPRIMIR_BOTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIR_BOTONActionPerformed(evt);
            }
        });
        getContentPane().add(IMPRIMIR_BOTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 110, 40));

        RE_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/smooth-soft-and-blurred-liquid-foil-trendy-colorful-green-gradient-modern-cover-template-blur-design-background-for-flyer-social-media-post-screen-mobile-app-wallpaper-free-vector.jpg"))); // NOI18N
        getContentPane().add(RE_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RE_DNI_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_DNI_CampoActionPerformed
        
    }//GEN-LAST:event_RE_DNI_CampoActionPerformed

    private void RE_Direccion_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Direccion_CampoActionPerformed
        
    }//GEN-LAST:event_RE_Direccion_CampoActionPerformed

    private void RE_Edad_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Edad_CampoActionPerformed
        
    }//GEN-LAST:event_RE_Edad_CampoActionPerformed

    private void RE_HorasTrabajadas_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_HorasTrabajadas_CampoActionPerformed
        
    }//GEN-LAST:event_RE_HorasTrabajadas_CampoActionPerformed

    private void RE_AñosExperiencia_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_AñosExperiencia_CampoActionPerformed
        
    }//GEN-LAST:event_RE_AñosExperiencia_CampoActionPerformed

    private void RE_PagoHora_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_PagoHora_CampoActionPerformed
        
    }//GEN-LAST:event_RE_PagoHora_CampoActionPerformed

    private void RE_Apellidos_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Apellidos_CampoActionPerformed
        
    }//GEN-LAST:event_RE_Apellidos_CampoActionPerformed

    private void RE_Recibo_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Recibo_CampoActionPerformed
        
    }//GEN-LAST:event_RE_Recibo_CampoActionPerformed

    private void RE_Nombre_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Nombre_CampoActionPerformed
        
    }//GEN-LAST:event_RE_Nombre_CampoActionPerformed

    private void RE_Procesar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Procesar_BotonActionPerformed
        ////Creamos un objeto y hacemos referencia al constructor con todos los parametros de la clase de Empleado_Recibo
        Empleado_Recibo eR = new Empleado_Recibo(
                RE_Recibo_Campo.getText(),
                RE_Nombre_Campo.getText(),
               RE_Apellidos_Campo.getText()
               ,RE_DNI_Campo.getText()
               ,RE_Direccion_Campo.getText()
               ,Integer.parseInt(RE_Edad_Campo.getText())
               ,RE_Estudios_ComboBox.getSelectedItem().toString()
               ,Integer.parseInt(RE_AñosExperiencia_Campo.getText())
               ,Integer.parseInt(RE_HorasTrabajadas_Campo.getText())
               ,Integer.parseInt(RE_PagoHora_Campo.getText())
               );
        RE_TextArea.setText(eR.imprimirReciboPago());
        
       
    
    }//GEN-LAST:event_RE_Procesar_BotonActionPerformed

    private void RE_Salir_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Salir_BotonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_RE_Salir_BotonActionPerformed

    private void RE_VolverMenu_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_VolverMenu_BotonActionPerformed
        this.setVisible(false);
        Menu p = new Menu();
        p.setVisible(true);
    }//GEN-LAST:event_RE_VolverMenu_BotonActionPerformed

    private void RE_Limpiar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Limpiar_BotonActionPerformed
        this.setVisible(false);
        Recibo_Empleado p2 = new Recibo_Empleado();
        p2.setVisible(true);
    }//GEN-LAST:event_RE_Limpiar_BotonActionPerformed

    private void RE_Estudios_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_Estudios_ComboBoxActionPerformed
        
    }//GEN-LAST:event_RE_Estudios_ComboBoxActionPerformed

    private void IMPRIMIR_BOTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIR_BOTONActionPerformed
        // Obtener el texto del TextArea
        String texto = RE_TextArea.getText();

        // Creamos un JFileChooser, es una ventana para seleccionar un fichero
        JFileChooser fileChooser = new JFileChooser();
        // Hacemos que aparezca un fichero por defecto
        fileChooser.setSelectedFile(new File("fichero.txt"));
        // Cambiamos el título de la ventana
        fileChooser.setDialogTitle("Selecciona un fichero");
        // Mostramos la ventana de seleccionar el fichero
        int resultado = fileChooser.showSaveDialog(null);
        // Si se ha seleccionado un fichero, si se pulsa cancelar no se ejecuta
        if (resultado == JFileChooser.APPROVE_OPTION)
        {
            // Obtenemos la ruta del fichero
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();

            try {
                // Creamos un FileWriter para escribir en el archivo seleccionado
                FileWriter writer = new FileWriter(ruta);

                // Escribimos el texto en el archivo
                writer.write(texto);

                // Cerramos el FileWriter
                writer.close();

                // Mensaje de éxito
                JOptionPane.showMessageDialog(null, "Texto guardado exitosamente en " + ruta);
            } catch (IOException ex) {
                // Manejo de errores de escritura en el archivo
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_IMPRIMIR_BOTONActionPerformed

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
            java.util.logging.Logger.getLogger(Recibo_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Titulo_Menu;
    private javax.swing.JButton IMPRIMIR_BOTON;
    private javax.swing.JTextField RE_Apellidos_Campo;
    private javax.swing.JLabel RE_Apellidos_Texto;
    private javax.swing.JTextField RE_AñosExperiencia_Campo;
    private javax.swing.JLabel RE_AñosExperiencia_Texto;
    private javax.swing.JTextField RE_DNI_Campo;
    private javax.swing.JLabel RE_DNI_Texto;
    private javax.swing.JTextField RE_Direccion_Campo;
    private javax.swing.JLabel RE_Direccion_Texto;
    private javax.swing.JTextField RE_Edad_Campo;
    private javax.swing.JLabel RE_Edad_Texto;
    private javax.swing.JComboBox<String> RE_Estudios_ComboBox;
    private javax.swing.JLabel RE_Estudios_Texto;
    private javax.swing.JLabel RE_Fondo;
    private javax.swing.JTextField RE_HorasTrabajadas_Campo;
    private javax.swing.JLabel RE_HorasTrabajadas_Texto;
    private javax.swing.JButton RE_Limpiar_Boton;
    private javax.swing.JTextField RE_Nombre_Campo;
    private javax.swing.JLabel RE_Nombres_Texto;
    private javax.swing.JTextField RE_PagoHora_Campo;
    private javax.swing.JLabel RE_PagoHora_Texto;
    private javax.swing.JButton RE_Procesar_Boton;
    private javax.swing.JTextField RE_Recibo_Campo;
    private javax.swing.JLabel RE_Recibo_Texto;
    private javax.swing.JButton RE_Salir_Boton;
    private javax.swing.JTextArea RE_TextArea;
    private javax.swing.JLabel RE_Titulo;
    private javax.swing.JButton RE_VolverMenu_Boton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
