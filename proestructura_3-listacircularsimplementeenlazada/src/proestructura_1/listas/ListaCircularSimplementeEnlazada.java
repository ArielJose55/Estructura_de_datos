/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_1.listas;

import java.util.Formatter;

/**
 *
 * @author Klac
 */
public class ListaCircularSimplementeEnlazada<E> {
    
    /**
     * Una lista circular de enlace simple o doble siempre hay un primer nodo llamado cabeza y un ultimo nodo llamado cola.
     * estas listas no tiene principio ni fin se podria considerarse que es una lista lineal cuyo ultimo nodo apunta al primero
     */
    
    private Nodo<E> nodoAcceso;
    

    public ListaCircularSimplementeEnlazada() {
        nodoAcceso = null;
    }

    
    public void añadir(E dato){
        Nodo<E> nuevoNodo = new Nodo<>(dato);
        if(nodoAcceso != null){
            nuevoNodo.setNodoEnlace(nodoAcceso.getNodoEnlace());
            nodoAcceso.setNodoEnlace(nuevoNodo);
        }
        nodoAcceso = nuevoNodo;
    }
    
    @Override
    public String toString(){
        StringBuilder formato = new StringBuilder();
        Nodo<E> aux;
        if(nodoAcceso != null){
            aux = nodoAcceso.getNodoEnlace();
            do{
                formato.append(aux.getDato().toString());
                formato.append("\t");
                aux = aux.getNodoEnlace();
            }while(!aux.equals(nodoAcceso.getNodoEnlace()));
        }else{
            formato.append("Lista Circular Vacía!");
        }
        return formato.toString();
    }
}
