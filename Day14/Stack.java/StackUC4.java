class QueueUC4 {
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

    int dequeue() {
        if (head == null) return -1;
        int val = head.data;
        head = head.next;
        if (head == null) tail = null;
        return val;
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
        QueueUC4 q = new QueueUC4();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);

        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}