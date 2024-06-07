public class Cachorro extends Animal {
    private String som;

    public Cachorro(String nome, String raca, String som) {
        super(nome, raca);
        this.som = som;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public void fazerSom() {
        System.out.println(som);
    }
}
