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
//Node structure of graph
public class GraphNode{
   //data on the node
   private int data ;
   //this list contains all the connected nodes.
   private DHArrayList<GraphNode> connectedTo;
   //visited for bfs
   boolean visited;
   //Constructor
   GraphNode(int data){
       this.data =data;
       this.connectedTo = new DHArrayList<>();
   }

   //getter and setters
   public int getData() {
       return data;
   }
   public void setData(int data) {
       this.data = data;
   }
   public DHArrayList<GraphNode> getConnectedTo() {
       return connectedTo;
   }
   public void setConnectedTo(DHArrayList<GraphNode> connectedTo) {
       this.connectedTo = connectedTo;
   }
}
