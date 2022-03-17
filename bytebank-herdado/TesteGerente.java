public class TesteGerente {

  public static void main(String[] args) {
    Gerente g1 = new Gerente();
    g1.setNome("Mauricio");
    g1.setMatricula("454654");
    g1.setSalario(5000);

    System.out.println(g1.getNome());
    System.out.println(g1.getMatricula());
    System.out.println(g1.getSalario());

    g1.setSenha(2709);

    boolean autenticou = g1.autentica(2709);

    System.out.println(autenticou);

    System.out.println("A bonificação eh: " + g1.getBonificacao());
  }
}
