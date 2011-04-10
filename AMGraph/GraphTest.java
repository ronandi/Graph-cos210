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
		g.insertVertex(montana);
		g.insertVertex(denver);
		g.insertVertex(newjersey);
		g.insertEdge(dallas, denver);
		g.insertDirectedEdge(montana, newjersey);
		g.insertEdge(montana, denver);
		g.insertWeightedEdge(dallas, montana, 50);
		
		System.out.println("Dallas: " + ((AMVertex<String>)dallas).getKey());
		//System.out.println("Chicago: " + ((AMVertex<String>)chicago).getKey());
		System.out.println("Montana: " + ((AMVertex<String>)montana).getKey());
		System.out.println("New Jersey: " + ((AMVertex<String>)newjersey).getKey());
		System.out.println("Denver: " + ((AMVertex<String>)denver).getKey());

		
		System.out.println(g.edges());
		//System.out.println();
		//System.out.println(g.directedEdges());
		//System.out.println();
		//System.out.println(g.weightedEdges());
		//System.out.println();
		//System.out.println(g.directedWeightedEdges());
		System.out.println("Dallas: " + ((AMVertex<String>)dallas).getKey());
		//System.out.println("Chicago: " + ((AMVertex<String>)chicago).getKey());
		System.out.println("Montana: " + ((AMVertex<String>)montana).getKey());
		System.out.println("New Jersey: " + ((AMVertex<String>)newjersey).getKey());
		System.out.println("Denver: " + ((AMVertex<String>)denver).getKey());
		System.out.println();
		Iterator<? extends Edge> edgeIterator = g.edges().iterator();
		while (edgeIterator.hasNext()) {
			g.removeEdge(edgeIterator.next());
		}
		System.out.println("Edges: " + g.edges());
		//System.out.println(g.vertices());
	}
}