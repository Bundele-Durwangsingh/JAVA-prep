package DSA.LeetCode.LinkedList;

public class RemoveNthNodeFromEndOfList {
    /**
     * Approach:
     * This solution removes the nth node from the end of a linked list.
     * It first calculates the size of the list and then identifies the node to remove.
     * 
     * Explanation:
     * 1. Calculate the size of the linked list by traversing it once.
     * 2. If the node to remove is the head, return the next node of the head.
     * 3. Otherwise, traverse the list again to find the node just before the node to be removed.
     * 4. Update the next pointer of the previous node to skip the node to be removed.
     * 5. Return the head of the modified list.
     */
    public static void main(String[] args) {
        // Creating the input list
        ListNode head = ListNode.createLinkedList(new int[]{1, 2, 3, 4, 5});
        
        System.out.print("Original List: ");
        ListNode.printList(head);

        // Removing the nth node from the end
        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 2);

        System.out.print("List after removing the nth node from the end: ");
        ListNode.printList(result);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Removing the SIZEth node from last i.e. head
        if (n == size) {
            return head.next;
        }

        // Find previous node
        int ptf = size - n; // Position to find
        ListNode prev = head; // Previous node
        int cp = 1; // Current position

        while (cp != ptf) {
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;
        return head;
    }
}
