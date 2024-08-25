package _4_começando;

import java.util.Scanner;

public class Exercicio04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite sua idade: ");
	Integer idade = sc.nextInt();
	
	System.out.println("Digite quantos anos contribuiu com a previdência");
	Integer contribuicaoPrevidencia = sc.nextInt();
	
	Integer idadeMinima = 55;
	Integer tempoContribucao = 25;
	
	if(idade >= idadeMinima && contribuicaoPrevidencia>= tempoContribucao) {
		System.out.println("Você pode se aposentar");
	}else {
		if(idade< idadeMinima && contribuicaoPrevidencia>= tempoContribucao) {
			System.out.println("Desculpa ainda falta "+(idadeMinima-idade)+"anos para você se posentar por idade ");
		}else if(idade >= idadeMinima && contribuicaoPrevidencia< tempoContribucao) {
			System.out.println("Desculpa você não tem o tempo de contribuição suficienta para se aposentar ainda faltam "+(tempoContribucao-contribuicaoPrevidencia)+" anos");
		}else {
			System.out.println("Descupa você não tem nem idade e nem tempo suficiente de contribuição faltam "+(idadeMinima-idade)+" anos para se aposentar por idade e "+(tempoContribucao-contribuicaoPrevidencia)+" anos por tempo de serviço");
		}
	}

	sc.close();
}
}
