import java.util.ArrayList;
import java.util.List;

public class StringAndStringBuilder {

  public static void main(String[] args) {
    String str1 = "Hello World";
    String str2 = "Hello World";

    String str3 = new String("Hello World");
    String str4 = new String("Hello World");

    // String is immutable
    System.out.println(str1 == str2); //true
    System.out.println(str4 == str3); //false
    System.out.println(str4.equals(str3)); //true

    // index
    System.out.println(str1.charAt(0)); //H
    System.out.println(str1.indexOf("World")); //6
    System.out.println(str1.indexOf("o")); //4

    // substring
    System.out.println(str1.substring(0, 5)); //Hello
    System.out.println(str1.substring(6)); //World

    // split
    String str5 = "Hello,World,Java";
    String[] strArr = str5.split(",");
    System.out.println(strArr[0]); //Hello
    System.out.println(strArr[1]); //World
    System.out.println(strArr[2]); //Java

    // join
    String str6 = String.join(",", strArr);
    System.out.println(str6); //Hello,World,Java

    // replace
    System.out.println(str1.replace("World", "Java")); //Hello Java

    // toLowerCase
    System.out.println(str1.toLowerCase()); //hello world

    // toUpperCase
    System.out.println(str1.toUpperCase()); //HELLO WORLD

    // trim
    String str7 = "   Hello World   ";
    System.out.println(str7.trim()); //Hello World

    // isEmpty
    System.out.println(str7.isEmpty()); //false

    // isBlank
    System.out.println(str7.isBlank()); //false

    // length
    System.out.println(str7.length()); //17

    // startsWith
    System.out.println(str7.startsWith("Hello")); //false

    // endsWith
    System.out.println(str7.endsWith("World")); //false

    // charArray
    char[] charArr = str7.toCharArray();

    // valueOf
    int a = 10;
    String str8 = String.valueOf(a);

    // compareTo
    System.out.println(str1.compareTo(str2)); //0

    // compareToIgnoreCase
    System.out.println(str1.compareToIgnoreCase(str2)); //0

    // contains
    System.out.println(str1.contains("Hello")); //true

    // concat
    System.out.println(str1.concat(" Java")); //Hello World Java

    // indexOf
    System.out.println(str1.indexOf("World")); //6

    // lastIndexOf
    System.out.println(str1.lastIndexOf("o")); //7

    // strip
    System.out.println(str7.strip()); //Hello World

    // stripLeading
    System.out.println(str7.stripLeading()); //Hello World

    // stripTrailing
    System.out.println(str7.stripTrailing()); //   Hello World

    // repeat
    System.out.println(str1.repeat(2)); //Hello WorldHello World

    // matches
    System.out.println(str1.matches("Hello World")); //true

    // replaceAll
    System.out.println(str1.replaceAll("World", "Java")); //Hello Java

    // replaceFirst
    System.out.println(str1.replaceFirst("World", "Java")); //Hello Java

    // toCharArray
    System.out.println(str1.toCharArray()); //[C@1b6d3586

    // String Builder
    StringBuilder sb = new StringBuilder("Hello World");
    System.out.println(sb); //Hello World


  }
}
