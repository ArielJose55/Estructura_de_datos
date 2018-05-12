/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_9;

/**
 *
 * @author Klac
 */
public class ListaEnlazada<E> {
    
    Nodo<E> primero;
    
    public ListaEnlazada(){
        primero = null;
    }
    
    public ListaEnlazada(Nodo<E> primero){
        this.primero = primero;
    }
    
    public void insertar(E dato){
        Nodo<E> nuevo = new Nodo<>(dato,primero);
        primero = nuevo;
    }
    
    public ListaEnlazada<E> getListaEnlazada(){
        return this;
    }
    
    public boolean listaVacia(){
        return primero == null;
    }
}
