class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

class StackUC1 {
    Node head;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUC1 s = new StackUC1();
        s.push(70);
        s.push(30);
        s.push(56);
        s.display(); // 56->30->70
    }
}