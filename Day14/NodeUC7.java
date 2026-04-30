class UC7 {
    static boolean search(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(70);

        System.out.println(search(head, 30));
    }
}