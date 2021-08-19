package inverso.controller;

public class Inversao {
	public String palavraInvertida(String palavra, int tamanho, String resultado) { 
		if (tamanho == 0 ) {
			return " ";
		} else{
			resultado = palavra.substring(tamanho - 1, tamanho);
			return resultado + palavraInvertida(palavra, tamanho - 1, resultado );
		}
	}
}
