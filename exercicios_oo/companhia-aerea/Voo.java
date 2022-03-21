public class Voo {
	private int codigoVoo;
	private int assentoVoo;
	private Passageiro[] vetPassageiro;
	
	/*
	* Métodos acessores e modificadores
	*/

	public int getCodigoVoo() {
		return codigoVoo;
	}

	public void setCodigoVoo(int codigoVoo) {
		this.codigoVoo = codigoVoo;
	}
	
	public int getAssentoVoo() {
		return assentoVoo;
	}

	public void setAssentoVoo(int assentoVoo) {
		this.assentoVoo = assentoVoo;
	}	

	public Passageiro getPassageiro(int pos) {
		return this.vetPassageiro[pos];
	}

	public void setPassageiro(int pos, Passageiro passageiro){
		this.vetPassageiro[pos] = passageiro;
	}
	
}