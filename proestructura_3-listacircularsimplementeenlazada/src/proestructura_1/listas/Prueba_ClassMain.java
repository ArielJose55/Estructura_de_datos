/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_1.listas;

/**
 *
 * @author Klac
 */
public class Prueba_ClassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircularSimplementeEnlazada<Integer> lista = new ListaCircularSimplementeEnlazada<>();
        
        System.out.println(lista+"\n");
        lista.añadir(10);
        System.out.println(lista+"\n");
        lista.añadir(100);
        System.out.println(lista+"\n");
        lista.añadir(99);
        System.out.println(lista+"\n");
        lista.añadir(33);
        System.out.println(lista+"\n");
    }
}
