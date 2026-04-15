
package com.mycompany.estruturas202601;


public class TestaPilhaEncadeada {;
    
    public static void main(String[] args){
    
        PilhaEncadeada p = new PilhaEncadeada();
       
        p.imprimePilha();
        
        p.empilha(9);
        p.empilha(15);
        p.empilha(40);
        
        p.imprimePilha();
        p.desempilha();
      
        p.imprimePilha();
        p.desempilha();
        p.imprimePilha();

        
    
    }
    
}
