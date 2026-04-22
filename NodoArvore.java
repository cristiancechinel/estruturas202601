
package com.mycompany.estruturas202601;


public class NodoArvore {
    
    private NodoArvore esq;
    private Integer valor; 
    private NodoArvore dir; 
    
    NodoArvore(int valor, NodoArvore esq, NodoArvore dir){
        this.valor = valor; 
        this.esq = esq;
        this.dir = dir;
    }
    
    void imprimePre(NodoArvore a){
    
        if (a != null){
            System.out.print("<");
            System.out.print(a.valor);
            imprimePre(a.esq);
            imprimePre(a.dir);
            System.out.print(">");
        }
    
    
    }
    
    
    boolean buscaArvore(NodoArvore a, int valor){
        if (a == null) 
            return false;
      
        if (a.valor == valor) 
            return true;
        else 
            return buscaArvore(a.esq, valor) ||
                   buscaArvore(a.dir, valor);
    
    }
    
    
}
