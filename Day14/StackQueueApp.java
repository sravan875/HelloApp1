import java.util.*;

// Node class
class MyNode<T> {
    T data;
    MyNode<T> next;

    MyNode(T data) {
        this.data = data;
        this.next = null;
    }
}

// Custom LinkedList
class MyLinkedList<T> {
    private MyNode<T> head;

    // Add at beginning (better for stack)
    public void add(T data) {
        MyNode<T> newNode = new MyNode<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Remove from beginning
    public T remove() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        T value = head.data;
        head = head.next;
        return value;
    }

    // Peek top element
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    // Check empty
    public boolean isEmpty() {
        return head == null;
    }

    // Display (for debugging)
    public void display() {
        MyNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Stack using LinkedList
class Stack<T> {
    private MyLinkedList<T> list;

    public Stack() {
        list = new MyLinkedList<>();
    }

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        return list.remove();
    }

    public T peek() {
        return list.peek();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }
}

// Main class
public class StackQueueApp {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements:");
        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("After pop:");
        stack.display();

        System.out.println("Is Empty: " + stack.isEmpty());
    }
}