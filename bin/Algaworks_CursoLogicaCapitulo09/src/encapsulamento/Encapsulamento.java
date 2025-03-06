package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		
		Cliente cliente =  new Cliente();
		
		cliente.setNome ("Alexandre Afonso");
		cliente.setTelefone ("349222354737");
		
		System.out.println("Nome do Cliente: "+ cliente.getNome());
		System.out.println("Nome do Cliente: "+ cliente.getPrimeiroNome());
		System.out.println("Nome do Cliente: "+ cliente.getSoubreNome());
	}

}
