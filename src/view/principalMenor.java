package view;

import controller.controllerMenor;

public class principalMenor {

	public static void main(String[] args) {
		int vetor[] = { 2, 5, -3, 9 };
		int tamanho = vetor.length;
		int menor = vetor[tamanho - 1];

		controllerMenor cm = new controllerMenor();
		int res = cm.RetornaMenor(vetor, tamanho, menor);
		System.out.println(res);

	}

}
