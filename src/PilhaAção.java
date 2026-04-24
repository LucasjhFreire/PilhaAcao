public class PilhaAção {
    private Ação[] elementos;
    private int topo;

    public PilhaAção(int capacidade) {
        elementos = new Ação[capacidade];
        topo = -1;
    }

    public boolean isEmpty() { return topo == -1; }
    public boolean isFull() { return topo == elementos.length - 1; }

    public void push(Ação p) {
        if (!isFull()) {
            elementos[++topo] = p;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public Ação pop() {
        if (!isEmpty()) {
            Ação p = elementos[topo];
            elementos[topo--] = null;
            return p;
        }
        return null;
    }

    public Ação peek() {
        return isEmpty() ? null : elementos[topo];
    }

    public void display() {
        if (isEmpty()) System.out.println("Pilha vazia.");
        for (int i = topo; i >= 0; i--) {
            System.out.println("| " + elementos[i] + " |");
        }
    }
}