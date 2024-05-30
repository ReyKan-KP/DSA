import java.util.*;

public class customCircularLinkedList {
  private Node head;
  private Node tail;

  public customCircularLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public static void main(String[] args) {
    customCircularLinkedList list = new customCircularLinkedList();
    list.insert(9);
    list.insert(8);
    list.insert(5);
    list.insert(3);
    list.insert(17);
    list.display();
    list.delete(5);
    list.display();
  }

  public void insert(int value) {
    Node node = new Node(value);
    if (head == null) {
      head = node;
      tail = node;
      return;
    }
    tail.next = node;
    node.next = head;
    tail = node;
  }

  public void display() {
    Node current = head;
    if (head == null) {
      return;
    }
    do {
      System.out.print(current.value + " -> ");
      current = current.next;
    } while (current != head);
    System.out.println("Head");
  }

  public void delete(int value) {
    Node current = head;
    Node previous = null;
    if (head == null) {
      return;
    }
    do {
      if (current.value == value) {
        if (previous == null) {
          head = current.next;
          tail.next = head;
        } else {
          previous.next = current.next;
        }
        return;
      }
      previous = current;
      current = current.next;
    } while (current != head);
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }
}
