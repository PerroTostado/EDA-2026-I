
package Grafos;

import java.util.LinkedList;

public class Grafo_Listas_Adyacencia {
    private LinkedList<Integer>[] adj;
    private int V; // number of vertices
    private int A; // number of aristas

    public Grafo_Listas_Adyacencia(int nodos) {
        this.V = nodos;
        this.A = 0;
        this.adj = new LinkedList[nodos];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void agregarArista(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        A++;
    }

    public void imprimirGrafo() {
        for (int v = 0; v < V; v++) {
            System.out.print("Row " + v + ": ");
            for (int w = 0; w < adj[v].size(); w++) {
                System.out.print(adj[v].get(w) + " ");
            }
            System.out.println("");
        }
    }
}
