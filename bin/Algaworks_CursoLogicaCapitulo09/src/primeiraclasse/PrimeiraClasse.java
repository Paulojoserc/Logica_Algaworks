package primeiraclasse;

public class PrimeiraClasse {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.0;
		produto.quantidade =15;
		
		exiberQuantidadeEmEstoque(produto);
	}
	
	static void exiberQuantidadeEmEstoque(Produto produto) {
		
		System.out.println("Quantidade em estoque do produto " +produto.nome + " � de" + produto.quantidade+ " unidades");
	}
}
