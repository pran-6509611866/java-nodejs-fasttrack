import java.util.Scanner;

class HelloWorld {
    void greet() {
        System.out.println("Hello, World!");
    }
}

class Main {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.greet();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        System.out.println("Your score is: " + score);

        System.out.print("Enter a number to check if it's even or odd: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }


        int summation = 0;
        for (int i = 1; i <= 100; i++){
            summation += i;
        }
        System.out.println("Summation is between 1 and 100: " + summation);

        int guess = (int)(Math.random() * 10) + 1;
        System.out.print("Enter your guess (1-10): ");
        int input = scanner.nextInt();
        
        while (input != guess) {
            if (input < guess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            input = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed the number: " + guess);
        scanner.close();
    }
}