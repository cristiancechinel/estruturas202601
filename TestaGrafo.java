
package com.mycompany.estruturas202601;


public class TestaGrafo {
    
    public static void main(String[] args){
    
        Grafo g = new Grafo(5);
        
        g.insereAresta(0, 1);
        g.insereAresta(0, 2);
        g.insereAresta(1, 2);
        g.insereAresta(1, 3);
        g.insereAresta(3, 4);
        
        g.imprimeGrafo();
        
        BuscaLargura bl = new BuscaLargura(g);
        
        
        bl.busca(0);
        
        bl.imprimeResultado();
        
        
      //  System.out.println(g.eh_Adjacente(0, 3));
    }
    
}
