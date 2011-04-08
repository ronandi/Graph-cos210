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
    public Vertex opposite(Edge e);
    public List adjacentVertices();
    public List inAdjacentVertices();
    public List outAdjacentVertices();
    public boolean areAdjacent(Vertex v);
    public void addEdge(Vertex v);
    public void addEdge(Edge e);
    public void removeEdge(Edge e);
}
