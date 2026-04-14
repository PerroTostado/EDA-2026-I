
package Grafos;

import java.util.LinkedList;
import java.util.Queue;

public class Grafo_Matriz_Adyacencia {
    private int V;
    private int A;
    private int[][] matrizAdyacencia;

    public Grafo_Matriz_Adyacencia(int nodos) {
        this.V = nodos;
        this.A = 0;
        this.matrizAdyacencia = new int[nodos][nodos];
    }
    
    public void agregarArista (int u, int v){
        matrizAdyacencia[u][v] = 1;
        matrizAdyacencia[v][u] = 1;
        A++;
    }
    
    public void imprimirGrafo(){
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(matrizAdyacencia[i][j]);
            }
            System.out.println("");
        }
    }
    
    public void bfs(int nodoInicial){
        
        //Validación
        if(nodoInicial < 0 || nodoInicial >= V){
            System.out.println("NODO INVALIDO......");
            return;
        }
        
        boolean[] visitado = new boolean[V];
        
        Queue<Integer> cola = new LinkedList<>();
        
        visitado[nodoInicial] = true;
        cola.add(nodoInicial);
        
        while(!cola.isEmpty()){
            int actual = cola.poll();
            System.out.print(actual + " ");
            
            for (int i=0; i<V; i++){
                if(matrizAdyacencia[actual][i] == 1 && !visitado[actual]){
                    visitado[i] = true;
                    cola.add(i);
                }
            }
        }
        System.out.println();
    }
}
