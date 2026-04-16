package DAY4;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {

        int position = 0;
        int count = 0;

        Random random = new Random();

        while (position < 100) {

            int dice = random.nextInt(6) + 1;
            int option = random.nextInt(3); // 0,1,2

            count++;

            if (option == 0) {
                // No Play
                System.out.println("No Play: Dice = " + dice);
            } 
            else if (option == 1) {
                // Ladder
                position += dice;
                System.out.println("Ladder: +" + dice);
            } 
            else {
                // Snake
                position -= dice;
                System.out.println("Snake: -" + dice);
            }

            // Boundary conditions
            if (position < 0) {
                position = 0;
            }

            if (position > 100) {
                position -= dice; // cancel move
            }

            System.out.println("Current Position: " + position);
        }

        System.out.println("Reached 100 in " + count + " moves!");
    }
}