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
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        Nodo nodo = new Nodo(22);
        lista.añadirAlPrincipio(11);
        System.out.println(lista);
        lista.añadirAlPrincipio(nodo.getDato());
        System.out.println(lista);
        lista.añadirAlPrincipio(33);
        System.out.println(lista);
        lista.anadirAlFinal(44);
        System.out.println(lista);
        lista.anadirAlFinal(55);
        System.out.println(lista);
        lista.insertarEnoOrden();
        System.out.println(lista);
       
    }
}
