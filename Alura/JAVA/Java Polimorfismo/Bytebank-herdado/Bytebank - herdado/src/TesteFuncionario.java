public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();

        nico.setNome("Nico Steppat");
        nico.setCpf("123456789-9");
        nico.setSalario(1000);
        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

        for (double i = 0; i <= 90; i = i + 0.01) {
            System.out.println(i);
        }

    }
}