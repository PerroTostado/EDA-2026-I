
package Arbol_Binario;

import java.io.UnsupportedEncodingException;

public class main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        ArbolBinario AB = new ArbolBinario();
        
        AB.insertarNodo(6);
        AB.insertarNodo(8);
        AB.insertarNodo(1);
        AB.insertarNodo(10);
        AB.insertarNodo(20);
        AB.insertarNodo(5);
        AB.insertarNodo(7);
        AB.insertarNodo(3);
        AB.insertarNodo(2);
        AB.insertarNodo(13);
        AB.insertarNodo(24);
        
        AB.mostrarArbol();
        //AB.recorridoAnchura();
        
        System.out.println(AB.buscar(1));
        
        AB.eliminar(6);
        AB.mostrarArbol();
        
    }
}
