package inverso.view;

import inverso.controller.Inversao;

public class Main {
	public static void main(String[] args) {
		
		Inversao inverter = new Inversao();
		
		String palavra = "Testando";
		String resultado = "";

		resultado = inverter.palavraInvertida(palavra, palavra.length(), resultado);
		System.out.printf("O resultado foi: " + resultado);
	}

}
