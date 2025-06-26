import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 names of students: ");
        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            stringList.add(input);
        }
        System.out.println("You entered: " + stringList);

        System.out.print("Enter a word: ");
        String wordString = scanner.nextLine();
        System.out.println("You length of the word is: " + wordString.length());
        System.out.println("Uppercase: " + wordString.toUpperCase());

        System.out.print("Enter two integers to divide: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            int result = a / b;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scanner.close();
    }
}