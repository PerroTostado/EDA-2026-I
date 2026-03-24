
package Pilas;

public class main {
    public static void main(String[] args) {
        Pila p = new Pila();
        
        p.push(3);
        p.push(10);
        p.push(4);
        p.push(5);
        
        p.imprimir();
        
        p.peek();
    }
}
