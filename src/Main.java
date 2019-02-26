import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a parameter ('+','-','*','/'");
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        boolean end = false;
        while (!end) {
            System.out.println("Enter a number");
            String x = scanner.next();
            if (!x.equals("done")) {
                numbers.add(Integer.valueOf(x));
            } else {
                end = true;
            }
        }

        System.out.println(numbers);

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

