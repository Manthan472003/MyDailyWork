import java.util.*;
// TASK 1

// NUMBER GAME
// Generate a random number within a specified range, such as 1 to 100.
// Prompt the user to enter their guess for the generated number.
// Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low.
// Repeat steps 2 and 3 until the user guesses the correct number. You can incorporate additional details as follows:
// => Limit the number of attempts the user has to guess the number.
// => Add the option for multiple rounds, allowing the user to play again.
// => Display the user's score, which can be based on the number of attempts taken or rounds won.


public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        double Random = Math.random();
        int actualNumber = (int)(Random*100 + 1);
        int rounds = 0;
        int score = 70;


        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) { 
            System.out.print("ENTER THE NUMBER BETWEEN 1 AND 100 :- ");
            int number = sc.nextInt();

            if (number == actualNumber) {
                System.out.println("Congratulations! You guessed the number correctly.");

                playAgain = false;                
            }
            else if(number < 0 || number > 100){
                System.out.println("CHECK YOUR INPUT");
                score -= 10;

            }
            else if(number > actualNumber){
                System.out.println("Too high! Try again.");
                score -= 10;

            }
            else if(number < actualNumber){
                System.out.println("Too low! Try again.");
                score -= 10;

            }
            rounds++;
            if(rounds >=7){
                System.out.println("OOPS !!, ROUNDS OVER");
                playAgain = false;
            }

        }
        sc.close();
        System.out.println("ROUNDS = "+rounds );
        System.out.println("SCORE = "+score );


        
    }
}
