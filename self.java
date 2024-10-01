import java.util.Scanner;

// ------------------------- Array Operation ----------------
class array {

    // <------- Print array ------->

    static void print(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    // <---------- Print 2D array ---------->

    static void print2d(int a[][]) {
        int rowLen = a.length;
        int colLen = a[0].length;

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }

    // <---------- Array sum ---------->

    static int sum(int a[]) {
        int n = a.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    // <---------- Reverse Array ---------->

    static void reverse(int a[]) {
        int n = a.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}

// <----------- Sorting Algorithm ------------------------>
class sorting {
    // <---------- Selection Sort -------------------------->
    static int[] selection(int a[]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int mni = i;
            for (int j = i; j < n; j++) {
                if (a[mni] > a[j]) {
                    mni = j;
                }
            }

            int t = a[i];
            a[i] = a[mni];
            a[mni] = t;
        }

        return a;
    }
}

// ------------------------- String Operation ----------------
class string {
    // Reverse in string
    public static void reverse(String str) {
        int lastLetterOfString = str.length() - 1;
        for (int i = lastLetterOfString; i >= 0; i--) {
            String rev = "";
            rev = rev + str.charAt(i);
            System.out.print(rev);
        }
    }
}

// --------------------- Node Creation in LinkList---------------------------
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// ------------------------- LinkList Operation ----------------
class linkList {
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

class basic {
    // sum of digits
    public static void sumOfDigits(int n) {
        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }
            System.out.println("sum of " + i + " = " + sum);
        }
    }

    // Pattern
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Decimal to binary : 7 = 111
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();

        if (n == 0) {
            binary.append(0);
        }

        while (n > 0) {
            int remainder = n % 2;
            binary.insert(0, remainder);
            n /= 2;
        }

        return binary.toString();
    }

    // binary to decimal : 111 = 7
    public static int binaryToDecimal(String str) {
        int decimal = 0;
        int power = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}

public class self {

    // ------------------------ Main Method ------------------------
    public static void main(String[] args) {

        // <------------------ Array ------------------------->

        // int a[] = { 1, 5, 3, 2, 4, 6 };
        // int b[][] = { { 1, 2, 3 },
        //         { 4, 5, 6 },
        //         { 7, 8, 9 } };
        // int n = a.length;

        // array.print(a);

        // array.reverse(a);
        // array.print2d(b);

        // sorting.selection(a);

        // array.print(a);

        // <------------- Linklist ----------------->

        // Node n1 = new Node(3);
        // n1.next = new Node(4);
        // n1.next.next = new Node(5);
        // n1.next.next.next = new Node(6);

        // n1 = linkList.insertAtBegin(n1, 1);
        // n1 = linkList.insertAfterKey(n1, 1, 2);
        // n1 = linkList.insertBeforeKey(n1, 1, 0);

        // n1 = linkList.insertAtPos(n1, 4, 7);

        // n1 = linkList.insertAtEnd(n1, 7);

        // // n1 = linkList.reverse(n1);
        // n1 = linkList.removeAtPos(n1, 4);

        // int n = linkList.length(n1);
        // System.out.println(n);

        // linkList.print(n1);

    }
}
