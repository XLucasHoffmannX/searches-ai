package hanoiSearches.Bfs;

import hanoiSearches.Bfs.src.Graph;

public class Main {
    public static void main(String[] args) {
        Graph<String> g = new Graph<String>();

        g.addVertex("aaa");
        g.addVertex("aab");
        g.addVertex("aac");
        g.addVertex("aba");
        g.addVertex("abb");
        g.addVertex("abc");
        g.addVertex("aca");
        g.addVertex("acb");
        g.addVertex("acc");
        g.addVertex("baa");
        g.addVertex("bab");
        g.addVertex("bac");
        g.addVertex("bba");
        g.addVertex("bbb");
        g.addVertex("bbc");
        g.addVertex("bca");
        g.addVertex("bcb");
        g.addVertex("bcc");
        g.addVertex("caa");
        g.addVertex("cab");
        g.addVertex("cac");
        g.addVertex("cba");
        g.addVertex("cbb");
        g.addVertex("cbc");
        g.addVertex("cca");
        g.addVertex("ccb");
        g.addVertex("ccc");

        g.addEdge(0.0, "aaa", "aab");
        g.addEdge(0.0, "aaa", "aac");
        g.addEdge(0.0, "aab", "aac");
        g.addEdge(0.0, "aab", "acb");
        g.addEdge(0.0, "acb", "acc");
        g.addEdge(0.0, "acb", "aca");
        g.addEdge(0.0, "acc", "aca");
        g.addEdge(0.0, "aca", "aba");
        g.addEdge(0.0, "aac", "abc");
        g.addEdge(0.0, "abc", "aba");
        g.addEdge(0.0, "abc", "abb");
        g.addEdge(0.0, "aba", "abb");
        g.addEdge(0.0, "acc", "bcc");
        g.addEdge(0.0, "bcc", "bca");
        g.addEdge(0.0, "bcc", "bcb");
        g.addEdge(0.0, "bca", "bcb");
        g.addEdge(0.0, "abb", "cbb");
        g.addEdge(0.0, "cbb", "cbc");
        g.addEdge(0.0, "cbb", "cba");
        g.addEdge(0.0, "cbc", "cba");
        g.addEdge(0.0, "bca", "bba");
        g.addEdge(0.0, "bba", "bbb");
        g.addEdge(0.0, "bba", "bbc");
        g.addEdge(0.0, "bbb", "bbc");
        g.addEdge(0.0, "bcb", "bab");
        g.addEdge(0.0, "bab", "bac");
        g.addEdge(0.0, "bab", "baa");
        g.addEdge(0.0, "bac", "baa");
        g.addEdge(0.0, "bbc", "baa");
        g.addEdge(0.0, "cbc", "cac");
        g.addEdge(0.0, "cac", "caa");
        g.addEdge(0.0, "cac", "cab");
        g.addEdge(0.0, "caa", "cab");
        g.addEdge(0.0, "baa", "caa");
        g.addEdge(0.0, "cba", "cca");
        g.addEdge(0.0, "cca", "ccb");
        g.addEdge(0.0, "cca", "ccc");
        g.addEdge(0.0, "cab", "ccb");
        g.addEdge(0.0, "ccb", "ccc");

        g.bfs();
    }
}
