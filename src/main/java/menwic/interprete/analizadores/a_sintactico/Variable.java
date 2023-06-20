package menwic.interprete.analizadores.a_sintactico;

/**
 *
 * @author lamr4
 */
public class Variable {
    private String tipo;
    private String nombre;
    private String valor;

    // Constructor para Declaracion
    public Variable(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    //Metodo usado para asignacion de variable
    public void setValor(String valor) {
        this.valor = valor;
    }

}
