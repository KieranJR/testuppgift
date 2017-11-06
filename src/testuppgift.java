/**
 * Created by Kieran Johansson Rye on 2017-11-06.
 */
import java.util.Scanner;

public class testuppgift {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        int a = 1 + (int) (Math.random() * 99);
        int guess = 0;

        System.out.println("What number am I thinking of?"
                + " It's between 1 and 100");
        while (guess != a) {
        guess = keyboard.nextInt();
        count++;
        if (guess > a) {
            System.out.println("Guess a lower number!");
        } else if (guess < a) {
            System.out.println("Guess a higher number!");
        }
    }
    System.out.println("Well done! You guessed the correct number! You guessed a total of " + count + " times!");
}
}
