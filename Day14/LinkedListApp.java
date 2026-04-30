class MyNode<T extends Comparable<T>> {
    T data;
    MyNode<T> next;

    MyNode(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T extends Comparable<T>> {
    private MyNode<T> head;
    private MyNode<T> tail;

    public void add(T data) {
        MyNode<T> newNode = new MyNode<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(T data) {
        MyNode<T> newNode = new MyNode<>(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public boolean insertAfter(T key, T data) {
        MyNode<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                MyNode<T> newNode = new MyNode<>(data);
                newNode.next = temp.next;
                temp.next = newNode;

                if (temp == tail) tail = newNode;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void pop() {
        if (head == null) return;

        head = head.next;
        if (head == null) tail = null;
    }

    public void popLast() {
        if (head == null) return;

        if (head.next == null) {
            head = tail = null;
            return;
        }

        MyNode<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    public boolean search(T key) {
        MyNode<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean delete(T key) {
        if (head == null) return false;

        if (head.data.equals(key)) {
            pop();
            return true;
        }

        MyNode<T> temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(key)) {
                temp.next = temp.next.next;

                if (temp.next == null) tail = temp;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        int count = 0;
        MyNode<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void sortedAdd(T data) {
        MyNode<T> newNode = new MyNode<>(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        if (head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        MyNode<T> temp = head;
        while (temp.next != null && temp.next.data.compareTo(data) < 0) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) tail = newNode;
    }

    public void display() {
        MyNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListApp {
    public static void main(String[] args) {

        System.out.println("RUNNING LINKED LIST PROGRAM");

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(70);
        list1.add(30);
        list1.add(56);
        list1.display();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(56);
        list2.append(30);
        list2.append(70);
        list2.display();

        list2.insertAfter(56, 40);
        list2.display();

        list2.pop();
        list2.display();

        list2.popLast();
        list2.display();

        System.out.println("Search 30: " + list2.search(30));

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.append(56);
        list3.append(30);
        list3.append(70);
        list3.insertAfter(30, 40);
        list3.display();

        list3.delete(40);
        System.out.println("Size: " + list3.size());
        list3.display();

        LinkedList<Integer> sortedList = new LinkedList<>();
        sortedList.sortedAdd(56);
        sortedList.sortedAdd(30);
        sortedList.sortedAdd(40);
        sortedList.sortedAdd(70);
        sortedList.display();
    }
}