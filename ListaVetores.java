package com.mycompany.estruturas202601;

public class ListaVetores {
    Integer dados[]; //positivos
    int qt; //quantidade
    
    ListaVetores(int tamanho){
        dados = new Integer[tamanho];
    }
        
    void insereFinal(int valor){
        if (qt < dados.length){
            dados[qt] = valor;
            qt++;
        }
    }
    
    void redimensiona(int max){
        Integer[] temp = new Integer[max];
        for (int i = 0; i < this.qt; i++)
            temp[i] = this.dados[i];
        this.dados = temp;
    }
    
    void insere(int valor){
        if (this.qt == this.dados.length)
            redimensiona(2 * dados.length);
        this.dados[qt] = valor;
        qt++;
    }
    
    Integer remove(){
        if (this.qt == 0) return null;
        Integer valor = this.dados[this.qt -1];
        this.qt--;
        
        if (this.qt > 0 && this.qt == this.dados.length/4)
            redimensiona(dados.length/2);
    
        return valor;
    }
    
    
    //boolean vazia(): verificar se a lista está vazia, retornando
    //True para vazia e False para não-vazia
    boolean vazia(){
        return this.qt == 0;
    }

    Integer removePos(int pos){
    // método que remove a posição enviada. deve retornar NULL
    //caso a posição não exista. 
        if (pos < 0 && pos >= this.qt) 
            return null;

        Integer valor = dados[pos];
        for (int j = pos + 1; j < qt; j++)
            dados[j-1] = dados[j];
        
        this.qt--;
        return valor;
    }
    
    Integer removeFinal(){
       if (qt != 0){
            Integer valor = dados[qt-1];
            qt--;
            return valor;
        }
        return null;
       
    }
    
    void imprime(){
        System.out.println("tamanho: " + dados.length);
        
        for (int i = 0; i < qt; i++)
            System.out.print(dados[i] + " - ");
        System.out.println();
    
    }
    
}
