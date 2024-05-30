import java.util.*;

public class customDoublyLinkedList {
  Node head;
  int size;

  public customDoublyLinkedList() {
    this.size = 0;
  }

  public static void main(String[] args) {
    customDoublyLinkedList list = new customDoublyLinkedList();
    list.insertFirst(9);
    list.insertFirst(8);
    list.insertFirst(5);
    list.insertFirst(3);
    list.insertLast(17);
    list.insertAt(2, 7);
    list.display();

    // Uncomment the lines below to test delete methods
    // list.deleteFirst();
    // list.display();
    // list.deleteLast();
    // list.display();
  }

  public void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    node.prev = null;
    if (head != null) {
      head.prev = node;
    }
    head = node;
    size++;
  }

  public void insertLast(int value) {
    Node node = new Node(value);
    if (head == null) {
      node.prev = null;
      head = node;
      size++;
      return;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = node;
    node.prev = last;
    size++;
  }

  public void insertAt(int index, int value) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    if (index == 0) {
      insertFirst(value);
    } else {
      Node newNode = new Node(value);
      Node current = head;
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }
      newNode.next = current.next;
      current.next = newNode;
      newNode.prev = current;
      if (newNode.next != null) {
        newNode.next.prev = newNode;
      }
      size++;
    }
  }

  public void display() {
    Node current = head;
    Node last = null;
    while (current != null) {
      System.out.print(current.value + " -> ");
      last = current;
      current = current.next;
    }
    System.out.println("End");
    System.out.println("In reverse order:");
    while (last != null) {
      System.out.print(last.value + " -> ");
      last = last.prev;
    }
    System.out.println("Start");
  }

  public Node find(int value) {
    Node temp = head;
    while (temp != null) {
      if (temp.value == value) {
        return temp;
      }
      temp = temp.next;
    }
    return null;
  }

  private class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}
