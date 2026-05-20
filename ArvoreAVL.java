
package com.mycompany.estruturas202601;


public class ArvoreAVL {
    
    private NodoAVL raiz;
    
    
    ArvoreAVL(){
        this.raiz = null;
    }
    
    void insere(int v){
        if (this.raiz == null)
            this.raiz = new NodoAVL(v, null, null);
        else 
            this.raiz.insereBalanceado(raiz, v);
    }
    
    void remove(int v){
        if (this.raiz != null)
            this.raiz = this.raiz.remove(raiz, v);
    
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
