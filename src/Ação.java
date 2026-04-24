public class Ação {
    private String nome;

    public Ação(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ação " + nome;
    }
}
