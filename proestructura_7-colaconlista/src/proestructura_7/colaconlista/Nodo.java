/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_7.colaconlista;

/**
 *
 * @author Klac
 */
public class Nodo {
    
    private Integer dato;
    private Nodo seguiente;

    public Nodo(Integer dato) {
       this(dato,null);
    }

    public Nodo(Integer dato, Nodo seguiente) {
        this.dato = dato;
        this.seguiente = seguiente;
    }

    public  int getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getSeguiente() {
        return seguiente;
    }

    public void setSeguiente(Nodo seguiente) {
        this.seguiente = seguiente;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
