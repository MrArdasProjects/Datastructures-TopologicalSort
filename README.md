# Datastructures-TopologicalSort
This project pertains to the implementation of important methods related to Topological Sort in the context of the Data Structures and Advanced Algorithms course within the Computer Engineering department. 

The project is an assignment task, and the project has been completed following the instructions in the assignment.

1. Run the topological sorting algorithm on Graph “g1” defined in main. Print and 
note down the result somewhere. 

2. For a topological sort to exist, the graph must not contain any cycles. Modify
topologicalSort() method any way you like to handle such cases. The 
method now must print “A cycle detected!” in such a case. Test your code on 
Graph “g2”. 

3. Current implementation of topologicalSort() uses queues. Implement a 
new method called topologicalSortStack()so that the underlying data 
structure is now a stack. This new method must use stack methods such as 
push() and pop() and it must also handle cases with cycles. 
(Note: You can use the default Stack implementation of Java for this method.)

4. Test this modified version with Graph “g1”. Is the result different from before? 
Does it mean your code is wrong if there is a difference? Explain the results and 
discuss in detail in your own words as a comment in your source code. 
