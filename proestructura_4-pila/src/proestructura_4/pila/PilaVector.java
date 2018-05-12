/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_4.pila;

import java.util.Arrays;
import java.util.Formatter;



/**
 *
 * Una pila es una lista lineal en la que todas las inserciones y supresiones se hacen en un extremo de la lista.
 * un ejemplo cotidiano del funcionamiento de un pila son una pila de platos de cocin. en ella el añadir o quitar platos
 * se hace siempre por la parte superior de la pila. Este tipo de pila se conoce como el nombre de LIFO(last in fist out)
 * ultimo en entrar, primero en salir
 * 
 * @author Klac
 */
public class PilaVector<integer> {
    
//    -----------------------CONCEPTO----------------------------------------------------------------------------------------------------
//    Una pila es una estructura de dato de entradas ordenadas que solo se puede introducir y eliminar por un extremo, llamado cima.
//    -----------------------------------------------------------------------------------------------------------------------------------
    
//    Operaciones   : Inicia pila.
//    Crear pila    : Pone un dato en la pila.
//    Insetar (pusp): Inserta un dato en la cima de la pila.
//    Quitar (pop)  : Retita un dato de la pila de la cima.
//    PilaVector vacía    : Comprueba si la pila esta vacia.
//    PilaVector llena    : Comprueba si la pila esta llena. 
//    Limpiar pila  : Elimina los datos de la pila.
//    Cima de pila  : Obtiene el dato de la cima.
//    Tamaño de pila: Obtiene el tamaño de la pila.

//    Insertar:
//    1. verificar si la pila no esta llena.
//    2. incrementar en 1 el puntero del indice de la pila.
//    3. almacenar el dato en la posicion del indice de la pila.
    
//    Quitar:
//    1. verificar si la pila no esta vacía.
//    2. Leer o obtener el dato del indice de la pila.
//    3. decrementat en 1 el puntero del indice de la pila.
    
    
//    Existen dos maneras de implementat una pila, la primera es utilizando vectores o arrays y la otra usando un lista linaal.
    
//    IMPLEMENTACION CON ARRAYS
    
//    se requiera un arrays y una variable numerica que apunte al ultimo dato colocado.
//    en esta implementacion es importante tener en cuenta de no exceder el tamaño de la pila.
    
    
    
   
    private Integer[] vector;
    private int index;
    
    public PilaVector(final int tamaño){
        vector = new Integer[tamaño];
        index = -1;
    }
    
    
    public void pusp(Integer dato){
        if(vector.length - 1 == index){
            throw new RuntimeException("Pila llena");
        }
        
        vector[++index] = dato;
    }
    
    public Integer pop(){
        if(IsEmply()){
            throw new RuntimeException("Pila vacia");
        }
            
        return (Integer) vector[index--];
    }
    
    public PilaVector<Integer> ordenarPilaMayorToMenor(){
        PilaVector<Integer> resultado;
        resultado = new PilaVector<>(index+1);
        
        Integer[] auxVector = Arrays.copyOfRange(vector, 0, index+1);
        
        for(int i = 0; i < auxVector.length ; i++){
            for(int j = i ; j < auxVector.length ; j++){
                if(auxVector[i] > auxVector[j]){
                    int aux = auxVector[j];
                    auxVector[j] = auxVector[i];
                    auxVector[i] = aux;
                }
            }
            resultado.pusp(auxVector[i]);
        }
        return resultado;
    }
    
    public boolean IsEmply(){
        if(index < 0)
            return true;
        return false;
    }
    
    public String toString(){
        Formatter formato = new Formatter();
        for(int i = 0; i < index + 1; i++){
            formato.format("%d  ", vector[i]);
        }
        return formato.toString()+"\n";
    }
}
