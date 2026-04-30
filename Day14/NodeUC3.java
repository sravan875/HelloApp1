class UC3 {
    static Node head;

    static void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    public static void main(String[] args) {
        append(56);
        append(30);
        append(70);

        NodeUC1.print(head);
    }
}