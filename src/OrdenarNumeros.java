import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(8);
        numeros.add(6);
        numeros.add(4);
        numeros.add(2);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);
    }
}
