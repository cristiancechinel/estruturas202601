
package com.mycompany.estruturas202601;

public class TestaListaVetores {

    public static void main(String[] args){
    
        ListaVetores lista = new ListaVetores(5);
        lista.insere(15);
        lista.insere(25);
        lista.insere(50);
        lista.insere(30);
        lista.insere(40);
        
        lista.imprime();
        
        lista.insere(300);
        lista.insere(220);
        
        lista.imprime();
        
        System.out.println(lista.remove());
        System.out.println(lista.remove());        
        System.out.println(lista.remove());        
        System.out.println(lista.remove());    
        System.out.println(lista.remove());
        lista.imprime();

    }
    
}
