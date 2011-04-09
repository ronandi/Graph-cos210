public class ALDirectedEdge extends ALEdge implements DirectedEdge {
	public ALDirectedEdge(Vertex s, Vertex d) {
		super(s, d);
	}
	public void reverseDirection() {
		Vertex temp = getSource();
		setSource(getDestination());
		setDestination(temp);
	}
	public void setDirectionFrom(Vertex s, Vertex d) {
		setSource(d);
		setDestination(s);
	}
	public void setDirectionTo(Vertex s, Vertex d) {
		setSource(s);
		setDestination(d);
	}
}
