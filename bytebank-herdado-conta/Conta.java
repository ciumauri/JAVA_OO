public abstract class Conta {
  // atributos do objeto
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total;

  // construtor inicial do objeto
  public Conta(int agencia, int numero) {
    total++;
    // System.out.println("O numero de contas criadas é: " + Conta.total);

    this.agencia = agencia;
    this.numero = numero;
    // this.saldo = 100;
    // System.out.println("Estou criando uma conta " + this.numero);
  }

  // metodos do objeto
  public void deposita(double valor) {
    this.saldo += valor;
  }

  public boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean transfere(double valor, Conta destino) {
    if (this.saca(valor)) {
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getAgencia() {
    if (agencia <= 0) {
      System.out.println("Não é permitido número <= 0");
    }
    return this.agencia;
  }

  public int getNumero() {
    if (agencia <= 0) {
      System.out.println("Não é permitido número <= 0");
    }
    return this.numero;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return Conta.total;
  }
}
