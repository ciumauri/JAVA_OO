public class TesteFuncionario {

  public static void main(String[] args) {
    Funcionario mauricio = new Funcionario();
    mauricio.setNome("Mauricio Oliveira");
    mauricio.setMatricula("1515456");
    mauricio.setSalario(1500);

    System.out.println(mauricio.getNome());
    System.out.println(mauricio.getBonificacao());
  }
}
