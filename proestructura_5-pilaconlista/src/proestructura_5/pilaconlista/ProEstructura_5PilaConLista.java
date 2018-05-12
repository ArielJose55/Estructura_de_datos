/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_5.pilaconlista;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Klac
 */
public class ProEstructura_5PilaConLista {

    
    public static void main(String[] args) {
        PilaConLista pila = new PilaConLista();
        Random ram = new Random();
     
        if(mostrar("Pila Creada ¿Desea Llenarla?")){
            for(int i = 1; i<=10 ;i++){
                int valor = ram.nextInt(10);
                System.out.println("valor a añadir es :" + valor);
                pila.pusp(valor);
            }
        }
        
        
        
        if(mostrar("¿Desea Ordenar la pila de menor a mayor?")){
            pila = pila.ordenarMayor();
            imprimir(pila);
        }
        
        if(mostrar("¿Desea Ordenar la pila de mayor a menor?")){
            pila = pila.ordenarMenor();
            imprimir(pila);
        }
        
    }
    public static boolean mostrar(String valor){
        int option = JOptionPane.showConfirmDialog(null, valor);
        return option == JOptionPane.YES_OPTION;
    }
    public static void imprimir(PilaConLista pila){
        if(mostrar("¿Mostrar Pil Ordenada?")){
            StringBuilder sb = new StringBuilder();
            int i = 1;
            while(true){
                try{
                    sb.append((i++));
                    sb.append(" : ");
                    sb.append(pila.pop());
                    sb.append("\n");
                }catch(RuntimeException ex){
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
}
