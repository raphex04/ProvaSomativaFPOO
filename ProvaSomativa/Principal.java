package ProvaSomativa;

public class Principal {
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido (11, "Camiseta",2);
		System.out.println("Id: " + pedido.getId());
		System.out.println("Produto: " + pedido.getProduto());
		System.out.println("Quantidade: "+ pedido.getQuantidade());
		
	}
}