/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_9;

import java.util.Formatter;

/**
 *
 * @author Klac
 */
public class ColaLista<E> {
    
    Nodo<E> primero;
    private int prioridad;

    public ColaLista() {
        this.primero = null;
    }
    
    public ColaLista(int prioridad){
        this.primero = null;
        this.prioridad = prioridad;
    }
    
    public ColaLista(int prioridad, E dato){
        this.primero = new Nodo<>(dato);
        this.prioridad = prioridad;
    }
    
    public int getPrioridad(){
        return prioridad;
    }
    
    public void pusp(E dato){
        if(primero == null){
            primero = new Nodo<>(dato);
        }
        Nodo<E> iterador = primero;
        Nodo<E> nuevo = new Nodo<>(dato);
        
        while(iterador.getSiguiente() != null){
            iterador = iterador.getSiguiente();
        }
        iterador.setSiguiente(nuevo);
    }
    
    public Nodo<E> pop(){
        if(colaVacia()){
            throw new RuntimeException("Pila Vacia");
        }
        Nodo<E> quitar = primero;
        primero = primero.getSiguiente();
        return quitar;
    }
    
    public boolean colaVacia(){
        return primero == null;
    }
    
    @Override
    public String toString(){
        if(colaVacia())
            return "Cola Vacia";
            
        Formatter formato = new Formatter();
        formato.format("\nCOLA CON PRIORIDAD %d\n",prioridad);
        formato.format("%s\t%s\n","index","Dato");
        formato.flush();
        
        Nodo<E> iterador = primero;
        
        int cont = 1;
        
        while(iterador != null){
            
            formato.format("%d\t%s\n", cont,iterador.toString());
            
            iterador = iterador.getSiguiente();
            cont++;
        }
        return formato.toString();
    }
}
