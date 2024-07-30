package DSA.LinkedList;
import java.util.LinkedList;

/**
 * This class demonstrates the usage of Java's LinkedList from the Collection framework.
 *
 * The Collection framework provides a unified architecture for representing and manipulating collections,
 * allowing collections to be manipulated independently of the details of their representation.
 * It includes interfaces like List, Set, and Queue, and implementations like ArrayList, LinkedList, HashSet, etc.
 *
 * LinkedList is a part of the Collection framework and implements the List and Deque interfaces.
 * It allows for efficient insertion and deletion of elements.
 */
class LinkedListCollectiveFramework {
    public static void main(String args[]) {
        // Create a new LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();
        
        // Add elements to the LinkedList
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        
        // Print the entire list
        System.out.println(list); // Output: [this, is, a, linked, list]

        // Get and print the first element
        System.out.println(list.get(0)); // Output: this

        // Print the size of the list
        System.out.println(list.size()); // Output: 5

        // Remove elements from the list
        list.remove(3); // Remove the element at index 3
        list.removeFirst(); // Remove the first element
        list.removeLast(); // Remove the last element

        // Print the list after removals
        System.out.println(list); // Output: [is, a]
    }
}
