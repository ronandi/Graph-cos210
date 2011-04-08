import java.util.*;
public interface Graph <T1> {
    public int size();
    public boolean isEmpty();
	public boolean isDirected(Edge e);
	public boolean isWeighted(Edge e);
    public List<T1> elements();
    public int numVertices();
    public int numEdges();
    public List<Vertex> vertices();
    public List<? extends Edge> edges();
    public List<? extends Edge> directedEdges();
    public List<? extends Edge> undirectedEdges();
	public List<? extends Edge> weightedEdges();
    public void insertVertex(T1 o);
    public void removeVertex(Vertex v);
    public void removeEdge(Edge e);
	public Vertex[] endVertices(Edge e); // proper format?
	public void makeUndirected(Edge e); // maybe? can do this with what we already have
    public void insertEdge (Vertex V, Vertex W, T1 o);
	public void insertDirectedEdge (Vertex V, Vertex W, T1 o);
	public void insertWeightedEdge (Vertex V, Vertex W, int Cost);
	public void insertWeightedEdge (Vertex V, Vertex W, float Cost);
	public void insertWeightedEdge (Vertex V, Vertex W, double Cost);
	public void swap(Vertex V, Vertex W); // swaps the objects in the graphs without altering edges?
	public void positions(); // returns all vertices?
    public Edge vendEdge(Vertex<T1> V, Vertex<T1> W); 
    public Vertex<T1> vendVertex(T1);
}
