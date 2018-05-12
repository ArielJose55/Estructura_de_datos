/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_9;

/**
 *
 * @author Klac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaPrioridadLista<Integer> colaPrioridad = new ColaPrioridadLista<>();
        
        colaPrioridad.insertarPrioridad(0,99);
        colaPrioridad.insertarPrioridad(0, 100);
        colaPrioridad.insertarPrioridad(0, 112);
        
        colaPrioridad.implimirCola(0);
    }
}
