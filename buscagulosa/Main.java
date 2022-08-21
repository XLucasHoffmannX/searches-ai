package buscagulosa;

public class Main {
    public static void main(String[] args) {
        Graph<String> g = new Graph<>();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");

        g.addEdge(5, "A", "C");
        g.addEdge(2, "A", "B");
        g.addEdge(1, "B", "C");
        g.addEdge(1, "C", "D");
        g.addEdge(2, "B", "D");

        BuscaGulosa buscagulosa = new BuscaGulosa(g);
        int r = buscagulosa.runSearch(3);

        if (r == -1) System.out.println("Não foi possivel encontrar o destino!");
    }

}