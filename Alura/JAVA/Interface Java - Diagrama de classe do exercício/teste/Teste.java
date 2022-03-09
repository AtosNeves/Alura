import java.util.ArrayList;

class Teste {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<>();
       
        
          Conta cc = new ContaCorrente(22, 22);
          lista.add(cc);
          Conta cc2 = new ContaCorrente(22, 22);
          lista.add(cc2);
          
          // System.out.println(lista.size());
          
          Conta ref = (Conta) lista.get(0);
          
          lista.remove(0);
          System.out.println(lista.size());
          
          Conta cc3 = new ContaCorrente(333, 113);
          lista.add(cc3);
          Conta cc4 = new ContaCorrente(444, 222);
          lista.add(cc4);
          
          
          for (int i = 0; i < lista.size(); i++) {
          Object oRef = lista.get(i);
          System.out.println(oRef);
          }
          
          for (Conta oRef : lista) {
          System.out.println(oRef.get());
          }
         
        for (Conta conta : lista) {
            if (conta.equals(cc2)) {
                System.out.println("Já tenho essa conta");

            }
        }
    }

}