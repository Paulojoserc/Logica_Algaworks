package exercicio02;

public class Produto {
	String nome;

	Integer quantidadeEstoque;
	
	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	Boolean eNecessarioReporEstoque() {
		if (quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
	}
}
