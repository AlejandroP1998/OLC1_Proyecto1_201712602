package statpyconverter;

import java.io.FileWriter;
import java.io.IOException;

public class Config {

    StringBuilder salida = new StringBuilder();

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

}
