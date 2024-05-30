public class customLinkedList {

  private Node head;
  private Node tail;
  private int size;

  public customLinkedList() {
    this.size = 0;
  }

  public static void main(String[] args) {
    customLinkedList list = new customLinkedList();
    list.insertFirst(9);
    list.insertFirst(8);
    list.insertFirst(5);
    list.insertFirst(3);
    list.insertLast(17);
    list.insertAt(2, 7);
    list.display();

    list.deleteFirst();
    list.display();
    ;
    list.deleteLast();
    list.display();
    list.deleteAt(2);
    list.display();
  }

  public void insertFirst(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    size++;
  }

  public void insertLast(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  public void insertAt(int index, int value) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    Node newNode = new Node(value);
    if (index == 0) {
      insertFirst(value);
    } else if (index == size) {
      insertLast(value);
    } else {
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
      size++;
    }
  }

  //  public void InsertUsingRecursion(int index, int value) {
  //    if (index < 0 || index > size) {
  //      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
  //    }
  //    if (index == 0) {
  //      insertFirst(value);
  //    } else if (index == size) {
  //      insertLast(value);
  //    } else {
  //      Node newNode = new Node(value);
  //      InsertUsingRecursion(head, index, newNode, 0);
  //    }
  //  }

  public void deleteFirst() {
    if (head == null) {
      throw new IndexOutOfBoundsException("Index: 0, Size: 0");
    }
    head = head.next;
    size--;
  }

  public void deleteLast() {
    if (head == null) {
      throw new IndexOutOfBoundsException("Index: 0, Size: 0");
    }
    if (size == 1) {
      head = null;
      tail = null;
    } else {
      Node temp = head;
      while (temp.next != tail) {
        temp = temp.next;
      }
      temp.next = null;
      tail = temp;
    }
    size--;
  }

  public void deleteAt(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    if (index == 0) {
      deleteFirst();
    } else if (index == size - 1) {
      deleteLast();
    } else {
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
      size--;
    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("End");
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

    public Node get(int index) {
      if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
      }
      Node temp = head;
      for (int i = 0; i < index; i++) {
        temp = temp.next;
      }
      return temp;
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
  }
}
