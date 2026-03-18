
package com.mycompany.estruturas202601;


public class FilaVetores {
    
    private Integer[] dados;
    private int inicio, qt;
    
    FilaVetores(int tam){
        dados = new Integer[tam];
        inicio = qt = 0;
    }

    void insere02(int valor){
        if (qt < dados.length){

            int pos = (inicio + qt);
            
            if (pos >= dados.length)
                pos = pos - dados.length;
            
            dados[pos] = valor; 
            qt++;
        
        }
    }
    
    Integer remove(){
        if (qt != 0){
            Integer valor = dados[inicio];
            qt--;
            inicio = (inicio + 1) % dados.length;
            return valor;
        }
        return null;
    }

    
    void insere(int valor){
        if (qt < dados.length){

            int pos = (inicio + qt) % dados.length;
            dados[pos] = valor; 
            qt++;
        
        }
    }
    
    
}
