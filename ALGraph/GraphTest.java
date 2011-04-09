import java.util.*;
public class GraphTest {
	public static Graph<String> g = new ALGraph<String>();
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
		System.out.println(g.edges());
		
		Iterator<Vertex<String>> vertIterator = g.vertices().iterator();
		while (vertIterator.hasNext()) {
			Vertex<String> temp = vertIterator.next();
			System.out.println("Element: " + temp.getElement());
			System.out.println("Incident: " + temp.incidentEdges());
			System.out.println("inIncident: " + temp.inIncidentEdges());
			System.out.println("outIncident: " + temp.outIncidentEdges());
			System.out.println("degree: " + temp.getDegree());
			System.out.println("indegree: " + temp.getInDegree());
			System.out.println("outdegree: " + temp.getOutDegree());
			System.out.println("adjacent vertices: " + temp.adjacentVertices());
			System.out.println("inadjacent vertices: " + temp.inAdjacentVertices());
			System.out.println("outadjacent vertices: " + temp.outAdjacentVertices());
			System.out.println();
		}
		//System.out.println(g.edges());
		
		Iterator<? extends Edge> edgeIterator = g.edges().iterator();
		while (edgeIterator.hasNext()) {
			g.removeEdge(edgeIterator.next());
		}
		System.out.println(g.edges());
		System.out.println(g.vertices());
		
	}
}