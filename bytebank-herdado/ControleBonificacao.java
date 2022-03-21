public class ControleBonificacao {

    private double soma;

    // Método que registra a soma das bonificacoes dos funcionarios
    public void registraBonificacao(Funcionario f){
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma(){
        return soma;
    }
    
}
