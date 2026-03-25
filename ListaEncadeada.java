
package com.mycompany.estruturas202601;

public class ListaEncadeada {
    
    private Nodo inicio;
    
    private class Nodo{
        Integer dado;
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
    
    Integer removeInicio(){
        if (inicio != null){
            Nodo temp = inicio;
            inicio = inicio.prox;
            return temp.dado;
        }
        return null;
    }
    
    Integer removeNodo(int n){
        Nodo temp = inicio;
        Nodo ant = null;
    
        while (temp != null && temp.dado !=n){
            ant = temp;
            temp = temp.prox;
        }
    
        if (temp == null) return null; //elemento não existe
    
        if (ant == null){ //encontrou no inicio
            int retira = inicio.dado;
            inicio = inicio.prox;
            return retira;
        }
 
        int retira = temp.dado;
        ant.prox = temp.prox;
        return retira;
    }
    
    
    
   
    void imprime(){
            for (Nodo temp = inicio; temp != null; temp = temp.prox){
                 System.out.print(temp.dado + "->");
            }
            System.out.println();
    
    }
}
