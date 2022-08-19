/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;
import java.util.Scanner;
import java.util.LinkedList; 
/**
 *
 * @author garde
 */


// Linked list class
public class DoubleLinkedList {
    Node head;          // head of list

    public static class Node {
        int data;       // create a variable to hold integer data
        Node next;      // create a variable to hold pointer
        
        // Constructor 
        Node(int d)
        {
            data = d;
            next = null;
        } // end of Node constructor
    } // end of Node class
    
    
    public static DoubleLinkedList add(DoubleLinkedList list, int new_data) {
        // Create a new node with given data
        Node new_node = new Node(new_data);
        
        // Check whether the list is empty
        if (list.head == null)
        { // if no head node
            list.head = new_node;
        } 
        else 
        { // if head node exists
          // Need to traverse till the last node and
          // add the new_node at the end.
          Node last = list.head;
          while (last.next != null) {
            last = last.next;
          } // end of while loop
          
          // add the new_node to the last
          last.next = new_node;
        }
        
        // return the list
        return list;
    } // end of add()
    
    public static int dispList(DoubleLinkedList list) {
        int counter = 0;
        Node currentNode = list.head;
        while (currentNode.next != null) {
            System.out.print(currentNode.data + " - ");
            currentNode = currentNode.next;
            counter++;
        }
            System.out.print(currentNode.data + " - ");
            currentNode = currentNode.next;
            counter++;
        return counter;
    } // end of dispList()
    
    public static DoubleLinkedList delete(DoubleLinkedList list, int val)
    {   // retrieve the first node in the list
        Node currentNode = list.head;
        Node previousNode = null;
        
        // create a counter to detect the head
        int counter = 0;
        // retrieve the value from the current node and compare
        // retrieved value to the user's input
        
        while (currentNode.data != val)
        {
            System.out.println("CurrentNode : " + currentNode.data);
            
            if (currentNode.next == null)
            {   // we reach the end of the list and the value cannot be found
                System.out.println("The entered value cannot be found!");
                return list;
            }
            
            // memorize the currentNode
            previousNode = currentNode;
            // obtain the next node as currentNode
            currentNode = currentNode.next;
            // increase counter by 1
            counter++;
        } // end of while loop
        
        if (currentNode.data == val)
        {   
            if (counter == 0)
            {  // head node
                System.out.println("head node");
                list.head = currentNode.next;  
            } 
            else if (currentNode.next == null)
            { // last node
                System.out.println("tail node");
                previousNode.next = null;
            } 
            else
            { // middle nodes
                System.out.println("middle node");
                previousNode.next = currentNode.next;
            }
        }
        
        return list;
    } // end of delete()
    
    
    public static void main (String [] args) {
    
    // Create a Linked List
    DoubleLinkedList myList = new DoubleLinkedList();
    
    myList = add(myList, 7);
    myList = add(myList, 11);
    myList = add(myList, 3);
    myList = add(myList, 26);
    
    int length = dispList(myList);
    System.out.print("[" + length + "]");
    
    Scanner kbs = new Scanner(System.in);
    System.out.print("Please enter a value to be deleted : ");
    int val_del = kbs.nextInt();
    LinkedList fjk=new LinkedList();
    fjk.push(1);
   // fjk.
   myList = delete(myList, val_del);
    
    length = dispList(myList);
    System.out.print("[" + length + "]");
    } // end of main()


} // end of LinkedList class

    
