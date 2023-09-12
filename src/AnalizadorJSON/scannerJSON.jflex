package AnalizadorJSON;
import java_cup.runtime.Symbol;


%%

%{

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
<YYINITIAL> {DOSPT}                     {   return new Symbol(sym.DOSPT,            yyline, yycolumn,yytext()); }
<YYINITIAL> {identificador}             {   return new Symbol(sym.identificador,    yyline, yycolumn,yytext()); }
<YYINITIAL> {SPACE}                     { /*Espacios en blanco, ignorados*/   }
<YYINITIAL> {ENTER}                     { /*Saltos de linea, ignorados*/      }
<YYINITIAL> {COMENTARIO_SIMPLE}         { /*Comentario una linea, ignorados*/ }
<YYINITIAL> {COMENTARIO_EXTENSO}        { /*Comentario multilinea, ignorados*/}

<YYINITIAL> . {
        String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline)+" y columna: "+(yycolumn);
        System.out.println(errLex);
}