package exercicio01;

public class Ex01 {
public static void main(String[] args) {
	Produto produto =  new Produto();
	produto.nome = "PC gamer";
	produto.quantidadeEstoque = 8;
	
	System.out.println("Necessario repor estoque do produto "+ produto.nome+ "? "+eNecessarioReporEstoque(produto));
}

static Boolean eNecessarioReporEstoque(Produto produto) {
	if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
		return true;
	}
	return false;
}

}