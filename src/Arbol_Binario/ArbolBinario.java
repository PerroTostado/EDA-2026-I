
package Arbol_Binario;

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {
    Nodo raiz;
    
    public ArbolBinario(){
        this.raiz = null;
    }
    
    //Metodo insertar de manera secuencial
    /*public void insertarNodo(int dato){
        Nodo nuevo = new Nodo(dato);
        
        if(raiz == null){
            raiz = nuevo;
            return;
        }
        
        Nodo actual = raiz;
        Nodo padre = null;
        
        while(true){
            padre = actual;
            if( dato < actual.dato){
                actual = actual.hijoIzq;
                if(actual == null){
                    padre.hijoIzq = nuevo;
                    return;
                }
            }else{
                actual = actual.hijoDer;
                if(actual == null){
                    padre.hijoDer = nuevo;
                    return;
                }
            }
        }
    }*/
    
    //Metodo insertar de manera RECURSIVA
    public void insertarNodo(int dato){
        raiz = insertarRecursivo(raiz, dato);
    }
    
    private Nodo insertarRecursivo(Nodo actual, int dato){
        //Caso base
        if(actual == null){
            return new Nodo(dato);
        }
        
        if(dato < actual.dato){
            actual.hijoIzq = insertarRecursivo(actual.hijoIzq, dato);
        }else{
            actual.hijoDer = insertarRecursivo(actual.hijoDer, dato);
        }
        
        return actual;
        
    }
    
    //DEBUG
    public void mostrarPreorden(){
        preorden(raiz);
        System.out.println();
    }
    
    private void preorden(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo.dato + " ");
            preorden(nodo.hijoIzq);
            preorden(nodo.hijoDer);
        }
    }
    
    //MOSTRAR ARBOL EN CONSOLA
    public void mostrarArbol() {
        if (raiz == null) {
            System.out.println("(árbol vacío)");
            return;
        }
        mostrarArbolRecursivo(raiz, "", true);
    }

    private void mostrarArbolRecursivo(Nodo nodo, String prefijo, boolean esUltimo) {
        if (nodo == null) return;

        System.out.println(prefijo + (esUltimo ? "└── " : "├── ") + nodo.dato);

        String nuevoPrefijo = prefijo + (esUltimo ? "    " : "│   ");

        if (nodo.hijoIzq != null || nodo.hijoDer != null) {
            if (nodo.hijoDer != null) {
                mostrarArbolRecursivo(nodo.hijoDer, nuevoPrefijo, nodo.hijoIzq == null);
            }
            if (nodo.hijoIzq != null) {
                mostrarArbolRecursivo(nodo.hijoIzq, nuevoPrefijo, true);
            }
        }
    }
    
    //RECORRIDO EN ANCHURA
    public void recorridoAnchura(){
        if(raiz == null) return; //Arbol vacio
        
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        
        while(!cola.isEmpty()){
            Nodo actual = cola.poll();
            System.out.print(actual.dato + " ");
            
            if(actual.hijoIzq != null){
                cola.add(actual.hijoIzq);
            }
            
            if(actual.hijoDer != null){
                cola.add(actual.hijoDer);
            }
        }
    }
    
    //Para buscar un nodo
    public boolean buscar (int dato){
        return buscar(raiz,dato);
    }
    
    private boolean buscar(Nodo actual, int dato){
        if(actual == null){
            return false;
        }
        
        if( actual.dato == dato){
            return true;
        }
        
        if(dato < actual.dato){
            return buscar(actual.hijoIzq, dato);
        }else{
            return buscar(actual.hijoDer, dato);
        }
    }
    
    //Para eliminar un nodo
    public void eliminar(int dato){
        raiz = eliminar(raiz, dato);
    }
    
    private Nodo eliminar(Nodo actual, int dato){
        if(actual == null){
            System.out.println("El nodo " + dato + " no existe...");
            return null;
        }
        
        if(dato < actual.dato){
            actual.hijoIzq = eliminar(actual.hijoIzq, dato);
        }else if(dato > actual.dato){
            actual.hijoDer = eliminar(actual.hijoDer, dato);
        }else{
            
            // Caso 1: Nodo sin hijos
            if(actual.hijoDer == null && actual.hijoIzq == null){
                return null;
            }
            
            //Caso 2: Nodo con un solo hijo
            if(actual.hijoIzq == null){
                return actual.hijoDer;
            }
            if(actual.hijoDer == null){
                return actual.hijoIzq;
            }
            
            //Caso 3: Nodo con 2 hijos
            Nodo sucesor = encontrarMinimo(actual.hijoDer);
            
            actual.dato = sucesor.dato;
            actual.hijoDer = eliminar(actual.hijoDer, sucesor.dato);
        }
        return actual;
    }
    
    //Metodo auxiliar para el metodo eliminar
    private Nodo encontrarMinimo(Nodo actual){
        while(actual.hijoIzq != null){
            actual = actual.hijoIzq;
        }
        return actual;
    }
}
