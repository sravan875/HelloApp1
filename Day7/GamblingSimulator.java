package Day7;

import java.util.Random;

public class GamblingSimulator {

    static final int START_STAKE = 100;
    static final int BET = 1;
    static final int DAYS = 20;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 10;

    public static void main(String[] args) {

        int[] dailyResults = new int[DAYS];

        // UC4: simulate 20 days
        for (int day = 0; day < DAYS; day++) {
            dailyResults[day] = playDay();
        }

        // UC4: total win/loss
        int total = calculateTotal(dailyResults);
        System.out.println("Total after 20 days: " + total);

        // UC5: days won/lost
        printWinLossDays(dailyResults);

        // UC6: luckiest & unluckiest day
        findBestWorstDay(dailyResults);

        // UC7: continue or stop
        decideNextMonth(total);
    }

    // UC1 + UC2 + UC3
    public static int playDay() {
        int stake = START_STAKE;
        Random random = new Random();

        while (stake > LOSS_LIMIT && stake < WIN_LIMIT) {
            if (random.nextBoolean()) {
                stake += BET; // win
            } else {
                stake -= BET; // lose
            }
        }

        return stake - START_STAKE; // profit or loss
    }

    // UC4
    public static int calculateTotal(int[] results) {
        int total = 0;
        for (int value : results) {
            total += value;
        }
        return total;
    }

    // UC5
    public static void printWinLossDays(int[] results) {
        int winDays = 0, lossDays = 0;

        for (int i = 0; i < results.length; i++) {
            if (results[i] > 0) {
                winDays++;
                System.out.println("Day " + (i + 1) + " Won: " + results[i]);
            } else {
                lossDays++;
                System.out.println("Day " + (i + 1) + " Lost: " + results[i]);
            }
        }

        System.out.println("Total Win Days: " + winDays);
        System.out.println("Total Loss Days: " + lossDays);
    }

    // UC6
    public static void findBestWorstDay(int[] results) {
        int maxProfit = results[0];
        int maxLoss = results[0];
        int bestDay = 0, worstDay = 0;

        for (int i = 1; i < results.length; i++) {
            if (results[i] > maxProfit) {
                maxProfit = results[i];
                bestDay = i;
            }
            if (results[i] < maxLoss) {
                maxLoss = results[i];
                worstDay = i;
            }
        }

        System.out.println("Luckiest Day: Day " + (bestDay + 1) + " Profit: " + maxProfit);
        System.out.println("Unluckiest Day: Day " + (worstDay + 1) + " Loss: " + maxLoss);
    }

    // UC7
    public static void decideNextMonth(int total) {
        if (total > 0) {
            System.out.println("You won overall. Continue gambling next month.");
        } else {
            System.out.println("You lost overall. Stop gambling.");
        }
    }
}