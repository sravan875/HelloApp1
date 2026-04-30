class UC5 {
    static Node head;

    static void pop() {
        if (head != null)
            head = head.next;
    }

    public static void main(String[] args) {
        head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(70);

        pop();
        NodeUC1.print(head);
    }
}