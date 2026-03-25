
package com.mycompany.estruturas202601;

public class TestaLista {
    
    
    public static void main(String[] args){
    
    
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.insereInicio(15);
        lista.insereInicio(26);
        lista.insereInicio(55);
                
        lista.imprime();
    
        System.out.println("removeu " + lista.removeNodo(15));
        
        
        lista.imprime();
    
    
    }
    
}
