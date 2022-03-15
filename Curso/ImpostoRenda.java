public class ImpostoRenda {

  public static void main(String[] args) {
    double salario = 4000.00;
    if (salario >= 1999.99 && salario <= 3299.99) {
      System.out.println("A sua alíquota é de 15%");
      System.out.println("O valor do seu imposto é R$" + salario * 0.15);
    } else if (salario >= 3300.00) {
      System.out.println("A sua alíquota é de 22.5%");
      System.out.println("O valor do seu imposto é R$" + salario * 0.225);
    } else {
      System.out.println("Você é um pobre isento");
    }
  }
}
