package livraria;

public class RegistroDeVendas {
public static void main(String[] args) {
	System.out.println("CLass RegistroDeVendas");
	
	Autor autor = new Autor();
	autor.setNome("Mauricio Aniche");
	LivroFisico fisico = new LivroFisico(autor);
	fisico.setNome("Test-Driven Development");
fisico.setValor(10);
	
	Ebook ebook = new Ebook(autor);
	ebook.setNome("Ebook test-deiven Development");
	ebook.setValor(50);
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adiciona(fisico);
	carrinho.adiciona(ebook);
	System.out.println("Total" + carrinho.getTotal());

}
}
