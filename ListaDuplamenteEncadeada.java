package com.mycompany.estruturas202601;

public class ListaDuplamenteEncadeada {
    
    private Nodo inicio, ultimo;
  
    private class Nodo{
        Nodo prox, ant;
        Integer dado;
    }
    
    Integer removeFinal(){
        if (inicio == null) return null; 
        
        Integer retirar = ultimo.dado;
        if (inicio == ultimo){ // contem 1 elemento
            inicio = ultimo = null;
        }
        else{
            ultimo = ultimo.ant;
            ultimo.prox = null;
        }
        return retirar; 
    }
    
    
    Integer removeInicio(){
        if (inicio == null) 
            return null; //lista vazia
        
        Integer retirar = inicio.dado;
        if (inicio == ultimo ){ //possui 1 elemento apenas
            inicio = ultimo = null;
        }      
        else{
            inicio = inicio.prox;
            inicio.ant = null;
        } 
            
        return retirar; 
    
    
    
    
    }
    
    void insereFinal(int valor){
        Nodo novo = new Nodo();
        novo.dado = valor;
        
        novo.prox = null;
        novo.ant = ultimo;
       if (inicio == null)
            inicio = novo;
        else
            ultimo.prox = novo;

       ultimo = novo;
    
    
    }
    
    void insereInicio(int valor){
        Nodo novo = new Nodo();
        novo.dado = valor;
        
        novo.ant = null;
        novo.prox = inicio;        

        if (inicio == null){ //lista vazia
            inicio = novo;
            ultimo = novo;
        }
        else {
            inicio.ant = novo;
            inicio = novo;
        }
    }
    
    void imprimeRev(){
        for (Nodo n = ultimo; n != null; n = n.ant)
            System.out.print(n.dado + "<-");
        System.out.println();
    
    
    }
    
    void imprime(){
        
        for (Nodo n = inicio; n != null; n = n.prox)
            System.out.print(n.dado + "->");
        System.out.println();
    
    }
    
}
