<h1 align="center" > LinkedList </h1>
<p align="center" > List of values of a single data type stored in a continous memory location</p>

## A Linked List is a linear data structure where elements (nodes) are stored in non-contiguous memory locations

- Each node contains:
  - Data: Stores the actual data.
  - Next: A reference to the next node in the sequence.

#### Types of Linked Lists

- **Singly Linked List:** Each node points to the next node, and the last node points to `null`.
- **Doubly Linked List:** Each node has two pointers, one pointing to the next node and one pointing to the previous node.
- **Circular Linked List:** The last node points to the first node, forming a circular loop.

#### Basic Operations on Linked Lists

- **Insertion:**

  - At the beginning.
  - At the end.
  - At a given position.

- **Deletion:**

  - Deleting the first node.
  - Deleting the last node.
  - Deleting a node at a specific position.

- **Traversal:**
  - Iterating through the linked list to access or print the elements.

### Advantages of Linked Lists

- **Dynamic Size:** The size of a linked list can grow or shrink dynamically.
- **Efficient Insertions/Deletions:** Easier to insert or delete nodes compared to arrays since there’s no need for shifting elements.

### Disadvantages of Linked Lists

- **Extra Memory:** Requires extra memory for storing the next pointer.
- **Sequential Access:** Nodes need to be accessed sequentially from the start; no direct access like arrays.
- **Cache Performance:** Poor cache locality due to non-contiguous memory allocation.

### Node Structure

```java

class Node {
  int data;
  Node next;

  Node(int val) {
    data = val;
    next = null;
  }
}

public class demo {

  public static void main(String[] args) {
    Node node1 = new Node(5);
    System.out.println(node1.data);
    System.out.println(node1.next);
  }
}


```


### Insert at begining 

```java
    static Node insertBeg(Node head, int val) {

    Node temp = new Node(val);

    if (head == null) {
      return temp;
    }

    temp.next = head;
    head = temp;
    return head; // new_head
  }

  // in main class
    // inserting data randomly
    Node head = new Node(2);
    head.next = new Node(3);
    head.next.next = new Node(4);
    head.next.next.next = new Node(5);

    // inserting data at beg

    head = insertBeg(head, 1);

```

### Print the list

```java
      // method to prit list
  static void printList(Node head) {

    Node curr = head;

    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }

  }

  // in main 

  printList(head);

```

### Insertion after key

```java
      static Node insertAfterKey(Node head, int key, int val) {
    Node curr = head;

    while (curr != null) {
      if (curr.data == key) { // stopping at key node
        break;
      }
      curr = curr.next; // traversing to next node
    }

    if (curr == null) {
      System.out.print("Linked list does not contain key");
      return head;
    }

    Node newNode = new Node(val);

    newNode.next = curr.next;
    curr.next = newNode; // change the sequence of nodes

    return head;

  }


  // in main 
  
    head = insertAfterKey(head, 4, 6);

```

### Insertion before key

```java
    static Node insertBeforeKey(Node head, int key, int val) {

    if (head == null) {
      return null;
    }

    Node curr = head;
    Node prev = null;

    if (head.data == key) {
      Node newNode = new Node(val);
      newNode.next = head;
      return newNode;
    }

    while (curr != null && curr.data != key) {
      prev = curr;
      curr = curr.next;
    }

    if (curr == null) {
      System.out.print("Linked list does not contain key");
      return head;
    }

    Node newNode = new Node(val);
    newNode.next = curr;
    prev.next = newNode;

    return head;

  }

    // in main
      
    head = insertBeforeKey(head, 3, 7);

```
### Insert At position

```java
     static Node insertAtPos(Node head, int pos, int val) {

    Node newNode = new Node(val);

    if (pos == 1) {
      newNode.next = head;
      head = newNode;
      return head;
    }

    Node curr = head;

    for (int i = 1; i < pos && curr != null; ++i) { // curr will traverse till n-1
      curr = curr.next;
    }

    if (curr == null) { // if given pos is out of bound
      return head;
    }

    newNode.next = curr.next;
    curr.next = newNode;

    return head;
  }

    // in main 
        
    head = insertAtPos(head, 4, 8);

```

### Insert at end position

```java
    static Node insertEnd(Node head, int val) {

    Node newNode = new Node(val);

    if (head == null) {
      return newNode;
    }

    Node curr = head;

    while (curr.next != null) {
      curr = curr.next;
    }

    curr.next = newNode;
    return head;

  }

      // in main

              head = insertEnd(head, 10);


```







---

<h3 align="center">Connect with me:</h3>
<p align="center">
<a href="https://twitter.com/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://linkedin.com/in/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://fb.com/singhsaurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="singhsaurabhbahadur" height="30" width="40" /></a>
<a href="https://instagram.com/saurabhbahadur_" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="saurabhbahadur_" height="30" width="40" /></a>
<a href="https://www.youtube.com/c/mighty saur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/youtube.svg" alt="mighty saur" height="30" width="40" /></a>
<a href="https://www.hackerrank.com/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/hackerrank.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://discord.gg/aQR27Bg7de" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/discord.svg" alt="aQR27Bg7de" height="30" width="40" /></a>
</p>

---
