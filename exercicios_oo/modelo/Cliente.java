public class Cliente {
	private int idCliente;
	private String nomeCliente;
	
	/*
	* Métodos acessores modificadores
	*/
	public void setIdCliente(int idCliente){
		this.idCliente = idCliente;
	}
	
	public int getIdCliente(){
		return idCliente;
	}
	
	public void setNomeCliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	public String getNomeCliente(){
		return nomeCliente;
	}
}