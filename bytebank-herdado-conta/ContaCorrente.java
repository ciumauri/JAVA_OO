public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        System.out.println("chamei metodo saca CC");
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

}
