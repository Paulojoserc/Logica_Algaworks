package Exercicio;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double faturamentoReal ;
		Double metaFaturamentoAnual;
		Double mediaSalarial;
		
	

		System.out.println("Digite o valor do faturamento do ano atual");
		faturamentoReal  = sc.nextDouble();
		
		System.out.println("Digite o valor do faturamento do ano passado! ");
		metaFaturamentoAnual = sc.nextDouble();
		
		System.out.println("Digite a média salarial do funcionário");
		mediaSalarial = sc.nextDouble();
		
		if(faturamentoReal >=metaFaturamentoAnual) {
			System.out.printf("Parabéns você recebu um bônus de R$: %.2f", mediaSalarial);
		}else if(faturamentoReal  >= 0.8 * metaFaturamentoAnual) {
			System.out.printf("Parabéns você irar receber um bônus de R$: %.2f, ", (0.8* mediaSalarial));
		}else {
			System.out.println("Não foi atingido as metas para receber bônus");
		}
		
		
		sc.close();

	}
}
