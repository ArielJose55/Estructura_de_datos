
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_4.pila;

/**
 *
 * @author Klac
 */
public class ProEstructura_4Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaVector <Integer> pila = new PilaVector<>(5);
        
        System.out.println("Pila Creada");
        
        
        pila.pusp(122);
        
        pila.pusp(22);
        
        pila.pusp(33);
        
        pila.pusp(23);
        
        pila.pusp(44);
        
        System.out.println(pila.toString());
        
        System.out.println(pila.ordenarPilaMayorToMenor().toString());
        
        System.out.println(pila.toString());
    }
}
