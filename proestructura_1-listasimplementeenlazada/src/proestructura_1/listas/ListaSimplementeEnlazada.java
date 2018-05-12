/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_1.listas;

import java.util.Formatter;

/**
 *
 * @author Klac
 */
public class ListaSimplementeEnlazada {
    
    /**
     * Una lista simplemente enlazada es una coleccion de elementos u objetos de cualquier tipo que originalmente se encuentra vacia, no necesariamente
     * almacenados consecutivamente en memoria que durante la ejecucion del programa puede crecer o decreser segun sera necesario, a diferencia del array
     * que tienen tamaños fijos, una lista su tamaño varia deacuerdo a cantidad de elementos que contenga. el acceso a una lista es secuencial por lo que
     * es necesario conocer el primer nodo de la lista.
     */
    
    /**
     *  Primer nodo de la Lista
     */
    private Nodo primerNodo;
    
    /**
     * Constructor por defecto inicializa el primer nodo a null
     */
    public ListaSimplementeEnlazada(){
        primerNodo = null;
    }

    /**
     * Constructor parametrizado que recibe una referencia al primer nodo
     * 
     * @param primerNodo referecia al primer nodo de la lista
     */
    public ListaSimplementeEnlazada(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }
    
    public Nodo getPrimerNodo(){
        return primerNodo;
    }
    
    public void setPrimerNodo(Nodo primero){
        this.primerNodo = primero;
    }
    
    public ListaSimplementeEnlazada sacarPares(){
        ListaSimplementeEnlazada aux = new ListaSimplementeEnlazada();
        int i = 1;
        
        Nodo nodoaux = primerNodo;
        while(nodoaux != null){
            
            if((i%2)==0){
                aux.añadirAlFinal(nodoaux.obtenerDato());
            }
            i++;
            nodoaux = nodoaux.obtenerNodoSiguiente();
        }
        return aux;
    }
    
    /**
     * añade un nuevo nodo al final de la lista de enlace simple
     *
     * @param dato dato a añadir
     */
    public void añadirAlFinal(int dato){
//      si el primer nodo es null, significa que la lista esta vacia, esto ocurre cuando se instancia un objeto de la clase
//      ListaSimplementeEnlazada usado el constructor por defecto y no haber agregado aun ningun nodo a la misma
        if(primerNodo == null){
            primerNodo = new Nodo(dato);
//          esteblece el dato y el nodo siguiente del primer nodo es null, osea que solo hay una elemento en la lista, el primeroNodo
            return;// nos sacara del metodo prematuramente
        }
//        si el primer nodo el diferente de null estas lineas se ejecutaran, lo cual significa que por lo menos hay un elemento en la lista
        
        Nodo nuevoNodo = new Nodo(dato);// se crea un nuevo nodo con el dato pasado por parametro en el metodo, el constructor utilizado para
//      instanciar este nuevo nodo, establece su atributo de nodo siguiente a null
        
        Nodo auxiliar = primerNodo; //utilizamos un Nodo auxiliar  y le asinamos el primerNodo
        
        while(auxiliar.obtenerNodoSiguiente() != null){
//          recorremos la lista mientras el nodo siguiente sea diferente de null
            auxiliar = auxiliar.obtenerNodoSiguiente();
            
        }
//      luego despues de habermos posicionado en el ultimo nodo de la lista, el cual el atributo del nodo siguiente es null,
//      entonces a ese mismo nodo le asignamos en nuevo nodo creado
        auxiliar.establecerNodoSiguiente(nuevoNodo);
    }
    
    public void añadirAlPrincipio(int dato){
//      creamos un nuevo nodo con el nuevo dato, pero esta ves la referencia al nodo siguiente sera el primerNodo
        Nodo nuevoNodo = new Nodo(dato , primerNodo);
//      y el primer nuevo nodo sera el nodo creado.
        primerNodo = nuevoNodo;
    }
    
    public Nodo buscarNodo(int dato){
        if(primerNodo == null) throw new ListaVaciaException("La lista se encuentra vacia");
        
        Nodo aux= primerNodo;
        
        while(aux !=null){
            if(aux.obtenerDato() == (dato)) return aux;
            aux = aux.obtenerNodoSiguiente();
        }
        
        return null;
    }
    
    public boolean eliminarNodo(int dato){
        if(primerNodo == null) throw new ListaVaciaException("La lista se encuentra vacia");
        
        Nodo nodoActual = primerNodo , nodoAnterior = null;
        
        while(nodoActual != null && !(nodoActual.obtenerDato()==(dato))){
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.obtenerNodoSiguiente();
        }
        
        if(nodoActual != null){
            
                        
            if(nodoAnterior == null){//si se cumple es porque el nodo nodoActual es el primero
                primerNodo = nodoActual.obtenerNodoSiguiente();//
                return true;
            }
            
            if(nodoAnterior != null){
                nodoAnterior.establecerNodoSiguiente(nodoActual.obtenerNodoSiguiente());
                return true;
            }
        }
        return false;
    }
    
    public void eliminarNodoRepetidos(){
        if(primerNodo == null) throw new ListaVaciaException("La lista se encuentra vacia");
        
        Nodo auxNodo = primerNodo;
        
        while(auxNodo != null){
            eliminarNodoRepetido(auxNodo.obtenerDato());
            auxNodo = auxNodo.obtenerNodoSiguiente();
        }
    }
    
    public void eliminarNodoRepetido(int dato){
        Nodo auxNodo = primerNodo;
        int cont = 0;
        while(auxNodo != null){
           if(auxNodo.obtenerDato() == dato){
               cont++;
           }
           auxNodo = auxNodo.obtenerNodoSiguiente();
        }
        
        auxNodo = primerNodo;
        
        if(cont < 2) return;
        
        while(auxNodo != null){
           if(auxNodo.obtenerDato() == dato){
               eliminarNodo(dato);
           } 
            auxNodo = auxNodo.obtenerNodoSiguiente();
        }
    }
    
    public ListaSimplementeEnlazada ordenarMenorToMayor(){
        ListaSimplementeEnlazada auxLista = new ListaSimplementeEnlazada();
        
        if(primerNodo == null){//comprobamos que la list tenga elementos,para poder ordenarla.
            throw new ListaVaciaException("Operacion invalida por que la lista esta vacía");
        }
        
        Nodo nodoAux  = primerNodo;
        
        
        while(nodoAux != null){
 
            Nodo nuevo = new Nodo(nodoAux.obtenerDato());
              
            if(auxLista.primerNodo == null){
                
                auxLista.primerNodo = nuevo;
                
            }else if(nodoAux.obtenerDato()  < auxLista.primerNodo.obtenerDato()){
                
                nuevo.establecerNodoSiguiente(auxLista.primerNodo);
                auxLista.primerNodo = nuevo;
                
            }else{
                Nodo predecesor, aux2;
                predecesor = aux2 = auxLista.primerNodo;
                
                while((aux2.obtenerNodoSiguiente() != null) && (nodoAux.obtenerDato() > aux2.obtenerDato())){
                    predecesor = aux2;
                    aux2 = aux2.obtenerNodoSiguiente();
                }
                if(nodoAux.obtenerDato() > aux2.obtenerDato()){
                    predecesor = aux2;
                }
                nuevo.establecerNodoSiguiente(predecesor.obtenerNodoSiguiente());
                predecesor.establecerNodoSiguiente(nuevo);
                
            }
            nodoAux = nodoAux.obtenerNodoSiguiente();
            
        }

        return auxLista;
    }
    
    public ListaSimplementeEnlazada ordenarMayorToMenor(){
        if(primerNodo == null){
            throw new ListaVaciaException("Operacion invalida porque la lista se encuentra vacía");
        }
        
        ListaSimplementeEnlazada auxLista = new ListaSimplementeEnlazada();
        
        Nodo nodoAux = primerNodo;
        
        while(nodoAux != null){
            
            Nodo nuevo = new Nodo(nodoAux.obtenerDato());
            
            if(auxLista.primerNodo == null){
                auxLista.primerNodo = nuevo;
            }else if(nodoAux.obtenerDato() > auxLista.primerNodo.obtenerDato()){
                nuevo.establecerNodoSiguiente(auxLista.primerNodo);
                auxLista.primerNodo = nuevo;
            }else{
                Nodo siguiente, aux2;
                siguiente = aux2 = auxLista.primerNodo;
                
                while((aux2.obtenerNodoSiguiente() != null) && (nodoAux.obtenerDato() < aux2.obtenerDato())){
                    siguiente = aux2;
                    aux2 = aux2.obtenerNodoSiguiente();
                }
                if(nodoAux.obtenerDato() < aux2.obtenerDato()){
                    siguiente = aux2;
                }
                nuevo.establecerNodoSiguiente(siguiente.obtenerNodoSiguiente());
                siguiente.establecerNodoSiguiente(nuevo);
            }
            
            nodoAux = nodoAux.obtenerNodoSiguiente();
        }
        
        return auxLista;
    }
    
    @Override
    public String toString(){
        if(primerNodo == null) throw new ListaVaciaException("La lista se encuentra vacia");
        Formatter formato = new Formatter();
        Nodo aux = primerNodo;
        while(aux != null){
            formato.format("%s \t",aux.obtenerDato());
            aux = aux.obtenerNodoSiguiente();
        }
        return formato.toString()+"\n";
    }
}
