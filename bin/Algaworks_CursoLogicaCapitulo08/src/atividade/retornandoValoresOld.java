package atividade;

import java.util.Scanner;

public class RetornandoValoresOld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avan�ado" };

		imprimir("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		
		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que voc� deseja � o: ", sc);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);

		if (!posicaoValida) {
			encerraProgramaPorCausaDaPosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cart�o", "Boleto" };
		
		imprimir("Escolha dentre as formas de pagamento abaixo:");

		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamenrto escolhida �: ", sc);

		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);

		if (!posicaoValida) {
			encerraProgramaPorCausaDaPosicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);

		sc.close();
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner sc) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = sc.nextInt();
		
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
	//		System.out.println("[" + i + "]" + vetor[i]);
			imprimir(i+". "+ vetor[i]);
		}
	}

	static void imprimirTraco() {
		imprimir("-------------------------------------------------------------------------------------");
	}

	static void encerraProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posi��o invalida!");
		System.exit(1);
	}
	
}
