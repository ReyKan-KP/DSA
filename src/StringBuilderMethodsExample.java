public class StringBuilderMethodsExample {
    public static void main(String[] args) {
        // Methods for Modifying Contents:

        // 1. append(String str)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());  // Output: Hello World

        // 2. insert(int offset, String str)
        sb = new StringBuilder("Hello");
        sb.insert(5, " World");
        System.out.println(sb.toString());  // Output: Hello World

        // 3. delete(int start, int end)
        sb = new StringBuilder("Hello World");
        sb.delete(6, 11);
        System.out.println(sb.toString());  // Output: Hello

        // 4. deleteCharAt(int index)
        sb = new StringBuilder("Hello World");
        sb.deleteCharAt(5);
        System.out.println(sb.toString());  // Output: Helloworld

        // 5. replace(int start, int end, String str)
        sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Universe");
        System.out.println(sb.toString());  // Output: Hello Universe

        // Methods for Information Retrieval:

        // 6. charAt(int index)
        sb = new StringBuilder("Hello");
        char character = sb.charAt(2);
        System.out.println(character);  // Output: l

        // 7. indexOf(String str) and lastIndexOf(String str)
        sb = new StringBuilder("Hello World");
        int firstIndex = sb.indexOf("o");
        int lastIndex = sb.lastIndexOf("o");
        System.out.println(firstIndex);  // Output: 4
        System.out.println(lastIndex);   // Output: 7

        // 8. substring(int start) and substring(int start, int end)
        sb = new StringBuilder("Hello World");
        StringBuilder substring1 = new StringBuilder(sb.substring(6));        // "World"
        StringBuilder substring2 = new StringBuilder(sb.substring(0, 5));     // "Hello"
        System.out.println(substring1.toString());
        System.out.println(substring2.toString());

        // Methods for Capacity Management:

        // 9. length()
        sb = new StringBuilder("Hello");
        int length = sb.length();
        System.out.println(length);  // Output: 5

        // 10. setLength(int newLength)
        sb = new StringBuilder("Hello World");
        sb.setLength(5);
        System.out.println(sb.toString());  // Output: Hello

        // 11. ensureCapacity(int minimumCapacity)
        sb = new StringBuilder("Hello");
        sb.ensureCapacity(20);
        System.out.println(sb.capacity());  // Output: 20

        // 12. trimToSize()
        sb = new StringBuilder("Hello World");
        sb.trimToSize();
        System.out.println(sb.capacity());  // Output: 11

        // Other Methods:

        // 13. reverse()
        sb = new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb.toString());  // Output: olleH

        // 14. toString()
        sb = new StringBuilder("Hello");
        String result = sb.toString();
        System.out.println(result);  // Output: Hello

        // 15. codePoints()
        sb = new StringBuilder("Hello");
        sb.codePoints().forEach(System.out::println);  // Output: Unicode code points of each character

        // 16. Check if the StringBuilder contains a specific substring
        String substringToCheck = "World";
        if (sb.indexOf(substringToCheck) != -1) {
            System.out.println("StringBuilder contains '" + substringToCheck + "'");
        } else {
            System.out.println("StringBuilder does not contain '" + substringToCheck + "'");
        }
    }
}
