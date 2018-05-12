/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_11.arboles2;

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
    
    public void insertarNodo(E dato){
        if(estaVacio()){
            nodoRaiz = new Nodo<>(dato);
        }else{
            nodoRaiz.insertar(dato);
        }
    }
    
    public boolean borrarNodo(E dato){
        Nodo<E> actual = nodoRaiz;
        Nodo<E> padre = nodoRaiz;
        boolean eshijoIzq = true;
        while(actual.compareTo(dato) != 0){
            padre = actual;
            
            if(actual.compareTo(dato) > 0){
                
            }else{
                
            }
        }
    }
    
    public void recorrerEnPreOrden(){
        preOrden(nodoRaiz);
    }
    
    public void recorrerEnInOrden(){
        inOrden(nodoRaiz);
    }
    
    public void recorrerEnPosOrden(){
        posOrden(nodoRaiz);
    }
    
    public E getNodoRaizDato(){
        return nodoRaiz.getDato();
    }
    
    private void preOrden(Nodo<E> nodo){
        if(nodo == null){
            return;
        }
        System.out.format("%s ", nodo);
        preOrden(nodo.getNodoIzquierdo());
        preOrden(nodo.getNodoDerecho());
    }
    
    private void inOrden(Nodo<E> nodo){
        if(nodo == null){
            return;
        }
        inOrden(nodo.getNodoIzquierdo());
        System.out.format("%s ", nodo);
        inOrden(nodo.getNodoDerecho());
    }
    
    private void posOrden(Nodo<E> nodo){
        if(nodo == null){
            return;
        }
        posOrden(nodo.getNodoIzquierdo());
        posOrden(nodo.getNodoDerecho());
        System.out.format("%s ", nodo);
    }
    
    public boolean estaVacio(){
        return nodoRaiz == null;
    }
    
}
