package searches.DFS;

import searches.DFS.src.Deep;
import searches.DFS.src.Node;

public class Main {
    public static void main(String[] args) {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node5 = new Node(5);

        node0.setNodeEsquerda(node1);
        node1.setNodeEsquerda(node3);
        node3.setNodeEsquerda(node5);
        node5.setNodeEsquerda(node2);
        

        Deep bep = new Deep(2);

        bep.buscarResultado(node0);
        bep.exibirTextoResposta();
    }
}
