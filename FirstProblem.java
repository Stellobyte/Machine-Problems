import java.util.Scanner;

public class FirstProblem {
    public static void MachineProblemOne() {
        try (Scanner get = new Scanner(System.in)) {
            System.out.print("Input first number: ");
            int firstNumber = get.nextInt();
            System.out.print("Input second number: ");
            int secondNumber = get.nextInt();

            System.out.println("sum = " + (firstNumber + secondNumber));
            System.out.println("subtract = " + (firstNumber - secondNumber));
            System.out.println("product = " + (firstNumber * secondNumber));
            System.out.println("divide = " + (firstNumber / secondNumber));
            System.out.println("mod = " + (firstNumber % secondNumber));
        }
    }
}