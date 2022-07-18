package ls19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SSSP {

	public static void badSSSP(DirectedGraph g, Vertex src) {
		
		// Assumes src is in the graph.
		
		Set<Vertex> vertex_set = g.getVertices();
		for (Vertex v : vertex_set) {
			v.clearPathToSource();
		}
		
		// Set up 0-length path from source
		src.setPathFromSource(src);

		// For all possible path lengths
		for (int i=0; i<vertex_set.size()-1; i++) {
			// Go through all vertices

			for (Vertex v : vertex_set) {  

				if (v.hasPathFromSource() && v.getDistanceFromSource() == i) {
					// we mark all unmarked adjacent nodes with distant “len+1”
					Vertex[] adjacent = g.getAdjacent(v);
					
					for (Vertex adj_vertex : adjacent) {
						if (!adj_vertex.hasPathFromSource()) {
							adj_vertex.setPathFromSource(v);
						}
					}
				}
			}
		}		
	}
	
	public static void goodSSSP(DirectedGraph g, Vertex src) {
		
		// Assumes src is in the graph.
		
		Set<Vertex> vertex_set = g.getVertices();
		for (Vertex v : vertex_set) {
			v.clearPathToSource();
		}
		
		// Set up 0-length path from source
		src.setPathFromSource(src);

		// Set up queue of nodes to process
		Queue<Vertex> vq = new LinkedList<Vertex>();
		vq.add(src);
		
		// Process next node from queue until queue is empty.
		while (vq.size() > 0) {
			Vertex next = vq.remove();
			Vertex[] adjacent = g.getAdjacent(next);
			
			for (Vertex adj_vertex : adjacent) {
				if (!adj_vertex.hasPathFromSource()) {
					adj_vertex.setPathFromSource(next);
					vq.add(adj_vertex);
				}
			}			
		}
	}

}
