package metodoinstancia;

public class MetodoInstancia {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Alexandre";
		cliente.ultimoNome = "Afonso";
		cliente.telefone = "000000000000";
		cliente.email = "alexandre.afonso@algaworks.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "João";
		cliente2.ultimoNome = "Silva";
		cliente2.telefone = "348999999";
		
		
		//System.out.println("Nome cliente: "+ Cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD()); // Este é o método estático		
		System.out.println("Nome do cliente: "+ cliente.obterNomeCompleto()+ ", DDD: "+ cliente.obterDDD());
		System.out.println("Nome do cliente: "+ cliente2.obterNomeCompleto()+ ", DDD: "+ cliente2.obterDDD());
	}
}
