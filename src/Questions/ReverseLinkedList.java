package Questions;

import java.util.*;

public class ReverseLinkedList {
  public static void main(String[] args) {
    ReverseLinkedList obj = new ReverseLinkedList();
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

    // Reverse the list
    ListNode reversedHead = obj.reverse(head);

    // Print reversed list
    System.out.println();
    while (reversedHead != null) {
      System.out.print(reversedHead.val + " -> ");
      reversedHead = reversedHead.next;
    }
  }

  ListNode reverse(ListNode head) {
    ListNode prevNode = null;
    ListNode currNode = head;
    while (currNode != null) {
      ListNode nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }
    head = prevNode;
    return head;
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
