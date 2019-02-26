import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many Numbers");
        int count = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int x = 0; x < count; x++) {
            System.out.println("Enter a number");
            numbers.add(scanner.nextInt());
        }

        System.out.println(numbers);

        System.out.println("Enter a parameter ('+','-','*','/'");
        String input = scanner.next();

        switch (input) {
            case "+":
                Calculate add = new Add();
                System.out.println(add.calculate(numbers));
                break;
            case "-":
                Calculate minus = new Minus();
                System.out.println(minus.calculate(numbers));
                break;
            case "*":
                Calculate multiply = new Multiply();
                System.out.println(multiply.calculate(numbers));
                break;
            case "/":
                Calculate divide = new Divide();
                System.out.println(divide.calculate(numbers));
                break;
            default:
                System.out.println("Error. Invalid Operator.");
                break;
        }
    }
}