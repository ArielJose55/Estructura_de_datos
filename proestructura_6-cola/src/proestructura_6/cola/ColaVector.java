/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_6.cola;

/**
 *
 * @author Klac
 */
public class ColaVector {
    
    //una cola es una estructura de datos en la que para insertar elementos en ella solo se hace al final de la misma, y para quitar solo se se hace
    // al comienzo de ella.
    
    private int frente;
    private int fin;
    private Object []vector;
    private final int MAXIMO;
    
    public ColaVector(int tamaño){
        this.MAXIMO = tamaño;
        frente = 0;
        fin = -1;
        vector = new Object[MAXIMO];
    }
    
    public void insertar(Object dato){
        if(!colaLlena()){
            vector[frente++] = dato;
        }else{
            throw new RuntimeException("Cola llena");
        }
    }
    
    public Object quitar(){
        if(!colaVacia()){
            return vector[fin++];
        }
        
        throw new RuntimeException("Cola Vacia");
    }
    
    public boolean colaVacia(){
        return frente > fin;
    }
    
    public boolean colaLlena(){
        return fin == MAXIMO-1;
    }
    
}
