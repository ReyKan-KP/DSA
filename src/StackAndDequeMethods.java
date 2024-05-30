/*
   Stack Implementation Methods in Java
   -------------------------------------

   1. Using Array
   2. Using Linked List
   3. Using ArrayList
   4. Using Stack Class (java.util.Stack)
   5. Using Deque Interface (java.util.Deque)
*/

import java.util.*;

public class StackAndDequeMethods {

  // Method 4: Using Stack Class (java.util.Stack)
  static void stackClassExample() {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("Stack: " + stack); // Output: Stack: [10, 20, 30]

    System.out.println("Is stack empty? " + stack.empty()); // Output: Is stack empty? false

    System.out.println(
        "Search for element 20: " + stack.search(20)); // Output: Search for element 20: 2
    System.out.println(
        "Search for element 40: " + stack.search(40)); // Output: Search for element 40: -1
  }

  // Method 5: Using Deque Interface (java.util.Deque)
  static void dequeExample() {
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("Stack: " + stack); // Output: Stack: [30, 20, 10]
    System.out.println("Top Element: " + stack.peek()); // Output: Top Element: 30
    System.out.println("Popped Element: " + stack.pop()); // Output: Popped Element: 30
  }

  static void dequeAdditionalMethods() {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(10);
    deque.addLast(20);
    deque.addLast(30);
    System.out.println("Deque: " + deque); // Output: Deque: [10, 20, 30]

    deque.offerFirst(5);
    deque.offerLast(40);
    System.out.println("Size of deque: " + deque.size()); // Output: Size of deque: 5
    System.out.println(
        "Deque after offerFirst(5) and offerLast(40): "
            + deque); // Output: Deque after offerFirst(5) and offerLast(40): [5, 10, 20, 30, 40]

    System.out.println("First element: " + deque.getFirst()); // Output: First element: 5
    System.out.println("Last element: " + deque.getLast()); // Output: Last element: 40

    System.out.println(
        "Removing first element: " + deque.removeFirst()); // Output: Removing first element: 5
    System.out.println(
        "Deque after removing first element: "
            + deque); // Output: Deque after removing first element: [10, 20, 30, 40]

    System.out.println(
        "Polling last element: " + deque.pollLast()); // Output: Polling last element: 40
    System.out.println(
        "Deque after polling last element: "
            + deque); // Output: Deque after polling last element: [10, 20, 30]

    System.out.println(
        "Peek first element: " + deque.peekFirst()); // Output: Peek first element: 10
    System.out.println("Peek last element: " + deque.peekLast()); // Output: Peek last element: 30

    System.out.println(
        "Removing last occurrence of 20: "
            + deque.removeLastOccurrence(20)); // Output: Removing last occurrence of 20: true
    System.out.println(
        "Deque after removing last occurrence of 20: "
            + deque); // Output: Deque after removing last occurrence of 20: [10, 30]
  }

  public static void main(String[] args) {
    // Testing array stack
    ArrayStack arrayStack = new ArrayStack(5);
    arrayStack.push(10);
    arrayStack.push(20);
    arrayStack.push(30);
    System.out.println("Array Stack:");
    while (!arrayStack.isEmpty()) {
      System.out.println(arrayStack.pop()); // Output: 30, 20, 10
    }

    // Testing linked list stack
    LinkedListStack linkedListStack = new LinkedListStack();
    linkedListStack.push(10);
    linkedListStack.push(20);
    linkedListStack.push(30);
    System.out.println("Linked List Stack:");
    while (!linkedListStack.isEmpty()) {
      System.out.println(linkedListStack.pop()); // Output: 30, 20, 10
    }

    // Testing ArrayList stack
    ArrayListStack arrayListStack = new ArrayListStack();
    arrayListStack.push(10);
    arrayListStack.push(20);
    arrayListStack.push(30);
    System.out.println("ArrayList Stack:");
    while (!arrayListStack.isEmpty()) {
      System.out.println(arrayListStack.pop()); // Output: 30, 20, 10
    }

    // Testing Stack Class
    System.out.println("Stack Class Example:");
    stackClassExample(); // Output: Stack: [10, 20, 30], Top Element: 30, Popped Element: 30

    // Testing Deque Interface
    System.out.println("Deque Example:");
    dequeExample(); // Output: Stack: [30, 20, 10], Top Element: 30, Popped Element: 30

    // Testing Deque Additional Methods
    System.out.println("Deque Additional Methods:");
    dequeAdditionalMethods();
  }

  // Method 1: Using Array
  static class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
      maxSize = size;
      stackArray = new int[maxSize];
      top = -1;
    }

    public void push(int value) {
      if (top < maxSize - 1) {
        stackArray[++top] = value;
      }
    }

    public int pop() {
      if (top >= 0) {
        return stackArray[top--];
      }
      return -1;
    }

    public int peek() {
      if (top >= 0) {
        return stackArray[top];
      }
      return -1;
    }

    public boolean isEmpty() {
      return (top == -1);
    }
  }

  // Method 2: Using Linked List
  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class LinkedListStack {
    Node top;

    public LinkedListStack() {
      this.top = null;
    }

    public void push(int value) {
      Node newNode = new Node(value);
      newNode.next = top;
      top = newNode;
    }

    public int pop() {
      if (top == null) {
        return -1;
      }
      int poppedValue = top.data;
      top = top.next;
      return poppedValue;
    }

    public int peek() {
      if (top == null) {
        return -1;
      }
      return top.data;
    }

    public boolean isEmpty() {
      return (top == null);
    }
  }

  // Method 3: Using ArrayList
  static class ArrayListStack {
    private ArrayList<Integer> stack;

    public ArrayListStack() {
      stack = new ArrayList<>();
    }

    public void push(int value) {
      stack.add(value);
    }

    public int pop() {
      if (!stack.isEmpty()) {
        int lastIndex = stack.size() - 1;
        int poppedValue = stack.get(lastIndex);
        stack.remove(lastIndex);
        return poppedValue;
      }
      return -1;
    }

    public int peek() {
      if (!stack.isEmpty()) {
        return stack.get(stack.size() - 1);
      }
      return -1;
    }

    public boolean isEmpty() {
      return stack.isEmpty();
    }
  }
}
