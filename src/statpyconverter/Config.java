package statpyconverter;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.SerializedLambda;

public class Config {

    StringBuilder salida = new StringBuilder();

    public Config() {
    }

    public void translateStatPy(String methodString, String sentencesString) {
        switch (methodString) {
            case "main":
                translateMain(sentencesString);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void translateMain(String sentencesString) {
        salida.append("def main():\n"
                + "\t" + sentencesString + "\n"
                + "if __name__ == \"__main__\":\n"
                + "\tmain()\n\n");
        escribirSalida();
    }
    
    public void escribirSalida(){
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\salida.py");
            fileWriter.write(salida.toString());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}
