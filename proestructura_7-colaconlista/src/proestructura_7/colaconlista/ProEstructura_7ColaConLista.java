/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_7.colaconlista;

import javax.swing.JOptionPane;

/**
 *
 * @author Klac
 */
public class ProEstructura_7ColaConLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaLista cola = new ColaLista();
        
        while(true){
            try{
                int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Elemento"));
                cola.insertar(new Nodo(dato));
            }catch(NumberFormatException ex){
                break;
            }
        }
        
        if(mostrar("Desea Imprimir Cola?")){
            JOptionPane.showMessageDialog(null, imprimir(cola));
        }
        
    }
    
    public static boolean  mostrar(String ms){
        return JOptionPane.showConfirmDialog(null, ms) == JOptionPane.YES_OPTION;
    }
    
    public static String imprimir(ColaLista cola){
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (true) {            
            try{
                Nodo aux = cola.quitar();
                sb.append((i++));
                sb.append("  :  ");
                sb.append(aux);
                sb.append("\n");
            }catch(RuntimeException ex){
                break;
            }
        }
        return sb.toString();
    }
}
