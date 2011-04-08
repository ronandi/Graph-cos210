public interface Edge {
    //There should probably be better names for these...
    public Vertex getSource();
    public Vertex getDestination();
	public void setSource(Vertex v);
	public void setDestination(Vertex v);
}
