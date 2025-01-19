# Tokens: The Smallest Building Blocks of a Program

Tokens are the smallest components of a program that a compiler or interpreter recognizes and processes. They are essential to writing any code and are categorized into the following five types:

## 1. Identifiers
Identifiers are user-defined names for variables, functions, methods, classes, and objects. They are used to uniquely reference and manipulate program elements.

### Characteristics of Identifiers:
- Must begin with a letter (A-Z or a-z) or an underscore (_) and can contain letters, digits (0-9), and underscores.
- Cannot use reserved keywords as identifiers.
- Are case-sensitive in many programming languages.

---

## 2. Operators
Operators are special symbols used to perform operations on variables and values. They are used in computations, comparisons, and logic.

### Categories of Operators:
- **Arithmetic Operators** for mathematical calculations.
- **Relational Operators** for comparisons between values.
- **Logical Operators** for logical operations.
- **Bitwise Operators** for bit-level operations.
- **Assignment Operators** for assigning values to variables.

---

## 3. Separators
Separators, also called delimiters, are symbols used to organize and structure code. They define boundaries between statements and components of the program.

### Common Separators:
- Parentheses for grouping or defining function parameters.
- Braces for defining code blocks.
- Brackets for arrays or indexing.
- Commas for separating list items or function arguments.
- Semicolons to terminate statements.
- Periods for accessing class members or methods.

---

## 4. Keywords
Keywords are predefined, reserved words in a programming language. They have fixed meanings and are used to define the structure and behavior of code.

### Examples of Usage:
- Control flow keywords like `if`, `else`, `while`, and `switch`.
- Data type keywords like `int`, `float`, and `char`.
- Object-oriented keywords like `class`, `extends`, and `implements`.

---

## 5. Literals
Literals are fixed values written directly in the code that remain constant during the program's execution. They represent actual data, such as numbers, characters, strings, or boolean values.

### Types of Literals Based on Data Types:

#### 1. Primitive Data Type Literals:
- **Integer Literals** represent whole numbers.
  - The default type for integers is `int`. Other types, such as `long`, require explicit notation.
- **Floating-Point Literals** represent decimal numbers.
  - The default type for floating-point numbers is `double`. The `float` type requires explicit notation.
- **Character Literals** represent single characters enclosed in single quotes.
- **Boolean Literals** represent `true` or `false`.

#### 2. Non-Primitive Data Type Literals:
- **String Literals** represent sequences of characters enclosed in double quotes.
  - Strings are often treated as objects or references, depending on the language.
- **Null Literals** represent null references, indicating that a variable points to no object or value.

### Default Data Types for Literals:
- Integer literals are treated as `int` unless explicitly specified as another type (e.g., `long`).
- Floating-point literals are treated as `double` unless explicitly marked as `float`.
- Character literals are treated as `char`.

---

## Conclusion
Tokens form the foundation of programming. Among them, literals play a vital role as they define the fixed data that programs work with. Understanding their types and default behaviors is essential for efficient and error-free coding.
