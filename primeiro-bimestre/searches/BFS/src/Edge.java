package searches.BFS.src;

public class Edge<Type> {
    private Double weight;
    private Vertex<Type> begin;
    private Vertex<Type> end;

    public Edge(Double weight, Vertex<Type> begin, Vertex<Type> end) {
        this.weight = weight;
        this.begin = begin;
        this.end = end;
    }

    public Double getWeight(){
        return weight;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }

    public Vertex<Type> getbegin(){
        return begin;
    }

    public void setBegin(Vertex<Type> begin){
        this.begin = begin;
    }

    public Vertex<Type> getEnd(){
        return end;
    }
    
    public void setEnd(Vertex<Type> end){
        this.end = end ;
    }
}
