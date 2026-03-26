
package Arbol_Binario;

public class ArbolBinario {
    Nodo raiz;
    
    public ArbolBinario(){
        this.raiz = null;
    }
    
    public void insertarNodo(int dato){
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
    }
}
