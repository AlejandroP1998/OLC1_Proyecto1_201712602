package statpyconverter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Config {

    StringBuilder salida = new StringBuilder();
    ArrayList<Variable> arr = new ArrayList<>();
    ArrayList<varJSON> arrjson = new ArrayList<>();

    public Config() {
    }

    public void Escribir(String sentencesString) {
        salida.append("def main():\n\t").append(sentencesString).append("\nif __name__ == \"__main__\":\n\tmain()\n\n");
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

    public void guardarGlobales(String tipo, String nombre, String dato) {
        Variable varr = new Variable(tipo, nombre, dato);
        arr.add(varr);
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

}
