import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[52];
        int k = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + " of " + suit;
            }
        }

        Collections.shuffle(Arrays.asList(deck));

        String[][] players = new String[4][9];

        k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck[k++];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1));
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}