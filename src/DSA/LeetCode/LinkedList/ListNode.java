package DSA.LeetCode.LinkedList;

public class ListNode {
    int val; // Value of the node
    ListNode next; // Reference to the next node

    ListNode() { // Default constructor
    }

    ListNode(int val) { // Constructor with value parameter
        this.val = val;
    }

    ListNode(int val, ListNode next) { // Constructor with value and next node parameters
        this.val = val;
        this.next = next;
    }

    // Helper method to create a linked list from an array
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) { // Check if the array is null or empty
            return null;
        }
        ListNode head = new ListNode(arr[0]); // Initialize the head of the linked list
        ListNode current = head; // Initialize a current pointer to the head
        for (int i = 1; i < arr.length; i++) { // Traverse the array
            current.next = new ListNode(arr[i]); // Append each element to the linked list
            current = current.next; // Move the current pointer forward
        }
        return head; // Return the head of the linked list
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head; // Initialize a current pointer to the head
        while (current != null) { // Traverse the linked list
            System.out.print(current.val + " -> "); // Print the value of each node
            current = current.next; // Move the current pointer forward
        }
        System.out.println("NULL"); // Print a new line at the end
    }
}
