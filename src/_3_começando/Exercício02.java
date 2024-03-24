package _3_começando;

import java.util.Scanner;

public class Exercício02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o Seu primeiro nome");
	String nome = sc.next();
	
	System.out.println("Digite o Seu sobrenome");
	String sobrenome = sc.next();
	
	System.out.println("Seu nome completo é: "+nome+" "+sobrenome);
	
	sc.close();
}
}
