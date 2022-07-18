package ls19;

public class BadSSSPExample {

	public static void main(String[] args) {

		// Create a graph from lecture slides.
		Vertex a = new LabeledVertex("A");
		Vertex b = new LabeledVertex("B");
		Vertex c = new LabeledVertex("C");
		Vertex d = new LabeledVertex("D");
		Vertex e = new LabeledVertex("E");
		Vertex f = new LabeledVertex("F");
		Vertex g = new LabeledVertex("G");

		DirectedGraph dg = new DirectedGraphImpl();
		dg.addVertex(a);
		dg.addVertex(b);
		dg.addVertex(c);
		dg.addVertex(d);
		dg.addVertex(e);
		dg.addVertex(f);
		dg.addVertex(g);
		
		dg.addEdge(a,b);
		dg.addEdge(a,d);
		dg.addEdge(b,d);
		dg.addEdge(b,e);
		dg.addEdge(c,a);
		dg.addEdge(c,f);
		dg.addEdge(d,c);
		dg.addEdge(d,e);
		dg.addEdge(d,f);
		dg.addEdge(d,g);
		dg.addEdge(e,g);
		dg.addEdge(g,f);
		
		SSSP.badSSSP(dg, a);
		
		System.out.println("Path from A to A: " + tracePath(a));
		System.out.println("Path from A to B: " + tracePath(b));
		System.out.println("Path from A to C: " + tracePath(c));
		System.out.println("Path from A to D: " + tracePath(d));
		System.out.println("Path from A to E: " + tracePath(e));
		System.out.println("Path from A to F: " + tracePath(f));
		System.out.println("Path from A to G: " + tracePath(g));		
	}
	
	public static String tracePath(Vertex v) {
		String pathString = v.toString();
		
		Vertex prior = v.getPathFromSource();
		while (prior != null) {
			pathString = prior.toString()+"->"+pathString;
			prior = prior.getPathFromSource();
		}
		return pathString;
	}
	
}
