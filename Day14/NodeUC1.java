class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class NodeUC1 {
    public static void main(String[] args) {
        Node head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        head.next = second;
        second.next = third;

        print(head);
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}