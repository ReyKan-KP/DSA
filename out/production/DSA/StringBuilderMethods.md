### Methods for Modifying Contents:

1. **`append(String str)`**
    - Appends the string representation of the given argument to the sequence.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    ```

2. **`insert(int offset, String str)`**
    - Inserts the string representation of the given argument into the sequence at the specified position.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.insert(5, " World");
    ```

3. **`delete(int start, int end)`**
    - Deletes the characters in the specified range.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.delete(6, 11);
    ```

4. **`deleteCharAt(int index)`**
    - Deletes the character at the specified position.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.deleteCharAt(5);
    ```

5. **`replace(int start, int end, String str)`**
    - Replaces the characters in the specified range with the given string.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.replace(6, 11, "Universe");
    ```

### Methods for Information Retrieval:

6. **`charAt(int index)`**
    - Returns the character at the specified position.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    char character = sb.charAt(2);
    ```

7. **`indexOf(String str)` and `lastIndexOf(String str)`**
    - Returns the index of the first (or last) occurrence of the specified substring.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    int firstIndex = sb.indexOf("o");
    int lastIndex = sb.lastIndexOf("o");
    ```

8. **`substring(int start)` and `substring(int start, int end)`**
    - Returns a new `StringBuilder` that is a substring of the current `StringBuilder`.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    StringBuilder substring1 = sb.substring(6); // "World"
    StringBuilder substring2 = sb.substring(0, 5); // "Hello"
    ```

### Methods for Capacity Management:

9. **`length()`**
    - Returns the length (number of characters) of the sequence.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    int length = sb.length();
    ```

10. **`setLength(int newLength)`**
    - Sets the length of the `StringBuilder`. Truncates or pads with null characters as needed.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.setLength(5); // "Hello"
    ```

11. **`ensureCapacity(int minimumCapacity)`**
    - Ensures that the capacity of the `StringBuilder` is at least equal to the specified minimum capacity.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.ensureCapacity(20);
    ```

12. **`trimToSize()`**
    - Attempts to reduce the capacity of the `StringBuilder` to its current length.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.trimToSize();
    ```

### Other Methods:

13. **`reverse()`**
    - Reverses the sequence of characters.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.reverse();
    ```

14. **`toString()`**
    - Converts the contents of the `StringBuilder` to a `String`.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    String result = sb.toString();
    ```

15. **`codePoints()`**
    - Returns a stream of Unicode code points from the `StringBuilder`.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.codePoints().forEach(System.out::println);
    ```
I believe you're asking about checking if a `StringBuilder` contains a particular sequence of characters. Unlike the `String` class, `StringBuilder` does not have a direct `contains` method. However, you can achieve this using the `indexOf` method.

Here's an example:

```java
StringBuilder sb = new StringBuilder("Hello World");

// Check if the StringBuilder contains a specific substring
String substringToCheck = "World";
if (sb.indexOf(substringToCheck) != -1) {
    System.out.println("StringBuilder contains '" + substringToCheck + "'");
} else {
    System.out.println("StringBuilder does not contain '" + substringToCheck + "'");
}
```


Keep in mind that the `indexOf` method is case-sensitive. If you want a case-insensitive check, you can convert both the `StringBuilder` content and the substring to lowercase or uppercase using `toLowerCase()` or `toUpperCase()` methods before comparing.

These methods provide a wide range of functionalities for efficiently manipulating mutable character sequences using `StringBuilder` in Java.

