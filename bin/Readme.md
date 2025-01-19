# Introduction to Java

Java is a high-level, object-oriented programming language developed by Sun Microsystems in 1995, now owned by Oracle Corporation. It is widely used for building platform-independent applications due to its **"Write Once, Run Anywhere" (WORA)** capability. Java is known for its simplicity, robustness, portability, and security.

## Platform Independence in Java

Java is platform-independent because Java programs are compiled into **bytecode**, which can run on any operating system with a **Java Virtual Machine (JVM)**. Unlike other programming languages that generate platform-specific machine code, Java's bytecode can be executed on any device with a compatible JVM, regardless of the underlying hardware or operating system.

## Write Once, Run Anywhere (WORA)

WORA means that Java programs can be written once and executed on any platform without requiring modifications. This is achieved by compiling Java source code into bytecode, which is interpreted by the JVM specific to each platform.

## JDK (Java Development Kit)

The JDK is a software development kit that provides the tools required to develop and run Java programs. It includes:

- The Java compiler (`javac`) for compiling source code into bytecode.
- The JVM for running Java programs.
- Libraries, documentation, and tools like `javadoc` and `jar`.

## JRE (Java Runtime Environment)

The JRE is a subset of the JDK that allows running Java programs. It includes:

- The JVM to execute bytecode.
- Core libraries and supporting files.

However, it does **not** include tools for developing Java programs, such as the compiler.

## JVM (Java Virtual Machine)

The JVM is a virtual machine that provides the runtime environment to execute Java bytecode. It performs the following tasks:

- Converts bytecode into machine code using **Just-In-Time (JIT) compilation**.
- Manages memory through **garbage collection**.
- Ensures security and portability of Java applications.

## JIT (Just-In-Time Compiler)

The **JIT compiler** is part of the JVM. It improves performance by converting frequently executed bytecode into machine code at runtime, enabling faster execution of the program.

## Installing Java on Different Operating Systems

### Windows:
1. Download the JDK installer from the official **Oracle website**.
2. Run the installer and follow the setup instructions.
3. Set the `JAVA_HOME` environment variable to the JDK installation directory.
4. Update the `PATH` variable to include the `bin` directory of the JDK.

### macOS:
1. Install Java using a package manager like **Homebrew** or download the installer from Oracle.
2. Run the installer and follow the prompts.
3. Verify the installation by running `java -version` in the terminal.

### Linux:
1. Install Java using the system's package manager (e.g., `sudo apt install openjdk-XX-jdk` for Ubuntu).
2. Set the `JAVA_HOME` and `PATH` environment variables.
3. Verify the installation with `java -version`.

## Structure of a Java Program

A basic Java program consists of the following components:

1. **Class Declaration**: Every Java program must contain at least one class.
2. **Main Method**: The entry point of the program, defined as `public static void main(String[] args)`.
3. **Statements**: Instructions that perform actions within the program.

### Example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Important Rules While Writing Java Code

- **Class Name and File Name**: The name of the file must match the name of the public class inside it.
- **Case Sensitivity**: Java is case-sensitive, so `MyClass` and `myclass` are considered different.
- **Main Method**: The main method must have the exact signature: `public static void main(String[] args)`.
- **Curly Braces**: Properly open and close braces `{}` to define blocks of code.

## Running Java Code

1. Write the code in a file with the `.java` extension.
2. Compile the code using the `javac` command:

```bash
javac FileName.java
```

3. Run the program using the `java` command:

```bash
java FileName
```

## Casing in Java

Casing refers to the way words are capitalized in identifiers to improve readability and consistency.

### Types of Casing

- **Camel Case**: The first word is lowercase, and subsequent words start with an uppercase letter. 
  - Example: `myVariableName`.
- **Pascal Case**: Every word starts with an uppercase letter. 
  - Example: `MyClassName`.
- **Snake Case**: Words are separated by underscores and written in lowercase. 
  - Example: `my_variable_name`.

### Recommended Casing in Java

- **Classes and Interfaces**: Use **Pascal Case** (e.g., `MyClass`).
- **Methods and Variables**: Use **Camel Case** (e.g., `calculateSum`).
- **Constants**: Use **Snake Case** in uppercase (e.g., `MAX_VALUE`).

---

