package DSA.LeetCode.LinkedList;

public class MergeTwoSortedLists {
    /**
     * Approach:
     * This solution merges two sorted linked lists into one sorted linked list.
     * It uses a dummy node to facilitate the merging process and a current pointer to build the new list.
     * 
     * Explanation:
     * 1. Create a dummy node to serve as the starting point of the merged list.
     * 2. Initialize a current pointer to the dummy node.
     * 3. Traverse both input lists (list1 and list2) simultaneously:
     *    - Compare the current nodes of list1 and list2.
     *    - Append the smaller node to the merged list and move the corresponding list pointer forward.
     * 4. After the loop, append any remaining nodes from list1 or list2 to the merged list.
     * 5. Return the next node of the dummy node, which is the head of the merged list.
     */
    public static void main(String[] args) {
        // Creating the input lists
        ListNode list1 = ListNode.createLinkedList(new int[]{1, 2, 4});
        ListNode list2 = ListNode.createLinkedList(new int[]{1, 3, 4});

        // Merging the lists
        ListNode mergedList = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        // Printing the merged list
        ListNode.printList(mergedList);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); // Create a dummy node to serve as the starting point of the merged list
        ListNode cur = dummy; // Initialize a current pointer to the dummy node

        while (list1 != null && list2 != null) { // Traverse both input lists simultaneously
            if (list1.val > list2.val) { // Compare the current nodes of list1 and list2
                cur.next = list2; // Append the smaller node to the merged list
                list2 = list2.next; // Move the list2 pointer forward
            } else {
                cur.next = list1; // Append the smaller node to the merged list
                list1 = list1.next; // Move the list1 pointer forward
            }
            cur = cur.next; // Move the current pointer forward
        }

        cur.next = (list1 != null) ? list1 : list2; // Append any remaining nodes from list1 or list2

        return dummy.next; // Return the next node of the dummy node, which is the head of the merged list
    }
}
