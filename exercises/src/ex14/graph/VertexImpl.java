package ex14.graph;


import java.util.List;

import java.util.ArrayList;

public class VertexImpl implements Vertex {
    private List<Edge> _edges;
    private String _label;
    private double _distance_from_source;
    private Vertex _previous_vertex;

    public VertexImpl(String label) {
        _label = label;
        _edges = new ArrayList<>();
        _distance_from_source = 0;
        _previous_vertex = null;
    }

    public List<Edge> getEdges() {
        return _edges;
    }

    public void addEdge(Edge e) {
        _edges.add(e);
    }

    public double getDistanceFromSource() {
        return _distance_from_source;
    }

    public void setDistanceFromSource(double distance) {
        _distance_from_source = distance;
    }

    public String getLabel() {
        return _label;
    }

    public Vertex getPreviousVertex() {
        return _previous_vertex;
    }

    public void setPreviousVertex(Vertex v) {
        _previous_vertex = v;
    }

}
