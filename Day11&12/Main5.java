class Card {
    String suit, rank;

    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

class Node {
    Card data;
    Node next;

    Node(Card data) {
        this.data = data;
    }
}

class Queue {
    Node front, rear;

    void enqueue(Card c) {
        Node temp = new Node(c);
        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class Player {
    Queue cards = new Queue();

    void addCard(Card c) {
        cards.enqueue(c);
    }

    void showCards() {
        cards.display();
    }
}

public class Main5 {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        Card[] deck = new Card[52];
        int k = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = new Card(suit, rank);
            }
        }

        // simple shuffle
        Random r = new Random();
        for (int i = 0; i < 52; i++) {
            int j = r.nextInt(52);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) players[i] = new Player();

        k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i].addCard(deck[k++]);
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1));
            players[i].showCards();
            System.out.println();
        }
    }
}