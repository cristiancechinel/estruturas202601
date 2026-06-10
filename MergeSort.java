
package com.mycompany.estruturas202601;


public class MergeSort {
    
    
    void mergeSort(int a[], int inicio, int fim){
        
        if (inicio < fim){
            int meio = (inicio + fim)/2;
            mergeSort(a, inicio, meio);
            mergeSort(a, meio + 1, fim);
            merge(a, inicio, meio, fim);
        }
    }

    // 8 posições -> 0 - 7  
    // p = 0
    // q = 3 
    // r = 7
    // n1 = 3 - 0 + 1 = 4
    // n2 = 7 - 3 =  4 
    
    void merge(int a[], int inicio, int meio, int fim){
    
        int nesquerda = meio - inicio + 1;
        int ndireita = fim - meio;
        //criando vetores auxiliares
        int esq[] = new int[nesquerda];
        int dir[] = new int[ndireita];
    
        //cópia esquerda
        for (int i = 0; i < nesquerda; i++){
            esq[i] = a[inicio + i];
        }
        //cópia direita
        for (int i = 0; i < ndireita; i++){
            dir[i] = a[meio + 1 + i];
        }
        //intercalação
        
        int e = 0;
        int d = 0;
        int j = inicio;
        
        do{
            if (esq[e] <= dir[d]){
                a[j] = esq[e];
                e++;
            }
            else{
                a[j] = dir[d];
                d++;
            }
            j++;
        }
        while (e < nesquerda && d < ndireita);
        
        for (int i = e; i < nesquerda; i++){
            a[j] = esq[i];
            j++;
        }
        for (int i = d; i < ndireita; i++){
            a[j] = dir[i];
            j++;
        }
    }

    void imprimeVet(int vet[]){
    
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println();
    
    }
    
}
