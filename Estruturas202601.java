package com.mycompany.estruturas202601;

import java.util.Scanner;

public class Estruturas202601 {

    public static void imprimir(int n){
       System.out.println(n);
        if (n != 1) 
            imprimir(n-1);
     
    }
    
    public static int potencia(int b, int e){
    
       if (e == 0) return 1; 
       else return b * potencia(b, e-1);
    
    }
    
   
    public static int fatorial(int n){
        
        if (n == 0 ) return 1;
        else return n * fatorial(n-1);
    
    }
    
    public static void main(String[] args) {
        imprimir(10);
        
        System.out.println(potencia(2, 4));

    }
}
