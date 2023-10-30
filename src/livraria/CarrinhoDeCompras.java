package livraria;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {
    private double total; // Initialize the 'total' variable.

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        
        total += produto.getValor(); // Use the 'total' variable with the '+=' operator.
    }
    
    public double getTotal() {
    	return total;
    }
}
