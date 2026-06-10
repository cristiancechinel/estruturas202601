package com.mycompany.estruturas202601;

public class Grafo {
    
    private int V;
    private int[][] matriz;
    
    
    Grafo(int V){
        this.V = V;
        this.matriz = new int[this.V][this.V];
    }

    void setV(int V){
        if (V >= 1) this.V = V;
        else this.V = 1;
    }
    
    boolean  eh_Adjacente(int i, int j){
        if (i >= 0 && i < this.V && j >= 0 && j < this.V)
            return this.matriz[i][j] == 1;
        return false;
    
    }
    
    void insereAresta(int i, int j){
        if (i >= 0 && i < this.V && j >= 0 && j < this.V){
            this.matriz[i][j] = 1;
            this.matriz[j][i] = 1;
        }
    }
    
    void imprimeGrafo(){
        
        for (int i = 0; i < this.V; i++){
            for (int j = 0; j < this.V; j++){
                System.out.print(matriz[i][j] + " ") ;
            }
            System.out.println();
        }
                
    
    
    
    }
    
}
