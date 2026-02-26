package Modelo;

public class ArrayGenerico<T> {

	private T[] info;
    private int tamanho;

    public ArrayGenerico(){
        info = (T[]) new Object[10];
        tamanho = 0;
    }
    private void redimensionar(){
    	T[] temp = (T[]) new Object[tamanho + 10];
        for(int i = 0; i < tamanho; i++){
            temp[i] = info[i];
        }
        info = temp;
    }
    public void inserir(T elemento){
        if(tamanho == info.length){
            redimensionar();
        }
        info[tamanho] = elemento;
        tamanho++;
        
    }
    public void exibir(){
        for(int i = 0; i < tamanho; i++){
            System.out.print(info[i] + " ");
        }
        System.out.println();
    }
    public int buscar(T elemento){
        int achou = -1;
        for(int i = 0; i < tamanho; i++){
            if(info[i].equals(elemento)){
                achou = i;
            }
        }
        return achou;
    }
    public void retirar(T elemento){
        for(int i = 0; i < tamanho; i++){
            if (info[i].equals(elemento)) {
                for(int j = i; j < tamanho - 1; j++){
                    info[j] = info [j+1];
                }
                tamanho --;
                i--;
            }
        }
    }
    public void liberar(){
    	T[] temp = (T[]) new Object[10];
        tamanho = 0;
    }
    public Object obterElemento(int posicao) throws IndexOutOfBoundsException{
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posiçaõ " + posicao + "não existe.");
        }
        return info[posicao];
    }
    public boolean estaVazia(){
        return (tamanho == 0);
    }
    public int getTamanho(){
        return tamanho;
    }
    public String toString(){
        String aux = "";
        for(int i = 0; i < tamanho; i++){
        	aux += info[i];
            if(i < tamanho - 1){
                aux += ", ";
            }
        }
        return aux;
    }
   public void inverter() {
	   T aux;
	   for(int i = 0; i < tamanho/2; i++){
		   aux = info[i];
           info[i] = info[tamanho - i - 1];
           info[tamanho - i - 1] = aux;
       }
   }
}


