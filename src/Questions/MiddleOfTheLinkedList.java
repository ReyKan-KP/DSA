package Questions;

import java.util.*;

public class MiddleOfTheLinkedList {
  public static void main(String[] args) {
    MiddleOfTheLinkedList obj = new MiddleOfTheLinkedList();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);
    head.next.next.next.next.next.next.next = new ListNode(8);
    head.next.next.next.next.next.next.next.next = new ListNode(9);
    head.next.next.next.next.next.next.next.next.next = new ListNode(10);

    // Store reference to the original head
    ListNode originalHead = head;

    // Print original list
    while (originalHead != null) {
      System.out.print(originalHead.val + " -> ");
      originalHead = originalHead.next;
    }

    // Get the middle of the list
    ListNode middleNode = obj.middleNode(head);

    // Print middle node
    System.out.println();
    System.out.println("Middle node: " + middleNode.val);
  }

  ListNode middleNode(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode fastNode = head;
    ListNode slowNode = head;

    while (fastNode != null && fastNode.next != null) {
      fastNode = fastNode.next.next;
      slowNode = slowNode.next;
    }
    return slowNode;
  }

  static class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }
}
