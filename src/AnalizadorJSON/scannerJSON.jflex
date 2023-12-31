package AnalizadorJSON;
import java_cup.runtime.Symbol;
import statpyconverter.Config;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;


%%

%{
Config cf = new Config();
ArrayList<String> err = new ArrayList<>();

public void htmlErrors(String er){
        try {
                try (FileWriter fileWriter = new FileWriter("C:\\Users\\1998j\\OneDrive\\Desktop\\compi1\\proyecto1\\StatPyConverter\\src\\Reportes\\erroresLexicos.html")) {
                        fileWriter.write("<h1>Errores lexicos</h1><br>");
                        for(int i = 0; i<err.size();i++){
                                fileWriter.write("<p>"+err.get(i)+"</p><br>");
                        }
                }
                } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
                }
        }
%}

%class scanner
%cup
%public
%line
%char
%unicode
%ignorecase


//SIMBOLOS
DOSPT   = ":"
COMD    = "\""
LLI     = "{"
LLC     = "}"
COMA    = ","
SIMBOLOS = ({DOSPT}|{COMD}|{LLI}|{LLC}|{COMA})


//EXPRESIONES
ENTERO  = [0-9]+   
DECIMAL = [0-9]+("."[  |0-9]+)?
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]
LETRA   = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
EXPRESIONES = ({ENTERO}|{DECIMAL}|{SPACE}|{LETRA})

identificador       = ({LETRA}|{ENTERO})+
COMENTARIO_SIMPLE   = "//"+ ({EXPRESIONES}|{SIMBOLOS}|{identificador})+ 
COMENTARIO_EXTENSO  = "/*"+ ({EXPRESIONES}|{SIMBOLOS}|{ENTER}|{identificador})+ "*/"+

%%

<YYINITIAL> {LLI}                       {   return new Symbol(sym.LLI,              yyline, yycolumn,yytext()); }
<YYINITIAL> {LLC}                       {   return new Symbol(sym.LLC,              yyline, yycolumn,yytext()); }
<YYINITIAL> {DECIMAL}                   {   return new Symbol(sym.DECIMAL,          yyline, yycolumn,yytext()); }
<YYINITIAL> {COMD}                      {   return new Symbol(sym.COMD,             yyline, yycolumn,yytext()); }
<YYINITIAL> {COMA}                      {   return new Symbol(sym.COMA,             yyline, yycolumn,yytext()); }
<YYINITIAL> {DOSPT}                     {   return new Symbol(sym.DOSPT,            yyline, yycolumn,yytext()); }
<YYINITIAL> {identificador}             {   return new Symbol(sym.identificador,    yyline, yycolumn,yytext()); }
<YYINITIAL> {SPACE}                     { /*Espacios en blanco, ignorados*/   }
<YYINITIAL> {ENTER}                     { /*Saltos de linea, ignorados*/      }
<YYINITIAL> {COMENTARIO_SIMPLE}         { /*Comentario una linea, ignorados*/ }
<YYINITIAL> {COMENTARIO_EXTENSO}        { /*Comentario multilinea, ignorados*/}

<YYINITIAL> . {
        String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline)+" y columna: "+(yycolumn);
        err.add(errLex);
        htmlErrors(errLex);
}