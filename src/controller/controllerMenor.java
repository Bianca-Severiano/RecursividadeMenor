package controller;

public class controllerMenor {

	public controllerMenor() {
		super();
	}
	
	public int RetornaMenor(int[] vetor, int tamanho, int menor) {		
		/* Quando tamanho do vetor for 0 retorna o valor
		 *  da última posição do vetor que servirá como primeiro 
		 *  "menor valor" a fim de ser comparado com as
		 *   demais posições até que se encontre um menor que
		 *   ele*/
		
		if (tamanho == 0) {			
			return menor;		
		} else {						
			tamanho--;
		/* Após o retorno do valor na posição 0, que assumirá o primeiro 
		 * valor de menor, serão feitas consecutivas comparações com
		 * as posições posteriores a fim de verificar se há outro menor, e
		 * se for o caso retorná-lo para que seja comparado ao próximo, até que
		 * se atinja a última posição do vetor --> vetor[3]
		 * */
			int res = RetornaMenor(vetor, tamanho, vetor[tamanho]);	
			if (res < menor) {
				return res;
			} else {
				return menor;
			}
			
		}
	}

}

/* vetor {2, 5, -3, 9}
 * tamnho == 0 -> retorna 2
 * 		tamanho == 1 -> compara valor 2 do retorno anterior com valor na posição 
 * 		1 que é igual a 5, retornando o menor, nesse caso o 2 
 * 
 *      tamanho == 2 -> compara valor 2 do retorno anterior com valor na posição 
 * 		2 que é igual a -3, retornando o menor, nesse caso o -3 
 * 
 *           segue consecutivamente até chegar a primeira chamada da recursiva onde 
 *           retornar o menor valor oficial
 * */

