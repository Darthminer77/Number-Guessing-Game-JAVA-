import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the number guessing game!");

        // RANDOM INT
        int secret = random.nextInt(100) + 1;

        // DIFFICULTY  

        int difficulty = 0;

        while (difficulty != 1 && difficulty != 2 && difficulty != 3) {

            showDifficultyMenu();
            
            difficulty = scanner.nextInt();

        }

        int chances;

        if (difficulty == 1) {
            System.out.println("You chose Easy ; 10 chances!");
            chances = 10;
        } else if (difficulty == 2) {
            System.out.println("You chose Medium ; 5 chances!");
            chances = 5;
        } else {
            System.out.println("You chose Hard ; 3 chances!");
            chances = 3;
        }

System.out.println(chances);
        System.out.println(secret);
        System.out.println(difficulty);
    }

    public static void showDifficultyMenu() {
        System.out.println("What difficulty do you want?");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
}   
}

