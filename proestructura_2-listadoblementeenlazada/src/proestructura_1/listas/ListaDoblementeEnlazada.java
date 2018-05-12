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
public class ListaDoblementeEnlazada {
    
    private Nodo primerNodo;

    public ListaDoblementeEnlazada() {
        primerNodo = null;
    }

    public ListaDoblementeEnlazada(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }
    
    public void añadirAlPrincipio(Integer dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setNodoSiguiente(primerNodo);
        if(primerNodo != null) primerNodo.setNodoAnterior(nuevoNodo);
        primerNodo = nuevoNodo;
    }
    
    public void anadirAlFinal(Integer dato){
        if(primerNodo == null){
            primerNodo = new Nodo(dato);
            return;
        }
        Nodo nuevoNodo =  new Nodo(dato);
        Nodo auxiliar = primerNodo;
        while(auxiliar.getNodoSiguiente() != null){
            auxiliar = auxiliar.getNodoSiguiente();
        }
        nuevoNodo.setNodoAnterior(auxiliar);
        auxiliar.setNodoSiguiente(nuevoNodo);
    }
    
    public void añadirDespuesDe(Nodo anterior , Integer dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setNodoSiguiente(anterior.getNodoSiguiente());
        if(anterior.getNodoSiguiente() != null){
            anterior.getNodoSiguiente().setNodoAnterior(nuevoNodo);
        }
        anterior.setNodoSiguiente(nuevoNodo);
        nuevoNodo.setNodoAnterior(anterior);
    }
    
    public void añadirAntesDe(Nodo siguiente , Integer dato){
        
    }
    
    public void insertarEnoOrden(){
        if(primerNodo == null) return;
        
        
        ListaDoblementeEnlazada listaaux = new ListaDoblementeEnlazada();
        
        Nodo nodoite = primerNodo;
        
        while(nodoite != null){
            
            Nodo nuevo = new Nodo(nodoite.getDato());
            
            if(listaaux.primerNodo == null){
                listaaux.primerNodo = nuevo;
            }else if(listaaux.primerNodo.getDato() > nodoite.getDato()){
                nuevo.setNodoSiguiente(listaaux.primerNodo);
                listaaux.primerNodo = nuevo;
            }else{
                Nodo anterior, aux;
                anterior = aux = listaaux.primerNodo;
                
                while((aux.getNodoSiguiente() != null)&&(nodoite.getDato() > aux.getDato())){
                    anterior = aux;
                    aux = aux.getNodoSiguiente();
                }
                if(nodoite.getDato() > aux.getDato()){
                    anterior = aux;
                }
                nuevo.setNodoSiguiente(anterior.getNodoSiguiente());
                anterior.setNodoSiguiente(nuevo);
            }
            
            nodoite = nodoite.getNodoSiguiente();
        }
        
        nodoite = listaaux.primerNodo;
        
        while(nodoite != null){
            añadirAlPrincipio(nodoite.getDato());
            nodoite = nodoite.getNodoSiguiente();
        }
    }
    
    
    public String toString(){
        Formatter formato = new Formatter();
        Nodo aux = primerNodo;
        while(aux != null){
            formato.format("%s \t",aux.getDato() );
            aux = aux.getNodoSiguiente();
        }
        return formato.toString()+"\n";
    }
}
