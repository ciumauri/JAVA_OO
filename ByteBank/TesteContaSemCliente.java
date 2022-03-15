public class TesteContaSemCliente {

  public static void main(String[] args) {
    Cliente cl1 = new Cliente();
    cl1.setNome("Mauricio Oliveira");
    cl1.setCpf("816.998.995-25");
    cl1.setProfissao("Engenheiro");

    Conta c1 = new Conta(123, 1556);
    // Associando o cliente X a conta Y
    c1.setTitular(cl1);

    c1.setSaldo(100);
    System.out.println(
      "Saldo inicial da conta do(a) " +
      c1.getTitular().getNome() +
      " é: R$ " +
      c1.getSaldo()
    );

    //Instanciação direta
    Conta c2 = new Conta(151, 6565);
    System.out.println("Saldo inicial da conta do(a) " + c2.getSaldo());
    c2.setTitular(new Cliente());
    System.out.println(c2.getTitular());
    c2.getTitular().setNome("Patricia Camargo");
    System.out.println(c2.getTitular().getNome());
  }
}
