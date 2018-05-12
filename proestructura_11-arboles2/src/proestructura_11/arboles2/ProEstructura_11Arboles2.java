/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_11.arboles2;
import java.util.Random;
/**
 *
 * @author Klac
 */
public class ProEstructura_11Arboles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario<Integer> arbol = new ArbolBinario<>(new Nodo<>(200));
        Random rd = new Random();
        
        
        
        for(int i = 0 ; i < 20 ; i++){
            arbol.insertarNodo(rd.nextInt(100));
        }
        
        
        arbol.recorrerEnInOrden();
        System.out.println("");
        System.out.println(arbol.getNodoRaizDato());
        System.out.println("");
        arbol.recorrerEnPosOrden();
        System.out.println("");
    }
}
