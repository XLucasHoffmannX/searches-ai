package searches.BFS;

import searches.BFS.src.Graph;

public class Main{
    public static void main(String[] args){
        Graph<String> graph = new Graph<String>();
        
        graph.addVertex("0");
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");
        graph.addVertex("4");

        graph.addEdge(2.0, "0", "1");
        graph.addEdge(3.0, "1", "3");
        graph.addEdge(1.0, "3", "2");
        graph.addEdge(1.0, "0", "2");
        graph.addEdge(2.0, "4", "1");
        graph.addEdge(3.0, "4", "0");

        graph.bfs();
    }
}