public class StringMethodsExample {
    public static void main(String[] args) {
        // 1. length()
        String str = "Hello";
        int length = str.length();
        System.out.println(length);  // Output: 5

        // 2. charAt(int index)
        char character = str.charAt(2);
        System.out.println(character);  // Output: l

        // 3. substring(int beginIndex) and substring(int beginIndex, int endIndex)
        String substring1 = str.substring(2);       // "llo"
        String substring2 = str.substring(1, 4);    // "ell"
        System.out.println(substring1);
        System.out.println(substring2);

        // 4. indexOf(String str) and lastIndexOf(String str)
        int firstIndex = str.indexOf("l");
        int lastIndex = str.lastIndexOf("l");
        System.out.println(firstIndex);  // Output: 2
        System.out.println(lastIndex);   // Output: 3

        // 5. startsWith(String prefix) and endsWith(String suffix)
        boolean startsWith = str.startsWith("He");
        boolean endsWith = str.endsWith("lo");
        System.out.println(startsWith);  // Output: true
        System.out.println(endsWith);    // Output: true

        // 6. equals(Object obj) and equalsIgnoreCase(String anotherString)
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str.equals(str1);
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(str2);
        System.out.println(isEqual);           // Output: true
        System.out.println(isEqualIgnoreCase); // Output: true

        // 7. toLowerCase() and toUpperCase()
        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();
        System.out.println(lowerCase);  // Output: hello
        System.out.println(upperCase);  // Output: HELLO

        // 8. trim()
        String withSpaces = "   Hello   ";
        String trimmed = withSpaces.trim();
        System.out.println(trimmed);  // Output: Hello

        // 9. replace(char oldChar, char newChar) and replace(CharSequence target, CharSequence replacement)
        String replaced1 = str.replace('l', 'L');
        String replaced2 = str.replace("lo", "WO");
        System.out.println(replaced1);  // Output: HeLLo
        System.out.println(replaced2);  // Output: HeWO

        // 10. toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println(charArray);  // Output: ['H', 'e', 'l', 'l', 'o']

        // 11. split(String regex)
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // 12. format(String format, Object... args)
        String formattedString = String.format("Hello, %s!", "World");
        System.out.println(formattedString);  // Output: Hello, World!

        // 13. isEmpty()
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.println(isEmpty);  // Output: true

        // 14. contains(CharSequence sequence)
        String phrase = "Java Programming";
        boolean containsJava = phrase.contains("Java");
        System.out.println(containsJava);  // Output: true

        // 15. compareTo(String anotherString)
        String str12 = "apple";
        String str21 = "banana";
        int compareResult = str12.compareTo(str21);
        System.out.println(compareResult);  // Output: Negative value

        // 16. valueOf(primitive data types)
        int num = 42;
        String numStr = String.valueOf(num);
        System.out.println(numStr);  // Output: "42"

        // 17. intern()
        String str3 = new String("Hello").intern();
        String str4 = "Hello";
        System.out.println(str3 == str4);  // Output: true

        // 18. join(CharSequence delimiter, CharSequence... elements)
        String joinedString = String.join("-", "Java", "Programming", "Language");
        System.out.println(joinedString);  // Output: Java-Programming-Language

        // 19. matches(String regex)
        String email = "example@email.com";
        boolean isEmail = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        System.out.println(isEmail);  // Output: true

        // 20. regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        String str5 = "Hello World";
        String str6 = "world";
        boolean regionMatches = str5.regionMatches(true, 6, str6, 0, 5);
        System.out.println(regionMatches);  // Output: true

        // 21. codePointAt(int index)
        int codePoint = str.codePointAt(1);
        System.out.println(codePoint);  // Output: 101 (Unicode for 'e')

        // 22. offsetByCodePoints(int index, int codePointOffset)
        int offsetIndex = str.offsetByCodePoints(1, 2);
        System.out.println(offsetIndex);  // Output: 3

        // 23. format(Locale l, String format, Object... args)
        String formattedWithLocale = String.format(java.util.Locale.US, "Currency: %.2f", 42.567);
        System.out.println(formattedWithLocale);  // Output: Currency: 42.57

        // 24. repeat(int count)
        String repeatedString = "Java".repeat(3);
        System.out.println(repeatedString);  // Output: JavaJavaJava

        // 25. codePointCount(int beginIndex, int endIndex)
        String str0 = "Java\uD83D\uDE0AProgramming";
        int codePointCount = str0.codePointCount(0, str0.length());
        System.out.println(codePointCount);  // Output: 15

        // 26. offsetByCodePoints(int index, int codePointOffset)
        int offsetIndex1 = str.offsetByCodePoints(0, 2);
        System.out.println(offsetIndex1);  // Output: 2

        // 27. strip()
        String stringWithWhitespace = "  Hello   ";
        String strippedString = stringWithWhitespace.strip();
        System.out.println(strippedString);  // Output: Hello

        // 28. lines()
        String multilineString = "Line 1\nLine 2\nLine 3";
        long lineCount = multilineString.lines().count();
        System.out.println(lineCount);  // Output: 3

        // 29. repeat(int count)
        String repeatedString1 = "Java".repeat(3);
        System.out.println(repeatedString1);  // Output: JavaJavaJava

        // 30. isBlank()
        String blankString = "   ";
        boolean isBlank = blankString.isBlank();
        System.out.println(isBlank);  // Output: true

        // 31. stripLeading() and stripTrailing()
        String stringWithLeadingWhitespace = "   Hello";
        String stringWithTrailingWhitespace = "Hello   ";
        String strippedLeading = stringWithLeadingWhitespace.stripLeading();
        String strippedTrailing = stringWithTrailingWhitespace.stripTrailing();
        System.out.println(strippedLeading);   // Output: Hello
        System.out.println(strippedTrailing);  // Output: Hello

        // 32. lines() with forEach
        String multilineString2 = "Line 1\nLine 2\nLine 3";
        multilineString2.lines().forEach(System.out::println);
        // Output:
        // Line 1
        // Line 2
        // Line 3

        // 33. transform(Function<? super String, ? extends R> f)
        String transformedString = "Java".transform(String::toUpperCase);
        System.out.println(transformedString);  // Output: JAVA
    }
}
