public class ALDirectedWeightedEdge extends ALEdge implements WeightedEdge, DirectedEdge {
    private double weight;
	public ALDirectedWeightedEdge (Vertex s, Vertex d, double c) {
		super(s, d);
		weight = c;
	}
	public double getWeight(){
		return weight;
	}
	public double setWeight(double c){
		double temp = weight;
		weight = c;
		return temp;
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
	@Override
	public String toString() {
		String s = getSource().getElement() + " --- " + getWeight() + " ---> " + getDestination().getElement();
		return s;
	}
}