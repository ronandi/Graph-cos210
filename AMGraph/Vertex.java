import java.util.*;
public interface Vertex<T1> {
    public T1 getElement();
	public T1 replaceElement(T1 o);
    public int getDegree();
	public int getInDegree();
	public int getOutDegree();
    
    public List<Edge> incidentEdges();
    public List<Edge> inIncidentEdges();
    public List<Edge> outIncidentEdges();
    public Vertex<T1> opposite(Edge e);
    public List<Vertex<T1>> adjacentVertices();
    public List<Vertex<T1>> inAdjacentVertices();
    public List<Vertex<T1>> outAdjacentVertices();
    public boolean isAdjacent(Vertex<T1> v);
    public void addEdge(Vertex<T1> v);
    public void addEdge(Edge e);
    public void removeEdge(Edge e);
}
