/*}
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_5.pilaconlista;

import java.util.List;

public class PilaConLista {
    
    private Nodo primero;

    public PilaConLista() {
        primero = null;
    }
    
    public void pusp(Integer dato){
           Nodo nuevo = new Nodo(dato, primero);
           primero = nuevo; 
    }
    
    public Nodo pop(){
        if(primero == null){
            throw new RuntimeException("pila vacia");
        }
        Nodo aux= primero;
        primero = primero.getSiguiente();
        
        return aux;
    }
    public PilaConLista ordenarMayor(){
        PilaConLista lista = new PilaConLista();
        
        if(primero == null){
            throw new RuntimeException("Operacion no valido");
        }
        
        Nodo nodoite = primero;
        
        while(nodoite != null){
            
            Nodo nuevo = new Nodo(nodoite.getDato());
            
            if(lista.primero == null){
                lista.primero = nuevo;
            }else if(lista.primero.getDato() > nodoite.getDato()){
                nuevo.setSiguiente(lista.primero);
                lista.primero = nuevo;
            }else{
                Nodo anterior, aux;
                anterior = aux = lista.primero;
                
                while((aux.getSiguiente() != null)&&(nodoite.getDato() > aux.getDato())){
                    anterior = aux;
                    aux = aux.getSiguiente();
                }
                if(nodoite.getDato() > aux.getDato()){
                    anterior = aux;
                }
                
                nuevo.setSiguiente(anterior.getSiguiente());
                anterior.setSiguiente(nuevo);
            }
            
            nodoite = nodoite.getSiguiente();
        }
        
        return lista;
    }
    
    public PilaConLista ordenarMenor(){
        PilaConLista pila = new PilaConLista();
        
        if(primero == null){
            throw new RuntimeException("Operacion no valido");
        }
        
        Nodo nodoite = primero;
        
        while(nodoite != null){
            
            Nodo nuevo = new Nodo(nodoite.getDato());
            
            if(pila.primero == null){
                pila.primero = nuevo;
            }else if(pila.primero.getDato() < nodoite.getDato()){
                nuevo.setSiguiente(pila.primero);
                pila.primero = nuevo;
            }else{
                Nodo anterior, aux;
                anterior = aux = pila.primero;
                
                while((aux.getSiguiente() != null)&&(nodoite.getDato() < aux.getDato())){
                    anterior = aux;
                    aux = aux.getSiguiente();
                }
                
                if(nodoite.getDato() < aux.getDato()){
                    anterior = aux;
                }
                nuevo.setSiguiente(anterior.getSiguiente());
                anterior.setSiguiente(nuevo);
            }
            
            nodoite = nodoite.getSiguiente();
        }
        return pila;
    }
}
