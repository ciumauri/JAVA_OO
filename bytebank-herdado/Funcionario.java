//Classe abstrata, nao pode ser instnciada
public abstract class Funcionario {

  private String nome;
  private String matricula;
  private double salario;

  // Metodo abstrato sem corpo, obrigatorio implementacao na classe filha
  public abstract double getBonificacao();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
