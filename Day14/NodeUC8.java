class UC8 {
    public static void main(String[] args) {
        Node head = new Node(56);
        Node node30 = new Node(30);
        Node node70 = new Node(70);

        head.next = node30;
        node30.next = node70;

        Node node40 = new Node(40);
        node40.next = node30.next;
        node30.next = node40;

        NodeUC1.print(head);
    }
}