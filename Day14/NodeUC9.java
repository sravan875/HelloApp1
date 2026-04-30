class UC9 {

    static Node delete(Node head, int key) {
        if (head.data == key)
            return head.next;

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    static int size(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(70);

        head = delete(head, 40);

        System.out.println("Size: " + size(head));
        NodeUC1.print(head);
    }
}