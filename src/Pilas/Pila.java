
package Pilas;

public class Pila {
    private Nodo cima;
    private int tamaño;

    public Pila() {
        cima = null;
        tamaño = 0;
    }
    
    public int size(){
        return this.tamaño;
    }
    
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }
    
    public void pop(){
        if (cima == null){
            System.out.println("La pila está vacía.");
            return;
        }
        cima = cima.siguiente;
        tamaño--;
    }
    
    public int peek(){
        if (cima == null){
            System.out.println("La pila está vacía.");
            return-1;
        }
        System.out.println("Cima de la pila: " + cima.dato);
        return cima.dato;
    }
    
    public boolean isEmpty(){
        if(tamaño > 0){
            return false;
        }else{
            return true;
        }
    }
    
    public void eliminarPila(){
        while(!isEmpty()){
            pop();
        }
    }
    
    
    //Debug
    public void imprimir(){
        Nodo actual = this.cima;
        while(actual != null){
            System.out.print(actual.dato + "->");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
