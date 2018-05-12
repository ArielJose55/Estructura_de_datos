/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_10.arboles;

/**
 *
 * @author Klac
 */
public class ArbolBinario<E> {
     
    private Nodo<E> nodoRaiz;

    public ArbolBinario() {
        nodoRaiz = null;
    }

    public ArbolBinario(Nodo<E> nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }
    
    public boolean estaVacio(){
        return nodoRaiz == null;
    }
}
