/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_1.listas;

/**
 *
 * @author Klac
 */
public class Nodo{
    
    private int dato;
    private Nodo nodoSiguiente;
    private Nodo nodoAnterior;

    public Nodo(Integer dato) {
        this(dato , null, null);
    }

    public Nodo(Integer dato, Nodo nodoAnterior, Nodo nodoSiguiente) {
        this.dato = dato;
        this.nodoSiguiente = nodoSiguiente;
        this.nodoAnterior = nodoAnterior;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
}
