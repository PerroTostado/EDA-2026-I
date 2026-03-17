
package Lista_Enlazada_Doble;

public class LED {
    public static void main(String[] args) {

        Lista L = new Lista();
        
        L.insertarFinal(3);
        System.out.println(L.getTamaño());
        L.insertarFinal(5);
        System.out.println(L.getTamaño());
        L.insertarFinal(6);
        System.out.println(L.getTamaño());
        L.insertarFinal(6);
        System.out.println(L.getTamaño());
        
        L.insertarInicial(1);
        System.out.println(L.getTamaño());
        
        L.insertarPosicion(8, 4);
        System.out.println(L.getTamaño());
        L.insertarPosicion(8, 4);
        System.out.println(L.getTamaño());
        
        L.imprimir();
    }
}
