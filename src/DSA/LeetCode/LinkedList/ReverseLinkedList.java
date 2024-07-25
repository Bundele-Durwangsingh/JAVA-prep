package DSA.LeetCode.LinkedList;

public class ReverseLinkedList {

    /**
     * Approach:
     * This solution reverses a given singly linked list using an iterative approach.
     * 
     * Explanation:
     * 1. Initialize two pointers, `prev` and `curr`. `prev` starts as `null` and `curr` starts as `head`.
     * 2. Traverse the list, adjusting the `next` pointers to reverse the links.
     * 3. At each step, store the next node, reverse the current node's pointer, and move the `prev` and `curr` pointers one step forward.
     * 4. When `curr` becomes `null`, `prev` will be the new head of the reversed list.
     */
    public static void main(String[] args) {
        // Create a sample linked list with values [1, 2, 3, 4, 5]
        ListNode head = ListNode.createLinkedList(new int[]{1, 2, 3, 4, 5});

        // Print the original linked list
        System.out.print("Original List: ");
        ListNode.printList(head);

        // Reverse the linked list using the reverseList function
        ListNode reversedHead = reverseList(head);

        // Print the reversed linked list
        System.out.print("Reversed List: ");
        ListNode.printList(reversedHead);
    }

    // Function to reverse the linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; // Initialize previous node as null
        ListNode curr = head; // Initialize current node as head
        while (curr != null) {
            ListNode next = curr.next; // Store the next node before changing curr.next
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev one step forward
            curr = next; // Move curr one step forward
        }
        return prev; // The prev pointer will be the new head after reversal
    }
}
