import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a parameter ('+','-','*','/'");
        String input = scanner.next();

        //Random random = new Random();
        System.out.println("Enter a number");
        int randomNumber = scanner.nextInt();
        System.out.println("Enter another number");
        int randomNumberTwo = scanner.nextInt();
        System.out.println(randomNumber);
        System.out.println(randomNumberTwo);
        switch (input) {
            case "+":
                System.out.println(randomNumber + randomNumberTwo);
                break;
            case "-":
                System.out.println(randomNumber - randomNumberTwo);
                break;
            case "*":
                System.out.println(randomNumber * randomNumberTwo);
                break;
            case "/":
                System.out.println(randomNumber / randomNumberTwo);
                break;
            default:
                System.out.println("Error. Invalid Operator.");
                break;
        }
    }
}