package statpyconverter;


import AnalizadorStatPy.parser;
import AnalizadorStatPy.scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class interfaz extends javax.swing.JFrame {

    File selectedFile = null;

    public interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        btnAnalizador = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        comboArchivo = new javax.swing.JComboBox<>();
        labelAnalizador = new javax.swing.JLabel();
        labelEntrada = new javax.swing.JLabel();
        labelSalida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaEntrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StatPy Converter");
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setMinimumSize(new java.awt.Dimension(1000, 450));
        background.setPreferredSize(new java.awt.Dimension(800, 550));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar.setBackground(new java.awt.Color(255, 51, 51));

        btnAnalizador.setBackground(new java.awt.Color(0, 0, 102));
        btnAnalizador.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnAnalizador.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalizador.setText("Analizador");
        btnAnalizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizadorActionPerformed(evt);
            }
        });

        btnEjecutar.setBackground(new java.awt.Color(0, 0, 102));
        btnEjecutar.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboArchivo.setBackground(new java.awt.Color(0, 0, 102));
        comboArchivo.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        comboArchivo.setForeground(new java.awt.Color(255, 255, 255));
        comboArchivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abrir archivo", "Guardar", "Guardar como" }));
        comboArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(comboArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(btnAnalizador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        labelAnalizador.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        labelAnalizador.setForeground(new java.awt.Color(255, 255, 255));
        labelAnalizador.setText("Analizador: StatPy");
        background.add(labelAnalizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        labelEntrada.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        labelEntrada.setForeground(new java.awt.Color(255, 255, 255));
        labelEntrada.setText("Entrada:");
        background.add(labelEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        labelSalida.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        labelSalida.setForeground(new java.awt.Color(255, 255, 255));
        labelSalida.setText("Salida:");
        background.add(labelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 120, -1));

        textAreaEntrada.setBackground(new java.awt.Color(153, 153, 153));
        textAreaEntrada.setColumns(20);
        textAreaEntrada.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        textAreaEntrada.setForeground(new java.awt.Color(0, 0, 0));
        textAreaEntrada.setRows(5);
        jScrollPane1.setViewportView(textAreaEntrada);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 440, 310));

        textAreaSalida.setBackground(new java.awt.Color(0, 0, 0));
        textAreaSalida.setColumns(20);
        textAreaSalida.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        textAreaSalida.setRows(5);
        textAreaSalida.setEnabled(false);
        jScrollPane2.setViewportView(textAreaSalida);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 470, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizadorActionPerformed
        String analizador = labelAnalizador.getText();
        if (analizador.equals("Analizador: StatPy")) {
            labelAnalizador.setText("Analizador: JSON");
        } else {
            labelAnalizador.setText("Analizador: StatPy");
        }
    }//GEN-LAST:event_btnAnalizadorActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        Ejecutar(textAreaEntrada.getText());
        try {
            File archivo = new File("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\salida.py");
            Scanner scanner = new Scanner(archivo);
            StringBuilder salida = new StringBuilder();
            // Lee el contenido línea por línea
            while (scanner.hasNextLine()) {
                salida.append(scanner.nextLine()+"\n");
            }
            textAreaSalida.setText(salida.toString());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboArchivoActionPerformed
        int option = comboArchivo.getSelectedIndex();
        switch (option) {
            case 0:
                JFileChooser archivo = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JSON y SP", "json", "sp");
                archivo.setFileFilter(filter);
                int eleccionAbrir = archivo.showOpenDialog(null);

                if (eleccionAbrir == JFileChooser.APPROVE_OPTION) {
                    selectedFile = archivo.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Archivo seleccionado: \n" + selectedFile.getName(), "Abierto", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                        StringBuilder content = new StringBuilder();
                        String line;

                        while ((line = reader.readLine()) != null) {
                            content.append(line).append("\n");
                        }

                        reader.close();
                        textAreaEntrada.setText(content.toString());
                        textAreaSalida.setText("Archivo leido con exito");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se selecciono ningun archivo", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
                break;

            case 1:
                if (selectedFile != null) {
                    try {
                        FileWriter writer = new FileWriter(selectedFile);
                        String contenido = textAreaEntrada.getText();
                        writer.write(contenido);
                        writer.close();
                        JOptionPane.showMessageDialog(null, "Se guardo correctamente el archivo \n" + selectedFile.getName(), "Guardado", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se logro guardar archivo", "Error al guardar", JOptionPane.WARNING_MESSAGE);
                }

                break;

            case 2:
                JFileChooser saveChooser = new JFileChooser();
                int eleccionGuardar = saveChooser.showSaveDialog(null);
                if (eleccionGuardar == JFileChooser.APPROVE_OPTION) {
                    selectedFile = saveChooser.getSelectedFile();
                    String fileName = selectedFile.getAbsolutePath();
                    if (labelAnalizador.getText().equals("Analizador: StatPy")) {
                        selectedFile = new File(fileName + ".sp");
                    } else {
                        selectedFile = new File(fileName + ".json");
                    }
                    try (FileWriter escribir = new FileWriter(selectedFile, true)) {
                        escribir.write(textAreaEntrada.getText());
                        escribir.close();
                        JOptionPane.showMessageDialog(null, "Se guardo correctamente el archivo \n" + selectedFile.getName(), "Guardado", JOptionPane.INFORMATION_MESSAGE);

                    } catch (IOException ex) {
                        Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se logro guardar archivo", "Error al guardar", JOptionPane.WARNING_MESSAGE);
                }

                break;
            default:
                break;
        }
    }//GEN-LAST:event_comboArchivoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    private static void Ejecutar(String codigoFuente) {
        try {
            // realizar el analisis lexico con el scanner
            scanner scan = new scanner(new java.io.StringReader(codigoFuente));
            //  sintactico con el parser
            parser parser = new parser(scan);
            parser.parse();
            System.out.println("Analisis realizado correctamente");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAnalizador;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JComboBox<String> comboArchivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAnalizador;
    private javax.swing.JLabel labelEntrada;
    private javax.swing.JLabel labelSalida;
    private javax.swing.JPanel navbar;
    private javax.swing.JTextArea textAreaEntrada;
    private javax.swing.JTextArea textAreaSalida;
    // End of variables declaration//GEN-END:variables
}
