package searches.BFS.src;

import java.util.ArrayList;

public class Graph<Type> {
    private ArrayList<Vertex<Type>> vertices;
    private ArrayList<Edge<Type>> arestas;

    public Graph(){
        this.vertices = new ArrayList<Vertex<Type>>();
        this.arestas = new ArrayList<Edge<Type>>();
    }

    public void addVertex(Type dado){
        Vertex<Type> newVertex = new Vertex<Type>(dado);
        this.vertices.add(newVertex);
    }

    public void addEdge(Double peso, Type dadoInicio, Type dadoFim){
        Vertex<Type> inicio = this.getVertex(dadoInicio);
        Vertex<Type> fim = this.getVertex(dadoFim);
        Edge<Type> aresta = new Edge<Type>(peso, inicio, fim);
        inicio.addEdgeEndPoint(aresta);
        fim.addEdgeEnterPoint(aresta);
        this.arestas.add(aresta);
    }

    public Vertex<Type> getVertex(Type dado){
        Vertex<Type> vertice = null;
        for(int i=0; i< this.vertices.size(); i++){
            if(this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice; 
    }

    public void bfs(){
        ArrayList<Vertex<Type>> marcados = new ArrayList<Vertex<Type>>();
        ArrayList<Vertex<Type>> fila = new ArrayList<Vertex<Type>>();
        Vertex<Type> atual = this.vertices.get(0);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        
        while(fila.size() > 0){
            Vertex<Type> visitado = fila.get(0); 
            for(int i=0; i < visitado.getEdgeEndPoint().size(); i++){
                Vertex<Type> proximo = visitado.getEdgeEndPoint().get(i).getEnd();
                
                if(!marcados.contains(proximo)){
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
