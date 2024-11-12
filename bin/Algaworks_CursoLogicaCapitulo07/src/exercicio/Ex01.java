package exercicio;

import java.util.Scanner;

public class Ex01 {
	//Cadastrando as tarefas do dia
	
	//	Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes
	//	do dia dele. Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String[] tarefas = new String[5];
		
		System.out.println("Digite 1º tarefa");
		tarefas[0]= sc.next();
		System.out.println("Digite 2º tarefa");
		tarefas[1]= sc.next();
		System.out.println("Digite 3º tarefa");
		tarefas[2]= sc.next();
		System.out.println("Digite 4º tarefa");
		tarefas[3]= sc.next();
		System.out.println("Digite 5º tarefa");
		tarefas[4]= sc.next();
		
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println("[" + (i+1) + "]" + tarefas[i]);
		}
		
		
		sc.close();
		
		
	}

}
