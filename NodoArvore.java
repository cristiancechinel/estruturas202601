
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
    
    void imprimeSim(NodoArvore a){
    
        if (a != null){
            System.out.print("<");
            imprimeSim(a.esq);
            System.out.print(a.valor);
            imprimeSim(a.dir);
            System.out.print(">");
        }
    }
    
    void imprimePos(NodoArvore a){
    
        if (a != null){
            System.out.print("<");
            imprimePos(a.esq);
            imprimePos(a.dir);
            System.out.print(a.valor);
            System.out.print(">");
        }
    }
    
    int maior(NodoArvore a){
    
        NodoArvore temp = a;
        
        while (temp.dir != null)
            temp = temp.dir;
    
        return temp.valor;

    
    }
    
    
    int quantidade(NodoArvore a){
        if (a == null) 
            return 0;
        else
            return 1 + quantidade(a.esq) + quantidade(a.dir);
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
    
    
    NodoArvore insere(NodoArvore atual, int valor){
        if (atual == null)
            atual = new NodoArvore(valor, null, null);
        else
            if (valor < atual.valor)//insere esquerda
                atual.esq = insere(atual.esq, valor);
            else //insere direita
                atual.dir = insere(atual.dir, valor);
                
        return atual;
    }
    
    NodoArvore remove(NodoArvore nodo, int numero){
        if (nodo == null) return null;
        else if (numero < nodo.valor)// remove esquerda
                nodo.esq = remove(nodo.esq, numero);
        else if (numero > nodo.valor)// remove direita
                    nodo.dir = remove(nodo.dir, numero);
        else //encontrou
           if (nodo.esq == null && nodo.dir == null) //não tem filhos
               return null;
           else
               if (nodo.dir == null) //tem filho na esquerda
                   return nodo.esq;
               else if (nodo.esq == null)// tem filho na direito
                   return nodo.dir;
               else { //dois filhos // maior elemento da subarvore da esquerda
                   NodoArvore temp = nodo.esq;
                   while (temp.dir != null)
                       temp = temp.dir;
                   
                   nodo.valor = temp.valor;
                   temp.valor= numero; 
                   
                   nodo.esq = remove(nodo.esq, numero);
               }
        return nodo;
    }
                
}
