
package com.mycompany.estruturas202601;

public class TestaLista {
    
    
    public static void main(String[] args){
    
    
        ListaEncadeada02 lista = new ListaEncadeada02();
      
        
        lista.insereInicio(5);
        lista.insereInicio(10);
        lista.imprime();
        
        lista.insereFinal(55);
        lista.insereFinal(80);
        
        lista.imprime();
 
        System.out.println("removeu ultimo " + lista.removeFinal());
        System.out.println("removeu ultimo " + lista.removeFinal());
        lista.imprime();
        
        lista.insereFinal(33);
        lista.imprime(); 
        
        /*  lista.insereInicio(15);
        lista.insereInicio(26);
        lista.insereInicio(55);
                
        lista.imprime();
    
        System.out.println("removeu " + lista.removeNodo(15));
        
        
        lista.imprime();
    */
    
    }
    
}
