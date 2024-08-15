# Hashing in Java

## HashSet

### Overview
`HashSet` is a collection class in Java that implements the `Set` interface, backed by a hash table. It is used to store unique elements, meaning no duplicates are allowed.

### Uses
- **Storing Unique Values:** `HashSet` is primarily used when you need to store a collection of unique elements.
- **Efficient Search Operations:** It offers constant-time performance for basic operations such as add, remove, and contains.

### Advantages
- **Fast Access:** Due to the hashing mechanism, `HashSet` provides faster access to elements compared to other set implementations.
- **No Duplicates:** Ensures that no duplicate elements are added to the collection.
- **Automatic Handling of Nulls:** Allows storing one null value.

## HashMap

### Overview
`HashMap` is a collection class in Java that implements the `Map` interface, backed by a hash table. It stores data in key-value pairs and does not maintain any order of the keys.

### Uses
- **Key-Value Pairs:** `HashMap` is used when you need to associate a unique key with a specific value.
- **Efficient Data Retrieval:** It allows for fast retrieval of data using the key.

### Advantages
- **Constant-Time Performance:** Offers constant-time complexity for get, put, and remove operations.
- **Null Handling:** Allows storing one null key and multiple null values.
- **Flexible Usage:** Can be used in various scenarios like caching, representing dictionaries, and more.

