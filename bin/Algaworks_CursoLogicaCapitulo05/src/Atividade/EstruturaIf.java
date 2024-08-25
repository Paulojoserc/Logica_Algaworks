package Atividade;

public class EstruturaIf {
	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean movimentaPeloMenosMetadeDoValor = true;
		Boolean aContaTemTempoSuficenteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		//Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficenteDeAbertura && temNomeLimpo ;
		
		if (movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficenteDeAbertura && temNomeLimpo) {
			System.out.println("Sim! Pode liberar emprestimo");
	}
	}
}