
package Grafos;

public class main {
    public static void main(String[] args) {
        Grafo_Matriz_Adyacencia g = new Grafo_Matriz_Adyacencia(5);
        Grafo_Listas_Adyacencia gl = new Grafo_Listas_Adyacencia(5);
        
        //Grafo con matriz adyacente
        System.out.println("MATRIZZ ADYACENTE");
        g.agregarArista(3, 0);
        g.agregarArista(1, 1);
        g.agregarArista(2, 2);
        g.agregarArista(4, 3);
        g.agregarArista(4, 4);
        
        g.imprimirGrafo();
        
        g.bfs(2);
        
        System.out.println("----------------------------");
        
        //Grafo con lista adyacente
        System.out.println("MATRIZ DE LISTA ADYACENTE");
        gl.agregarArista(3, 0);
        gl.agregarArista(1, 1);
        gl.agregarArista(2, 2);
        gl.agregarArista(4, 3);
        gl.agregarArista(4, 4);
        
        g.imprimirGrafo();
    }
}
