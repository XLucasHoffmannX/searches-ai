package hanoiSearches.Dfs;

import hanoiSearches.Dfs.src.Deep;
import hanoiSearches.Dfs.src.Node;

public class Main {
    public static void main(String[] args) {

        Node node0 = new Node("aaa");
        Node node1 = new Node("baa");
        Node node2 = new Node("caa");
        Node node3 = new Node("bca");
        Node node4 = new Node("cba");
        Node node5 = new Node("aca");
        Node node6 = new Node("aba");
        Node node7 = new Node("cca");
        Node node8 = new Node("bba");
        Node node9 = new Node("ccb");
        Node node10 = new Node("bbc");
        Node node11 = new Node("bcb");
        Node node12 = new Node("cbc");
        Node node13 = new Node("acb");
        Node node14 = new Node("abc");
        Node node15 = new Node("abb");
        Node node16 = new Node("acc");
        Node node17 = new Node("bbb");
        Node node18 = new Node("ccc");
        Node node19 = new Node("cbb");
        Node node20 = new Node("bcc");
        Node node21 = new Node("cab");
        Node node22 = new Node("bac");
        Node node23 = new Node("bab");
        Node node24 = new Node("cac");
        Node node25 = new Node("acc");
        Node node26 = new Node("aab");

        node0.setNodeEsquerda(node1);
        node0.setNodeDireita(node2);
        node1.setNodeEsquerda(node3);
        node2.setNodeDireita(node4);
        node3.setNodeDireita(node5);
        node4.setNodeEsquerda(node6);
        node5.setNodeEsquerda(node7);
        node6.setNodeDireita(node8);
        node7.setNodeEsquerda(node9);
        node8.setNodeDireita(node10);
        node9.setNodeDireita(node11);
        node10.setNodeEsquerda(node12);
        node11.setNodeEsquerda(node13);
        node12.setNodeDireita(node14);
        node13.setNodeEsquerda(node15);
        node14.setNodeDireita(node16);
        node15.setNodeEsquerda(node17);
        node16.setNodeDireita(node18);
        node17.setNodeDireita(node19);
        node18.setNodeEsquerda(node20);
        node19.setNodeDireita(node21);
        node20.setNodeEsquerda(node22);
        node21.setNodeDireita(node23);
        node22.setNodeEsquerda(node24);
        node23.setNodeDireita(node26);
        node24.setNodeEsquerda(node25);
        node25.setNodeDireita(node26);

        Deep dfs = new Deep("ccc");

        dfs.buscarResultado(node0);
        dfs.exibirTextoResposta();
    }
}
