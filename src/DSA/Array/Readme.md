# Array Notes

## Definition of Array
An array is a fundamental data structure in programming that consists of a collection of elements, each identified by at least one index or key. Arrays store multiple items of the same type together, making it easier to calculate the position of each element by simply adding an offset to a base value, which is the memory location of the first element. Arrays are commonly used for organizing data so that a related set of values can be easily sorted or searched.

Arrays can be single-dimensional, where data is stored in a linear form, or multi-dimensional, where data can be stored in a matrix or grid form, like a table. The primary characteristic of an array is its fixed size, meaning the number of elements it can hold is defined when the array is created and cannot change.

## Types of Arrays
- **Single-Dimensional Array**: Also known as a one-dimensional array, this is the simplest form of array where elements are stored in a single row.
- **Multi-Dimensional Array**: Arrays that have more than one dimension, such as two-dimensional arrays (matrices) or three-dimensional arrays. These arrays store data in a grid or table-like structure.
- **Jagged Array**: An array of arrays where the inner arrays can have different lengths. This is useful when dealing with irregularly shaped data structures.

## Advantages of Array
- **Efficient Random Access**: Arrays allow quick access to any element using its index, making data retrieval fast.
- **Memory Allocation**: Arrays use contiguous memory allocation, which makes it easier for the system to manage and access the memory.
- **Fixed Size**: The size of an array is determined at the time of creation, which can help in managing memory allocation effectively.

## Uses of Array
- **Storing Data**: Arrays are used to store data of the same type, such as a list of integers or a collection of strings.
- **Iterating Elements**: Arrays allow easy iteration over elements using loops, making it convenient to process each element.
- **Multidimensional Arrays**: Arrays can be used to represent multi-dimensional data structures, such as matrices.

## Array in Java

### Example of Creating and Using an Array in Java
```java
public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements using their index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Iterating over the array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Modifying an element
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);
    }
}
