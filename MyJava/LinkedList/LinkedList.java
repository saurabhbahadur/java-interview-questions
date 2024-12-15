package MyJava.LinkedList;

public class LinkedList {
    // ------------ Printing LinkList ----------------------
    static void print(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // ------------ Length of Linklist

    static int length(Node head) {
        int count = 0;

        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    // ------------ Insertion at begining ----------------------

    static Node insertAtBegin(Node head, int val) {
        Node temp = new Node(val);
        if (head == null) {
            return temp;
        }

        temp.next = head;
        head = temp;
        return head;
    }

    // ------------ Insertion after key ----------------------

    static Node insertAfterKey(Node head, int key, int val) {
        Node curr = head;
        if (curr == null) {
            System.out.println("No key found");
            return head;
        }

        while (curr != null) {
            if (curr.data == key) {
                break;
            }
            curr = curr.next;
        }

        Node newNode = new Node(val);

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    // ------------ Insertion before key ----------------------

    static Node insertBeforeKey(Node head, int key, int val) {
        Node curr = head;
        Node prev = null;
        Node newNode = new Node(val);

        if (curr == null) {
            System.out.println("Key not found!");
            return head;
        }

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.data == key) {
            newNode.next = curr;
            return newNode;
        }

        prev.next = newNode;

        return head;
    }

    // -------------- Insertion at position ---------------
    static Node insertAtPos(Node head, int pos, int val) {

        Node newNode = new Node(val);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node curr = head;
            for (int i = 0; i < pos - 1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }

        return head;
    }

    // ---------- Insert At End -------------------------
    static Node insertAtEnd(Node head, int val) {

        Node curr = head;
        Node newNode = new Node(val);
        if (curr == null) {
            return newNode;
        }

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;

        return head;
    }

    // -------------- Reverse List --------------
    static Node reverse(Node head) {

        Node curr = head;
        Node prev = null;
        Node nextNode;

        if (curr == null) {
            return null;
        }

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;

        }

        head = prev;

        return head;
    }

    // ------------------ Delete at Position ------------

    static Node removeAtPos(Node head, int pos) {

        if (pos == 0) {
            return head.next;
        }

        Node curr = head;

        for (int i = 0; curr != null && i < pos - 1; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null) {
            return head;
        }

        Node nextNode = curr.next.next;
        curr.next = nextNode;

        return head;
    }

    static Node midpointOfLinkedList(Node head) {
        // <------- Brute Approach -------->
        // int n = length(head);
        // int middle = n/2 +1;

        // while (middle>1){
        // head = head.next;
        // middle--;
        // }

        // return head;
        // }

        // <----- optimized approach (Tortoise and Hare) -------->
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;

    }
}
