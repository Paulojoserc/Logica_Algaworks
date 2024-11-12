package exercicios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avan�ado" };

		System.out.println("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		System.out.println("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = sc.nextInt();

		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		iterarPosisaoInvalida(posicaoValida);

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cart�o", "Boleto" };
		System.out.println("Escolha dentre as formas de pagamento abaixo:");

		iterarEExibirPosicoesDoVetorString(formasPagamento);
		System.out.println("Sua forma de pagamenrto escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = sc.nextInt();

		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

		iterarPosisaoInvalida(posicaoValida);
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		System.out.println(
				"O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);

		sc.close();
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
//		System.out.println("[" + i + "]" + vetor[i]);
			System.out.println(i + ". " + vetor[i]);
		}
	}
	
	static void iterarPosisaoInvalida(Boolean posicao) {
		if(!posicao) {
			encerraProgramaPorCausaDaPosicaoInvalida();
		}
	}

	static void imprimirTraco() {
		System.out.println("-------------------------------------------------------------------------------------");
	}

	static void encerraProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posi��o invalida!");
		System.exit(1);
	}

}
