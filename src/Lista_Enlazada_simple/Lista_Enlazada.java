
package Lista_Enlazada_simple;

import java.io.UnsupportedEncodingException;

public class Lista_Enlazada {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        // Agregamos una lista ya ordenada con duplicados
        Lista L = new Lista();
        L.agregarFinal(1);
        L.agregarFinal(1);
        L.agregarFinal(2);
        L.agregarFinal(3);
        L.agregarFinal(3);
        L.agregarFinal(3);
        L.agregarFinal(4);

        System.out.println("Antes:");
        L.imprimir();
        // 1->1->2->3->3->3->4->null

        L.eliminarDuplicado();

        System.out.println("Después:");
        L.imprimir();
        // 1->2->3->4->null

        System.out.println("Tamaño: " + L.getTamaño());
    }
    
}
