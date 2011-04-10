public class AMEdge implements Edge {
	private Vertex source;
	private Vertex destination;
    public AMEdge(Vertex s, Vertex d) {
		source = s;
		destination = d;
	}
	//There should probably be better names for these...
    public Vertex getSource() {
		return source;
	}
    public Vertex getDestination() {
		return destination;
	}
	public void setDestination(Vertex d) {
		destination = d;
	}
	public void setSource(Vertex s) {
		source = s;
	}
	public String toString() {
		String s = source.getElement() + "<------>" + destination.getElement();
		return s;
	}
}
