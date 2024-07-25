package DSA.LeetCode.LinkedList;

public class LinkedListCycle {

    /**
     * Approach:
     * This solution detects if a given singly linked list has a cycle using two pointers (fast and slow).
     * 
     * Explanation:
     * 1. Initialize two pointers, `fast` and `slow`. Both start at the head of the list.
     * 2. Traverse the list, moving `slow` one step at a time and `fast` two steps at a time.
     * 3. If there is a cycle, `fast` will eventually meet `slow` inside the cycle.
     * 4. If `fast` reaches the end of the list (null), there is no cycle.
     */
    public static void main(String[] args) {
        // Create a sample linked list with a cycle for testing
        ListNode head = ListNode.createLinkedList(new int[]{1, 2, 3, 4, 5});
        head.next.next.next.next.next = head.next; // Creating a cycle

        // Check if the linked list has a cycle
        boolean result = hasCycle(head);
        System.out.println("Linked List has a cycle: " + result);
    }

    // Function to detect if a linked list has a cycle
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
