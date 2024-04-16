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
public class Informe_Empleado extends javax.swing.JFrame {

    public Informe_Empleado() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        IE_Titulo = new javax.swing.JLabel();
        IE_Pension_Texto = new javax.swing.JLabel();
        IE_Hacienda_RadioButton = new javax.swing.JRadioButton();
        IE_Retencion_RadioButton = new javax.swing.JRadioButton();
        IE_Procesar_Boton = new javax.swing.JButton();
        IE_Limpiar_Boton = new javax.swing.JButton();
        IE_VolverMenu_Boton = new javax.swing.JButton();
        IE_Salir_Boton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        IE_TextArea = new javax.swing.JTextArea();
        IE_DNI_Texto = new javax.swing.JLabel();
        IE_DNI_Campo = new javax.swing.JTextField();
        IE_Direccion_Texto = new javax.swing.JLabel();
        IE_Direccion_Campo = new javax.swing.JTextField();
        IE_Edad_Texto = new javax.swing.JLabel();
        IE_Edad_Campo = new javax.swing.JTextField();
        IE_Estudios_Texto = new javax.swing.JLabel();
        IE_HorasTrabajadas_Texto = new javax.swing.JLabel();
        IE_Estudios_ComboBox = new javax.swing.JComboBox<>();
        IE_AñosExperiencia_Texto = new javax.swing.JLabel();
        IE_HorasTrabajadas_Campo = new javax.swing.JTextField();
        IE_AñosExperiencia_Campo = new javax.swing.JTextField();
        IE_PagoHora_Texto = new javax.swing.JLabel();
        IE_PagoHora_Campo = new javax.swing.JTextField();
        IE_Apellidos_Texto = new javax.swing.JLabel();
        IE_NumeroHijos_Texto = new javax.swing.JLabel();
        IE_Apellidos_Campo = new javax.swing.JTextField();
        IE_NumeroHijos_Campo = new javax.swing.JTextField();
        IE_Nombres_Texto = new javax.swing.JLabel();
        IE_Nombre_Campo = new javax.swing.JTextField();
        Fondo_Titulo_Menu = new javax.swing.JLabel();
        IMPRIMIR_BOTON = new javax.swing.JButton();
        IE_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IE_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IE_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        IE_Titulo.setText("INFORME EMPLEADO:");
        getContentPane().add(IE_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        IE_Pension_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Pension_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_Pension_Texto.setText("Pensión:  ");
        getContentPane().add(IE_Pension_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        buttonGroup1.add(IE_Hacienda_RadioButton);
        IE_Hacienda_RadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Hacienda_RadioButton.setForeground(new java.awt.Color(255, 255, 255));
        IE_Hacienda_RadioButton.setText("hacienda 1.5%");
        IE_Hacienda_RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Hacienda_RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Hacienda_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        buttonGroup1.add(IE_Retencion_RadioButton);
        IE_Retencion_RadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Retencion_RadioButton.setForeground(new java.awt.Color(255, 255, 255));
        IE_Retencion_RadioButton.setText("retencion 2.5%");
        IE_Retencion_RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Retencion_RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Retencion_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        IE_Procesar_Boton.setBackground(new java.awt.Color(59, 16, 59));
        IE_Procesar_Boton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        IE_Procesar_Boton.setForeground(new java.awt.Color(255, 255, 255));
        IE_Procesar_Boton.setText("PROCESAR");
        IE_Procesar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Procesar_BotonActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Procesar_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 262, 130, 40));

        IE_Limpiar_Boton.setBackground(new java.awt.Color(102, 102, 102));
        IE_Limpiar_Boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Limpiar_Boton.setForeground(new java.awt.Color(255, 255, 255));
        IE_Limpiar_Boton.setText("LIMPIAR");
        IE_Limpiar_Boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IE_Limpiar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Limpiar_BotonActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Limpiar_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 130, 30));

        IE_VolverMenu_Boton.setBackground(new java.awt.Color(102, 102, 102));
        IE_VolverMenu_Boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_VolverMenu_Boton.setForeground(new java.awt.Color(255, 255, 255));
        IE_VolverMenu_Boton.setText("VOLVER MENU");
        IE_VolverMenu_Boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IE_VolverMenu_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_VolverMenu_BotonActionPerformed(evt);
            }
        });
        getContentPane().add(IE_VolverMenu_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 130, 30));

        IE_Salir_Boton.setBackground(new java.awt.Color(102, 102, 102));
        IE_Salir_Boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Salir_Boton.setForeground(new java.awt.Color(255, 255, 255));
        IE_Salir_Boton.setText("SALIR");
        IE_Salir_Boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IE_Salir_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Salir_BotonActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Salir_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 130, 30));

        IE_TextArea.setBackground(new java.awt.Color(20, 72, 69));
        IE_TextArea.setColumns(20);
        IE_TextArea.setForeground(new java.awt.Color(255, 255, 255));
        IE_TextArea.setRows(5);
        jScrollPane1.setViewportView(IE_TextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 340, 210));

        IE_DNI_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_DNI_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_DNI_Texto.setText("DNI:  ");
        getContentPane().add(IE_DNI_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        IE_DNI_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_DNI_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_DNI_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 80, -1));

        IE_Direccion_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Direccion_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_Direccion_Texto.setText("Dirección:  ");
        getContentPane().add(IE_Direccion_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        IE_Direccion_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Direccion_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Direccion_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 80, -1));

        IE_Edad_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Edad_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_Edad_Texto.setText("Edad:  ");
        getContentPane().add(IE_Edad_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        IE_Edad_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Edad_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Edad_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 80, -1));

        IE_Estudios_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Estudios_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_Estudios_Texto.setText("Estudios:  ");
        getContentPane().add(IE_Estudios_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        IE_HorasTrabajadas_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_HorasTrabajadas_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_HorasTrabajadas_Texto.setText("Horas Trabajadas:  ");
        getContentPane().add(IE_HorasTrabajadas_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        IE_Estudios_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "E.S.O", "Grado Medio", "Grado Superior", "Universidad" }));
        IE_Estudios_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Estudios_ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Estudios_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 20));

        IE_AñosExperiencia_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_AñosExperiencia_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_AñosExperiencia_Texto.setText("Años de Experiencias:  ");
        getContentPane().add(IE_AñosExperiencia_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        IE_HorasTrabajadas_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_HorasTrabajadas_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_HorasTrabajadas_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 80, -1));

        IE_AñosExperiencia_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_AñosExperiencia_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_AñosExperiencia_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 80, -1));

        IE_PagoHora_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_PagoHora_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_PagoHora_Texto.setText("Pago por hora:  ");
        getContentPane().add(IE_PagoHora_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        IE_PagoHora_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_PagoHora_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_PagoHora_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 80, -1));

        IE_Apellidos_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Apellidos_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_Apellidos_Texto.setText("Apellidos:  ");
        getContentPane().add(IE_Apellidos_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        IE_NumeroHijos_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_NumeroHijos_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_NumeroHijos_Texto.setText("Nº de Hijos:  ");
        getContentPane().add(IE_NumeroHijos_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        IE_Apellidos_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Apellidos_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Apellidos_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, -1));

        IE_NumeroHijos_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_NumeroHijos_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_NumeroHijos_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 80, -1));

        IE_Nombres_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IE_Nombres_Texto.setForeground(new java.awt.Color(255, 255, 255));
        IE_Nombres_Texto.setText("Nombres:  ");
        getContentPane().add(IE_Nombres_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        IE_Nombre_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IE_Nombre_CampoActionPerformed(evt);
            }
        });
        getContentPane().add(IE_Nombre_Campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, -1));

        Fondo_Titulo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/metal-fondo-468x346_1.jpg"))); // NOI18N
        Fondo_Titulo_Menu.setText("jLabel1");
        getContentPane().add(Fondo_Titulo_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        IMPRIMIR_BOTON.setBackground(new java.awt.Color(102, 102, 0));
        IMPRIMIR_BOTON.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        IMPRIMIR_BOTON.setForeground(new java.awt.Color(255, 255, 255));
        IMPRIMIR_BOTON.setText("IMPRIMIR");
        IMPRIMIR_BOTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIR_BOTONActionPerformed(evt);
            }
        });
        getContentPane().add(IMPRIMIR_BOTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 110, 40));

        IE_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/Interfaces/smooth-soft-and-blurred-liquid-foil-trendy-colorful-green-gradient-modern-cover-template-blur-design-background-for-flyer-social-media-post-screen-mobile-app-wallpaper-free-vector.jpg"))); // NOI18N
        getContentPane().add(IE_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IE_Hacienda_RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Hacienda_RadioButtonActionPerformed

    }//GEN-LAST:event_IE_Hacienda_RadioButtonActionPerformed

    private void IE_Procesar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Procesar_BotonActionPerformed
        //Hacemos el calculo segun la selección del RadioButton que se seleccióne, pudiendo seleccionar solo uno de los dos 
        InformeEmpleado iEm = new InformeEmpleado();
        if(IE_Hacienda_RadioButton.isSelected()){
            iEm.setHacienda("hacienda 1.5%");
        }else if(IE_Retencion_RadioButton.isSelected()){
            iEm.setHacienda("retencion 2.5%");
            }else{
            System.out.println("Error, Seleccione alguno de los dos");
        }
        
        //Creamos un objeto y hacemos referencia al constructor con todos los parametros de la clase de InformeEmpleado
        InformeEmpleado iE = new InformeEmpleado(Integer.parseInt(IE_NumeroHijos_Campo.getText()), 
                IE_Hacienda_RadioButton.getText(), 
                IE_Retencion_RadioButton.getText(), 
                IE_Nombre_Campo.getText(), 
                IE_Apellidos_Campo.getText(), 
                IE_DNI_Campo.getText(),
                IE_Direccion_Campo.getText(),
                Integer.parseInt(IE_Edad_Campo.getText()),
                IE_Estudios_ComboBox.getSelectedItem().toString(),
                Integer.parseInt(IE_AñosExperiencia_Campo.getText()),
                Integer.parseInt(IE_HorasTrabajadas_Campo.getText()),
                Integer.parseInt(IE_PagoHora_Campo.getText())
        );
        IE_TextArea.setText(iE.imprimirReciboPago());
        
        
    }//GEN-LAST:event_IE_Procesar_BotonActionPerformed

    private void IE_DNI_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_DNI_CampoActionPerformed
        
    }//GEN-LAST:event_IE_DNI_CampoActionPerformed

    private void IE_Direccion_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Direccion_CampoActionPerformed
        
    }//GEN-LAST:event_IE_Direccion_CampoActionPerformed

    private void IE_Edad_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Edad_CampoActionPerformed
        
    }//GEN-LAST:event_IE_Edad_CampoActionPerformed

    private void IE_HorasTrabajadas_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_HorasTrabajadas_CampoActionPerformed
        
    }//GEN-LAST:event_IE_HorasTrabajadas_CampoActionPerformed

    private void IE_AñosExperiencia_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_AñosExperiencia_CampoActionPerformed
        
    }//GEN-LAST:event_IE_AñosExperiencia_CampoActionPerformed

    private void IE_PagoHora_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_PagoHora_CampoActionPerformed
        
    }//GEN-LAST:event_IE_PagoHora_CampoActionPerformed

    private void IE_Apellidos_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Apellidos_CampoActionPerformed
        
    }//GEN-LAST:event_IE_Apellidos_CampoActionPerformed

    private void IE_NumeroHijos_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_NumeroHijos_CampoActionPerformed
        
    }//GEN-LAST:event_IE_NumeroHijos_CampoActionPerformed

    private void IE_Nombre_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Nombre_CampoActionPerformed
        
    }//GEN-LAST:event_IE_Nombre_CampoActionPerformed

    private void IE_Salir_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Salir_BotonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_IE_Salir_BotonActionPerformed

    private void IE_VolverMenu_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_VolverMenu_BotonActionPerformed
        //Cerramos la ventana actual y con ayuda del objeto abrimos el menú
        this.setVisible(false);
        Menu p = new Menu();
        p.setVisible(true);
    }//GEN-LAST:event_IE_VolverMenu_BotonActionPerformed

    private void IE_Limpiar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Limpiar_BotonActionPerformed
        //Se cierra la ventana actual y se abre otra vez la misma
        this.setVisible(false);
        Informe_Empleado p = new Informe_Empleado();
        p.setVisible(true);
    }//GEN-LAST:event_IE_Limpiar_BotonActionPerformed

    private void IE_Estudios_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Estudios_ComboBoxActionPerformed
        
    }//GEN-LAST:event_IE_Estudios_ComboBoxActionPerformed

    private void IE_Retencion_RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IE_Retencion_RadioButtonActionPerformed
          
    }//GEN-LAST:event_IE_Retencion_RadioButtonActionPerformed

    private void IMPRIMIR_BOTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIR_BOTONActionPerformed
    // Obtener el texto del TextArea
    String texto = IE_TextArea.getText();

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
        //Obtenemos la ruta del fichero
        String ruta = fileChooser.getSelectedFile().getAbsolutePath();

        try {
            //Creamos un FileWriter para escribir en el archivo seleccionado
            FileWriter writer = new FileWriter(ruta);

            //Escribimos el texto en el archivo
            writer.write(texto);

            //Cerramos el FileWriter
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
            java.util.logging.Logger.getLogger(Informe_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informe_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informe_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informe_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informe_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Titulo_Menu;
    private javax.swing.JTextField IE_Apellidos_Campo;
    private javax.swing.JLabel IE_Apellidos_Texto;
    private javax.swing.JTextField IE_AñosExperiencia_Campo;
    private javax.swing.JLabel IE_AñosExperiencia_Texto;
    private javax.swing.JTextField IE_DNI_Campo;
    private javax.swing.JLabel IE_DNI_Texto;
    private javax.swing.JTextField IE_Direccion_Campo;
    private javax.swing.JLabel IE_Direccion_Texto;
    private javax.swing.JTextField IE_Edad_Campo;
    private javax.swing.JLabel IE_Edad_Texto;
    private javax.swing.JComboBox<String> IE_Estudios_ComboBox;
    private javax.swing.JLabel IE_Estudios_Texto;
    private javax.swing.JLabel IE_Fondo;
    private javax.swing.JRadioButton IE_Hacienda_RadioButton;
    private javax.swing.JTextField IE_HorasTrabajadas_Campo;
    private javax.swing.JLabel IE_HorasTrabajadas_Texto;
    private javax.swing.JButton IE_Limpiar_Boton;
    private javax.swing.JTextField IE_Nombre_Campo;
    private javax.swing.JLabel IE_Nombres_Texto;
    private javax.swing.JTextField IE_NumeroHijos_Campo;
    private javax.swing.JLabel IE_NumeroHijos_Texto;
    private javax.swing.JTextField IE_PagoHora_Campo;
    private javax.swing.JLabel IE_PagoHora_Texto;
    private javax.swing.JLabel IE_Pension_Texto;
    private javax.swing.JButton IE_Procesar_Boton;
    private javax.swing.JRadioButton IE_Retencion_RadioButton;
    private javax.swing.JButton IE_Salir_Boton;
    private javax.swing.JTextArea IE_TextArea;
    private javax.swing.JLabel IE_Titulo;
    private javax.swing.JButton IE_VolverMenu_Boton;
    private javax.swing.JButton IMPRIMIR_BOTON;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
