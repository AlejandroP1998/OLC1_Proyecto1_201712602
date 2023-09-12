package AnalizadorJSON;

public class GeneradorJSON {

    public static void main(String[] args) {
        compilar();
    }

    private static void compilar() {

        try {

            String ruta = "src/AnalizadorJSON/";
            //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = {ruta + "scannerJSON.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "parserJSON.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
