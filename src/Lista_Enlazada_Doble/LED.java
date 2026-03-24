
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
        
        System.out.println("----------LISTA ORIGINAL----------");
        L.imprimir();
        
        System.out.println("----------ELIMINANDO EL FINAL----------");
        L.eliminarFinal();
        System.out.println(L.getTamaño());
        L.imprimir();
        
        System.out.println("----------ELIMINANDO EL INICIAL----------");
        L.eliminarInicial();
        System.out.println(L.getTamaño());
        L.imprimir();
        
        System.out.println("----------ELIMINANDO EN CUALQUIER POSICION----------");
        L.eliminarPosicion(4);
        System.out.println(L.getTamaño());
        L.imprimir();
        
        System.out.println("----------BUSCAR DATO----------");
        L.buscarValor(8);
    }
}
