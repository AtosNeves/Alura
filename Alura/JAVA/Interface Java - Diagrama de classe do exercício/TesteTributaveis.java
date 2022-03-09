public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadorDeImposto calc = new CalculadorDeImposto();
        cc.deposita(100.0);
        
        calc.registra(cc);
        calc.registra(seguro);
        System.out.println(calc.getTotalImposto());
   
    }
}
