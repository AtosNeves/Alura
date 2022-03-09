public class TesteReferencia {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);
        controle.registra(ev);
        System.out.println(controle.getSoma());
        System.out.println();

    }
}
