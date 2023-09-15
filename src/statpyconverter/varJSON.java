package statpyconverter;

public class varJSON {

    private final String nombre;
    private final String dato;
    private final String documento;

    public varJSON(String nombre, String dato, String documento) {
        this.nombre = nombre;
        this.dato = dato;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDato() {
        return dato;
    }

    public String getDocumento() {
        return documento;
    }

}
