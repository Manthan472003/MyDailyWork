import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Task4 {

    public static final int TIMER_DURATION = 15; // Timer duration in seconds
    public static int score = 0;
    public static Timer timer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // List of questions and answers
        String[][] questions = {
            {"Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", "b"},
            {"What is the capital city of France?", "Berlin", "Madrid", "Paris", "Rome", "c"},
            {"Which ocean is the largest in the world?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "d"},
            {"Who invented the telephone?", "Thomas Edison", "Nikola Tesla", "Alexander Graham Bell", "Guglielmo Marconi", "c"},
            {"Which is the smallest country in the world by land area?", "Monaco", "Vatican City", "San Marino", "Liechtenstein", "b"},
            {"What is the chemical symbol for water?", "O2", "CO2", "H2O", "HO", "c"},
            {"In which year did the Titanic sink?", "1910", "1912", "1914", "1916", "b"},
            {"Which continent is known as the 'Dark Continent'?", "Asia", "Africa", "Australia", "Europe", "b"},
            {"Which is the longest river in the world?", "Amazon River", "Yangtze River", "Mississippi River", "Nile River", "d"},
            {"Which is the largest mammal in the world?", "Elephant", "Blue Whale", "Giraffe", "Polar Bear", "b"},
            {"Which planet is closest to the Sun?", "Venus", "Earth", "Mars", "Mercury", "d"},
            {"Who wrote the play 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen", "b"},
            {"Which country is known as the Land of the Rising Sun?", "China", "Japan", "South Korea", "Thailand", "b"},
            {"Which is the hardest natural substance on Earth?", "Gold", "Iron", "Diamond", "Silver", "c"},
            {"Which animal is known as the King of the Jungle?", "Tiger", "Elephant", "Lion", "Bear", "c"}
        };
        
        for (String[] question : questions) {
            askQuestion(sc, question);
        }

        System.out.println("Your final score is: " + score);
    }

    public static void askQuestion(Scanner sc, String[] question) {
        resetTimer();

        System.out.println(question[0]);
        System.out.println("a) " + question[1]);
        System.out.println("b) " + question[2]);
        System.out.println("c) " + question[3]);
        System.out.println("d) " + question[4]);
        System.out.print("Your answer: ");

        String answer = sc.nextLine().trim().toLowerCase();
        if (timer != null) {
            timer.cancel();
        }

        if (answer.equals(question[5])) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer was " + question[5]);
        }
    }

    public static void resetTimer() {
        if (timer != null) {
            timer.cancel();
        }
        
        timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up!");
                System.exit(0); // Exit the program when time is up
            }
        };
        
        // Schedule the timer task to run after TIMER_DURATION seconds
        timer.schedule(timerTask, TIMER_DURATION * 1000);
    }
}
