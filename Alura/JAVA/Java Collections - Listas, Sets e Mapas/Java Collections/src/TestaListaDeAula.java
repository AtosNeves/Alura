import java.util.ArrayList;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Alura a1 = new Alura("Revistando as ArrayLists", 21);
        Alura a2 = new Alura("Listas de objetos", 15);
        Alura a3 = new Alura("Relacionamento de listas e objetos", 15);

        ArrayList<Alura> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);
    }
}
