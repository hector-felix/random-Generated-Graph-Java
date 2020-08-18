/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC401Assn2part6;

/**
 *
 * @author Hector Felix
 */
//import java.util.*;
//Node structure of graph
public class Graph {

    private DHArrayList<GraphNode> vertices;

    //Constructor
    public Graph() {

        this.vertices = new DHArrayList<>();
    }

    public DHArrayList<GraphNode> getVertices() {
        return vertices;
    }

    public void setVertices(DHArrayList<GraphNode> vertices) {
        this.vertices = vertices;
    }

    public void bfs(GraphNode node) {
        if (node == null) {
            return;
        }
        SingleLinkedList<GraphNode> queue = new SingleLinkedList<>();
        queue.addLast(node);
        queue.addLast(null);
        node.visited = true;
        GraphNode parent = null;
        GraphNode prev = null;
        while (!queue.isEmpty()) {

     
            GraphNode element = queue.removeFirst();
            if (element == null) {
                parent = prev;
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                }
                element = queue.removeFirst();
            }

            if (element != null && parent != null) {
                System.out.print(element.getData() + "(" + parent.getData() + ")");
                DHArrayList<GraphNode> neighbours = element.getConnectedTo();
                for (int i = 0; i < neighbours.getSize(); i++) {
                    GraphNode n = neighbours.get(i);
                    if (n != null && !n.visited) {
                        queue.addLast(n);
                        n.visited = true;
                    }
                }
                prev = element;
                queue.addLast(null);
            } else {
                if (element != null) {
                    System.out.print(element.getData() + "(" + ")");
                    DHArrayList<GraphNode> neighbours = element.getConnectedTo();
                    for (int i = 0; i < neighbours.getSize(); i++) {
                        GraphNode n = neighbours.get(i);
                        if (n != null && !n.visited) {
                            queue.addLast(n);
                            n.visited = true;

                        }
                    }
                    prev = element;
                    queue.addLast(null);
                }
            }
        }
    }
}
