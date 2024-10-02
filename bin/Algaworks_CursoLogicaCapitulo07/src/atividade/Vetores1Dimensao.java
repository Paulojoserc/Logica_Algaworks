package atividade;

import java.util.Scanner;

public class Vetores1Dimensao {
	public static void main(String[] args) {
//	String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//	
//	System.out.println("Escolha o sabor:");
//	
//	for (int i = 0; i < cardapio.length; i++) {
//		System.out.println("["+i+"]"+ cardapio[i]);
//	}
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println("Digite o número referente ao sabor: ");
//	Integer saborEscolido = sc.nextInt();
//	
//	System.out.println("Você escolheu o sabor: "+cardapio[saborEscolido]);
//	
//	sc.close();

//		String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto" };
//		// troca valor no vetor
//		cardapio[3] = "Frango";
//
//		for (int i = 0; i < cardapio.length; i++) {
//			System.out.println("[" + i + "]" + cardapio[i]);
//		}

		String[] cardapio = new String[4];
		cardapio[0] = "Calabresa";
		cardapio[1] = "Atum";
		cardapio[2] = "Queijo";
		cardapio[3] = "Presunto";

		for (int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "]" + cardapio[i]);
		}

	}
}
