package DSA.LinkedList;

public class ReversedList {
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
     * Method to reverse the linked list using an iterative approach.
     */
    public void ReverseList() {
        if (head == null || head.next == null) {
            return;                    // If the list is empty or has only one node, do nothing
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next; // Store the next node
            currNode.next = prevNode;      // Reverse the current node's pointer
            prevNode = currNode;           // Move prevNode one step forward
            currNode = nextNode;           // Move currNode one step forward
        }
        head.next = null;                 // Set the original head's next to null
        head = prevNode;                  // Update the head to be the new first node
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
        ReversedList list = new ReversedList(); // Create a new linked list

        // Insert nodes at the start and end
        list.InsertAtEnd("1");
        list.InsertAtEnd("2");
        list.InsertAtEnd("3");
        list.InsertAtEnd("4");

        // Print the entire list
        System.out.print("Original list: ");
        list.PrintList(); // Output: 1 2 3 4

        // Reverse the list
        list.ReverseList();

        // Print the reversed list
        System.out.print("Reversed list: ");
        list.PrintList(); // Output: 4 3 2 1
    }
}
