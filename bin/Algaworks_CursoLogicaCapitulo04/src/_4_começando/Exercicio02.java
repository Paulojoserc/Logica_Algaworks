package _4_começando;

import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Double taxaFrete = 15.00;
	Double totalDaCompra;
	System.out.println("Digite o valor da sua compra");
	Double compra = sc.nextDouble();
	
	if(compra<100) {
		totalDaCompra = compra + taxaFrete;
	}
	else {
		totalDaCompra = compra;
	}
	
	System.out.println("Você vai pagar um total de: "+totalDaCompra);
	sc.close();
}
}
