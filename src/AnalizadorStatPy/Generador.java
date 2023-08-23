package AnalizadorStatPy;

public class Generador {

    public static void main(String[] args) {
        compilar();
    }

    private static void compilar() {

        try {

            String ruta = "src/AnalizadorStatPy/";
            //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = {ruta + "scannerStatPy.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "parserStatPy.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
