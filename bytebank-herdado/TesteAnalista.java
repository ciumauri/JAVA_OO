public class TesteAnalista {

    public static void main(String[] args) {
        
        Analista a1 = new Analista();

        a1.setSalario(3000);

        double boniAnalista = a1.getBonificacao();

        System.out.println(boniAnalista);

    }
    
}
