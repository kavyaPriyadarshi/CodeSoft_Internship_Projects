import java.util.Random;
import java.util.Scanner;

public class NumberGuess_Game {
    private static int attempt = 5;

    public static void main(String[] args) {
        boolean choice = true;
        int x = 0;
        boolean guess = false;
        int num = 0;
        int user_num = 0;
        int finals = 0;
        Random rand = new Random();

        while (choice) {

            num = rand.nextInt(101);
            System.out.println("You have 5 attempts to win this Game");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < attempt; i++) {

                System.out.print("Please enter the number = ");
                user_num = sc.nextInt();
                if (user_num == num) {
                    finals += 1;
                    guess = true;
                    break;
                } else if (user_num > num) {
                    System.out.println("Your guess is too high");
                } else if (user_num < num) {
                    System.out.println("Your guess is too low");
                }
                System.out.println("You have " + (5 - (i + 1)) + " attempts left");
            }

            if (guess == false) {
                System.out.println("OOps ! Maximum attemt reached and your guess was incorrect the number is" + num);
            } else {
                System.out.println("your guess was correct Yohoo! Won the game");
                System.out.println("Your Score is:: " + finals);
            }

            System.out.println("Try again! Press 1 OR To Stop Press 0...");
            x = sc.nextInt();
            if (x == 1) {
                choice = true;
            } else {
                choice = false;
            }

        }

    }
}
