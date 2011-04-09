import java.util.*;
public class AMGraph<T1> implements Graph<T1> {
    private int size; 
    private ArrayList<Vertex<T1>> vertexList;
    private ArrayList<ArrayList<Edge>> matrix;
    private int key = 0;
    public AMGraph() {
        size = 0;
        vertexList = new ArrayList<Vertex<T1>>();
        matrix = new ArrayList<ArrayList<Edge>>();
    }
    public int size() {
        this.size = this.vertexList.size() + this.edges().size();
        return this.size;
    }
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isDirected(Edge e) {
        return e instanceof DirectedEdge;
    }
    public boolean isWeighted(Edge e) {
        return e instanceof WeightedEdge;
    }
    public List<T1> elements() {
        Iterator<Vertex<T1>> iter = vertexList.iterator();
        ArrayList<T1> elements = new ArrayList<T1>();
        while (iter.hasNext()) {
            elements.add(iter.next().getElement());
        }
        return elements;
    }
    public int numVertices() {
        return this.vertexList.size();
    }
    public int numEdges() {
        return this.edges().size();
    }
    public List<Vertex<T1>> vertices() {
        return vertexList;
    }
    public List<? extends Edge> edges() {
        return null;
    }
    public List<? extends Edge> directedEdges() {
        return null;
    }
    public List<? extends Edge> undirectedEdges() {
        return null;
    }
    public List<? extends Edge> weightedEdges() {
        return null;
    }
    public List<? extends Edge> directedWeightedEdges() {
        return null;
    }
    public void insertVertex(Vertex<T1> myVertex) {
        AMVertex<T1> myVerte = (AMVertex<T1>) myVertex;
        vertexList.add(myVerte.getKey(), myVerte);
        matrix.add(new ArrayList<Edge>());
        for (int x = 0; x < matrix.size(); x++) {
            for (int y = matrix.get(x).size(); y < matrix.size(); y++){
                matrix.get(x).add(null);
            }
        }
        System.out.println(matrix.size());
        for (int x = 0; x < matrix.size(); x++){
            System.out.println(matrix.get(x).size());
        }
    }
    public void removeVertex(Vertex<T1> v) {
        key--;
    }
    public void removeEdge(Edge e) {
        
    }
    public Vertex[] endVertices(Edge e) {
        Vertex[] ends = new Vertex[2];
        ends[0] = e.getSource();
        ends[1] = e.getDestination();
        return ends;
    }
    public void makeUndirected(Edge e) {
        
    }
    public void insertEdge (Vertex<T1> v, Vertex<T1> w) {
        AMVertex<T1> V = (AMVertex<T1>) v;
        AMVertex<T1> W = (AMVertex<T1>) w;
        int a = vertexList.indexOf(V);
        int b = vertexList.indexOf(W);
        Edge myEdge = vendEdge(V, W);
        vertexList.get(a).addEdge(myEdge);
        vertexList.get(b).addEdge(myEdge);
        System.out.println("V: " + V.getKey());
        System.out.println("W: " + W.getKey());
        matrix.get(V.getKey()).add(W.getKey(), myEdge);
    }
    public void insertDirectedEdge (Vertex<T1> v, Vertex<T1> w) {
          AMVertex<T1> V = (AMVertex<T1>) v;
        AMVertex<T1> W = (AMVertex<T1>) w;
        int a = vertexList.indexOf(V);
        int b = vertexList.indexOf(W);
        Edge myEdge = vendDirectedEdge(V, W);
        vertexList.get(a).addEdge(myEdge);
        vertexList.get(b).addEdge(myEdge);
        System.out.println("V: " + V.getKey());
        System.out.println("W: " + W.getKey());
        matrix.get(V.getKey()).add(W.getKey(), myEdge);
    }
    public void insertWeightedEdge (Vertex<T1> v, Vertex<T1> w, double Cost) {
        AMVertex<T1> V = (AMVertex<T1>) v;
        AMVertex<T1> W = (AMVertex<T1>) w;
        int a = vertexList.indexOf(V);
        int b = vertexList.indexOf(W);
        Edge myEdge = vendWeightedEdge(V, W, Cost);
        vertexList.get(a).addEdge(myEdge);
        vertexList.get(b).addEdge(myEdge);
        System.out.println("V: " + V.getKey());
        System.out.println("W: " + W.getKey());
        matrix.get(V.getKey()).add(W.getKey(), myEdge);
    }
    public void insertDirectedWeightedEdge (Vertex<T1> v, Vertex<T1> w, double Cost) {
        AMVertex<T1> V = (AMVertex<T1>) v;
        AMVertex<T1> W = (AMVertex<T1>) w;
        int a = vertexList.indexOf(V);
        int b = vertexList.indexOf(W);
        Edge myEdge = vendDirectedWeightedEdge(V, W, Cost);
        vertexList.get(a).addEdge(myEdge);
        vertexList.get(b).addEdge(myEdge);
        System.out.println("V: " + V.getKey());
        System.out.println("W: " + W.getKey());
        matrix.get(V.getKey()).add(W.getKey(), myEdge);
    }
    public void swap(Vertex<T1> v, Vertex<T1> w) {
        w.replaceElement(v.replaceElement(w.getElement()));
    }
    public void positions() {
        
    }
    public Edge vendEdge(Vertex<T1> V, Vertex<T1> W) {
        AMEdge myEdge = new AMEdge(V, W);
        return myEdge;
    }
    public Edge vendWeightedEdge(Vertex<T1> V, Vertex<T1> W, double cost) {
        AMWeightedEdge myEdge = new AMWeightedEdge(V, W, cost);
        return myEdge;
    }
    public Edge vendDirectedEdge (Vertex<T1> V, Vertex<T1> W) {
        AMDirectedEdge myEdge = new AMDirectedEdge(V, W);
        return myEdge;
    }
    public Edge vendDirectedWeightedEdge (Vertex<T1> V, Vertex<T1> W, double Cost) {
        AMDirectedWeightedEdge myEdge = new AMDirectedWeightedEdge(V, W, Cost);
        return myEdge;
    }
    public Vertex<T1> vendVertex(T1 o) {
        AMVertex<T1> myVertex = new AMVertex<T1>(o, key);
        key++;
        return myVertex;
    }
}