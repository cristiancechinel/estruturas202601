
package com.mycompany.estruturas202601;


public class TestaGrafo {
    
    public static void main(String[] args){
    
        Grafo g = new Grafo(4);
        
        g.insereAresta(0, 1);
        g.insereAresta(0, 2);
        g.insereAresta(1, 2);
        g.insereAresta(2, 3);
        
        g.imprimeGrafo();
    }
    
}
