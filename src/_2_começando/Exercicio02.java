package _2_come�ando;

import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a sua altura");
	double altura = sc.nextDouble();
	
	System.out.println("Digite o seu peso");
	
	double peso = sc.nextDouble();
	
	double imc = peso / (Math.sqrt(altura));
	
	System.out.printf("O seu IMC �: %.2f ",imc);
			
		sc.close();	
}
}
