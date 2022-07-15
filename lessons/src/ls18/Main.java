package ls18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Vertex v4 = new Vertex("v4");
        Vertex v5 = new Vertex("v5");
        Vertex v6 = new Vertex("v6");
        Vertex v7 = new Vertex("v7");
        Vertex v8 = new Vertex("v8");
        Vertex v9 = new Vertex("v9");
        Vertex v10 = new Vertex("v10");

        v0.addEdge(v2);
        v0.addEdge(v6);
        v1.addEdge(v5);
        v1.addEdge(v2);
        v2.addEdge(v7);
        v2.addEdge(v10);
        v3.addEdge(v9);
        v3.addEdge(v4);
        v4.addEdge(v10);
        v5.addEdge(v8);
        v5.addEdge(v7);
        v6.addEdge(v3);
        v6.addEdge(v4);
        v7.addEdge(v6);
        v7.addEdge(v3);
        v7.addEdge(v9);
        v8.addEdge(v4);
        v8.addEdge(v6);

        Vertex[] vertices = new Vertex[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10};
        Queue<Vertex> zero_in_degree_q = new LinkedList<Vertex>();
        List<Vertex> topo_sort = new ArrayList<Vertex>();

        for (Vertex v : vertices) {
            if (v.getInDegree() == 0) {
                zero_in_degree_q.add(v);
            }
        }

        while (!zero_in_degree_q.isEmpty()) {
            Vertex v = zero_in_degree_q.remove();
            topo_sort.add(v);
            for (Edge e : v.getEdges()) {
                Vertex adjacent = e.getTo();
                adjacent.decrementInDegree();
                if (adjacent.getInDegree() == 0) {
                    zero_in_degree_q.add(adjacent);
                }
            }
        }

        if (topo_sort.size() != vertices.length) {
            System.out.println("There is no topo sort");
        } else {
            System.out.println("Topological Sort:");
            for (int i=0; i < topo_sort.size(); i++) {
                System.out.println(topo_sort.get(i).getLabel());
            }
        }
    }
}