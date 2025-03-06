package encapsulamento;

public class Cliente {
	
	//String nome;
	
	String primeiroNome;
	
	String soubreNome;
	
	String telefone;
	
	String getNome() {
		return primeiroNome + " " + soubreNome;
	}
	
	void setNome(String nome) {
		String[] nomeCompleto =  nome.split(" ");
		primeiroNome =  nomeCompleto[0];
		soubreNome =  nomeCompleto[1];
	}

	String getPrimeiroNome() {
		return primeiroNome;
	}

	void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	String getSoubreNome() {
		return soubreNome;
	}

	void setSoubreNome(String soubreNome) {
		this.soubreNome = soubreNome;
	}

	String getTelefone() {
		return telefone;
	}

	void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
