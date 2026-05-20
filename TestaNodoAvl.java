/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas202601;

/**
 *
 * @author cechinel
 */
public class TestaNodoAvl {
    
    
    public static void main(String[] args){
    
        
        ArvoreAVL a = new ArvoreAVL();
        a.insere(8);
        a.insere(5);
        a.insere(10);
        a.insere(6);
        a.insere(3);
        
        a.imprimePre();
        a.remove(10);
        
        a.imprimePre();
        
      //  NodoAVL arv = new NodoAVL(8, null, null);
     //   arv = arv.insereBalanceado(arv, 5);
     //   arv = arv.insereBalanceado(arv, 10);
    //    arv = arv.insereBalanceado(arv,6);
    //    arv = arv.insereBalanceado(arv,3);
        
        
    ///    arv.imprimePre(arv);
        
     //   arv = arv.remove(arv, 10);
     //   arv.imprimePre(arv);
       
    
    
    }
    
}
