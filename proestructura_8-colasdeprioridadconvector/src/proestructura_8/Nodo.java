/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_8;

/**
 *
 * @author Klac
 */
public class Nodo {
    
    private Object dato;
    private Nodo siguiente;

    public Nodo(Object dato) {
        this(dato,null);
    }

    public Nodo(Object dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString(){
        return dato.toString();
    }
    
}
