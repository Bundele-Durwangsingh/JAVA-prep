# Java Methods

## What is a Method?

A method is a block of code that performs a specific task. Methods are used to perform certain actions, and they are also known as functions.

## When to Use Methods

Methods are used to:
- Reuse code: Define the code once and use it many times.
- Improve code readability and maintainability.
- Divide a complex problem into simpler pieces.

## How to Use Methods

### Method Terminology

- **Method Signature**: The combination of the method name and the parameter list.
- **Method Declaration**: The part of the method that includes the method signature and the return type.
- **Method Definition**: The entire method including the method body.

### Syntax of a Method

```java
accessModifier nonAccessModifier returnType methodName(formalArguments) {
    // method body
}
```

### Components of a Method

1. **Access Modifier**: Defines the access level of the method. Types include:
   - `public`: The method is accessible from any other class.
   - `protected`: The method is accessible within its own package and by subclasses.
   - `default` (no modifier): The method is accessible only within its own package.
   - `private`: The method is accessible only within its own class.

2. **Non-Access Modifier**: Provides additional functionality. Types include:
   - `static`: The method belongs to the class, rather than instances of the class.
   - `final`: The method cannot be overridden by subclasses.
   - `abstract`: The method does not have a body and must be implemented by subclasses.

3. **Return Type**: The data type of the value the method returns. If the method does not return a value, use `void`.

4. **Method Name**: The name of the method. It should be a meaningful name that describes the task performed by the method.

5. **Formal Arguments**: The parameters passed to the method. These are optional.

### The `return` Statement

The `return` statement is used to exit from a method and optionally pass a value back to the caller. It terminates the execution of the method and returns control to the calling method.

### Calling Static Methods

Static methods can be called in three ways:
1. **Using the method name directly** (only within the same class):
   ```java
   methodName(arguments);
   ```
2. **Using the class name**:
   ```java
   ClassName.methodName(arguments);
   ```
3. **Using an object of the class** (not recommended for static methods):
   ```java
   ClassName obj = new ClassName();
   obj.methodName(arguments);
   ```

### Calling Non-Static Methods

Non-static methods must be called using an object of the class:
```java
ClassName obj = new ClassName();
obj.methodName(arguments);
```

### Difference Between Static and Non-Static Methods

- **Static Methods**:
  - Belong to the class, not instances of the class.
  - Can be called without creating an object of the class.
  - Cannot access instance variables directly.

- **Non-Static Methods**:
  - Belong to instances of the class.
  - Require an object of the class to be called.
  - Can access instance variables and other instance methods directly.

### When to Use Which

- Use **static methods** for operations that do not require data from an instance of the class.
- Use **non-static methods** for operations that require data from an instance of the class.

### Example of Static Method

```java
public class StaticExample {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Calling static method
        StaticExample.staticMethod();
    }
}
```

### Example of Non-Static Method

```java
public class NonStaticExample {
    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Calling non-static method
        NonStaticExample obj = new NonStaticExample();
        obj.nonStaticMethod();
    }
}
```
