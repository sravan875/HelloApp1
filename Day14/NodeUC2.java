class UC2 {
    static Node head;

    static void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        add(70);
        add(30);
        add(56);

        NodeUC1.print(head);
    }
}