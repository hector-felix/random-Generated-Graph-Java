/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC401Assn2part6;

import java.util.Scanner;

/**
 *
 * @author Hector Felix
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Lets first create the object of Graph Class;
       Graph g = new Graph();
      
       //Scanner is used for taking input from user
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the Number of Nodes :");
       int n = sc.nextInt();
      
       //Lets declare probability array as mention in question probability has to be 0.25. we code achieve this by
       //taking three false and one true in the array.
       //if true comes we connect them otherwise not
       boolean prob[] = {true,false,false,false};
      
       //Lets create all the vertices first
       for(int i = 1; i <= n; i++) {
           //create a graph node
           GraphNode gn = new GraphNode(i);
           //add the vertex in the graph.
           g.getVertices().add(gn);
       }
      
       //Now we have added all the vertices of the graph.
       //Its time to connect them with each other;
      
       DHArrayList<GraphNode> al = g.getVertices();
       for(int i = 0; i < al.getSize(); i++) {
//       for(GraphNode gn : al) {
          GraphNode gn = new GraphNode(i);
           for(int j = 0; j < al.getSize(); j++) {
//           for(GraphNode gn2 : al) {
              GraphNode gn2 = new GraphNode(j);
               if(!gn.equals(gn2)) {
               //used to generate random number between 0 to 3
                   int rand = (int) (Math.random()*3);
               //if it is 0 then it will give true and we connect the node else not
               if(prob[rand]) {
                   gn.getConnectedTo().add(gn2);
                   gn2.getConnectedTo().add(gn);
               }
              
               }
           }
       }
      
       //Now all we need to do BFS
       System.out.println("Enter starting vertex");
       int start = sc.nextInt();
       //find this vertex in the graph
       GraphNode startVertex=null;
       for(int i = 0; i < al.getSize(); i++) {
          GraphNode gn = new GraphNode(i);
       //for(GraphNode gn : al) {
           if(gn.getData()==start) {
               startVertex=gn;
               break;
           }
       }
       //call method bfs
       
       g.bfs(startVertex); // node to graphnode error
      
   }
    
}
