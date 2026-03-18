
package com.mycompany.estruturas202601;

public class PilhaVetores {
    private Integer[] dados;
    private int qt;
    
    PilhaVetores(int tam){
        dados = new Integer[tam];
        qt = 0;
    }

    void empilha(int valor){
        if (qt < dados.length){
            dados[qt] = valor;
            qt++;
        }
    }
    
    Integer desempilha(){
        if (qt != 0){
            Integer valor = dados[qt-1];
            qt--;
            return valor;
        }
        return null;
    }
    
    void imprime(){
        for (int i = 0; i < qt; i++)
            System.out.print(dados[i] + "->");
    
        System.out.println();
    }
    
}
