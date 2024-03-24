package _3_começando;

import java.util.Scanner;

public class Exercício04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o valor do produto: ");
	Double produto = sc.nextDouble();
	System.out.println();
	System.out.println("Digite a quantidade do produto: ");
	Integer quantidade = sc.nextInt();
	
	Double subTotal = produto * quantidade;
	Double descontoSubTotal = 0.0; 
	if(quantidade >=10) {
		descontoSubTotal = subTotal - (subTotal * 0.1);
		System.out.println(descontoSubTotal);
	}
	
	sc.close();
}
}
