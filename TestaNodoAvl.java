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
    
        NodoAVL arv = new NodoAVL(80, null, null);
        arv.insere(arv, 70);
        arv.insere(arv, 60);
        
        arv.imprimePre(arv);
        
        arv = arv.rotacaoEsquerda(arv);
        System.out.println();
   
        arv.imprimePre(arv);
    
    
    }
    
}
