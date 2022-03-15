public class TesteMetodos {

  public static void main(String[] args) {
    Cliente cl1 = new Cliente();
    cl1.setNome("Mauricio Oliveira");
    cl1.setCpf("816.998.995-25");
    cl1.setProfissao("Engenheiro");

    Conta c1 = new Conta(1212, 12121);
    c1.setTitular(cl1);

    c1.setSaldo(100);
    System.out.println(
      "Saldo inicial da conta do(a) " +
      c1.getTitular().getNome() +
      " é: R$ " +
      c1.getSaldo()
    );

    Cliente cl2 = new Cliente();
    cl2.setNome("Patricia Camargo");
    cl2.setCpf("816.000.995-00");
    cl2.setProfissao("Acompanhante");

    Conta c2 = new Conta(151, 54545);
    c2.setTitular(cl2);
    c2.setSaldo(1000);
    System.out.println(
      "Saldo inicial da conta do(a) " +
      c2.getTitular().getNome() +
      " é: R$ " +
      c2.getSaldo()
    );
  }
}
