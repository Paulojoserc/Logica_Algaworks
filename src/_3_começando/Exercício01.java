package _3_come�ando;

import java.util.Scanner;

public class Exerc�cio01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um n�mero");
	int num = sc.nextInt();
	
	System.out.printf("Este n�mero ao quadrado �: %d ", (int)Math.pow(num, num));
	
	sc.close();
}
}
