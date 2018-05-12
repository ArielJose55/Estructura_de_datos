/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proestructura_7.colaconlista;


public class ColaLista {
    
    private Nodo primero;
    private Nodo ultimo;

    public ColaLista() {
        primero = ultimo = null;
    }
    
    public void insertar(Nodo dato){
        Nodo nuevo = new Nodo(dato.getDato());
        if(primero == null){
            primero=ultimo=nuevo;
        }
        ultimo.setSeguiente(nuevo);
        ultimo = nuevo;
        
    }
    
    public Nodo quitar(){
        if(!colaVacia()){
            Nodo aux = primero;
            primero = primero.getSeguiente();
            return aux;
        }
        throw new RuntimeException("Cola Vacia");
    }
    
    public  void invertir(){
        int tamaño = contar();
        
        Nodo [] vector = new Nodo[tamaño];
        
        for(int i = 0; i < tamaño ; i++){
            vector[i] = this.quitar();
        }
        for(int i = tamaño-1; i >= 0; i--){
            this.insertar(vector[i]);
        }
    }
    
    public int contar(){
        int i = 0;
        Nodo aux = primero;
        
        while(aux != null){
            i++;
            aux = aux.getSeguiente();
        }
        return i;
    } 
    
    public boolean colaVacia(){
        return ((primero == null));
    }
}
