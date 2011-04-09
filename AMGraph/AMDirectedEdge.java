public class AMDirectedEdge extends AMEdge implements DirectedEdge {
	public AMDirectedEdge(Vertex s, Vertex d) {
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
	public String toString() {
		String s = getSource().getElement() + " ------> " + getDestination().getElement();
		return s;
	}
}