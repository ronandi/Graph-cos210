import java.util.*;
public class AMGraph<T1> implements Graph<T1> {
	private int size; 
	private ArrayList<Vertex<T1>> vertexList;
	private ArrayList<ArrayList<Edge>> matrix;
	public AMGraph() {
		size = 0;
		vertexList = new ArrayList<Vertex<T1>>();
		matrix = new ArrayList<ArrayList<Edge>>();
	}
	public int size() {
		return size;
	}
    public boolean isEmpty() {
    	return size() == 0;
    }
    public boolean isDirected(Edge e) {
    	return false;
    }
    public boolean isWeighted(Edge e) {
    	return false;
    }
    public List<T1> elements() {
    	return null;
    }
    public int numVertices() {
    	return 0;
    }
    public int numEdges() {
    	return 0;
    }
    public List<Vertex<T1>> vertices() {
    	return null;
    }
    public List<? extends Edge> edges() {
    	return null;
    }
    public List<? extends Edge> directedEdges() {
    	return null;
    }
    public List<? extends Edge> undirectedEdges() {
    	return null;
    }
    public List<? extends Edge> weightedEdges() {
    	return null;
    }
    public List<? extends Edge> directedWeightedEdges() {
    	return null;
    }
    public void insertVertex(Vertex<T1> myVertex) {
    	
    }
    public void removeVertex(Vertex<T1> v) {
    	
    }
    public void removeEdge(Edge e) {
    	
    }
    public Vertex[] endVertices(Edge e) {
    	return new Vertex[2];
    }
    public void makeUndirected(Edge e) {
    	
    }
    public void insertEdge (Vertex<T1> V, Vertex<T1> W) {
    	
    }
    public void insertDirectedEdge (Vertex<T1> V, Vertex<T1> W) {
    	
    }
    public void insertWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost) {
    	
    }
    public void insertDirectedWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost) {
    	
    }
    public void swap(Vertex<T1> V, Vertex<T1> W) {
    	
    }
    public void positions() {
    	
    }
    public Edge vendEdge(Vertex<T1> V, Vertex<T1> W) {
    	return null;
    }
    public Edge vendWeightedEdge(Vertex<T1> V, Vertex<T1> W, double cost) {
    	return null;
    }
    public Edge vendDirectedEdge (Vertex<T1> V, Vertex<T1> W) {
    	return null;
    }
    public Edge vendDirectedWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost) {
    	return null;
    }
    public Vertex<T1> vendVertex(T1 o) {
    	return null;
    }
}