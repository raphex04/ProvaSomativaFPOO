package ProvaSomativa;

public class Pedido {
	private Long id;
	private String produto;
	private int quantidade;
	public Pedido(long id, String produto, int quantidade) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
