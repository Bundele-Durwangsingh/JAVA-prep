package DSA.LinkedList;

/**
 * This class represents a simple linked list implementation.
 * It provides methods to insert nodes at the start and end of the list,
 * delete nodes from the start and end of the list, and to print the entire list.
 *
 * A linked list is a linear data structure where each element is a separate object,
 * called a node. Each node contains a data field and a reference (or link) to the next node in the sequence.
 * This allows for efficient insertion and deletion of elements at the cost of additional memory overhead for storing references.
 */
public class LinkedlistDelete {
    // Inner class to represent a node in the linked list
    class Node {
        String data; // Data stored in the node
        Node next;   // Reference to the next node in the list

        // Constructor to initialize a new node with given data
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reference to the head of the linked list
    private Node head;

    /**
     * Method to insert a new node at the start of the linked list.
     *
     * @param data the data to be inserted
     */
    public void InsertAtStart(String data) {
        Node newNode = new Node(data); // Create a new node with the given data
        newNode.next = head;           // Make the new node's next reference point to the current head
        head = newNode;                // Update the head to be the new node
    }

    /**
     * Method to insert a new node at the end of the linked list.
     *
     * @param data the data to be inserted
     */
    public void InsertAtEnd(String data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {
            head = newNode;            // If the list is empty, make the new node the head
        } else {
            Node temp = head;          // Start from the head
            // Traverse to the last node
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;       // Make the last node's next reference point to the new node
        }
    }

    /**
     * Method to delete a node from the start of the linked list.
     */
    public void DeleteAtStart() {
        if (head != null) {
            head = head.next;          // Update the head to be the next node
        }
    }

    /**
     * Method to delete a node from the end of the linked list.
     */
    public void DeleteAtEnd() {
        if (head != null) {
            if (head.next == null) {
                head = null;           // If there's only one node, set head to null
            } else {
                Node temp = head;
                // Traverse to the second last node
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;      // Remove the last node by setting the second last node's next to null
            }
        }
    }

    /**
     * Method to print the entire linked list.
     */
    public void PrintList() {
        Node temp = head;              // Start from the head
        // Traverse the list and print each node's data
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();          // Print a newline at the end
    }

    /**
     * Main method to demonstrate the usage of the linked list.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        LinkedlistDelete list = new LinkedlistDelete(); // Create a new linked list

        // Insert nodes at the start and end
        list.InsertAtStart("First");
        list.InsertAtEnd("Second");
        list.InsertAtStart("Zero");

        // Print the entire list
        System.out.print("List after insertion: ");
        list.PrintList(); // Output: Zero First Second

        // Delete nodes from the start and end
        list.DeleteAtStart();
        System.out.print("List after deleting at start: ");
        list.PrintList(); // Output: First Second

        list.DeleteAtEnd();
        System.out.print("List after deleting at end: ");
        list.PrintList(); // Output: First
    }
}
