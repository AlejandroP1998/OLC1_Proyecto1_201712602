package statpyconverter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
import javax.swing.SwingUtilities;
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
        btnReporte = new javax.swing.JButton();
        comboReportes = new javax.swing.JComboBox<>();
        comboArchivo = new javax.swing.JComboBox<>();
        labelAnalizador = new javax.swing.JLabel();
        labelEntrada = new javax.swing.JLabel();
        labelSalida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaEntrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaSalida = new javax.swing.JTextArea();
        labelArchivo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        btnAnalizador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StatPy Converter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1400, 550));

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setMinimumSize(new java.awt.Dimension(1000, 450));
        background.setPreferredSize(new java.awt.Dimension(800, 550));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar.setBackground(new java.awt.Color(255, 51, 51));

        btnReporte.setBackground(new java.awt.Color(0, 0, 102));
        btnReporte.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("ver Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        comboReportes.setBackground(new java.awt.Color(0, 0, 102));
        comboReportes.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        comboReportes.setForeground(new java.awt.Color(255, 255, 255));
        comboReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Errores lexicos", "Lista de tokens", "Graficos" }));
        comboReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReportesActionPerformed(evt);
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
                .addGap(12, 12, 12)
                .addComponent(comboArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addComponent(comboReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 50));

        labelAnalizador.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        labelAnalizador.setForeground(new java.awt.Color(255, 255, 255));
        labelAnalizador.setText("Analizador: StatPy");
        background.add(labelAnalizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        labelEntrada.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        labelEntrada.setForeground(new java.awt.Color(255, 255, 255));
        labelEntrada.setText("Entrada:");
        background.add(labelEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        labelSalida.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        labelSalida.setForeground(new java.awt.Color(255, 255, 255));
        labelSalida.setText("Salida:");
        background.add(labelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 90, -1));

        textAreaEntrada.setBackground(new java.awt.Color(0, 0, 51));
        textAreaEntrada.setColumns(20);
        textAreaEntrada.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        textAreaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        textAreaEntrada.setRows(5);
        textAreaEntrada.setCaretColor(new java.awt.Color(0, 255, 0));
        jScrollPane1.setViewportView(textAreaEntrada);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 710, 360));

        textAreaSalida.setBackground(new java.awt.Color(0, 0, 0));
        textAreaSalida.setColumns(20);
        textAreaSalida.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        textAreaSalida.setRows(5);
        textAreaSalida.setEnabled(false);
        jScrollPane2.setViewportView(textAreaSalida);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 640, 360));

        labelArchivo.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        labelArchivo.setForeground(new java.awt.Color(255, 255, 255));
        background.add(labelArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 300, -1));

        btnLimpiar.setBackground(new java.awt.Color(51, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar todo");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        background.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 230, -1));

        btnEjecutar.setBackground(new java.awt.Color(0, 102, 0));
        btnEjecutar.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        background.add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 450, -1));

        btnAnalizador.setBackground(new java.awt.Color(102, 0, 102));
        btnAnalizador.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnAnalizador.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalizador.setText("Cambiar Analizador");
        btnAnalizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizadorActionPerformed(evt);
            }
        });
        background.add(btnAnalizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        if (labelAnalizador.getText().equals("Analizador: StatPy")) {
            EjecutarStatPy(textAreaEntrada.getText());
            try {
                File archivo = new File("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\salida.py");
                StringBuilder salida;
                try (Scanner scanner = new Scanner(archivo)) {
                    salida = new StringBuilder();
                    // Lee el contenido línea por línea
                    while (scanner.hasNextLine()) {
                        salida.append(scanner.nextLine()).append("\n");
                    }
                }
                textAreaSalida.setText(salida.toString());
                if (textAreaSalida.getText().isBlank()) {
                    textAreaSalida.setText("No compila");
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No se logro leer la salida", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            EjecutarJSON(textAreaEntrada.getText());
            try {
                File archivo = new File("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\salida.txt");
                StringBuilder salida;
                try (Scanner scanner = new Scanner(archivo)) {
                    salida = new StringBuilder();
                    // Lee el contenido línea por línea
                    while (scanner.hasNextLine()) {
                        salida.append(scanner.nextLine()).append(selectedFile.getName()).append("\n");
                    }
                }
                textAreaSalida.setText(salida.toString());
                StringBuilder contenido = new StringBuilder();
                try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\items.txt"))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        contenido.append(linea).append("\n");
                    }
                } catch (IOException e) {
                }
                contenido.append(textAreaSalida.getText());
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\\\Users\\\\1998j\\\\OneDrive\\\\Desktop\\\\compi1\\\\proyecto1\\\\StatPyConverter\\\\src\\\\Reportes\\\\items.txt"))) {
                    bw.write(contenido.toString());
                } catch (IOException e) {
                }
                if (textAreaSalida.getText().isBlank()) {
                    textAreaSalida.setText("No compila");
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No se logro leer la salida", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed

    }//GEN-LAST:event_btnReporteActionPerformed

    private void comboArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboArchivoActionPerformed
        int option = comboArchivo.getSelectedIndex();
        switch (option) {
            case 0 -> {
                JFileChooser archivo = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JSON y SP", "json", "sp");
                archivo.setFileFilter(filter);
                int eleccionAbrir = archivo.showOpenDialog(null);

                if (eleccionAbrir == JFileChooser.APPROVE_OPTION) {
                    selectedFile = archivo.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Archivo seleccionado: \n" + selectedFile.getName(), "Abierto", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        StringBuilder content;
                        try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                            content = new StringBuilder();
                            String line;
                            while ((line = reader.readLine()) != null) {
                                content.append(line).append("\n");
                            }
                        }
                        labelArchivo.setText(selectedFile.getName());
                        textAreaEntrada.setText(content.toString());
                        textAreaSalida.setText("Archivo leido con exito");
                    } catch (IOException e) {
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se selecciono ningun archivo", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }

            case 1 -> {
                if (selectedFile != null) {
                    try {
                        try (FileWriter writer = new FileWriter(selectedFile)) {
                            String contenido = textAreaEntrada.getText();
                            writer.write(contenido);
                        }
                        JOptionPane.showMessageDialog(null, "Se guardo correctamente el archivo \n" + selectedFile.getName(), "Guardado", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e) {
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se logro guardar archivo", "Error al guardar", JOptionPane.WARNING_MESSAGE);
                }
            }

            case 2 -> {
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
            }
            default -> {
            }
        }
    }//GEN-LAST:event_comboArchivoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        textAreaEntrada.setText("");
        textAreaSalida.setText("");
        labelArchivo.setText("");
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\salida.py");
            fileWriter.write("");
            fileWriter.close();
            fileWriter = new FileWriter("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\salida.txt");
            fileWriter.write("");
            fileWriter.close();
            fileWriter = new FileWriter("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\items.txt");
            fileWriter.write("");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void comboReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboReportesActionPerformed

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            new interfaz().setVisible(true);
        });
    }

    private static void EjecutarStatPy(String codigoFuente) {
        try {
            // realizar el analisis lexico con el scanner
            AnalizadorStatPy.scanner scan = new AnalizadorStatPy.scanner(new java.io.StringReader(codigoFuente));
            //  sintactico con el parser
            AnalizadorStatPy.parser parser = new AnalizadorStatPy.parser(scan);
            parser.parse();
            System.out.println("Analisis realizado correctamente");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    private static void EjecutarJSON(String codigoFuente) {
        try {
            // realizar el analisis lexico con el scanner
            AnalizadorJSON.scanner scan = new AnalizadorJSON.scanner(new java.io.StringReader(codigoFuente));
            //  sintactico con el parser
            AnalizadorJSON.parser parser = new AnalizadorJSON.parser(scan);
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
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> comboArchivo;
    private javax.swing.JComboBox<String> comboReportes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAnalizador;
    private javax.swing.JLabel labelArchivo;
    private javax.swing.JLabel labelEntrada;
    private javax.swing.JLabel labelSalida;
    private javax.swing.JPanel navbar;
    private javax.swing.JTextArea textAreaEntrada;
    private javax.swing.JTextArea textAreaSalida;
    // End of variables declaration//GEN-END:variables
}
