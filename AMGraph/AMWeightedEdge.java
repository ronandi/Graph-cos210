public class AMWeightedEdge extends AMEdge implements WeightedEdge {
    private double weight;
	public AMWeightedEdge (Vertex s, Vertex d, double c) {
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
	public String toString() {
		String s = getSource().getElement() + " <--- " + getWeight() + " ---> " + getDestination().getElement();
		return s;
	}
}