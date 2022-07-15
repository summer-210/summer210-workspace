package ls18;

public class Edge {
    private Vertex _from;
    private Vertex _to;

    public Edge(Vertex from, Vertex to) {
        _from = from;
        _to = to;
    }

    public Vertex getFrom() {
        return _from;
    }

    public Vertex getTo() {
        return _to;
    }
}
