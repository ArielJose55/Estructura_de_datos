/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proestructura_12.grafo;

/**
 *
 * @author Klac
 */
public class Nodo {
 
    private int numVertices;
    private String nombre;

    public Nodo(String nombre){ 
        this(0, nombre);
    }

    public Nodo(int numVertices, String nombre) {
        this.numVertices = numVertices;
        this.nombre = nombre;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
