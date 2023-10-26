package livraria;

public class Autor {
	private String nome;
	private String email;
	private String cpf;
	void mostarDetalhes() {

		System.out.println("DETALHES DO AUTOR");
		System.out.println("Autor: " + nome);
		System.out.println("email: " + email);
		System.out.println("CPF: " + cpf);



	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
