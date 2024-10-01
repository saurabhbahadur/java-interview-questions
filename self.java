
// ------------------------- Array Operation ----------------
class array {

    // Revese in array
    public static void reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

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

    }
}
