public class ALDirectedEdge implements Edge {
	private Vertex vertexA;
	private Vertex vertexB;
	public ALDirectedEdge(Vertex a, Vertex b) {
		this.vertexA = a;
		this.vertexB = b;
	}
	public Vertex getSource() {
		return this.vertexA;
	}
	public Vertex getDestination() {
		return this.vertexB; 
	}
	public void reverseDirection() {
		Vertex temp = vertexA;
		vertexA = vertexB;
		vertexB = temp;
	}
	public void setDirectionFrom(Vertex e, Vertex v) {
		this.vertexA = e;
		this.vertexB = v;
	}
	public void setDirectionTo(Vertex v, Vertex e) {
		this.vertexA = v;
		this.vertexB = e;
	}
	public void setSource(Vertex v) {
		this.vertexA = v;
	}
	public void setDestination(Vertex v) {
		this.vertexB = v;
	}
}
