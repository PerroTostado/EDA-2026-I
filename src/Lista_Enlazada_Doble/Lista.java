
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
    
    public void insertarPosicion( int dato, int index){
        
        //Validación
        if(index < 0 || index > tamaño){
            System.out.println("Dato inválido...");
            return;
        }else if(index == 0){
            insertarInicial(dato);
        }else if (index == tamaño){
            insertarFinal(dato);
        }
        
        Nodo nuevo = new Nodo(dato);
        Nodo actual = this.cabeza;
        
        //Posicionarse al nodo anterior donde se quiere agregar
        for(int i = 0; i < index-1; i++){
            actual = actual.siguiente;
        }
        
        nuevo.siguiente = actual.siguiente;
        nuevo.anterior = actual;
        actual.siguiente.anterior = nuevo;
        actual.siguiente = nuevo;
        
        tamaño++;
    }
    
    public void eliminarInicial(){
        if (cabeza == null){
            System.out.println("La lista está vacía.");
            return;
        }
        
        //Solo hay un nodo
        if(cabeza == cola){
            cabeza = null;
            cola = null;
            return;
        }else{
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
        }
        tamaño--;
    }
    
    public void eliminarFinal(){
        if (cabeza == null){
            System.out.println("La lista está vacía.");
            return;
        }
        //Solo hay un nodo
        if(cabeza == cola){
            cabeza = null;
            cola = null;
            return;
        }else{
            cola = cola.anterior;
            cola.siguiente = null;
        }
        tamaño--;
    }
    
    public void eliminarPosicion(int index){
        if (cabeza == null){
            System.out.println("La lista está vacía.");
            return;
        }
        if (index < 0 || index >= tamaño){
            System.out.println("Índice fuera de rango.");
            return;
        }
        if (index == 0){
            eliminarInicial();
            return;
        }
        if(index == tamaño-1){
            eliminarFinal();
            return;
        }
        
        Nodo actual = cabeza;
        
        //Recorrer la lista hasta la posición 
        for(int i = 0; i<index; i++){
            actual = actual.siguiente;
        }
        
        //Reconectar los nodos anterior y siguiente
        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;
        
        tamaño--;
    }
    
    public int buscarValor(int dato){
        if (cabeza == null){
            System.out.println("La lista está vacía.");
            return -1;
        }
        
        Nodo actual = cabeza;
        int posicion = 0;
        
        while(actual != null){
            if(actual.dato == dato){
                System.out.println("Dato: "+dato+" encontrado en Posición: "+ posicion);
                return posicion;
            }
            actual = actual.siguiente;
            posicion++;
        }
        
        System.out.println("Dato: "+dato+" no encontrado en la lista...");
        return -1;
    }
}
