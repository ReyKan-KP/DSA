import java.util.LinkedList;

public class linkedListMethods {

  public static void main(String[] args) {
    // Creating a LinkedList
    LinkedList<String> list = new LinkedList<>();

    // Adding elements to the LinkedList
    list.add("Apple");
    list.add("Banana");
    System.out.println(list); // [Apple, Banana]

    // Inserting an element at a specific position
    list.add(1, "Orange");
    System.out.println(list); // [Apple, Orange, Banana]

    // Removing an element
    list.remove("Orange");
    System.out.println(list); // [Apple, Banana]

    // Getting an element by index
    System.out.println(list.get(0)); // Apple

    // Getting the size of the LinkedList
    System.out.println(list.size()); // 2

    // Clearing the LinkedList
    list.clear();
    System.out.println(list); // []

    // Checking if the LinkedList is empty
    System.out.println(list.isEmpty()); // true

    // Adding elements from another collection
    LinkedList<String> fruits = new LinkedList<>();
    fruits.add("Mango");
    fruits.add("Grapes");
    list.addAll(fruits);
    System.out.println(list); // [Mango, Grapes]

    // Checking if the list contains a specific element
    System.out.println(list.contains("Mango")); // true

    // Finding the index of an element
    System.out.println(list.indexOf("Grapes")); // 1

    // Removing the first element
    System.out.println(list.removeFirst()); // Mango
    System.out.println(list); // [Grapes]

    // Removing the last element
    System.out.println(list.removeLast()); // Grapes
    System.out.println(list); // []

    // Adding an element to the beginning of the list
    list.addFirst("Strawberry");
    System.out.println(list); // [Strawberry]

    // Adding an element to the end of the list
    list.addLast("Watermelon");
    System.out.println(list); // [Strawberry, Watermelon]

    // Getting the first element of the list
    System.out.println(list.getFirst()); // Strawberry

    // Getting the last element of the list
    System.out.println(list.getLast()); // Watermelon

    // Retrieves and removes the head of the list
    System.out.println(list.poll()); // Strawberry
    System.out.println(list); // [Watermelon]

    // Retrieves and removes the first element of the list
    System.out.println(list.pollFirst()); // Watermelon
    System.out.println(list); // []

    // Retrieves and removes the last element of the list
    System.out.println(list.pollLast()); // null
    System.out.println(list); // []

    // Pushes an element onto the stack represented by this list
    list.push("Pineapple");
    System.out.println(list); // [Pineapple]

    // Pops the element from the stack represented by this list
    System.out.println(list.pop()); // Pineapple
    System.out.println(list); // []
  }
}
