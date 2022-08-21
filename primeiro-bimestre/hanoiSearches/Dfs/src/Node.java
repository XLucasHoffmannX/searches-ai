package hanoiSearches.Dfs.src;

public class Node {
    private Node noPai;
    private Node nodeEsquerda;
    private Node nodeDireita;
    private String valor;

    public Node(String valor) {
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Node getNodePai() {
        return noPai;
    }

    public void setNodePai(Node noPai) {
        this.noPai = noPai;
    }
}

