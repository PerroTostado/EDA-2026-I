
package tda;

public class Lista {
    private Nodo cabeza;
    
    public Lista(){
        this.cabeza = null;
    }
    
    public void agregarInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }
    
    public void agregarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        
        //lista vacía
        if (this.cabeza == null){
            this.cabeza = nuevo;
            return;
        }
        
        //recorrer hasta el último
        Nodo actual = this.cabeza;
        while(actual.siguiente != null){
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
    
    public void imprimir(){
        Nodo actual = this.cabeza;
        while(actual != null){
            System.out.print(actual.dato + "->");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
    public void insertarPosicion(int indice, int dato){
        Nodo nuevo = new Nodo(dato);
        if(indice == 0){    
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            return;
        }
        
        Nodo anterior = null;
        Nodo actual = this.cabeza;
        
        for(int i = 0; i < indice; i++){
            anterior = actual;
            actual =actual.siguiente;
        }
        
        nuevo.siguiente = actual;
        anterior.siguiente = nuevo;
    }
}
