import java.util.*;
public class GraphTest {
	public static Graph<String> g = new AMGraph<String>();
	public static void main(String[] args) {
		Vertex<String> dallas = g.vendVertex("Dallas");
		Vertex<String> chicago = g.vendVertex("Chicago");
		Vertex<String> montana = g.vendVertex("Montana");
		Vertex<String> newjersey = g.vendVertex("New Jersey");
		Vertex<String> denver = g.vendVertex("Denver");
		
		g.insertVertex(dallas);
		g.insertVertex(chicago);
		g.insertVertex(montana);
		g.insertVertex(newjersey);
		g.insertVertex(denver);
		g.insertDirectedEdge(dallas, montana);
		g.insertWeightedEdge(montana, denver, 50);
		g.insertEdge(dallas, chicago);
		g.insertEdge(chicago, newjersey);
		g.insertDirectedEdge(newjersey, denver);
		g.insertWeightedEdge(dallas, denver, 50);
		g.insertDirectedWeightedEdge(dallas, newjersey, 50);
	}
}