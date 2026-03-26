
package Colas;

public class main {
    public static void main(String[] args) {
        Cola c = new Cola();
        
        c.enqueue(3);
        c.enqueue(6);
        c.enqueue(5);
        c.imprimir();
        c.peek();
        
        c.dequeue();
        c.imprimir();
        c.peek();
        
        c.eliminarCola();
        c.imprimir();
    }
}
