package _4_come�ando;

import java.util.Scanner;

public class Exercicio04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite sua idade: ");
	Integer idade = sc.nextInt();
	
	System.out.println("Digite quantos anos contribuiu com a previd�ncia");
	Integer contribuicaoPrevidencia = sc.nextInt();
	
	Integer idadeMinima = 55;
	Integer tempoContribucao = 25;
	
	if(idade >= idadeMinima && contribuicaoPrevidencia>= tempoContribucao) {
		System.out.println("Voc� pode se aposentar");
	}else {
		if(idade< idadeMinima && contribuicaoPrevidencia>= tempoContribucao) {
			System.out.println("Desculpa ainda falta "+(idadeMinima-idade)+"anos para voc� se posentar por idade ");
		}else if(idade >= idadeMinima && contribuicaoPrevidencia< tempoContribucao) {
			System.out.println("Desculpa voc� n�o tem o tempo de contribui��o suficienta para se aposentar ainda faltam "+(tempoContribucao-contribuicaoPrevidencia)+" anos");
		}else {
			System.out.println("Descupa voc� n�o tem nem idade e nem tempo suficiente de contribui��o faltam "+(idadeMinima-idade)+" anos para se aposentar por idade e "+(tempoContribucao-contribuicaoPrevidencia)+" anos por tempo de servi�o");
		}
	}

	sc.close();
}
}
