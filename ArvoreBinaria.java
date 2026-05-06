
package com.mycompany.estruturas202601;


public class ArvoreBinaria {
    
    private NodoArvore raiz;
    
    
    ArvoreBinaria(){
        this.raiz = null;
    }
    
    void insere(int v){
        if (this.raiz == null)
            this.raiz = new NodoArvore(v, null, null);
        else 
            this.raiz.insere(raiz, v);
    }

    void imprimePre(){
        if (this.raiz != null)
            this.raiz.imprimePre(raiz);
        System.out.println();

    }
    
    void imprimeSimetrico(){
        if (this.raiz != null)
            this.raiz.imprimeSim(raiz);
        System.out.println();

    }

    void imprimePos(){
        if (this.raiz != null)
            this.raiz.imprimePos(raiz);
        System.out.println();

    }

}
