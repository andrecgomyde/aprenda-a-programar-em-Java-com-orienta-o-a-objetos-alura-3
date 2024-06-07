public class Sorvete {
    private String sabor;
    private boolean cobertura;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isCobertura() {
        return cobertura;
    }

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    public Sorvete(String sabor, boolean cobertura) {
        this.sabor = sabor;
        this.cobertura = cobertura;
    }

    public String toString() {
        return "Sabor: " + sabor + ", cobertura: " + cobertura;
    }
}
