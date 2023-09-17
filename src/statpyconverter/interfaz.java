package statpyconverter;

import java.awt.Desktop;
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

        btnTokens1 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        btnErrores = new javax.swing.JButton();
        comboArchivo = new javax.swing.JComboBox<>();
        btnTokens = new javax.swing.JButton();
        btnGraficos = new javax.swing.JButton();
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

        btnTokens1.setBackground(new java.awt.Color(0, 0, 102));
        btnTokens1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnTokens1.setForeground(new java.awt.Color(255, 255, 255));
        btnTokens1.setText("tokens");
        btnTokens1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokens1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StatPy Converter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1400, 550));

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setMinimumSize(new java.awt.Dimension(1000, 450));
        background.setPreferredSize(new java.awt.Dimension(800, 550));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar.setBackground(new java.awt.Color(255, 51, 51));

        btnErrores.setBackground(new java.awt.Color(0, 0, 102));
        btnErrores.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnErrores.setForeground(new java.awt.Color(255, 255, 255));
        btnErrores.setText("Errores");
        btnErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErroresActionPerformed(evt);
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

        btnTokens.setBackground(new java.awt.Color(0, 0, 102));
        btnTokens.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnTokens.setForeground(new java.awt.Color(255, 255, 255));
        btnTokens.setText("tokens");
        btnTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokensActionPerformed(evt);
            }
        });

        btnGraficos.setBackground(new java.awt.Color(0, 0, 102));
        btnGraficos.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnGraficos.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficos.setText("graficos");
        btnGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(comboArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addComponent(btnErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnTokens, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTokens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGraficos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 710, 410));

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
        background.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 70, 230, -1));

        btnEjecutar.setBackground(new java.awt.Color(0, 102, 0));
        btnEjecutar.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        btnEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        background.add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 496, 640, 50));

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
                        salida.append(scanner.nextLine()).append(":").append(selectedFile.getName()).append("\n");
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

    private void btnErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErroresActionPerformed
        File archivoHTML = new File("C:\\\\Users\\\\1998j\\\\OneDrive\\\\Desktop\\\\compi1\\\\proyecto1\\\\StatPyConverter\\\\src\\\\Reportes\\\\erroresLexicos.html");

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (archivoHTML.exists()) {
                try {
                    desktop.open(archivoHTML);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo HTML no existe en la ruta especificada.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            System.out.println("La funcionalidad de Desktop no está soportada en este sistema.");
        }
    }//GEN-LAST:event_btnErroresActionPerformed

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

    private void btnTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokensActionPerformed
        File archivoHTML = new File("C:\\\\Users\\\\1998j\\\\OneDrive\\\\Desktop\\\\compi1\\\\proyecto1\\\\StatPyConverter\\\\src\\\\Reportes\\\\tokens.html");

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (archivoHTML.exists()) {
                try {
                    desktop.open(archivoHTML);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo HTML no existe en la ruta especificada.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            System.out.println("La funcionalidad de Desktop no está soportada en este sistema.");
        }
    }//GEN-LAST:event_btnTokensActionPerformed

    private void btnTokens1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokens1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTokens1ActionPerformed

    private void btnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficosActionPerformed
        File carpeta = new File("C:\\\\Users\\\\1998j\\\\OneDrive\\\\Desktop\\\\compi1\\\\proyecto1\\\\StatPyConverter\\\\src\\\\Reportes\\\\Graficos");

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (carpeta.exists() && carpeta.isDirectory()) {
                try {
                    desktop.open(carpeta);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("La carpeta no existe en la ruta especificada.");
            }
        } else {
            System.out.println("La funcionalidad de Desktop no está soportada en este sistema.");
        }
    }//GEN-LAST:event_btnGraficosActionPerformed

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
    private javax.swing.JButton btnErrores;
    private javax.swing.JButton btnGraficos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnTokens;
    private javax.swing.JButton btnTokens1;
    private javax.swing.JComboBox<String> comboArchivo;
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
