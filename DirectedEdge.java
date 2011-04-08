public interface DirectedEdge extends Edge {
    public Vertex getSource();
    public Vertex getDestination();
    public void reverseDirection();
    public void setDirectionFrom(Vertex e, Vertex v);
    public void setDirectionTo(Vertex e, Vertex v);
}
