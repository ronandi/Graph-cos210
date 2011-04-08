public class ALWeightedEdge extends ALEdge implements WeightedEdge {
    private double weight;
	public ALWeightedEdge (Vertex s, Vertex d, double c) {
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
}
