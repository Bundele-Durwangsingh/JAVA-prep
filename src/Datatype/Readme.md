### **Notes: Data Types in Java**

#### **1. Primitive Data Types**
Primitive data types are the most basic data types provided by Java. They represent simple values and are predefined in the language.

##### **Categories of Primitive Data Types:**

1. **Number:**
   - **Integer/Whole Numbers:**
     - `byte`: Stores 8-bit signed integer values. Range: -128 to 127.
     - `short`: Stores 16-bit signed integer values. Range: -32,768 to 32,767.
     - `int`: Stores 32-bit signed integer values. Range: -2,147,483,648 to 2,147,483,647.
     - `long`: Stores 64-bit signed integer values. Suffix `L` is used to define `long` literals.
   - **Floating-Point/Decimal Numbers:**
     - `float`: Stores 32-bit single-precision floating-point numbers. Suffix `F` is used to define `float` literals.
     - `double`: Stores 64-bit double-precision floating-point numbers. Default for decimal values.

2. **Character (`char`):**
   - Represents a single character.
   - Enclosed in single quotes `' '`.
   - Example: `'A'`, `'@'`.
   - Unicode characters are supported.

3. **Boolean:**
   - Represents a value of either `true` or `false`.

---

#### **2. Non-Primitive Data Types**
Non-primitive data types are more complex and are defined by developers. They are not predefined in the language like primitive types.

##### **Examples of Non-Primitive Data Types:**
- **Arrays**: Collection of variables of the same type.
- **Strings**: Sequence of characters, handled by the `String` class.
- **Lists**: Ordered collections of elements.
- **Objects**: Instances of user-defined classes.

---

**Key Differences Between Primitive and Non-Primitive Data Types:**

| Feature                  | Primitive Data Types                   | Non-Primitive Data Types           |
|--------------------------|----------------------------------------|-------------------------------------|
| **Definition**           | Predefined by Java.                   | Defined by the developer.          |
| **Examples**             | `int`, `float`, `boolean`, `char`.    | `Array`, `String`, `Object`, `List`. |
| **Storage**              | Stores simple values.                 | Stores addresses of data in memory. |
| **Capabilities**         | Limited functionality.                | Advanced functionalities provided. |
