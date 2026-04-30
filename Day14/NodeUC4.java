class UC4 {
    public static void main(String[] args) {
        Node head = new Node(56);
        Node node70 = new Node(70);

        head.next = node70;

        Node node30 = new Node(30);
        node30.next = node70;
        head.next = node30;

        NodeUC1.print(head);
    }
}