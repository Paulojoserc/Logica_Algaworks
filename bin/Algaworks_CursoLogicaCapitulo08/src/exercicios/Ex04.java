package exercicios;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para ver sua tabuada: ");
		Integer numero = sc.nextInt();

		imprimirTabuada(numero, 0);
		sc.close();
	}

	public static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {

		if (multiplicador > 10) {
			return;
		}

		Integer resultado = multiplicando * multiplicador;
		System.out.printf("%d x %d = %d%n", multiplicando, multiplicador, resultado);

		imprimirTabuada(multiplicando, multiplicador + 1);
	}
}
