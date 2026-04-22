/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas202601;

/**
 *
 * @author cechinel
 */
public class TestaArvore {
    
    
    public static void main(String[] args){
    
        
        NodoArvore c = new NodoArvore(3, null, null);
        NodoArvore e = new NodoArvore(13, null, null);
        NodoArvore f = new NodoArvore(15, null, null);

        NodoArvore b = new NodoArvore(5, c, null);
        NodoArvore d = new NodoArvore(10, e, f);
        
        NodoArvore a = new NodoArvore(8, b, d);
        
        a.imprimePre(a);
        
        
        //System.out.println(a.buscaArvore(a, 10));
        
        
    
    }
    
}
