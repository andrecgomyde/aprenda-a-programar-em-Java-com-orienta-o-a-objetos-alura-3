import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolimorfismoListas {
    public static void main(String[] args) {
        List<String> lista;

        // Usando ArrayList
        lista = new ArrayList<>();
        lista.add("Cachorro");
        lista.add("Gato");
        lista.add("Papagaio");

        System.out.println("ArrayList (usando polimorfismo): " + lista);

        // Usando LinkedList
        lista = new LinkedList<>();
        lista.add("Fusca");
        lista.add("Kombi");
        lista.add("Caminhão");

        System.out.println("LinkedList (usando polimorfismo): " + lista);
    }
}
