
package Lista_Enlazada_Doble;

public class Lista {
    
    private Nodo cabeza, cola;
    private int dato;
    private int tamaño;
    
    public Lista(){
        this.cabeza = null;
        this.cola = null;
        this.tamaño = 0;
    }
    
    public int getTamaño(){
        return this.tamaño;
    }
    
    public void imprimir(){
        Nodo actual = this.cabeza;
        
        //ADELANTE
        System.out.println("Adelante: ");
        System.out.print("null");
        
        while(actual != null){
            System.out.print("<->" + actual.dato);
            actual = actual.siguiente;
        }
        System.out.println("-> null");
        
        //ATRAS
        System.out.println("Atras: ");
        System.out.print("null");
        
        actual = this.cola;
        while(actual != null){
            System.out.print("<->" + actual.dato);
            actual = actual.anterior;
        }
        System.out.println("<- null");
    }
    
    public void insertarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        
        //Si está vacia
        if (this.cabeza == null){
            this.cabeza = nuevo;
            this.cola = nuevo;
        }else{
            //Si hay elementos
            this.cola.siguiente = nuevo;
            nuevo.anterior = cola;
            this.cola = nuevo;
        }
        tamaño++;
    }
    
    public void insertarInicial(int dato){
        Nodo nuevo = new Nodo(dato);
        
        //Si está vacia
        if(this.cabeza == null){
            this.cabeza = nuevo;
            this.cola = nuevo;
        }else{
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        tamaño++;
    }
}
