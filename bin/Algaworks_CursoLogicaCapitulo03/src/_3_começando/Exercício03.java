package _3_começando;

import java.util.Scanner;

public class Exercício03 {
	
	static final Integer MEDIA = 70;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digita a nota do Aluno");
	int nota = sc.nextInt();
	
	if(nota>=MEDIA) {
		System.out.println("Aluno aprovado");
	}else {
		System.out.println("Aluno reprovado");
	}
	
	sc.close();
}
}
