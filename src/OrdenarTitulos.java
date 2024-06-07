import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarTitulos {
    public static void main(String[] args) {
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Senhor dos Anéis"));
        titulos.add(new Titulo("Harry Potter"));
        titulos.add(new Titulo("Star Wars"));
        titulos.add(new Titulo("Game of Thrones"));

        Collections.sort(titulos);

        System.out.println("Títulos ordenados: " + titulos);
    }
}
