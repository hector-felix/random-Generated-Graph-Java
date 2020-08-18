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
public class Node {
    Object data;
    //Object data;
    //link
    Node next;
    
    // Constructors
    // Default Constructor
    public Node (Object data) {
        this.data = data;       // Assign the given date
        this.next = null;       // By default there is no next node
    }
    
    // Overloaded Constructor
    // Created a node and points it to another node
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}

