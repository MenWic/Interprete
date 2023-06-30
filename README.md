# Interprete

Indicaciones: Proyecto hecho en Java (construido con Maven) realizado en Netbeans.

Version de JDK: JDK 11 (Puede usar cualquier JDK >= version 11 para correr el proyecto o .jar).


## Herraminetas utilizadas

### Análisis Léxico (Lexer): JFLEX.
Compilación de Archivo de extension .jflex / .flex / .lex =
jflex [archivo].[extension] -d [ruta de directorio destino]

### Análisis Sintáctico (Parser): CUP.
Compilación de Archivo de extensión .cup =
cd [ruta de carpeta de ubicación del archivo .cup a compilar]
java -jar [ruta de ubicacion del .jar de cup descargado]/[nombre de .jar de cup].jar [archivo].cup
