
package com.mycompany.estruturas202601;

public class ListaEncadeada {
    
    private Nodo inicio;
    
    private class Nodo{
        int dado;
        Nodo prox; 
    }

    ListaEncadeada(){
        inicio = null;
    }
    
    void insereInicio(int valor){
        Nodo novo = new Nodo();
        novo.dado = valor; 
        novo.prox = inicio; 
        inicio = novo;
    }
   
    void imprime(){
            for (Nodo temp = inicio; temp != null; temp = temp.prox){
                 System.out.print(temp.dado + "->");
            }
    
    }
}
