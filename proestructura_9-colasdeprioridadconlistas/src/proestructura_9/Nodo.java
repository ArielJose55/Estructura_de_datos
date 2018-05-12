/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_9;

/**
 *
 * @author Klac
 */
public class Nodo<E> {
    
    private E dato;
    private Nodo siguiente;

    public Nodo(E dato) {
        this(dato,null);
    }

    public Nodo(E dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
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
