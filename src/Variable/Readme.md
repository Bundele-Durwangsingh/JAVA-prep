# **Variables in Java**

## **1. Data Types**
Java variables can store different types of data, categorized into:

### **1.1 Primitive Data Types**
These are the basic data types provided by Java:
- **byte** (1 byte) → Stores whole numbers from -128 to 127
- **short** (2 bytes) → Stores whole numbers from -32,768 to 32,767
- **int** (4 bytes) → Stores whole numbers from -2³¹ to 2³¹-1
- **long** (8 bytes) → Stores large whole numbers (-2⁶³ to 2⁶³-1)
- **float** (4 bytes) → Stores decimal numbers, with up to 7 decimal digits
- **double** (8 bytes) → Stores decimal numbers, with up to 16 decimal digits
- **char** (2 bytes) → Stores single characters (e.g., 'A', 'b', '1', '@')
- **boolean** (1 bit) → Stores `true` or `false`

### **1.2 Non-Primitive Data Types**
These include reference types that store memory addresses:
- **String** → Stores sequences of characters (`String name = "Java";`)
- **Arrays** → Collection of values of the same type (`int[] numbers = {1, 2, 3};`)
- **Classes** → User-defined blueprints for objects
- **Interfaces** → Defines a contract for classes to implement

---

## **2. Scope of Variables**
The scope of a variable determines where it can be accessed in a Java program.

### **2.1 Local Variables**
- Declared inside a block of code (methods, loops, if-else statements, etc.)
- Accessible only within that block
- Must be initialized before use

**Example:**
```java
public class Example {
    public void show() {
        int localVar = 10; // Local variable
        System.out.println(localVar); // Accessible only inside show() method
    }
}
```

### **2.2 Global Variables (Instance and Static Variables)**
Declared inside the class but outside any method, loop, or block.

#### **2.2.1 Static Variables**
- Declared with the `static` keyword
- Shared across all instances of the class
- Memory is allocated once, at the class level

**Example:**
```java
public class Example {
    static int count = 0; // Static variable

    public static void main(String[] args) {
        System.out.println(count); // Accessible without creating an object
    }
}
```

#### **2.2.2 Non-Static (Instance) Variables**
- Declared without `static`
- Each object of the class has its own copy
- Memory is allocated when an object is created

**Example:**
```java
public class Example {
    int num = 5; // Instance variable

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.num); // Accessed using an object
    }
}
```

---

### **Key Differences**
| Variable Type       | Declared Inside          | Accessible           | Memory Allocation         | Needs an Object? |
|---------------------|--------------------------|----------------------|---------------------------|------------------|
| **Local**           | Method/Loop/Block       | Within that block only | When block executes       | No               |
| **Instance (Non-Static)** | Class, outside methods | Each object separately | When an object is created | Yes              |
| **Static**          | Class, outside methods  | Shared among all objects | When class loads          | No               |
