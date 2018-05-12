/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_1.listas;

/**
 *
 * @author Klac
 */
public class Nodo<E> {
    
    private Nodo<E> nodoEnlace;
    private E dato;

    public Nodo(E dato) {
        this.dato = dato;
        this.nodoEnlace = this;
    }

    public Nodo(Nodo<E> nodoEnlace, E dato) {
        this.nodoEnlace = nodoEnlace;
        this.dato = dato;
    }

    public Nodo<E> getNodoEnlace() {
        return nodoEnlace;
    }

    public void setNodoEnlace(Nodo<E> nodoEnlace) {
        this.nodoEnlace = nodoEnlace;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }
    
}
