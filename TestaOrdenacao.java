
package com.mycompany.estruturas202601;

public class TestaOrdenacao {

    public static void main(String[] args){
    
       
        MergeSort o = new MergeSort();
        
        int vet[] = {8, 222, 16, 20, 1, 18, 35, 40};
       
        o.mergeSort(vet, 0, 7);
        o.imprimeVet(vet);
    
    
    }


    
}
