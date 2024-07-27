package DSA.LeetCode.LinkedList;

public class ReorderLinkedList {
    /**
     * Approach:
     * This solution reorders a linked list by finding the middle, reversing the second half,
     * and merging the two halves.
     *
     * Explanation:
     * 1. Find the middle of the linked list.
     * 2. Reverse the second half of the linked list.
     * 3. Merge the two halves.
     */
    public static void main(String[] args) {
        // Creating a sample linked list with values [1, 2, 3, 4, 5]
        ListNode head = ListNode.createLinkedList(new int[]{1, 2, 3, 4, 5});

        // Printing the original linked list
        System.out.print("Original List: ");
        ListNode.printList(head);

        // Reordering the list
        new ReorderLinkedList().reorderList(head);

        // Printing the reordered linked list
        System.out.print("Reordered List: ");
        ListNode.printList(head);
    }

    /**
     * Reorders the linked list by:
     * 1. Finding the middle of the list.
     * 2. Reversing the second half of the list.
     * 3. Merging the two halves.
     * 
     * @param head The head of the linked list.
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return; // Base case: If the list is empty or has only one node

        ListNode mid = findMid(head); // Step 1: Find the middle of the list
        ListNode midReversed = reverse(mid, null); // Step 2: Reverse the second half of the list
        reorder(head, mid, midReversed); // Step 3: Merge the two halves
    }

    /**
     * Finds the middle of the linked list using the slow and fast pointer technique.
     * 
     * @param head The head of the linked list.
     * @return The middle node of the linked list.
     */
    private ListNode findMid(ListNode head) {
        ListNode slow = head; // Initialize slow pointer to the head
        ListNode fast = head; // Initialize fast pointer to the head

        while (fast != null && fast.next != null) { // Traverse the list until fast reaches the end
            slow = slow.next; // Move slow pointer one step at a time
            fast = fast.next.next; // Move fast pointer two steps at a time
        }

        return slow; // Slow pointer will be at the middle of the list
    }

    /**
     * Reverses the linked list from the given node.
     * 
     * @param head The current node to start reversing from.
     * @param prev The previous node in the reversed list.
     * @return The new head of the reversed linked list.
     */
    private ListNode reverse(ListNode head, ListNode prev) {
        if (head == null) return head; // Base case: If head is null, return null

        if (head.next == null) { // Base case: If head is the last node, set its next to prev and return head
            head.next = prev;
            return head;
        }

        ListNode next = head.next; // Store the next node
        head.next = prev; // Reverse the link
        return reverse(next, head); // Recursively reverse the remaining list
    }

    /**
     * Reorders the linked list by merging the first half and the reversed second half.
     * 
     * @param left The head of the first half of the list.
     * @param midPoint The middle node of the list (end of the first half).
     * @param right The head of the reversed second half of the list.
     */
    private void reorder(ListNode left, ListNode midPoint, ListNode right) {
        while (left != null && right != null && right != midPoint) { // Traverse both halves until reaching the midpoint
            ListNode leftNext = left.next; // Store the next node of the left half
            ListNode rightNext = right.next; // Store the next node of the right half
            left.next = right; // Link current node of left half to current node of right half
            right.next = leftNext; // Link current node of right half to next node of left half
            left = leftNext; // Move to the next node in the left half
            right = rightNext; // Move to the next node in the right half
        }
    }
}
