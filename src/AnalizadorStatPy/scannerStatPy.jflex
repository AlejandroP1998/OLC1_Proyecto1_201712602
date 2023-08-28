package AnalizadorStatPy;
import java_cup.runtime.Symbol;
import statpyconverter.Config;

%%

%{
    Config cf = new Config();
%}

%class scanner
%cup
%public
%line
%char
%unicode
%ignorecase


//simbolos
PAR_IZQ = "("
PAR_DER = ")"
PTCOMA  = ";"
DOSPT   = ":"
LLI = "{"
LLC = "}"
COMS = "\'"
COMD = "\""
SIMBOLOS = ({PAR_IZQ}|{PAR_DER}|{PTCOMA}|{DOSPT}|{LLI}|{LLC}|{COMS}|{COMD})

//operadores
MAS     = "+"
MENOS   = "-"
POR     = "*"
DIV     = "/"
OPERADORES = ({MAS}|{MENOS}|{POR}|{DIV})

//relacionales
MAYOR   = ">"
MENOR   = "<"
MAYORI  = ">="
MENORI  = "<="
IGUAL   = "="
COMPARACION = "=="
DISTINTO    = "!="
RELACIONES  = ({MAYOR}|{MENOR}|{MAYORI}|{MENORI}|{COMPARACION}|{DISTINTO})

//logicas
AND = "&&"
OR  = "||"
NOT = "!"
LOGICAS     = ({AND}|{OR}|{NOT})

//palabras reservadas
varINT      = "int"
varDOUBLE   = "double"
varCHAR     = "char"
varBOOL     = "bool"
varSTRING   = "string"
wVoid       = "void"
wMain       = "main"
wPrint      = "Console.Write"
wSWITCH     = "switch"
wCASE       = "case"
wBREAK      = "break"
wIF         = "if"
wELSE       = "else"
RESERVADAS  = ({varINT}|{varDOUBLE}|{varCHAR}|{varBOOL}|{varSTRING}|{wVoid}|{wMain}|{wPrint}|{wSWITCH}|{wCASE}|{wBREAK}|{wIF}|{wELSE})

//expresiones
ENTERO  = [0-9]+   
DECIMAL = [0-9]+("."[  |0-9]+)?
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]
LETRA   = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
EXPRESIONES = ({ENTERO}|{DECIMAL}|{SPACE}|{LETRA})

identificador       = ({LETRA}|{ENTERO})+
COMENTARIO_SIMPLE   = "//"+ ({EXPRESIONES}|{RELACIONES}|{RESERVADAS}|{SIMBOLOS}|{OPERADORES}|{LOGICAS}|{identificador})+ 
COMENTARIO_EXTENSO  = "/*"+ ({EXPRESIONES}|{RELACIONES}|{RESERVADAS}|{SIMBOLOS}|{OPERADORES}|{LOGICAS}|{ENTER}|{identificador})+ "*/"+

%%

<YYINITIAL> {LLI}                       {   return new Symbol(sym.LLI,              yyline, yycolumn,yytext()); }
<YYINITIAL> {LLC}                       {   return new Symbol(sym.LLC,              yyline, yycolumn,yytext()); }
<YYINITIAL> {wMain}                     {   return new Symbol(sym.wMain,            yyline, yycolumn,yytext()); }
<YYINITIAL> {wVoid}                     {   return new Symbol(sym.wVoid,            yyline, yycolumn,yytext()); }
<YYINITIAL> {varINT}                    {   return new Symbol(sym.varINT,           yyline, yycolumn,yytext()); }
<YYINITIAL> {varDOUBLE}                 {   return new Symbol(sym.varDOUBLE,        yyline, yycolumn,yytext()); }
<YYINITIAL> {varCHAR}                   {   return new Symbol(sym.varCHAR,          yyline, yycolumn,yytext()); }
<YYINITIAL> {varBOOL}                   {   return new Symbol(sym.varBOOL,          yyline, yycolumn,yytext()); }
<YYINITIAL> {varSTRING}                 {   return new Symbol(sym.varSTRING,        yyline, yycolumn,yytext()); }
<YYINITIAL> {wIF}                       {   return new Symbol(sym.wIF,              yyline, yycolumn,yytext()); }
<YYINITIAL> {wELSE}                     {   return new Symbol(sym.wELSE,            yyline, yycolumn,yytext()); }
<YYINITIAL> {wSWITCH}                   {   return new Symbol(sym.wSWITCH,          yyline, yycolumn,yytext()); }
<YYINITIAL> {wCASE}                     {   return new Symbol(sym.wCASE,            yyline, yycolumn,yytext()); }
<YYINITIAL> {wBREAK}                    {   return new Symbol(sym.wBREAK,           yyline, yycolumn,yytext()); }
<YYINITIAL> {PAR_IZQ}                   {   return new Symbol(sym.PAR_IZQ,          yyline, yycolumn,yytext()); }
<YYINITIAL> {PAR_DER}                   {   return new Symbol(sym.PAR_DER,          yyline, yycolumn,yytext()); }
<YYINITIAL> {PTCOMA}                    {   return new Symbol(sym.PTCOMA,           yyline, yycolumn,yytext()); }
<YYINITIAL> {MAS}                       {   return new Symbol(sym.MAS,              yyline, yycolumn,yytext()); }
<YYINITIAL> {MENOS}                     {   return new Symbol(sym.MENOS,            yyline, yycolumn,yytext()); }
<YYINITIAL> {POR}                       {   return new Symbol(sym.POR,              yyline, yycolumn,yytext()); }
<YYINITIAL> {DIV}                       {   return new Symbol(sym.DIV,              yyline, yycolumn,yytext()); }
<YYINITIAL> {ENTERO}                    {   return new Symbol(sym.ENTERO,           yyline, yycolumn,yytext()); }
<YYINITIAL> {DECIMAL}                   {   return new Symbol(sym.DECIMAL,          yyline, yycolumn,yytext()); }
<YYINITIAL> {RELACIONES}                {   return new Symbol(sym.RELACIONES,       yyline, yycolumn,yytext()); }
<YYINITIAL> {IGUAL}                     {   return new Symbol(sym.IGUAL,            yyline, yycolumn,yytext()); }
<YYINITIAL> {COMS}                      {   return new Symbol(sym.COMS,             yyline, yycolumn,yytext()); }
<YYINITIAL> {COMD}                      {   return new Symbol(sym.COMD,             yyline, yycolumn,yytext()); }
<YYINITIAL> {wPrint}                    {   return new Symbol(sym.wPrint,           yyline, yycolumn,yytext()); }
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