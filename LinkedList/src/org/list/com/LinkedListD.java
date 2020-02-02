package org.list.com;

import org.list.com.LinkedListR.Node;

public class LinkedListD {
	Node head; 
	  
    
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) { data = d; next = null; } 
    } 
  
    
    void deleteList() 
    { 
        head = null; 
    } 
  
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
    
    public void push(int new_data) 
    { 
        
        Node new_node = new Node(new_data); 
  
        
        new_node.next = head; 
  
        
        head = new_node; 
    } 
    public int GetNth(int index) 
    { 
        Node current = head; 
        int count = 0;
        while (current != null) 
        { 
            if (count == index) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
  
        
        assert(false); 
        return 0; 
    } 
  
    public static void main(String [] args) 
    { 
        LinkedListD llist = new LinkedListD(); 
        
  
        llist.push(1); 
        llist.push(4); 
        llist.push(1); 
        llist.push(12); 
        llist.push(1); 
        
        llist.GetNth(4);
        llist.printList(null);
        
  
        
        System.out.println("Deleting the list"); 
        llist.deleteList(); 
  
        System.out.println("Linked list deleted"); 
    } 

}
