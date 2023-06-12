package menwic.interprete.analizadores.a_sintactico;

/**
 *
 * @author lamr4
 */
public class Variable {
    private String tipo;
    private String nombre;
    private String valor;

    //Constructor
    public Variable(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    public Variable(String tipo,String nombre, String valor) {
        this.nombre = nombre;
        this.tipo=tipo;
        this.valor = valor;
    }

    //Getters y Setters
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

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
