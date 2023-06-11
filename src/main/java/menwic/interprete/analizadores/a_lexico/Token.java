package menwic.interprete.analizadores.a_lexico;

/**
 *
 * @author lamr4
 */
public class Token {

    private String token;
    private int line;
    private int column;

    public Token(String token, int line, int column) {
        this.token = token;
        this.line = line;
        this.column = column;
    }

    @Override
    public String toString() {
        return "Token: " + token + ", Linea:" + line + ", Columna: " + column;
    }

}
