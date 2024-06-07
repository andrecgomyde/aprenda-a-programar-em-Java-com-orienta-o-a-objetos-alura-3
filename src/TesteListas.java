import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteListas {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Maçã");
        arrayList.add("Banana");
        arrayList.add("Laranja");

        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Carro");
        linkedList.add("Moto");
        linkedList.add("Bicicleta");

        System.out.println("LinkedList: " + linkedList);
    }
}
