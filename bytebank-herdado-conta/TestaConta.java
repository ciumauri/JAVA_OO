public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100d);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200d);

        cc.transfere(10d, cp);
        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

    }
}
