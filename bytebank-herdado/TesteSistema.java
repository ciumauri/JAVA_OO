public class TesteSistema {
    public static void main(String[] args) {
        Autenticavel g = new Gerente();
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();

        Autenticavel g1 = new Gerente();
        g1.setSenha(2222);

        Autenticavel c1 = new Cliente();
        c1.setSenha(2222);

        Autenticavel a1 = new Administrador();
        a1.setSenha(2222);

        si.autentica(g);
        si.autentica(g1);
        si.autentica(c1);
        si.autentica(a1);
    }

}
