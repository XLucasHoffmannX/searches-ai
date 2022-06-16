package searches.DFS.src;

import java.util.Stack;

public class Deep {
    private Stack<Node> pilhaNodes;

    private String response;

    private int valorSearch;

    public Deep(int valorSearch){
        this.pilhaNodes = new Stack<>();

        this.valorSearch = valorSearch;
    }

    public boolean isResultadoBusca(Node node) {
        return node.getValor() == valorSearch;
    }

    public boolean buscarResultado(Node node) {
        this.pilhaNodes.add(node);
        if (isResultadoBusca(node)) {
            exibirResultadoPaternal(node);
            return true;
        } else {
            if (node.getNodeEsquerda() != null && this.buscarResultado(node.getNodeEsquerda())) {
                return true;
            }
            if (node.getNodeDireita() != null && this.buscarResultado(node.getNodeDireita())) {
                return true;
            }
        }
        this.pilhaNodes.pop();
        return false;
    }

    public void exibirResultadoPaternal(Node no) {
        String retorno = "";

        Node noValor = no;

        retorno += noValor.getValor();

        while (noValor.getNodePai() != null) {
            noValor = noValor.getNodePai();
            retorno = noValor.getValor() + " " + retorno;
        }

        this.response = retorno;

    }

    public void exibirTextoResposta() {
        if (this.response != null) {
            System.out.println("Caminho percorrido: " + this.response);
        } else {
            System.out.println("Valor " + this.response + "não encontrado");
        }
    }
}
