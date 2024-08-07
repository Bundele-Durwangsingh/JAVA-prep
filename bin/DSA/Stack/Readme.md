# Stack in Java

## What is a Stack?

A **stack** is a linear data structure that follows the Last In, First Out (LIFO) principle. It means that the last element added to the stack will be the first one to be removed.

## Use of Stack

Stacks are used in various applications, including:
- **Expression evaluation and syntax parsing**: Compilers use stacks to parse expressions, manage function calls, and handle syntax parsing.
- **Backtracking**: Algorithms like depth-first search use stacks to keep track of the visited nodes.
- **Undo mechanisms**: Many software applications use stacks to implement undo features.
- **Memory management**: Stacks are used in managing function calls and local variables in programming languages.

## Actions in Stack

### Push
The **push** operation adds an element to the top of the stack. If the stack is full, an overflow condition occurs.

### Pop
The **pop** operation removes the top element from the stack. If the stack is empty, an underflow condition occurs.

### Peek (or Top)
The **peek** operation returns the top element of the stack without removing it.

### isEmpty
The **isEmpty** operation checks if the stack is empty and returns `true` if it is, otherwise `false`.

### isFull
The **isFull** operation checks if the stack is full and returns `true` if it is, otherwise `false`.

### Characteristics of a Stack:
- **LIFO (Last In, First Out)**: The most recently added item is the first to be removed.
- **Sequential Access**: Elements can only be added or removed from the top of the stack.
- **Dynamic Size**: Stacks can grow and shrink as elements are added or removed.

### Examples of Real-world Stacks:
- **Plates in a cafeteria**: Plates are stacked one on top of another; you take the top plate first.
- **Undo feature in software**: Actions are pushed onto a stack; the most recent action is undone first.
- **Browser history**: Recently visited pages are pushed onto a stack; the back button pops pages from the stack.

In Java, the `Stack` class in the `java.util` package provides methods to perform stack operations. However, for modern applications, the `Deque` interface and its implementations like `ArrayDeque` are preferred due to better performance and flexibility.

## Advantages of Stack

- **Easy to implement**: Stacks are simple to implement and use.
- **Efficient for certain tasks**: For tasks like expression evaluation, syntax parsing, and backtracking, stacks provide an efficient way to manage data.
- **Memory management**: Stacks help in managing memory for function calls and local variables in programming languages.
- **Reversibility**: Stacks can be used to reverse data, making them useful in algorithms requiring data reversal.

