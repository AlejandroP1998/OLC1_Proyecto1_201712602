package statpyconverter;

public class Variable {

    private final String tipo;
    private final String nombre;
    private final String dato;

    public Variable(String tipo, String nombre, String dato) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.dato = dato;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDato() {
        return dato;
    }

}
