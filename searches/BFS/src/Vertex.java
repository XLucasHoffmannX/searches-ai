package searches.BFS.src;

import java.util.ArrayList;

public class Vertex<Type> {
    private Type dado;
    private ArrayList<Edge<Type>> arestasEnterPoint;
    private ArrayList<Edge<Type>> arestasEndPoint;

    public Vertex(Type valor){
        this.dado = valor;
        this.arestasEnterPoint = new ArrayList<Edge<Type>>();
        this.arestasEndPoint = new ArrayList<Edge<Type>>();
    }

    public Type getDado(){
        return dado;
    }

    public void setDado(Type dado){
        this.dado = dado;
    }

    public void addEdgeEnterPoint(Edge<Type> aresta){
        this.arestasEnterPoint.add(aresta);
    }

    public void addEdgeEndPoint(Edge<Type> aresta){
        this.arestasEndPoint.add(aresta);
    }

    public ArrayList<Edge<Type>> getEdgeEnterPoint(){
        return arestasEnterPoint;
    }

    public ArrayList<Edge<Type>> getEdgeEndPoint(){
        return arestasEndPoint;
    }
}
