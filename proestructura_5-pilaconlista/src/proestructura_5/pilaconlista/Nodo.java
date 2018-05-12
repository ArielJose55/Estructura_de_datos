/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_5.pilaconlista;

/**
 *
 * @author Klac
 */
public class Nodo {
    private Integer dato;
    private Nodo siguiente;

    public Nodo(Integer dato) {
        this(dato,null);
    }
    
    public Nodo(Integer dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
         
}
