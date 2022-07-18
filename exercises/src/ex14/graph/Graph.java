package ex14.graph;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Graph {
    private Map<String, Vertex> _vertices;
    private List<List<String>> _data;


    public Graph(String fileName) {
        _vertices = new HashMap<>();
        createGraph(fileName);
    }
    public Graph() {
        _vertices = new HashMap<>();
    }


    public double calculateWeight(int distance, int traffic, int scenery, int attractions) {
        /*
        Your code here
         */
        return -1;
    }

    public Map<String, Double> dijkstra(Vertex start) {
        /*
        Your code here
         */
        return null;
    }

    // Do not edit anything below

    /*
    reads through each entry in csv and calls readLine to create edges and vertices.
     */
    public void createGraph(String fileName) {
        readCSV(fileName);
        for(List<String> list: _data) {
            readLine(list.get(0), list.get(1), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3))
                    , Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));
        }
    }
    /*
    reads through each line of csv and puts data into an ArrayList
     */
    public void readCSV(String fileName) {
        _data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String header = br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                _data.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    converts one entry of data into vertices and edges
     */
    public void readLine(String src, String dest, int distance, int traffic, int scenery, int attractions) {
        // find source and destination nodes, if they don't exist, create them
        Vertex source = _vertices.get(src);
        if(source == null)
            source = new VertexImpl(src);
        Vertex destination = _vertices.get(dest);
        if(destination == null)
            destination = new VertexImpl(dest);

        // calculate weight of edge
        double weight = calculateWeight(distance, traffic, scenery, attractions);

        //create edge
        Edge e = new EdgeImpl(source, destination, weight);
        source.addEdge(e);

        //add reverse direction edge
        e = new EdgeImpl(destination, source, weight);
        destination.addEdge(e);

        //add to graph
        _vertices.put(src, source);
        _vertices.put(dest, destination);

    }

    public Map<String, Vertex> getVertices() {
        return _vertices;
    }





}
