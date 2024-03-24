package _3_começando;

import java.util.Scanner;

public class Exercício01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número");
	int num = sc.nextInt();
	
	System.out.printf("Este número ao quadrado é: %d ", (int)Math.pow(num, num));
	
	sc.close();
}
}
