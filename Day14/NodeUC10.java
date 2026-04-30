class UC10 {

    static Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null || head.data > data) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data < data) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = sortedInsert(head, 56);
        head = sortedInsert(head, 30);
        head = sortedInsert(head, 40);
        head = sortedInsert(head, 70);

        NodeUC1.print(head);
    }
}