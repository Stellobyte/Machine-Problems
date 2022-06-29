import java.util.Scanner;

public class SecondProblem {
    public static void MachineProblemTwo() {
        try (Scanner get = new Scanner(System.in)) {
            int num = 0;
            System.out.print("Enter a number: ");
            num = get.nextInt();

            if (num > 10) {
                System.out.println("You entered a number bigger than 10!");
                return;
            } else if (num <= 10 && num >= 0) {
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is even number.");
                } else {
                    System.out.println("The number " + num + " is odd number.");
                }
            } else {
                System.out.println("Please try again.");
            }

        }

    }
}
