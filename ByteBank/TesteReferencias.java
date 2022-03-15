public class TesteReferencias {

  public static void main(String[] args) {
    Conta minhaConta = new Conta(121, 54545);
    minhaConta.setSaldo(500);

    System.out.println(minhaConta.getSaldo());
  }
}
