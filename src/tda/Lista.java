
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
}
