package DSA.LeetCode.LinkedList;

public class MergeKSortedLists {
    /**
     * Approach:
     * This solution merges k sorted linked lists into one sorted linked list using a divide and conquer method.
     * It merges pairs of lists and then merges the results, gradually reducing the number of lists until only one remains.
     * 
     * Explanation:
     * 1. Check if the input array of lists is null or empty.
     * 2. Initialize an interval variable to 1, which will be used to control the merging of pairs of lists.
     * 3. Loop until the interval is less than the number of lists:
     *    - For each interval, merge pairs of lists and store the merged list back in the array.
     *    - Double the interval in each iteration to merge larger groups of lists.
     * 4. Return the merged list stored at index 0 of the array.
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        
        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i = i + interval * 2) {
                lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }
        return lists[0];
    }
    
    /**
     * Approach:
     * This helper function merges two sorted linked lists into one sorted linked list.
     * 
     * Explanation:
     * 1. Create a dummy node to serve as the starting point of the merged list.
     * 2. Initialize a current pointer to the dummy node.
     * 3. Traverse both input lists (l1 and l2) simultaneously:
     *    - Compare the current nodes of l1 and l2.
     *    - Append the smaller node to the merged list and move the corresponding list pointer forward.
     * 4. After the loop, append any remaining nodes from l1 or l2 to the merged list.
     * 5. Return the next node of the dummy node, which is the head of the merged list.
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode dummy = new ListNode(0); // Create a dummy node to serve as the starting point of the merged list
        ListNode cur = dummy; // Initialize a current pointer to the dummy node

        while (l1 != null && l2 != null) { // Traverse both input lists simultaneously
            if (l1.val <= l2.val) { // Compare the current nodes of l1 and l2
                cur.next = l1; // Append the smaller node to the merged list
                l1 = l1.next; // Move the l1 pointer forward
            } else {
                cur.next = l2; // Append the smaller node to the merged list
                l2 = l2.next; // Move the l2 pointer forward
            }
            cur = cur.next; // Move the current pointer forward
        }

        cur.next = (l1 != null) ? l1 : l2; // Append any remaining nodes from l1 or l2

        return dummy.next; // Return the next node of the dummy node, which is the head of the merged list
    }
    
    public static void main(String[] args) {
        // Creating the input lists for k sorted lists
        ListNode list1 = ListNode.createLinkedList(new int[]{1, 4, 5});
        ListNode list2 = ListNode.createLinkedList(new int[]{1, 3, 4});
        ListNode list3 = ListNode.createLinkedList(new int[]{2, 6});
        ListNode[] lists = new ListNode[]{list1, list2, list3};

        // Printing the original lists
        System.out.println("Original lists:");
        for (int i = 0; i < lists.length; i++) {
            System.out.print("List " + (i + 1) + ": ");
            ListNode.printList(lists[i]);
        }

        // Merging the lists
        ListNode mergedList = new MergeKSortedLists().mergeKLists(lists);

        // Printing the merged list
        System.out.println("Merged list:");
        ListNode.printList(mergedList);
    }
}
