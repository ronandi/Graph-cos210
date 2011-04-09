import java.util.*;
public class ALGraph<T1> implements Graph<T1> {
	private int size; 
	private ArrayList<Vertex<T1>> vertexList;
	public ALGraph() {
		size = 0;
		vertexList = new ArrayList<Vertex<T1>>();
	}
	public int size() {
		this.size = this.vertexList.size() + this.edges().size();
		return this.size;
	}
	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else {
			return false;
		}
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
		return this.edges().size();
	}
	public List<Vertex<T1>> vertices() {
		return vertexList;
	}
	public void swap(Vertex<T1> v, Vertex<T1> w){
		w.replaceElement(v.replaceElement(w.getElement()));
	}
	public Vertex[] endVertices(Edge e) {
		Vertex[] ends = new Vertex[2];
		ends[0] = e.getSource();
		ends[1] = e.getDestination();
		return ends;
	}
	public void makeUndirected(Edge e){	
		Vertex source = null;
		Vertex destination = null;
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
	public Edge vendWeightedEdge(Vertex<T1> V, Vertex<T1> W, double cost) {
		ALWeightedEdge myEdge = new ALWeightedEdge(V, W, cost);
		return myEdge;
	}
	public Edge vendDirectedEdge (Vertex<T1> V, Vertex<T1> W) {
		ALDirectedEdge myEdge = new ALDirectedEdge(V, W);
		return myEdge;
	}
	public Vertex<T1> vendVertex(T1 o) {
		ALVertex<T1> myVertex = new ALVertex<T1>(o);
		return myVertex;
	}
	public void positions() {
	}
	public void insertEdge(Vertex<T1> V, Vertex<T1> W) {
		int a = vertexList.indexOf(V);
		int b = vertexList.indexOf(W);
		Edge myEdge = vendEdge(V, W);
		vertexList.get(a).addEdge(myEdge);
		vertexList.get(b).addEdge(myEdge);
	}
	public void insertWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost){
		int a = vertexList.indexOf(V);
		int b = vertexList.indexOf(W);
		Edge myEdge = vendWeightedEdge(V, W, Cost);
		vertexList.get(a).addEdge(myEdge);
		vertexList.get(b).addEdge(myEdge);
	}
	public void insertDirectedEdge (Vertex<T1> V, Vertex<T1> W) {
		int a = vertexList.indexOf(V);
		int b = vertexList.indexOf(W);
		Edge myEdge = vendDirectedEdge(V, W);
		vertexList.get(a).addEdge(myEdge);
		vertexList.get(b).addEdge(myEdge);
	}
	public void removeEdge(Edge e){
		int a = vertexList.indexOf(e.getSource());
		vertexList.get(a).removeEdge(e);
		a = vertexList.indexOf(e.getDestination());
		vertexList.get(a).removeEdge(e);
	}
	public void removeVertex(Vertex<T1> v) {
		ArrayList<Vertex<T1>> toDeleteList = new ArrayList<Vertex<T1>>();
		int a = vertexList.indexOf(v);
		Iterator<Edge> iter = v.incidentEdges().iterator();
		while (iter.hasNext()) {
			toDeleteList.add(v.opposite(iter.next()));
		}
		Iterator<Vertex<T1>> delIter = toDeleteList.iterator();
		while (delIter.hasNext()) {
			Vertex<T1> myVertex = delIter.next();
			Iterator<Edge> delEdge = myVertex.incidentEdges().iterator();
			Edge myEdge = delEdge.next();
			if (myEdge.getSource() == v || myEdge.getDestination() == v) {
				myVertex.removeEdge(myEdge);
			}
		}
		vertexList.remove(a);
	}
	public void insertVertex(Vertex<T1> myVertex){
		vertexList.add(myVertex);
	}
	public List<? extends Edge> weightedEdges() {
		ArrayList<Edge> directedList = new ArrayList();
		Iterator<? extends Edge> iter = edges().iterator();
		while (iter.hasNext()) {
			Edge myEdge = iter.next();
			if (myEdge instanceof WeightedEdge) {
				directedList.add(myEdge);
			}
		}	
		return directedList;
	}
	public List<? extends Edge> undirectedEdges() {
		ArrayList<Edge> directedList = new ArrayList();
		Iterator<? extends Edge> iter = edges().iterator();
		while (iter.hasNext()) {
			Edge myEdge = iter.next();
			if (!(myEdge instanceof DirectedEdge)) {
				directedList.add(myEdge);
			}
		}	
		return directedList;
	}
	public List<? extends Edge> directedEdges() {
		ArrayList<Edge> directedList = new ArrayList();
		Iterator<? extends Edge> iter = edges().iterator();
		while (iter.hasNext()) {
			Edge myEdge = iter.next();
			if (myEdge instanceof DirectedEdge) {
				directedList.add(myEdge);
			}
		}	
		return directedList;
	}
	public List<? extends Edge> edges() {
		ArrayList<Edge> myEdgeList = new ArrayList<Edge>();
		Iterator<Vertex<T1>> vertexIterator = vertexList.iterator();
		while (vertexIterator.hasNext()) {
			Iterator<Edge> edgeIter = vertexIterator.next().incidentEdges().iterator();
			while (edgeIter.hasNext()) {
				Edge myEdge = edgeIter.next();
				if (!myEdgeList.contains(myEdge)) {
					myEdgeList.add(myEdge);
				}
			}
		}
		return myEdgeList;
	}
}