package Questions;

import java.util.*;

public class ReorderList {
  public static void main(String[] args) {
    ReorderList obj = new ReorderList();
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
    System.out.println("Null");
    // Reorder the list
    obj.reorderList(head);

    // Print reordered list
    System.out.println();
    while (head != null) {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("Null");
  }

  void reorderList(ListNode head) {
    ListNode middle = middleNode(head);
    ListNode revMiddle = reverse(middle.next);
    middle.next = null;
    mergeLists(head, revMiddle);
  }

  private void mergeLists(ListNode l1, ListNode l2) {
    while (l1 != null && l2 != null) {
      ListNode next1 = l1.next;
      ListNode next2 = l2.next;

      l1.next = l2;
      l2.next = next1;

      l1 = next1;
      l2 = next2;
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

  ListNode middleNode(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
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
