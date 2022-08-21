package buscagulosa;
import java.util.ArrayList;

public class BuscaGulosa {
    private ArrayList<Vertex<String>> open = new ArrayList<>();
    private ArrayList<Vertex<String>> close = new ArrayList<>();

    Graph<String> graph = new Graph<>();

    public BuscaGulosa(Graph<String> g) {
        this.graph = g;
        open.add(graph.getVertex(0));
    }

    public int through() {
        double menor = Double.MAX_VALUE;
        int aux = 0;
        for (int i = 0; i < open.size(); i++) {
            for (int j = 0; j < open.get(i).getEdge_2().size(); j++) {
                    if (this.open.get(i).returnWeight(j) < menor) {
                    menor = this.open.get(i).returnWeight(j);
                    aux = i;
                }
            }
        }
        return aux;
    }

    public int runSearch(int n) {
        Vertex<String> v = (open.get(0));
        ArrayList<Vertex<String>> adjacents = new ArrayList<>();
        while (!open.isEmpty()) {
            int lessH = through();
            Vertex<String> aux =  this.open.get(lessH);
            this.close.add(aux);
            this.open.remove(lessH);
            v=aux;
            for (int i = 0; i < v.getEdge_2().size(); i++) {
                adjacents.add(v.getEndVertex(i));
            }
            for (Vertex<String> a : adjacents) {
                if (a.getD() == graph.getVertex(n).getD()) {
                    for(Vertex<String> c : close){
                        System.out.print(c.getD() + " --> ");
                    }
                    System.out.println(graph.getVertex(n).getD());
                    return 0;
                }
                if (!this.open.contains(a) || !this.close.contains(a)) {
                    this.open.add(a);
                }
            }
        }
       return -1;
    }
}