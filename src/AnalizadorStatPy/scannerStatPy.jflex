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
PAR_IZQ   = "("
PAR_DER   = ")"
COR_IZQ  = "["
COR_DER  = "]" 
PTCOMA  = ";"
LLI = "{"
LLC = "}"
COMS = "\'"
COMD = "\""

//operadores
MAS = "+"
MENOS = "-"
POR = "*"
DIV = "/"

//relacionales
MAYOR = ">"
MENOR = "<"
MAYORI = ">="
MENORI = "<="
IGUAL = "="
COMPARACION="=="
DISTINTO = "!="

//logicas
AND = "&&"
OR = "||"
NOT = "!"

//palabras reservadas
varINT = "int"
varDOUBLE = "double"
varCHAR = "char"
varBOOL = "bool"
varSTRING = "string"
wVoid = "void"
wMain = "main"
wPrint = "Console.Write"

//expresiones
ENTERO  = [0-9]+   
DECIMAL = [0-9]+("."[  |0-9]+)?
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]
LETRA = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
identificador = ({LETRA}|{ENTERO})+

COMENTARIO_SIMPLE = "//"+ ({SPACE}|{LETRA}|{ENTERO}|{DECIMAL})+
COMENTARIO_EXTENSO = "/*"+ ({ENTER}|{SPACE}|{LETRA}|{ENTERO}|{DECIMAL})+ "*/"+

%%

<YYINITIAL> {LLI}                       {   return new Symbol(sym.LLI, yyline, yycolumn,yytext());          }

<YYINITIAL> {LLC}                       {   return new Symbol(sym.LLC, yyline, yycolumn,yytext());          }

<YYINITIAL> {wMain}                     {   return new Symbol(sym.wMain, yyline, yycolumn,yytext());        }

<YYINITIAL> {wVoid}                     {   return new Symbol(sym.wVoid, yyline, yycolumn,yytext());        }

<YYINITIAL> {varINT}                    {   return new Symbol(sym.varINT, yyline, yycolumn,yytext());       }

<YYINITIAL> {varDOUBLE}                 {   return new Symbol(sym.varDOUBLE, yyline, yycolumn,yytext());    }

<YYINITIAL> {varCHAR}                   {   return new Symbol(sym.varCHAR, yyline, yycolumn,yytext());      }

<YYINITIAL> {varBOOL}                   {   return new Symbol(sym.varBOOL, yyline, yycolumn,yytext());      }

<YYINITIAL> {varSTRING}                 {   return new Symbol(sym.varSTRING, yyline, yycolumn,yytext());    }

<YYINITIAL> {PAR_IZQ}                   {   return new Symbol(sym.PAR_IZQ, yyline, yycolumn,yytext());      }

<YYINITIAL> {PAR_DER}                   {   return new Symbol(sym.PAR_DER, yyline, yycolumn,yytext());      }

<YYINITIAL> {COR_IZQ}                   {   return new Symbol(sym.COR_IZQ, yyline, yycolumn,yytext());      }

<YYINITIAL> {COR_DER}                   {   return new Symbol(sym.COR_DER, yyline, yycolumn,yytext());      }

<YYINITIAL> {PTCOMA}                    {   return new Symbol(sym.PTCOMA, yyline, yycolumn,yytext());       }

<YYINITIAL> {MAS}                       {   return new Symbol(sym.MAS, yyline, yycolumn,yytext());          }

<YYINITIAL> {MENOS}                     {   return new Symbol(sym.MENOS, yyline, yycolumn,yytext());        }

<YYINITIAL> {POR}                       {   return new Symbol(sym.POR, yyline, yycolumn,yytext());          }

<YYINITIAL> {DIV}                       {   return new Symbol(sym.DIV, yyline, yycolumn,yytext());          }

<YYINITIAL> {ENTERO}                    {   return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());       }

<YYINITIAL> {DECIMAL}                   {   return new Symbol(sym.DECIMAL, yyline, yycolumn,yytext());      }

<YYINITIAL> {MAYOR}                     {   return new Symbol(sym.MAYOR, yyline, yycolumn,yytext());        }

<YYINITIAL> {MENOR}                     {   return new Symbol(sym.MENOR, yyline, yycolumn,yytext());        }

<YYINITIAL> {MAYORI}                    {   return new Symbol(sym.MAYORI, yyline, yycolumn,yytext());       }

<YYINITIAL> {MENORI}                    {   return new Symbol(sym.MENORI, yyline, yycolumn,yytext());       }

<YYINITIAL> {IGUAL}                     {   return new Symbol(sym.IGUAL, yyline, yycolumn,yytext());        }

<YYINITIAL> {COMPARACION}               {   return new Symbol(sym.COMPARACION, yyline, yycolumn,yytext());          }

<YYINITIAL> {identificador}             {   return new Symbol(sym.identificador, yyline, yycolumn,yytext());        }

<YYINITIAL> {DISTINTO}                  {   return new Symbol(sym.DISTINTO, yyline, yycolumn,yytext());             }

<YYINITIAL> {AND}                       {   return new Symbol(sym.AND, yyline, yycolumn,yytext());      }

<YYINITIAL> {OR}                        {   return new Symbol(sym.OR, yyline, yycolumn,yytext());       }

<YYINITIAL> {NOT}                       {   return new Symbol(sym.NOT, yyline, yycolumn,yytext());      }

<YYINITIAL> {COMS}                      {   return new Symbol(sym.COMS, yyline, yycolumn,yytext());     }

<YYINITIAL> {COMD}                      {   return new Symbol(sym.COMD, yyline, yycolumn,yytext());     }

<YYINITIAL> {wPrint}                    {   return new Symbol(sym.wPrint, yyline, yycolumn,yytext());   }

<YYINITIAL> {SPACE}                     { /*Espacios en blanco, ignorados*/   }

<YYINITIAL> {ENTER}                     { /*Saltos de linea, ignorados*/      }

<YYINITIAL> {COMENTARIO_SIMPLE}         { /*Comentario una linea, ignorados*/ }

<YYINITIAL> {COMENTARIO_EXTENSO}        { /*Comentario multilinea, ignorados*/}


<YYINITIAL> . {
        String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
        System.out.println(errLex);
}