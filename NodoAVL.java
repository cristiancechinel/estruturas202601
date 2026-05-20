package com.mycompany.estruturas202601;


public class NodoAVL {
    
    private NodoAVL esq;
    private Integer valor; 
    private NodoAVL dir; 
    
    NodoAVL(int valor, NodoAVL esq, NodoAVL dir){
        this.valor = valor; 
        this.esq = esq;
        this.dir = dir;
    }
    
    NodoAVL rotacaoDireitaEsquerda(NodoAVL a){
        a.dir = rotacaoDireita(a.dir);
        a = rotacaoEsquerda(a);
        return a;  
    }
    
    NodoAVL rotacaoEsquerdaDireita(NodoAVL a){
        a.esq = rotacaoEsquerda(a.esq);
        a = rotacaoDireita(a);
        return a;
    }
    
    
    NodoAVL rotacaoEsquerda(NodoAVL a){
        NodoAVL aux = a.dir;
        a.dir = aux.esq;
        aux.esq = a;
        return aux;
    }
    
    NodoAVL rotacaoDireita(NodoAVL a){
    
        NodoAVL aux = a.esq;
        a.esq = aux.dir;
        aux.dir = a;
        return aux;
    }
  
    
    int max (int a , int b){
        if (a > b) return a;
        else return b;
    }

    int altura(NodoAVL a){
        if (a == null) 
            return -1;
        else
            return 1 + max(altura(a.esq), altura(a.dir));
    }

    
    void imprimePre(NodoAVL a){
    
        if (a != null){
            System.out.print("<");
            System.out.print(a.valor);
            imprimePre(a.esq);
            imprimePre(a.dir);
            System.out.print(">");
        }
    }
    
    void imprimeSim(NodoAVL a){
    
        if (a != null){
            System.out.print("<");
            imprimeSim(a.esq);
            System.out.print(a.valor);
            imprimeSim(a.dir);
            System.out.print(">");
        }
    }
    
    void imprimePos(NodoAVL a){
    
        if (a != null){
            System.out.print("<");
            imprimePos(a.esq);
            imprimePos(a.dir);
            System.out.print(a.valor);
            System.out.print(">");
        }
    }
    
    NodoAVL insereBalanceado(NodoAVL a, int valor){
        if (a == null) 
            a = new NodoAVL(valor, null, null);
        else
            if (valor < a.valor){ //insere esquerda
               a.esq = insereBalanceado(a.esq, valor);
               if (altura(a.esq) - altura(a.dir) == 2)
                   if (valor < a.esq.valor){//rotacao simples direita
                       a = rotacaoDireita(a);
                       System.out.println("rotacao direita");
                   }
                   else {// rotacao dupla
                       a = rotacaoEsquerdaDireita(a);
                       System.out.println("rotacao esq direita");
                   }
            }
            else{ //insere direita
               a.dir = insereBalanceado(a.dir, valor);
               if (altura(a.esq) - altura(a.dir) == -2)
                   if (valor > a.dir.valor){//rotacao simples esquerda
                       a = rotacaoEsquerda(a);
                       System.out.println("rotacao esquerda");
                   }
                   else{ //rotacao dupla
                       a = rotacaoDireitaEsquerda(a);
                       System.out.println("rotacao dir esquerda");
                   }
            }    
        return a;        
   }
    
    
    int maior(NodoAVL a){
    
        NodoAVL temp = a;
        
        while (temp.dir != null)
            temp = temp.dir;
    
        return temp.valor;

    
    }
    
    
    int quantidade(NodoAVL a){
        if (a == null) 
            return 0;
        else
            return 1 + quantidade(a.esq) + quantidade(a.dir);
    }
    
    
    
    boolean buscaArvore(NodoAVL a, int valor){
        if (a == null) 
            return false;
      
        if (a.valor == valor) 
            return true;
        else 
            return buscaArvore(a.esq, valor) ||
                   buscaArvore(a.dir, valor);
    
    }
    
    /*
    NodoAVL insere(NodoAVL atual, int valor){
        if (atual == null)
            atual = new NodoAVL(valor, null, null);
        else
            if (valor < atual.valor)//insere esquerda
                atual.esq = insere(atual.esq, valor);
            else //insere direita
                atual.dir = insere(atual.dir, valor);
                
        return atual;
    }*/
    
    NodoAVL remove(NodoAVL nodo, int numero){
        if (nodo == null) return null;
        else if (numero < nodo.valor){// remove esquerda
                nodo.esq = remove(nodo.esq, numero);
                if (altura(nodo.esq) - altura(nodo.dir) == -2)
                    if (altura(nodo.dir.esq) - altura(nodo.dir.dir) == 1){
                        nodo = rotacaoDireitaEsquerda(nodo);//rotacao dupla
                         System.out.println("rotacao direita esquerda");
                    }
                    else {
                        nodo = rotacaoEsquerda(nodo);//rotacao simples
                        System.out.println("rotacao esquerda");   
                    }
        }
        else if (numero > nodo.valor){// remove direita
                nodo.dir = remove(nodo.dir, numero);
                if (altura(nodo.esq) - altura(nodo.dir) ==  2)
                    if (altura(nodo.esq.esq) - altura(nodo.esq.dir) == -1){
                        nodo = rotacaoEsquerdaDireita(nodo); //rotacao dupla
                        System.out.println("rotacao esquerda direita");       
                    }
                    else {
                        nodo = rotacaoDireita(nodo);    //rotacao simples
                         System.out.println("rotacao direita");
                    }
        }
                
        
        else //encontrou
           if (nodo.esq == null && nodo.dir == null) //não tem filhos
               return null;
           else
               if (nodo.dir == null) //tem filho na esquerda
                   return nodo.esq;
               else if (nodo.esq == null)// tem filho na direito
                   return nodo.dir;
               else { //dois filhos // maior elemento da subarvore da esquerda
                   NodoAVL temp = nodo.esq;
                   while (temp.dir != null)
                       temp = temp.dir;
                   
                   nodo.valor = temp.valor;
                   temp.valor= numero; 
                   
                   nodo.esq = remove(nodo.esq, numero);
               }
        return nodo;
    }
                
}
