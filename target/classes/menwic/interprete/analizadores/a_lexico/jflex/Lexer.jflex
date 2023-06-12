package menwic.interprete.analizadores.a_lexico;

/*Codigo de importacion*/
import java_cup.runtime.Symbol;
import menwic.interprete.analizadores.a_sintactico.sym;

%%
%class Lexer
%line   
%column
%public
%unicode
%cup //Tronar %type token

/*PALABRAS RESERVADAS*/
ENTERO = [E][n][t][e][r][o]
FLOTANTE = [F][l][o][t][a][n][t][e]
TEXTO = [T][e][x][t][o]

/*INSTRUCCIONES*/
ESCRIBIR = [E][s][c][r][i][b][i][r]
LEER = [L][e][e][r]
SI = [S][i]
SINO = [S][i][n][o]
PARA = [P][a][r][a]

/*SYMBOLOS TERMINALES*/
IGUAL = "="
MAS = "+"
MENOS = "-"
POR = "*"
DIV = "/"
DIF = "!"
MAYOR = ">"
MENOR = "<"

GUION_B = "_"
PAR_A = "\("
PAR_C = "\)"
COMILLA = "\""
COMA = ","
PUNTO_COMA = ";"

/*EXPRESIONES REGULARES*/
//CARAC_ENTRADA = [^\r\n]
TERM_LINEA = \r|\n|(\r\n)
ESPACIO_BLANCO= {TERM_LINEA} | ( \t\f)
LETRA = [a-z]|[A-Z]

NumEntero = \p{Digit}+
NumDecimal = {NumEntero}\.{NumEntero}
NomVariable = ({LETRA}|{GUION_B})({LETRA}|{GUION_B}|{NumEntero})*
Cadena ={COMILLA} [^\n]* {COMILLA}

%init{
    yyline=1;
    yycolumn=1;
%init}

%%

/*RETURN DE TOKENS*/
{ENTERO}        {return new Symbol(sym.ENTERO,yyline,yycolumn,yytext());}           
{FLOTANTE}      {return new Symbol(sym.FLOTANTE,yyline,yycolumn,yytext());}
{TEXTO}         {return new Symbol(sym.TEXTO,yyline,yycolumn,yytext());}

{ESCRIBIR}      {return new Symbol(sym.ESCRIBIR,yyline,yycolumn,yytext());}
{LEER}          {return new Symbol(sym.LEER,yyline,yycolumn,yytext());}
{SI}            {return new Symbol(sym.SI,yyline,yycolumn,yytext());}
{SINO}          {return new Symbol(sym.SINO,yyline,yycolumn,yytext());}
{PARA}          {return new Symbol(sym.PARA,yyline,yycolumn,yytext());}

{IGUAL}         {return new Symbol(sym.IGUAL,yyline,yycolumn,yytext());}
{GUION_B}       {return new Symbol(sym.GUION_B,yyline,yycolumn,yytext());}
{PAR_A}         {return new Symbol(sym.PAR_A,yyline,yycolumn,yytext());}
{PAR_C}         {return new Symbol(sym.PAR_C,yyline,yycolumn,yytext());}
{COMA}          {return new Symbol(sym.COMA,yyline,yycolumn,yytext());}
{PUNTO_COMA}    {return new Symbol(sym.PUNTO_COMA,yyline,yycolumn,yytext());}

{NumEntero}      {return new Symbol(sym.NumEntero,yyline,yycolumn,yytext());}
{NumDecimal}     {return new Symbol(sym.NumDecimal,yyline,yycolumn,yytext());}
{NomVariable}    {return new Symbol(sym.NomVariable,yyline,yycolumn,yytext());}
{Cadena}         {return new Symbol(sym.Cadena,yyline,yycolumn,yytext());}

{MAS}           {return new Symbol(sym.MAS,yyline,yycolumn,yytext());}
{MENOS}         {return new Symbol(sym.MENOS,yyline,yycolumn,yytext());}
{POR}           {return new Symbol(sym.POR,yyline,yycolumn,yytext());}
{DIV}           {return new Symbol(sym.DIV,yyline,yycolumn,yytext());}
{DIF}           {return new Symbol(sym.DIF,yyline,yycolumn,yytext());}
{MAYOR}         {return new Symbol(sym.MAYOR,yyline,yycolumn,yytext());}
{MENOR}         {return new Symbol(sym.MENOR,yyline,yycolumn,yytext());}

{ESPACIO_BLANCO} {/*Ignorando*/}
[^]              {return new Symbol(sym.ERROR,yyline,yycolumn,yytext());}

