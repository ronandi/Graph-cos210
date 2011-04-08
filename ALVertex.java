import java.util.*;

public class ALVertex<T1> implements Vertex<T1> {
	private T1 data;
	private ArrayList<Edge> edges; //This could be a tree, or anything really. 
	
	public ALVertex (T1 data) {
		this.data = data;
		edges = new ArrayList<Edge>();
	}

	public T1 getElement() {
		return data;
	}
	public T1 replaceElement(T1 o) {
		T1 temp = data;
		data = o;
		return temp;
	}
	public int getDegree() {
		int count = 0;
		Iterator<Edge> iterator = edges.iterator();
		while (iterator.hasNext()) {
			Edge e = iterator.next();
			if (e instanceof DirectedEdge) {
				count += 2;
			} else {
				count++;
			}
		}
		return count;
	}
	
	public int getInDegree() {
		return inIncidentEdges().size();
	}
	
	public int getOutDegree() {
		return outIncidentEdges().size();
	}
	
	public List<Edge> incidentEdges() {
		return edges;
	}
    public List<Edge> inIncidentEdges() {
		ArrayList<Edge> incidentList = new ArrayList<Edge>();
		Iterator<Edge> iterator = edges.iterator();
		while (iterator.hasNext()) {
			Edge e = iterator.next();
			if (e instanceof DirectedEdge) {
				DirectedEdge de = (DirectedEdge)e;
				if (de.getDestination() == this) {
					incidentList.add(de);
				}	
			}
		}
		return incidentList;
	}
    public List<Edge> outIncidentEdges() {
		ArrayList<Edge> incidentList = new ArrayList<Edge>();
		Iterator<Edge> iterator = edges.iterator();
		while (iterator.hasNext()) {
			Edge e = iterator.next();
				if (e instanceof DirectedEdge) {
					DirectedEdge de = (DirectedEdge)e;
					if (de.getSource() == this) {
						incidentList.add(de);
					}	
				}
			}
		return incidentList;
	}
    public Vertex opposite(Edge e) {
		if (e.getSource() != this) {
			return e.getDestination();
		} else {
			return e.getSource();
		}
	}
    public List<Vertex> adjacentVertices() {
		ArrayList<Vertex> adjList = new ArrayList<Vertex>();
		Iterator<Edge> iterator = edges.iterator();
		while (iterator.hasNext()) {
			adjList.add(opposite(iterator.next()));
		}
		return adjList;	
	}
    public List<Vertex> inAdjacentVertices() {
		ArrayList<Vertex> inList = new ArrayList<Vertex>();
		List<Edge> adjList = inIncidentEdges();
		Iterator<Edge> iterator = adjList.iterator();
		while (iterator.hasNext()) {
			inList.add(opposite(iterator.next()));
		}
		return inList;
	}
    public List<Vertex> outAdjacentVertices() {
		ArrayList<Vertex> outList = new ArrayList<Vertex>();
		List<Edge> adjList = outIncidentEdges();
		Iterator<Edge> iterator = adjList.iterator();
		while (iterator.hasNext()) {
			outList.add(opposite(iterator.next()));
		}
		return outList;
	}
    public boolean areAdjacent(Vertex v) {
		return adjacentVertices().contains(v);
	}
    public void addEdge(Vertex v) {
		edges.add(new ALEdge(this, v));	
	}
}