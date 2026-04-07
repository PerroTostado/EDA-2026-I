
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
}
