
package statpyconverter;


public class Token {
    String lexema;
    String token;
    String linea;
    String columna;

    public Token(String lexema, String token, String linea, String columna) {
        this.lexema = lexema;
        this.token = token;
        this.linea = linea;
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public String getToken() {
        return token;
    }

    public String getLinea() {
        return linea;
    }

    public String getColumna() {
        return columna;
    }
    
}
