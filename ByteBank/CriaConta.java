public class CriaConta {

  public static void main(String[] args) {
    Conta c1 = new Conta(074, 154);
    c1.setSaldo(200);
    c1.getTitular().setNome("Mauricio Oliveira");
    System.out.println("O saldo inicial da conta de C1 é: " + c1.getSaldo());

    Conta c2 = new Conta(075, 5456);
    c2.setSaldo(50);
    System.out.println("O saldo inicial da conta de C2 é: " + c2.getSaldo());
  }
}
