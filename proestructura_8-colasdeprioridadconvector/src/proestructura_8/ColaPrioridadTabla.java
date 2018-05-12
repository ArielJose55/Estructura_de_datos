/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_8;

import java.util.Formatter;

/**
 *
 * Una Cola de Prioridad es una estructura de datos en los que los elementos se atiende sugun un orden indicado por la prioridad asociada a cada uno.
 * por lo tanto el termino primero en llegar, primero en ser atendido no se aplica del todo, sino que dada elemento tiene enlazado una prioridad en un
 * criterio objetivo.
 * La principal caracteristicas de las colas de prioridad es seleccionar los elementos de moyor prioridad.
 * Las operaciones elementales son:
 * 
 * Crear cola de prioridad      : Inicia la estructura de prioridades sin elementos
 * Insertar en Prioridad        : añade un elemento a la cola sugun prioridad
 * Ver Elemento Prioritario     : Devuelve el elemento de la cola con la prioridad mas alta.
 * Quitar Elemento Prioritario  : Devuelve y retira el elemento de l cola con la prioridad mas alta.
 * Cola Vacia                   : Comprueba si la cola no tiene elementos.
 * Cola Prioridad Vacia         : Comprueba si todas las colas de la estructura estan vacias.
  * 
 * @author Ariel Jose Arnedo
 */
public class ColaPrioridadTabla {
    
    /**
     * En la programacion de una cola de prioridades se ha tenido la convension de considerar un intervalo de prioridades que va desde una prioridad minima
     * a una maxima con valores en orden inverso, por ejempleo, el elemento con la prioridad mas alta tiene la clave cero, el segundo uno, y asi
     * sucesivamente, el elemento con la clave n sera el de prioridad minima.
     */
    
    /**
     * La implementacio co arrays se define como una tabla de tamaño igual al numero de prioridades, los elementos de la tabla son listas enlazadas 
     * con el comportamiento de una cola. En la Interfaz Comparator se contiene los elementos de la cola de prioridades.
     */
    
    
    private ColaLista[] tabla;
    private int maxPrioridad;

    /**
     * Constructor que inicializa el vector de colas con el tamaño definido por cantPrioridad
     * 
     * @param cantPrioridad tamaño del vector de prioridad
     */
    public ColaPrioridadTabla(int cantPrioridad) {
        
        //valida que la se inicialize el vector correctamente
        if(cantPrioridad < 0){
            throw  new RuntimeException("Tamaño invalido");
        }
        //crea la lista de colas con tamaño definido por maxPrioridad
        this.maxPrioridad = cantPrioridad;
        tabla = new ColaLista[cantPrioridad];
        
        //Iniciliza todas la colas del vector de prioridad
        for(int i = 0 ; i < cantPrioridad ; i++){
            tabla[i] = new ColaLista();
        }
    }
    
    
    /**
     * 
     * 
     * @param prioridad
     * @param dato 
     */
    public void insertarPrioridad(int prioridad, Object dato){
        
        if(prioridad < 0 || prioridad > maxPrioridad){
            throw  new RuntimeException("Prioridad fuera de rango");
        }
        
        for(int i = 0; i < maxPrioridad ; i++){
            if(i == prioridad){
                tabla[i].ingresarAlUltimo(dato);
                return;
            }
        }
    }
    
    /**
     * 
     * 
     * @param prioridad
     * @return 
     */
    public Nodo removerPrioridad(int prioridad){
        if(prioridad < 0 || prioridad > maxPrioridad){
            throw  new RuntimeException("Prioridad fuera de rango");
        }
        
        if(tabla[prioridad].estaVacia()){
            throw new RuntimeException("Cola seleccionada vacia");
        }
        
        Nodo dato = tabla[prioridad].retirarPrimero();
        
        if(tabla[prioridad].estaVacia()){
            for(int i = 0; i < maxPrioridad ;i++){
                if(i>prioridad){
                    if(tabla[i].estaVacia()){
                        continue;
                    }else{
                        tabla[prioridad].ingresarAlUltimo(tabla[i].retirarPrimero().getDato());
                        break;
                    }
                    
                }
            }
        }
        return dato;
    }
    
    public String toString(){
        Formatter formato = new Formatter();
        
        for(int i = 0; i< maxPrioridad;i++){
            formato.format(tabla[i].toString()+"\n");
        }
        
        return formato.toString();
    }
    
}
