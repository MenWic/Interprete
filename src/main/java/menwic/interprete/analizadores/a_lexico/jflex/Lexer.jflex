package menwic.interprete.analizadores.a_lexico;

/*Codigo de importacion*/
//import java_cup.runtime.*;
%%
%class Lexer
%line   
%column
%public
%unicode
%type Token /* %cup //Tronar %type token */

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
LETRA = \p{Letter} //[a-z]|[A-Z]
DIGITO = \p{Digit} //[0-9]

NumEntero = {DIGITO}+
NumDecimal = {NumEntero}\.{NumEntero}
NomVariable = ({LETRA}|{GUION_B})({LETRA}|{GUION_B}|{NumEntero})*
Cadena ={COMILLA}({LETRA}|{NumEntero}|{NumDecimal}|{ESPACIO_BLANCO}|\W )*{COMILLA}

%init{
    yyline=1;
    yycolumn=1;
%init}

%%

/*RETURN DE TOKENS*/
{ENTERO}        {return (new Token(yytext(),yyline,yycolumn));}
                /*return new Symbol(ParserSym.ENTERO,yyline,yycolumn,yytext());*/
{FLOTANTE}      {return (new Token(yytext(),yyline,yycolumn));}
{TEXTO}         {return (new Token(yytext(),yyline,yycolumn));}

{ESCRIBIR}      {return (new Token(yytext(),yyline,yycolumn));}
{LEER}          {return (new Token(yytext(),yyline,yycolumn));}
{SI}            {return (new Token(yytext(),yyline,yycolumn));}
{SINO}          {return (new Token(yytext(),yyline,yycolumn));}
{PARA}          {return (new Token(yytext(),yyline,yycolumn));}

{IGUAL}         {return (new Token(yytext(),yyline,yycolumn));}
{GUION_B}       {return (new Token(yytext(),yyline,yycolumn));}
{PAR_A}         {return (new Token(yytext(),yyline,yycolumn));}
{PAR_C}         {return (new Token(yytext(),yyline,yycolumn));}
{COMA}          {return (new Token(yytext(),yyline,yycolumn));}
{PUNTO_COMA}    {return (new Token(yytext(),yyline,yycolumn));}

{LETRA}          {return (new Token(yytext(),yyline,yycolumn));}
{DIGITO}         {return (new Token(yytext(),yyline,yycolumn));}
{NumEntero}      {return (new Token(yytext(),yyline,yycolumn));}
{NumDecimal}     {return (new Token(yytext(),yyline,yycolumn));}
{NomVariable}    {return (new Token(yytext(),yyline,yycolumn));}
{Cadena}         {return (new Token(yytext(),yyline,yycolumn));}

{ESPACIO_BLANCO} {/*Ignorando*/}
[^]              {System.out.println("Error: "+yytext());}
