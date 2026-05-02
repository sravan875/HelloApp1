class QueueUC3 {
    Node head, tail;

    void enqueue(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = n;
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
        QueueUC3 q = new QueueUC3();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.display();
    }
}