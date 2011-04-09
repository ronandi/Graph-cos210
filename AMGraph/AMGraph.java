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
		this.size = this.vertexList.size() + this.edges().size();
		return this.size;
	}
    public boolean isEmpty() {
    	return size() == 0;
    }
    public boolean isDirected(Edge e) {
    	return e instanceof DirectedEdge;
    }
    public boolean isWeighted(Edge e) {
    	return e instanceof WeightedEdge;
    }
    public List<T1> elements() {
    	Iterator<Vertex<T1>> iter = vertexList.iterator();
		ArrayList<T1> elements = new ArrayList<T1>();
		while (iter.hasNext()) {
			elements.add(iter.next().getElement());
		}
		return elements;
    }
    public int numVertices() {
    	return this.vertexList.size();
    }
    public int numEdges() {
    	return this.edges().size();
    }
    public List<Vertex<T1>> vertices() {
    	return vertexList;
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
    	Vertex[] ends = new Vertex[2];
		ends[0] = e.getSource();
		ends[1] = e.getDestination();
		return ends;
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
    public void swap(Vertex<T1> v, Vertex<T1> w) {
    	w.replaceElement(v.replaceElement(w.getElement()));
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