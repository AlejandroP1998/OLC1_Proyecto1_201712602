package statpyconverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Config {

    StringBuilder salida = new StringBuilder();
    ArrayList<varJSON> arrjson = new ArrayList<>();

    public Config() {
    }

    public void Escribir(String sentencesString) {
        salida.append(sentencesString);
        escribirSalida();
    }

    public void escribirSalida() {
        try {
            try (FileWriter fileWriter = new FileWriter("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\salida.py")) {
                fileWriter.write(salida.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void escribirJSON(String jsonString) {
        try {
            try (FileWriter fileWriter = new FileWriter("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\salida.txt")) {
                fileWriter.write(jsonString);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void cargarJSON() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\items.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] sep = linea.split(":");
                varJSON vr = new varJSON(sep[0], sep[1], sep[2]);
                arrjson.add(vr);
            }
            //System.out.println(arrjson);
        } catch (IOException e) {
        }
    }

    public String buscarJSON(String doc, String name) {
        cargarJSON();
        for (int i = 0; i < arrjson.size(); i++) {
            if (arrjson.get(i).getDocumento().equals(doc)) {
                if (arrjson.get(i).getNombre().equals(name)) {
                    return arrjson.get(i).getDato();
                }

            }
        }
        return "error";
    }

    public void graficaBarras(String titulo, String tituloX, String tituloY, String[] ejex, String[] valores) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < valores.length; i++) {
            dataset.addValue(Double.parseDouble(valores[i]), "calificaciones", ejex[i]);
        }
        JFreeChart barChart;
        barChart = ChartFactory.createBarChart(titulo, tituloX, tituloY, dataset);
        try {
            File file = new File("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\Graficos\\graficoBarras" + titulo + ".png");
            ChartUtilities.saveChartAsPNG(file, barChart, 1800, 600);
        } catch (IOException e) {
        }
    }
    
    public void graficoPie(String titulo,String[] valores, String[]categorias){
        DefaultPieDataset dataset = new DefaultPieDataset();
        for(int i = 0; i<valores.length;i++){
            dataset.setValue(categorias[i], Double.parseDouble(valores[i]));
        }
        JFreeChart pieChart = ChartFactory.createPieChart(titulo, dataset);
        try {
            File file = new File("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\Graficos\\graficoPie-" +  titulo + ".png");
            ChartUtilities.saveChartAsPNG(file, pieChart, 1800, 600);
        } catch (IOException e) {
        }
    }
    
    
    
}
