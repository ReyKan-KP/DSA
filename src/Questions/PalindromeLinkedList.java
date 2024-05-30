package Questions;

import java.util.*;

public class PalindromeLinkedList {
  public static void main(String[] args) {
    PalindromeLinkedList obj = new PalindromeLinkedList();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(1);

    System.out.println(obj.isPalindrome(head));
  }

  public boolean isPalindrome(ListNode head) {
    // ArrayList<Integer> list = new ArrayList<>();
    // while (head != null) {
    // list.add(head.val);
    // head = head.next;
    // }
    // int start = 0;
    // int end = list.size() - 1;
    // while (start <= end) {
    // if (list.get(start) != list.get(end)) {
    // return false;
    // }
    // start++;
    // end--;
    // }
    // return true;

    ListNode middle = middleNode(head);
    ListNode revNode = reverse(middle.next);
    middle.next = null;

    while (revNode != null) {
      if (head.val != revNode.val) {
        return false;
      }
      head = head.next;
      revNode = revNode.next;
    }
    return true;
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
    return prevNode;
  }

  ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }
}
