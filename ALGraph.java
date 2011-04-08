import java.util.*;
public class ALGraph implements Graph<T1> {
	private int size; 
	private ArrayList<ALVertex> vertexList;
	public ALGraph() {
		size = 0;
		vertexList = new ArrayList<ALVertex>();	
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
		
}