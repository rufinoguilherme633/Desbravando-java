package livraria;

public abstract class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	// temos dois costrutores de classe public Livro -> chamado de overloade(sobrecarga)
	public Livro(Autor autor) {
		System.out.println("--------Novo livro Criado-----------");
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
//	public Livro() {
//		System.out.println("--------Novo livro Criado-----------");
//
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	 public void setAutor(Autor autor) {
	        this.autor = autor;
	    }
	 
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	void mostarDetalhes() {
		String mensagem = "Mostrar detalhes do livro";

		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		if (this.temAutor()) {
			autor.mostarDetalhes();

		} else {
			System.out.println("Sem autor");
		}
		System.out.println("--");
	}

	
	public abstract boolean aplicaDescontoDe(double porcentagem);

//	public abstract boolean aplicaDescontoDe(double porcentagem) {
////		if (porcentagem > 0.3) {
////			return false;
////		}
////
////		this.valor -= this.valor * porcentagem;
////		return true;
//		return false;
//	}

	boolean temAutor() {
		return this.autor != null;
	}
	


}
