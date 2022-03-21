public class Produto {
	private int codigoProduto;
	private String marca;
	private String descricao;
	
	/*
	* Métodos acessores e modificadores
	*/
	public void setCodigoProduto(int codigoProduto){
		this.codigoProduto = codigoProduto;
	}
	
	public int getCodigoProduto(){
		return codigoProduto;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
}