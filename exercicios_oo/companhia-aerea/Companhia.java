public class Companhia {
    private String nomeCompanhia;
    private String numeroVoo;
    private int qtDeVoos;
    private Voo[] vetDeVoos;

    /*
	* Métodos acessores e modificadores
	*/

    public Companhia(){
        this.vetDeVoos = new Voo[5];
    }

    public String getNomeCompanhia() {
        return this.nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }

    public String getNumeroVoo() {
        return this.numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    } 

    public int getQtDeVoos() {
        return qtDeVoos;
    }

    public void setQtDeVoos(int qtDeVoos) {
        this.qtDeVoos = qtDeVoos;
    }

    public Voo getVoos(int pos) {
        return this.vetDeVoos[pos];
    }

    public void setVoos(Voo v){
		this.setQtDeVoos(this.getQtDeVoos() + 1);
		int pos = this.getQtDeVoos() - 1;
		this.vetDeVoos[pos] = v;
	} 

}
