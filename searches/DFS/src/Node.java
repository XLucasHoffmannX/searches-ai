package searches.DFS.src;

public class Node {
    private Node noPai;
    private Node nodeEsquerda;
    private Node nodeDireita;
    private int valor;

    public Node(int valor) {
        this.valor = valor;
    }

    public Node getNodeEsquerda() {
        return nodeEsquerda;
    }

    public void setNodeEsquerda(Node NoEsquerda) {
        this.nodeEsquerda = NoEsquerda;
        this.nodeEsquerda.setNodePai(this);
    }

    public Node getNodeDireita() {
        return nodeDireita;
    }

    public void setNodeDireita(Node noDireita) {
        this.nodeDireita = noDireita;
        this.nodeDireita.setNodePai(this);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNodePai() {
        return noPai;
    }

    public void setNodePai(Node noPai) {
        this.noPai = noPai;
    }
}
