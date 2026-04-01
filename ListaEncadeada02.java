
package com.mycompany.estruturas202601;

public class ListaEncadeada02 {
    
    private Nodo inicio, ultimo;
    
    
    private class Nodo{
        Integer dado;
        Nodo prox; 
    }

    ListaEncadeada02(){
        inicio = null;
        ultimo = null;
    }
    
    void insereInicio(int valor){
        
        Nodo novo = new Nodo();
        novo.dado = valor; 
        
        novo.prox = inicio; 
        inicio = novo;
        
        if (ultimo == null)
            ultimo = novo;
            
    }
    
    Integer removeInicio(){
                
        if (inicio == null) return null;
        
        Nodo temp = inicio;
        
        if (inicio == ultimo)
            inicio = ultimo = null;
        else
            inicio = inicio.prox;
        return temp.dado;
        
        
    }
    
    
    void insereFinal(int valor){
        Nodo novo = new Nodo();
        novo.dado = valor; 
        novo.prox = null;
        
        if (inicio == null) {//indica lista vazia. 
            inicio = novo;
            ultimo = novo;
        }
        else {
            ultimo.prox = novo;
            ultimo = novo;
        }
    
    
    
    
    
    
    
    
    }
  
    
   
   
    void imprime(){
            for (Nodo temp = inicio; temp != null; temp = temp.prox){
                 System.out.print(temp.dado + "->");
            }
            System.out.println();
    
    }
}
