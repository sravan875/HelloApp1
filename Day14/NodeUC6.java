class UC6 {
    static Node head;

    static void popLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    public static void main(String[] args) {
        head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(70);

        popLast();
        NodeUC1.print(head);
    }
}