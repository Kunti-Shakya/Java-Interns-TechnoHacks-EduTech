import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random ra= new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Let's play Rock, Paper, Scissors!");

        while (true) {
            int computerChoice = ra.nextInt(3);
            System.out.println("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors, or 3 to quit): ");
            int userChoice = s.nextInt();

            if (userChoice < 0 || userChoice > 3) {
                System.out.println("Invalid choice. Please choose 0, 1, 2, or 3.");
                continue;
            }

            if (userChoice == 3) {
                System.out.println("Thanks for playing! Goodbye.");
                break;

            }

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            int result = (userChoice - computerChoice + 3) % 3;

            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        }

        s.close();
    }
}

