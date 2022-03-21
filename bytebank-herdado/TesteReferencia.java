public class TesteReferencia {
    public static void main(String[] args) {
        Analista a1 = new Analista();
        a1.setSalario(5000);
        System.out.println(a1.getBonificacao());

        Gerente g1 = new Gerente();
        g1.setSalario(9000);
        System.out.println(g1.getBonificacao());

        Funcionario f1 = new Gerente();
        f1.setSalario(1923);
        System.out.println(f1.getBonificacao());

        ControleBonificacao bonificacao = new ControleBonificacao();
        bonificacao.registraBonificacao(a1);
        bonificacao.registraBonificacao(g1);
        bonificacao.registraBonificacao(f1);
        System.out.println(bonificacao.getSoma());

    }
}
