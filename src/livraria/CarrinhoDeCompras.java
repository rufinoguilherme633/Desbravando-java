package livraria;

public class CarrinhoDeCompras {
    private double total; // Initialize the 'total' variable.

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.05);
 
        total += livro.getValor(); // Use the 'total' variable with the '+=' operator.
    }
    
    public double getTotal() {
    	return total;
    }
}
