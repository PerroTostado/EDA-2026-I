/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda;

/**
 *
 * @author CENTIC
 */
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
            nuevo = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
}
