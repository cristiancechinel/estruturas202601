package com.mycompany.estruturas202601;

public class PilhaEncadeada {
    
    private ListaDuplamenteEncadeada lista;
    
    PilhaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }

    void empilha(Integer valor){
        lista.insereFinal(valor);
    }
    
    Integer desempilha(){
        return lista.removeFinal();
    }
    
    void imprimePilha(){
        lista.imprime();
    }
}
