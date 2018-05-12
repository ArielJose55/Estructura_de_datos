/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_10.arboles;

/**
 *
 * @author Klac
 */
public class Nodo<E> {
    
    private E dato;
    private Nodo<E> nodoIzquierdo;
    private Nodo<E> nodoDerecho;

    public Nodo(E dato) {
        this(dato, null, null);
    }
    
    public Nodo( E dato , Nodo<E> nodoIzquierdo , Nodo<E> nodoDerecho ){
        this.dato = dato;
        this.nodoIzquierdo = nodoIzquierdo;
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo<E> getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo<E> nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Nodo<E> getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo<E> nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
    
}
