import java.io.*;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderCalculator {

    public static void main(String[] args) throws ArithmeticException, NumberFormatException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a parameter ('+','-','*','/'");
        String input = scanner.next();

        System.out.println("Enter a FILENAME: ");
        String filename = scanner.next();

        Charset charset = Charset.forName("US-ASCII");
        List<Integer> numbers = new ArrayList<>();
        try {
            Path path = FileSystems.getDefault().getPath(filename);
            System.out.println(path.toAbsolutePath().toString());
            BufferedReader bufferedReader = Files.newBufferedReader(path, charset);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.valueOf(line));
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("FIle Not Found");
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Damn Input Failed");
        }
        System.out.println(numbers);
        runAr(input, numbers);
    }

    private static void runAr(String input, List<Integer> numbers) throws ArithmeticException {
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
                throw new ArithmeticException("Damn Fix It");
        }
    }
}
