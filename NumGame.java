import java.util.Scanner;
import java.util.Random;

public class NumGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random ran = new Random();

        int randomnumber = ran.nextInt(100) + 1;
        int userguess;
        int attempt = 0;

        System.out.println("Welcome to number guess game . you have 5 attempt to guess number between 1 to 100. ");

        do {
            System.out.print("Enter your guess: ");
            userguess = input.nextInt();
            attempt++;

            if (userguess==randomnumber){
                System.out.println("Congratulation ! you win " + attempt + "attempt.");
                break;
            }
            else if (userguess < randomnumber){
                System.out.println("Too low . try again ");
            }
            else {
                System.out.println("Too high . Try again ");
            }
            if (attempt == 5) {
                System.out.println("Sorry You,r all attempts end. The number was : " + randomnumber );
                break;
            }
        }
        while (true);

        input.close();
    }
}
