import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Código criado para criar novos objetos para classe Pessoa e listar cada pessoa com o ArrayList
        Pessoa joaoSilva = new Pessoa();
        joaoSilva.setNome("Joao Silva");
        joaoSilva.setIdade(20);

        Pessoa mariaSilva = new Pessoa();
        mariaSilva.setNome("Maria Silva");
        mariaSilva.setIdade(19);

        Pessoa antonioSilva = new Pessoa();
        antonioSilva.setNome("Antonio Silva");
        antonioSilva.setIdade(21);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(joaoSilva);
        listaDePessoas.add(mariaSilva);
        listaDePessoas.add(antonioSilva);

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);

        // Código criado para criar novos objetos para classe Produtos e listar cada produto com o ArrayList
        Produto computador = new Produto("Computador", 5600.00, 20);
        Produto teclado = new Produto("Teclado", 550.00, 40);
        Produto mouse = new Produto("Mouse", 200.00, 60);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(computador);
        listaDeProdutos.add(teclado);
        listaDeProdutos.add(mouse);

        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
        System.out.println("Primeira produto: " + listaDeProdutos.get(0).getNome());
        System.out.println(listaDeProdutos);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Software", 150.99, 10, "31/12/2026");

        System.out.println("Nome: " + produtoPerecivel.getNome());
        System.out.println("Preço: " + produtoPerecivel.getPreco());
        System.out.println("Quantidade: " + produtoPerecivel.getQuantidade());
        System.out.println("Data de Validade: " + produtoPerecivel.getDataValidade());

        // Código criado para criar novos objetos para classe Sorvete e listar novos sorvetes com o ArrayList
        Sorvete chocolate = new Sorvete("Chocolate", true);
        Sorvete baunilha = new Sorvete("Baunilha", true);
        Sorvete morango = new Sorvete("Morango", true);

        ArrayList<String> sabores = new ArrayList<>();
        sabores.add("Chocolate");
        sabores.add("Baunilha");
        sabores.add("Morango");

        for (String sabor : sabores) {
            System.out.println(sabor);
        }

        // Código criado para criar novos objetos para as classes Animal e Cachorro
        Cachorro cachorro = new Cachorro("Rex", "Labrador", "Latido");
        Animal animal = (Animal) cachorro;

        System.out.println("Nome: " + animal.getNome());
        System.out.println("Raça: " + animal.getRaca());
        animal.fazerSom();


        // Código criado para implementar novos objetos para classe Circulo
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(4);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
