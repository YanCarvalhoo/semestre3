package modelo;


public class Principal {
	private int[] info;
	private int tamanho;
	
	public Principal() {
		info = new int[10];
		tamanho = 0;
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		
		info[tamanho] = valor;
		tamanho++;
	}
	
	private void redimensionar() {
		int[] novo = new int[info.length * 2];
		
		for(int i = 0; i < tamanho; i++) {
			novo[i] = info[i];
		}
		
		info = novo;
	}
	
	public boolean remover(int valor) {

	    for (int i = 0; i < tamanho; i++) {

	        if (info[i] == valor) {

	            for (int j = i; j < tamanho - 1; j++) {
	                info[j] = info[j + 1];
	            }

	            tamanho--;

	            return true;
	        }
	    }

	    return false;
	}
	
	public int buscar(int valor) {
		for(int i = 0; i < tamanho; i ++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	
	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i] + " ");	
		}
		System.out.println();
	}
}