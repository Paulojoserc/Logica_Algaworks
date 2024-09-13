package Atividade;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o peso: ");
		Double peso = sc.nextDouble();

		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
//		Formula 1
		
//		if(pesoLeve) {
//			System.out.println("O lutador(a) é peso leve.");
//		}
//		if (pesoMedio) {
//			System.out.println("O lutador(a) é peso médio.");
//		}
//		if (pesoPesado) {
//			System.out.println("O lutador(a) é peso Pesado.");
//		}

//		Formula 2
		
//		if (pesoLeve) {
//			System.out.println("O lutador(a) é peso leve.");
//		} else {
//			if (pesoMedio) {
//				System.out.println("O lutador(a) é peso médio.");
//			} else {
//				if (pesoPesado) {
//					System.out.println("O lutador(a) é peso Pesado.");
//				}
//			}
//		}
		
//      Formula 3
		if (pesoLeve) {
			System.out.println("O lutador(a) é peso leve.");
		} else if (pesoMedio) {
			System.out.println("O lutador(a) é peso médio.");
		} else if (pesoPesado) {
			System.out.println("O lutador(a) é peso Pesado.");
		} else {
			System.out.println("O lutador não se encaixa em categoria alguma.");
		}

		sc.close();
	}

}
