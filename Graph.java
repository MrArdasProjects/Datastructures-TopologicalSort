
package main;
import java.util.*; 
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.io.*;


public class Graph {
    
     int V;// No. of vertices 
      
    //An Array of List which contains  
    //references to the Adjacency List of  
    //each vertex 
    List <Integer> adj[]; 
    public Graph(int V)// Constructor 
    { 
        this.V = V; 
        adj = new ArrayList[V]; 
        for(int i = 0; i < V; i++) 
            adj[i]=new ArrayList<Integer>(); 
    } 
      
    // function to add an edge to graph 
    public void addEdge(int u,int v) 
    { 
        adj[u].add(v); 
    } 
    // prints a Topological Sort of the complete graph     
    public void topologicalSort() 
    { 
        // Create a array to store indegrees of all 
        // vertices. Initialize all indegrees as 0. 
        int indegree[] = new int[V]; 
          
        // Traverse adjacency lists to fill indegrees of 
        // vertices. This step takes O(V+E) time         
        for(int i = 0; i < V; i++) 
        { 
            ArrayList<Integer> temp = (ArrayList<Integer>) adj[i]; 
            for(int node : temp) 
            { 
                indegree[node]++; 
            } 
        } 
          
        // Create a queue and enqueue all vertices with 
        // indegree 0 
        Queue<Integer> q = new LinkedList<Integer>(); 
        for(int i = 0;i < V; i++) 
        { 
            if(indegree[i]==0) 
                q.add(i); 
        } 
          
        // Initialize count of visited vertices 
        int cnt = 0; 
          
        // Create a vector to store result (A topological 
        // ordering of the vertices) 
        Vector <Integer> topOrder=new Vector<Integer>(); 
        while(!q.isEmpty()) 
        { 
            // Extract front of queue (or perform dequeue) 
            // and add it to topological order 
            int u=q.poll(); 
            topOrder.add(u); 
              
            // Iterate through all its neighboring nodes 
            // of dequeued node u and decrease their in-degree 
            // by 1 
            for(int node : adj[u]) 
            { 
                // If in-degree becomes zero, add it to queue 
                if(--indegree[node] == 0) 
                    q.add(node); 
            } 
            cnt++; 
        } 
          
       
        // Print topological order             
        for(int i : topOrder) 
        { 
            System.out.print(i+" "); 
        }
		
		System.out.println();
    } 
     public void topologicalSortModified()
    {
        // I create a array to store
        // indegrees of all vertices. Initialize all
        int indegree[] = new int[V];
 
        // Traverse adjacency lists
        for (int i = 0; i < V; i++) {
            ArrayList<Integer> temp
                = (ArrayList<Integer>)adj[i];
            for (int node : temp) {
                indegree[node]++;
            }
        }
 
        // Create a queue and enqueue
        // all vertices with indegree 0
        Queue<Integer> q
            = new LinkedList<Integer>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }
 
        // Initialize count of visited vertices
        int cnt = 0;
 
        // Create a vector to store result
        Vector<Integer> topOrder = new Vector<Integer>();
        while (!q.isEmpty()) {
           
       
            // add it to topological order
            int u = q.poll();
            topOrder.add(u);
 
            // Iterate through all its
            // neighbouring nodes

            for (int node : adj[u]) {
                // If in-degree becomes zero, add it to queue
                if (--indegree[node] == 0)
                    q.add(node);
            }
            cnt++;
        }
 
        // Check if there was a cycle
        if (cnt != V) {
            System.out.println(
                "a cycle is detected!!");
            return;
        }
 
        // Print topological order. İt will print in topological order.
        for (int i : topOrder) {
            System.out.print(i + " ");
        }
    }

    
    public void topologicalSortStack()
    {
        Stack<Integer> stack = new Stack<Integer>();
        
 
        // Mark all the vertices as not visited.we use it if vertices are visited.
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        // Call the recursive helper
        // function to store
        // Topological Sort starting
        // from all vertices one by one
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);
 
        // Print contents of stack
        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
        
    }
    public void topologicalSortUtil(int v, boolean visited[],
                             Stack<Integer> stack)
    {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;
 
 

        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }
 
        // Push current vertex to stack
        // which stores result
        stack.push(new Integer(v));
    }
    
    
    
}
