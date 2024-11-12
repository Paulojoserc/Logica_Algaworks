package atividade;

public class Recursividade {
	public static void main(String[] args) {
		// imprimirNumero(0);
		String[] alunos = new String[] { "Alexandre", "João", "Maria" };
		iterarNomes(alunos);
		imprimirTraco();
		iterarIfNomes(alunos, 0);
		
	}

	static void imprimirNumero(Integer numero) {
		System.out.println("Número: " + numero);

		if (numero < 10) {

			imprimirNumero(++numero);
		}

	}

	static void iterarNomes(String[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno: " + alunos[i]);
		}
	}
	static void iterarIfNomes(String[] alunos, Integer indice) {
		System.out.println("Aluno: "+alunos[indice]);
		
		if (++indice < alunos.length) {
			iterarIfNomes(alunos, indice);
		}
	}
	static void imprimirTraco() {
		System.out.println("------------------------------------------");
	}
}
