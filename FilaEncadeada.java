
package com.mycompany.estruturas202601;

public class FilaEncadeada {

    private ListaDuplamenteEncadeada lista;
    
    FilaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }

    void insereFinal(Integer valor){
        lista.insereFinal(valor);
    }
    
    Integer removeInicio(){
        return lista.removeInicio();
    }
    
    void imprimeFila(){
        lista.imprime();
    }
    
}
