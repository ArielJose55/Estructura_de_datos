/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_8;

import java.util.Formatter;

/**
 *
 * @author Ariel Jose Arnedo
 */
public class ColaLista {
    
    /**
     * 
     */
    private Nodo primero;

    /**
     * Constructor que inicializa el primer nodo en null, que siginifica que la cola esta vacía.
     */
    public ColaLista() {
        primero = null;
    }
    
    /**
     * 
     * 
     * @return retorna de primer nodo de la cola
     */
    public Nodo getCima(){
        return primero;
    }
    
    /**
     * Ingresa un dato en la ultima posición de la cola
     * 
     * @param dato dato a ingresar
     */
    public void ingresarAlUltimo(Object dato){
        //si la lista se encuentra vacía ingresa en nodo en la primera posicion
        if(estaVacia()){
            primero = new Nodo(dato);
        }
        //sino crea un nuevo nodo con la con el dato pasodo por parametro
        Nodo auxIte = primero;
        Nodo nuevo = new Nodo(dato);
        while(auxIte != null){
            auxIte = auxIte.getSiguiente();
        }
        auxIte.setSiguiente(nuevo);
    }
    
    /**
     * Retina el primer nodo de la cola
     * 
     * @return retorna el nodo que esta en la primera posicion de la cola
     */
    public Nodo retirarPrimero(){
        if(estaVacia()){
            throw new RuntimeException("Cola Vacia");
        }
        Nodo aux = primero;
        primero = primero.getSiguiente();
        return primero;
    }
    
    /**
     * 
     * @return 
     */
    public boolean estaVacia(){
        if(primero ==  null)
            return true;
        return false;
    }
    
    public String toString(){
        Formatter formato = new Formatter();
       
        if(estaVacia()){
            return "Cola vacia";
        }
        Nodo aux= primero;
        
        while(aux != null){
            formato.format(aux.toString()+"  ");
            aux = aux.getSiguiente();
        }
        
        return formato.toString();
    }
}
