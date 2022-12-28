package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner scan = new Scanner(System.in);

    public static void run() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int num = scan.nextInt();
        System.out.println("Your choice: " + num);
        if (num == 1) {
            Game.greetings();
        } else if(num == 2) {
            Game.greetings();
            Game.even();
        } else if (num == 3) {
            Game.greetings();
            Game.calc();
        } else if (num == 4) {
            Game.greetings();
            Game.gsd();
        } else if (num == 5) {
            Game.greetings();
            Game.progression();
        } else if (num == 6) {
            Game.greetings();
            Game.prime();
        }
    }

    public static void congratulations(int winCounter, int correctAnswersForWin) {
        if (winCounter == correctAnswersForWin) {
            System.out.println("Congratulations, " + Game.name + "!");
        }
    }

    public static void isWrongAnswer(int answerOfUser, int correctAnswer) {

        System.out.print("'" + answerOfUser + "'" + " is wrong answer ;(. ");
        System.out.println("Correct answer was " + "'" + correctAnswer + "'" + ".");
        System.out.println("Let's try again, " + Game.name + "!");
    }
}
