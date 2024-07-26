### Whats inside this JDK?

In `JDK`, it consists of `JRE`, and inside JRE, there is `JVM + Some Libraries`
The structure is as follows:

```lua
JDK + Dev Tools
| JRE
    | JVM + Libraries
```

### Behind the scenes how it gets executed?

- The execution involves two main processes: `Compilation` and `Execution`.
- There are two processes First is `Compilation` and Second is `Execution`
- Detailed Explanation of `what the fuck` is happening with my code:
  - Code Writing and Saving:
    - I wrote code and saved with `.java` extension
  - Compilation:
    - JDK has `Compiler` and that compiler `converted` my `source code` into `byte code (.class)`
    - Good thing about this byte code is I can run it `anywhere` and on any `system`
  - Execution:
    - Now `JVM` `converts` the earlier `byte code` one into `native code` (understadable by only `machines`)
    - `Source to byte Compilation` took place and `byte to native execution` took place

### Understanding Code Structure

- `Class component` : `Class` ke andar `functions` hota he bhot saare, `class demo {...}`
- `Function component` : `public static void main(String[] args)` (ye main wala is entry point of any Java application)

### Fundamentals

- Variables in Java : `int a = 10`, `String b = "hello"`,`Boolean c = True`
- For prompting data from user : import package `java.util.Scanner`, make an instance `Scanner sc = new Scanner(System.in)` and `sc.nextInt()` or `sc.next()`

#### Controlling flow using Loops and Conditions

- Conditional Statement

  - if-else statement :

    ```java
    if (condition) {
    // code
    } else if (condition) {
    // code
    } else {
    // code
    }
    ```

  - switch statement :

    ```java
    switch (var) {
      case x1:
          // code
          break;
      case x2:
          // code
          break;
      default:
          // code
          break;
    }
    ```

- Loops

  - for loop

    ```java
    for (initialization; condition; increment/decrement) {
    // code
    }
    ```

  - while loop :

    ```java
    while (condition) {
      // code
    }

    ```

  - do while loop :

    ```java
    do {
        // code
    } while (condition);

    ```

#### Function

```java
 public static int handleCalc(int arg1, int arg2) {
    // logic and return
    return result;
}
```

#### Arrays

- Array Declaration:
  - In Java: `int[] arr = {10, 20, 30};`
  - Type-safe: Once specified, the datatype cannot change.
- Printing Arrays:: - `System.out.println(arr)` prints a reference value. - Iterate with a loop to print elements:

  ```java
  for (int i = 0; i < letters.length; i++) {
  System.out.println(letters[i]);
  }
  ```

- 2D Arrays:

  ```java
  int[][] arr = new int[3][3];
  int[][] arr = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };

  ```

#### Strings

- immutable
- Strings cannot be changed after creation.
- StringBuilder: for mutable strings

    ````java
      // String Example:

      public class StringExample {
      public static void main(String[] args) {
      String greeting = "Hello";
      greeting += " World"; // Creates a new String object
      System.out.println(greeting); // Output: Hello World
      }
      }

      // StringBuilder Example:

      public class StringBuilderExample {
        public static void main(String[] args) {
            StringBuilder greeting = new StringBuilder("Hello");
            greeting.append(" World"); // Modifies the existing object
            System.out.println(greeting.toString()); // Output: Hello World
        }
        }
    ````

### Time and Space Complexity

- `Time Complexity` measures how the runtime of an algorithm changes with input size.
- `Space Complexity:` measures the total space or memory an algorithm uses as a function of the input size.
- `Best, Worst, and Average Cases`:
    - Best Case: The scenario where the algorithm performs the minimum number of operations.
    - Worst Case: The scenario where the algorithm performs the maximum number of operations.
    - Average Case: The expected scenario for a typical input.
- `Single loops` typically contribute O(n).
- `Nested loops` typically contributeO(n^2).