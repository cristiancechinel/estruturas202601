/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas202601;

public class Ordenacao {

    void imprimeVet(int vet[]){
    
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println();
    
    }
    
    void bubbleSort(int vet[]){
        int tam = vet.length;
        for (int i = tam - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (vet[j] > vet[j+1]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
    }

    void insertionSort(int vet[]){
    
        for (int j = 1; j < vet.length; j++){
            int chave = vet[j];
            int i = j -1;
            
            while (i >=0 && chave < vet[i]){
                vet[i+1] = vet[i]; 
                i--;
            }
            vet[i+1] = chave;
        
        }
    
    
    
    }
    
}
