package colecoes;

//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> listaAprovados = new HashSet<String>(); //Não garante a ordem de inserção
        //Set<String> listaAprovados = new TreeSet<String>(); ou...
        SortedSet<String> listaAprovados = new TreeSet<String>(); //Garante a ordem de inserção
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
    }
}