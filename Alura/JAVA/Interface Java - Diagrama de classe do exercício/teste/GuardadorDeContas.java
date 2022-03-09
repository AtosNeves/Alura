public class GuardadorDeContas {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Object[10];
        this.posicaoLivre =0;
    }

    public void adciona(Object ref) {

        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }


    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public Object getReferencia(int i) {
        return referencias[i];
    }

   

}
