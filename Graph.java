import java.util.*;
public interface Graph<T1> {
    public int size();
    public boolean isEmpty();
    public boolean isDirected(Edge e);
    public boolean isWeighted(Edge e);
    public List<T1> elements();
    public int numVertices();
    public int numEdges();
    public List<Vertex<T1>> vertices();
    public List<? extends Edge> edges();
    public List<? extends Edge> directedEdges();
    public List<? extends Edge> undirectedEdges();
    public List<? extends Edge> weightedEdges();
    public void insertVertex(Vertex<T1> myVertex);
    public void removeVertex(Vertex<T1> v);
    public void removeEdge(Edge e);
    public Vertex[] endVertices(Edge e); // proper format?
    public void makeUndirected(Edge e); // maybe? can do this with what we already have
    public void insertEdge (Vertex<T1> V, Vertex<T1> W);
    public void insertDirectedEdge (Vertex<T1> V, Vertex<T1> W);
    public void insertWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost);
    public void insertDirectedWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost);
    public void swap(Vertex<T1> V, Vertex<T1> W); // swaps the objects in the graphs without altering edges?
    public void positions(); // returns all vertices?
    public Edge vendEdge(Vertex<T1> V, Vertex<T1> W);
    public Edge vendWeightedEdge(Vertex<T1> V, Vertex<T1> W, double cost);
    public Edge vendDirectedEdge (Vertex<T1> V, Vertex<T1> W);
    public Edge vendDirectedWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost);
    public Vertex<T1> vendVertex(T1 o);
}