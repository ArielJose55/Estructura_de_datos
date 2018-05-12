/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_1.listas;

/**
 * 
 * @author Ariel Jose Arnedo
 */


public class Prueba_ClassMain {
    
    public static void main (String args[]){
        
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
        
        lista.añadirAlFinal(10);
        System.out.println(lista.toString());
        
        lista.añadirAlPrincipio(11);
        System.out.println(lista.toString());
        
        lista.añadirAlFinal(99);
        System.out.println(lista.toString());
        
        lista.añadirAlPrincipio(100);
        System.out.println(lista.toString());
        
        lista.añadirAlFinal(1);
        System.out.println(lista.toString());
        
        lista.añadirAlFinal(1);
        System.out.println(lista.toString());
        
        lista.añadirAlPrincipio(1);
        System.out.println(lista.toString());
        
        lista.añadirAlFinal(100);
        System.out.println(lista.toString());
        
        lista.añadirAlPrincipio(99);
        System.out.println(lista.toString());
        
        lista.añadirAlFinal(5);
        System.out.println(lista.toString());
        
        lista.añadirAlFinal(10);
        System.out.println(lista.toString());
      
        lista = lista.sacarPares();
        System.out.println(lista);
    }
}
