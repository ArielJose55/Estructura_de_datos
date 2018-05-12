/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_11.arboles2;

/**
 *
 * @author Klac
 */
public class Nodo<E> implements Comparable<E>{

    private E dato;
    private Nodo<E> nodoIzquierdo;
    private Nodo<E> nodoDerecho;

    public Nodo(E dato) {
        this(dato, null, null);
    }

    public Nodo(E dato, Nodo<E> nodoIzquierdo, Nodo<E> nodoDerecho) {
        this.dato = dato;
        this.nodoIzquierdo = nodoIzquierdo;
        this.nodoDerecho = nodoDerecho;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo<E> getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo<E> nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Nodo<E> getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo<E> nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }  

    public void insertar( E dato){
        if( this.compareTo(dato) > 0 ){
            
            if(getNodoIzquierdo() == null){
                setNodoIzquierdo(new Nodo<>(dato));
            }else{
                getNodoIzquierdo().insertar(dato);
            }
            
        }else if( this.compareTo(dato) < 0 ){
            
            if(getNodoDerecho() == null){
                setNodoDerecho(new Nodo<>(dato));
            }else{
                getNodoDerecho().insertar(dato);
            }
            
        }
    }
    
    @Override
    public String toString() {
        return dato.toString();
    }
      
    @Override
    public int compareTo(E o) {
        if(o.equals(this.dato)) return 0;
        return o.toString().compareTo(this.toString());
    }
     
}
