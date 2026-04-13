
package Lista_Enlazada_simple;

public class Lista {
    private Nodo cabeza;
    private int tamaño;

    public Lista(){
        this.cabeza = null;
        this.tamaño = 0;
    }

    public int getTamaño(){
        return this.tamaño;
    }
    
    public void agregarInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamaño++;
    }

    public void agregarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        if (this.cabeza == null){
            this.cabeza = nuevo;
            tamaño++;
            return;
        }
        Nodo actual = this.cabeza;
        while(actual.siguiente != null){
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
        tamaño++;
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
            tamaño++;
            return;
        }
        Nodo anterior = null;
        Nodo actual = this.cabeza;
        for(int i = 0; i < indice; i++){
            anterior = actual;
            actual = actual.siguiente;
        }
        nuevo.siguiente = actual;
        anterior.siguiente = nuevo;
        tamaño++;
    }

    public void eliminarInicio(){
        if (cabeza == null){
            System.out.println("La lista está vacía.");
            return;
        }
        cabeza = cabeza.siguiente;
        tamaño--;
    }

    public void eliminarFinal(){
        if (cabeza == null){
            System.out.println("La lista está vacía.");
            return;
        }
        // Solo hay un nodo
        if (cabeza.siguiente == null){
            cabeza = null;
            tamaño--;
            return;
        }
        
        //Si hay más nodos
        Nodo actual = this.cabeza;
        while(actual.siguiente.siguiente != null){
            actual = actual.siguiente;
        }
        actual.siguiente = null;
        tamaño--;
    }

    public void eliminarPosicion(int indice){
        if (cabeza == null){
            System.out.println("La lista está vacía.");
            return;
        }
        if (indice < 0 || indice >= tamaño){
            System.out.println("Índice fuera de rango.");
            return;
        }
        if (indice == 0){
            eliminarInicio();
            return;
        }
        Nodo anterior = null;
        Nodo actual = this.cabeza;
        for(int i = 0; i < indice; i++){
            anterior = actual;
            actual = actual.siguiente;
        }
        anterior.siguiente = actual.siguiente;
        tamaño--;
    }
    
    /**
        Como la lista está ordenada, los duplicados siempre
        están juntos, así que solo necesitamos comparar
        cada nodo con el nodo siguiente.
    */
   public void eliminarDuplicado() {

       // Si la lista está vacía no hay nada que hacer
       if (cabeza == null) {
           System.out.println("La lista está vacía.");
           return;
       }

       Nodo actual = cabeza;

       // Recorremos la lista mientras haya un nodo siguiente
       while (actual.siguiente != null) {

           // Comparamos el dato del nodo actual con el del siguiente
           if (actual.dato == actual.siguiente.dato) {

               // ¡Duplicado encontrado!
               // "Saltamos" el nodo siguiente apuntando
               // directamente al nodo que está después de él.
               actual.siguiente = actual.siguiente.siguiente;

               // Reducimos el tamaño de la lista
               tamaño--;

           } else {

               // Si no son iguales, simplemente avanzamos
               // al siguiente nodo y seguimos comparando
               actual = actual.siguiente;
           }
       }
   }
}