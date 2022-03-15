public class TestaJava {

  public static void main(String[] args) {
    String saudacao = "Olá, meu nome é ";
    String nome = "Rômulo ";
    String continuacao = "e minha idade é ";
    int idade = 100;
    System.out.println(saudacao + nome + continuacao + idade);

    int idades = 16;
    int quantidadePessoas = 1;
    if (idades >= 18 || quantidadePessoas >= 3) {
      System.out.println("Você pode pode entrar");
    } else {
      System.out.println("Você é um babaca, volte para casa");
    }
  }
}
