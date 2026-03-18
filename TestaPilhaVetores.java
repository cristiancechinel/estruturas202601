
package com.mycompany.estruturas202601;


public class TestaPilhaVetores {
    
    public static void main(String[] args){
    
        PilhaVetores p = new PilhaVetores(5);
        p.empilha(6);
        p.empilha(10);
        p.empilha(15);
        
        p.imprime();
    
        System.out.println("desempilhou " + p.desempilha());
        
        p.imprime();
      
    
    }
    
}
