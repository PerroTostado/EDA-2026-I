
package Colas;

public class Cola {
    private Nodo inicio;
    private Nodo fin;
    private int tamaño;
    
    public Cola(){
        inicio = fin = null;
        tamaño = 0;
    }
    
    public int size(){
        return this.tamaño;
    }
    
    public boolean isEmpty(){
        if(tamaño > 0){
            return false;
        }else{
            return true;
        }
    }
    
    public void enqueue(int dato){
        Nodo nuevo = new Nodo(dato);
        
        if(isEmpty()){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamaño++;
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("No hay elementos para sacar de la cola....");
        }
        Nodo aux = inicio;
        inicio = inicio.siguiente;
        aux.siguiente = null;
        tamaño--;
        return aux.dato;
    }
    
    public int peek(){
        if (isEmpty()){
            System.out.println("La pila está vacía.");
            return-1;
        }
        System.out.println("Cima de la cola: " + inicio.dato);
        return inicio.dato;
    }
    
    public void eliminarCola(){
        while(!isEmpty()){
            dequeue();
        }
    }
    
    //DEBUG
    public void imprimir(){
        Nodo actual = this.inicio;
        while(actual != null){
            System.out.print(actual.dato + "-");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
