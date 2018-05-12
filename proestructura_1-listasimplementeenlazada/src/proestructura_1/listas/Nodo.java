/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_1.listas;

/**
 * 
 * @author Ariel Jose Arnedo
 */
public class Nodo {
   /*
    * Un nodo es un elemento de una lista, que es este ejemplo hara parte de una lista simplemente enlazada
    * este consta de dos partes, en una almacena la informacion del nodo, la cual puede ser una instancia o una referencia a un objeto,
    * y la otra es una referencia a objeto de la clase Nodo, que contendra el Nodo siguiente de la lista de enlace simple, es importante
    * saber que la clasificacion de las listas, esta reguida por la disposicion de esta segunda parte del Nodo, es decir,
    * las referencias a  objetos de la clase Nodo, a pesar de que en una lista simplemente enlazada solo hay un a referencia a un nodo siguiente,
    * en otros tipos de lista puede haber dos referencias uno a un Nodo anterior y otra a un nodo siquiente.
    */ 
    
    /*
     * se declaran dos atributos que representan la parte de almacenamiento de la informacion del nodo y la referencia a nodo siguiente
     */
    
    /**
     *  Atributo que representa la informacion del nodo
     */
    private int dato;
    
    /**
     * Atributo que representa una referencia el nodo siguiente
     */
    private Nodo nodoSiguiente;

    /**
     * constructor que recibe por parametro un objeto que representa el dato del nodo
     * 
     * @param dato dato del nodo
     */
    public Nodo(int dato) {
        this(dato,null);
    }
    
    /**
     * constructor que recibe por parametro un objeto que representa el dato del nodo y la referencia al nodo siguiente
     * 
     * @param dato dato del nodo
     * @param nodoSiguiente una referencia del nodo siqguiente
     */
    public Nodo(int dato, Nodo nodoSiguiente) {
        this.dato = dato;
        this.nodoSiguiente = nodoSiguiente;
    }
    
    /**
     * establece el objeto que representa la informacion del nodo
     * 
     * @param dato dato del nodo
     */
    public void establecerDato(int dato){
        this.dato = dato;
    }
    
    /**
     * obtiene el objeto que representa la informacion del nodo
     * 
     * @return dato del nodo
     */
    public int obtenerDato(){
        return dato;
    }
    
    /**
     * establece la referencia al nodo siguiente
     * 
     * @param nodoSiguiente nodo siguiente
     */
    public void establecerNodoSiguiente(Nodo nodoSiguiente){
        this.nodoSiguiente = nodoSiguiente;
    }
    
    /**
     * obtiene la referencia del nodo siguiente
     * 
     * @return nodo siguiente
     */
    public Nodo obtenerNodoSiguiente(){
        return nodoSiguiente;
    }
    
}
