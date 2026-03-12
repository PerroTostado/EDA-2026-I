
package Listas_Enlazadas;

import Listas_Enlazadas.Lista;

public class Lista_Enlazada {

    public static void main(String[] args) {
        Lista L = new Lista();
        L.agregarFinal(3);
        L.agregarFinal(4);
        L.agregarFinal(10);
        L.agregarFinal(0);
        L.agregarFinal(1);
        
        L.insertarPosicion(0, 7);
        
        L.imprimir();
    }
    
}
