package _4_come�ando;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Double total=0.0;
	System.out.println("Digite o valor da conta de luz");
	total +=  sc.nextDouble();
	
	System.out.println("Digite o valor da conta de �gua");
	total +=  sc.nextDouble();
	System.out.println("Digite o valor da conta de telefone");
	total +=  sc.nextDouble();
	System.out.println("Digite o valor da conta da escola");
	total +=  sc.nextDouble();
	System.out.println("Digite o valor dos Gastos com supermecado");
	total +=  sc.nextDouble();
	
	System.out.println("Total dos gastos mensais "+total);
	
	
	
	sc.close();
}
}
