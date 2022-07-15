package ls18;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private String _label;
    private List<Edge> _edges;
    private int _in_degree;

    public Vertex(String label) {
        _label = label;
        _edges = new LinkedList<Edge>();
        _in_degree = 0;
    }

    public String getLabel() {
        return _label;
    }

    public void addEdge(Vertex destination) {
        _edges.add(new Edge(this, destination));
        destination.incrementInDegree();
    }

    public List<Edge> getEdges() {
        return _edges;
    }

    public void incrementInDegree() {
        _in_degree++;
    }

    public void decrementInDegree() {
        _in_degree--;
    }

    public int getInDegree() {
        return _in_degree;
    }
}
