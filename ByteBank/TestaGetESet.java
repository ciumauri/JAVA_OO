public class TestaGetESet {

  public static void main(String[] args) {
    //instacinando uma nova conta
    Conta conta1 = new Conta(111, 123456);
    Conta conta2 = new Conta(112, 123456);
    Conta conta3 = new Conta(113, 123456);
    Conta conta4 = new Conta(114, 123456);
    Conta conta5 = new Conta(111, 123456);
    Conta conta6 = new Conta(111, 123456);
    System.out.println("O número de contas abertas é: " + Conta.getTotal());
    //Inseção de saldo da conta com metódo Set
    conta1.setSaldo(500);
    //consulta do saldo através do método Get
    System.out.println(
      "Agência: " + conta1.getAgencia() + " e Conta: " + conta1.getNumero()
    );
    //instanciando um novo cliente
    Cliente cliente1 = new Cliente();

    //Conta Titular recebe Cliente
    conta1.setTitular(cliente1);
    //populando objeto com o metódo Set
    cliente1.setNome("Mauricio Oliveira");
    //passagem do parametro direto pela sua classe
    System.out.println(cliente1.getNome());
    //passagem do parametro via referência da classe
    System.out.println(conta1.getTitular().getNome());
    //Conta pega Titular e altera profissão
    conta1.getTitular().setProfissao("programador");
    System.out.println(conta1.getTitular().getProfissao());
    //Mesmo código em duas linhas criando variável temporaria
    Cliente titularDaConta = conta1.getTitular();
    titularDaConta.setProfissao("programador");
    System.out.println(titularDaConta.getProfissao());
  }
}
