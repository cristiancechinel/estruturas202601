/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas202601;

public class BuscaLargura {
    private static final int BRANCO = 0;
    private static final int CINZA = 1;
    private static final int PRETO = 2;

    private int[] cor;
    private int[] dist;
    private int[] pai;
    private Grafo g; 
    
    BuscaLargura(Grafo g){
        this.g = g;
        cor = new int[g.getV()];
        dist = new int[g.getV()];
        pai = new int[g.getV()];
        
        for (int i = 0; i < g.getV(); i++){
            cor[i] = BRANCO; dist[i] = -1; pai[i] = -1;
        }
    }
    
    void imprimeResultado(){
        System.out.println("Cor");
        for (int i = 0; i < g.getV(); i++){
            System.out.print(cor[i] + " ");
        }
        System.out.println();
        
        System.out.println("Distância");
        for (int i = 0; i < g.getV(); i++){
            System.out.print(dist[i] + " ");
        }
        
        System.out.println();
        System.out.println("Pai");
        for (int i = 0; i < g.getV(); i++){
            System.out.print(pai[i] + " ");
        }

    }
    
    void busca(int origem){
        cor[origem] = CINZA;
        dist[origem] = 0;
        //criar fila
        FilaEncadeada Q = new FilaEncadeada();
        Q.insereFinal(origem);
        while (!Q.fila_vazia()){
            int u = Q.removeInicio();
            for (int v = 0; v < g.getV(); v++){
                if (g.eh_Adjacente(u, v)){
                    if (cor[v] == BRANCO){
                        cor[v] = CINZA;
                        dist[v] = dist[u] + 1;
                        pai[v] = u;
                        Q.insereFinal(v);
                    }
                }
            }
            cor[u] = PRETO;
        }
    }
}
