/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_9;

/**
 *
 * @author Klac
 */
public class ColaPrioridadLista<E> {
    
    ListaEnlazada<ColaLista<E>> listaDeColas;

    public ColaPrioridadLista() {
        listaDeColas = new ListaEnlazada<>();
    }
    
    public void insertarPrioridad(int prioriadad, E dato){
        if(listaDeColas.listaVacia()){
            listaDeColas.insertar(new ColaLista<>(prioriadad, dato));
            return;
        }
        if(prioriadad < 0)
            throw new RuntimeException("Prioridad no valida");
            
        Nodo<ColaLista<E>> aux = listaDeColas.primero;
        
        while(aux!=null){
            if(aux.getDato().getPrioridad()== prioriadad){
                aux.getDato().pusp(dato);
                return;
            }
            aux = aux.getSiguiente();
        }
        ColaLista<E> nuevaCola = new ColaLista<>(prioriadad, dato);
        listaDeColas.insertar(nuevaCola);
        
    }
    
    
    public void implimirCola(int prioridad){
        if(listaDeColas.listaVacia())
            throw new RuntimeException("Lista de colas vacia");
        
        Nodo<ColaLista<E>> aux = listaDeColas.primero;
        
        while(aux != null){
            if(aux.getDato().getPrioridad() == prioridad){
                System.out.println(aux.toString());
                break;
            }
            
            aux = aux.getSiguiente();
        }
    }
    public void implimirColaPrioridad(){
        if(listaDeColas.listaVacia())
            throw new RuntimeException("Lista de colas vacia");
        
        Nodo<ColaLista<E>> aux = listaDeColas.primero;
        
        
    }
}
