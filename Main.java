
package main;
import java.util.*;   

public class Main {

    
    
    
    public static void main(String[] args) {
     // A graph 
        Graph g1=new Graph(6); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 1); 
        g1.addEdge(2, 3); 
        g1.addEdge(3, 4); 
        g1.addEdge(5, 2); 
        g1.addEdge(5, 4); 
        
        
         g1.topologicalSort(); 
         
        // A graph that contains a cycle
        Graph g2=new Graph(6); 
        g2.addEdge(1, 2); 
        g2.addEdge(2, 5); 
        g2.addEdge(5, 0); 
        g2.addEdge(5, 1); 
        g2.addEdge(3, 4); 
        g2.addEdge(4, 5);  
         g2.topologicalSortModified();
         //Final stack topological sort algorithm.
          System.out.println("For g2");
        g1.topologicalSortStack();
        
        
        
        /*  Question 4:When I do sorting with given alghoritm and the result is that--> 0 5 2 1 3 4 
        İn my modified algorithm result is that--> There exists a cycle in the graph.
         For g2;
          Stack implementation:  5 0 2 3 4 1 
İn my try they are not same. They are different results because  stack uses the LIFO(Last In first Out) principle and the other uses the FIFO(First In fırst out) principle.
İt means that their reading order is different, one reads from the beginning and the other from the end. 
        
        Working principle: the stack-based implementation starts by computing the indegree of 
each vertex and initializing a stack with all the vertices that have an indegree of 0. It then repeatedly pops a vertex from the top of the stack and adds it to the topological 
ordering, and decreases the indegree of all its neighbors by 1. If a vertex's indegree becomes 0 as a result, it is pushed to the top of the stack.

        
        
        */
 
    
        
    }
    
}
