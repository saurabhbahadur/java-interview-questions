public class test {

    public static void main(String[] args) {
        Node n1 = new Node(3);
        n1.next = new Node(4);
        n1.next.next = new Node(5);
        n1.next.next.next = new Node(6);

        n1 = linkList.insertAtBegin(n1, 1);
        n1 = linkList.insertAfterKey(n1, 1, 2);
        n1 = linkList.insertBeforeKey(n1, 1, 0);

        n1 = linkList.insertAtPos(n1, 4, 7);

        n1 = linkList.insertAtEnd(n1, 7);

        // n1 = linkList.reverse(n1);
        n1 = linkList.removeAtPos(n1, 4);

        linkList.print(n1);
    }
}
