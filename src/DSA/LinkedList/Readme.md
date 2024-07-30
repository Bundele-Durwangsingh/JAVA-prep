# Linked List Notes

## Definition of Linked List
A linked list is a linear data structure where elements are stored in nodes. Each node contains two parts: the data and a reference (or link) to the next node in the sequence. Unlike arrays, linked lists do not store elements in contiguous memory locations.

## Uses of Linked Lists
- **Dynamic Size**: Linked lists can easily grow and shrink in size by allocating and deallocating memory as needed.
- **Ease of Insertion/Deletion**: Adding or removing elements in a linked list is more efficient than in arrays, especially when dealing with large datasets.

## ArrayList vs LinkedList
- **ArrayList**: 
  - Stores elements in a dynamically resizable array.
  - Provides fast random access (O(1) time complexity) because elements are indexed.
  - Insertion and deletion operations are slower (O(n) time complexity) as elements need to be shifted.

- **LinkedList**: 
  - Stores elements in nodes that are connected via links.
  - Provides fast insertion and deletion (O(1) time complexity) because it only involves updating references.
  - Random access is slower (O(n) time complexity) because it requires traversing the list.

## When to Use ArrayList and When to Use LinkedList
- **Use ArrayList** when:
  - You need fast random access to elements.
  - You frequently access elements using their index.
  - The number of elements is stable and does not change frequently.

- **Use LinkedList** when:
  - You need frequent insertion and deletion operations.
  - You need a list with dynamic size.
  - You frequently add or remove elements from the beginning or middle of the list.

## Insertion and Deletion

### Insertion
- **Inserting at the beginning**:
  - Create a new node and set its reference to the current head.
  - Update the head to the new node.

- **Inserting at the end**:
  - Traverse to the end of the list.
  - Create a new node and set the last node's reference to this new node.

### Deletion
- **Deleting from the beginning**:
  - Update the head to the next node in the list.
  - Deallocate the old head node.

- **Deleting from the end**:
  - Traverse to the second last node.
  - Update its reference to null.
  - Deallocate the last node.

## Linked List using Java Collections Framework

### Insertion and Deletion Using `LinkedList`
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Insertion
        list.addFirst("Element1"); // Insert at the beginning
        list.addLast("Element2");  // Insert at the end
        list.add(1, "Element3");   // Insert at a specific position

        System.out.println("List after insertion: " + list);

        // Deletion
        list.removeFirst();        // Remove from the beginning
        list.removeLast();         // Remove from the end
        list.remove(0);            // Remove from a specific position

        System.out.println("List after deletion: " + list);
    }
}
