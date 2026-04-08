
package com.mycompany.estruturas202601;

public class TestaLista {
    
    
    public static void main(String[] args){
        
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.insereInicio(15);
        lista.insereInicio(20);
        lista.insereInicio(30);
        
        lista.insereFinal(200);
        lista.insereFinal(300);
        lista.imprime();
        lista.imprimeRev();
        
    
    
    
    }
    
}
