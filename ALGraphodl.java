import java.util.*;
public class ALGraph<T1> implements Graph<T1> {
	private int size; 
	private ArrayList<Vertex<T1>> vertexList;
	public ALGraph() {
		size = 0;
		vertexList = new ArrayList<Vertex<T1>>();	
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return size == 0;
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
		return vertexList.size();
	}
	public int numEdges() {
		return vertexList.size() - 1;
	}
	public List<Vertex<T1>> vertices() {
		return vertexList;
	}
	public void swap(Vertex v, Vertex w){
		w.replaceElement(v.replaceElement(w));
	}
	public Vertex[] endVertices(Edge e) {
		Vertex[] ends = new Vertex[2];
		ends[0] = e.getSource();
		ends[1] = e.getDestination();
		return ends;
	}
	public void makeUndirected(Edge e){	
		Vertex source;
		Vertex destination;
		double cost = 0;
		if (isWeighted(e)) {
			WeightedEdge we = (WeightedEdge) e;
			cost = we.getWeight();
			insertWeightedEdge(source, destination, cost);	
		} else {
			insertEdge(source, destination);
		}
	}
	public Edge vendEdge(Vertex<T1> V, Vertex<T1> W) {
		ALEdge myEdge = new ALEdge(V, W);
		return myEdge;
	}
	public Vertex<T1> vendVertex(T1 o) {
		ALVertex<T1> myVertex = new ALVertex<T1>(o);
		return myVertex;
	}
	public void positions() {
		
	}
	public void insertDirectedEdge (Vertex<T1> V, Vertex<T1> W, T1 o) {
		
	}
	public void insertWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost) {
		
	}
	public void insertEdge (Vertex<T1> V, Vertex<T1> W) {
		
	}
	public void removeEdge(Edge e) {
		
	}
	public void removeVertex(Vertex<T1> v) {
		
	}
	public void insertVertex(T1 o) {
		
	}
	public List<? extends Edge> weightedEdges() {
		return new List<ALEdge>();
		
	}
	public List<? extends Edge> directedEdges() {
		return new List<ALEdge>();
	}
    public List<? extends Edge> undirectedEdges() {
    	return new List<ALEdge>();
    }
    public List<? extends Edge> edges() {
    	return new List<ALEdge>();
    }		
}