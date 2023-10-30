package br.com.casadocodigo.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.10");

		Autor outroAutor = new Autor();
		outroAutor.setNome("Guilherme");
		outroAutor.setEmail("rufinoguilherme@caelum.com.br");
		outroAutor.setCpf("123.456.789.10");

//		if (autor == autor2) {
//			System.out.println("Iguais,mesmo autor");
//		}else{
//			System.out.println("hein!? Por que diferentes");
//		}
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Pratico");
		livro.setDescricao("Novos recursos da linguage");
		livro.setValor(59.90);
		//livro.setIsbn("978-85-66250-46-6");

		// livro.setAutor(autor);
		livro.mostarDetalhes();

		Ebook OutroLivro = new Ebook(outroAutor);
		OutroLivro.setNome("Lógica de programação");

		OutroLivro.setDescricao("Crie seus primeiros programas");
		OutroLivro.setValor(59.90);
		OutroLivro.setIsbn("978-85-66250-22-0");

		OutroLivro.setAutor(autor);

		OutroLivro.mostarDetalhes();
		if (!OutroLivro.aplicaDescontoDe(0.3)) {
			System.out.println("DEsconto nao pode ser maior que 30%");
		} else {
			System.out.println("valor com desconto" + OutroLivro.getValor());
		}

		
		Autor autor3 = new Autor();
		autor3.setNome("Amanda");
		autor3.setEmail("Amanda.turini@caelum.com.br");
		autor3.setCpf("123.456.789.10");
        // Criar um ebook
        Ebook ebook = new Ebook(autor3);
        ebook.setNome("Ebook Java");
        ebook.setDescricao("Ebook sobre Java");
        ebook.setValor(19.99);
        ebook.setIsbn("978-1234567890");

        // Configurar o watermark do ebook
        ebook.setWaterMark("Watermark para proteção");
        // Mostrar os detalhes do ebook
       ebook.mostarDetalhes();
       // Aplicar um desconto
       if (ebook.aplicaDescontoDe(0.10)) {
           System.out.println("Desconto aplicado com sucesso. Novo valor: " + ebook.getValor());
       } else {
           System.out.println("Desconto não aplicado. O desconto é maior que 15%.");
       }
	}
}
