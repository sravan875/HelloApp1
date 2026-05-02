class StackUC2 {
    Node head;

    void push(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    int pop() {
        if (head == null) return -1;
        int val = head.data;
        head = head.next;
        return val;
    }

    int peek() {
        return (head != null) ? head.data : -1;
    }

    boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        StackUC2 s = new StackUC2();
        s.push(70);
        s.push(30);
        s.push(56);

        System.out.println("Peek: " + s.peek());

        while (!s.isEmpty()) {
            System.out.println("Pop: " + s.pop());
        }
    }
}