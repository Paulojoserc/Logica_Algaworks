package _3_come�ando;

import java.util.Scanner;

public class Exerc�cio02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o Seu primeiro nome");
	String nome = sc.next();
	
	System.out.println("Digite o Seu sobrenome");
	String sobrenome = sc.next();
	
	System.out.println("Seu nome completo �: "+nome+" "+sobrenome);
	
	sc.close();
}
}
