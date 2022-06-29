import java.util.Scanner;

public class ForthProblem {
    public static void MachineProblemFour() {
        System.out.print("Enter the age \n");
        try (Scanner keyboard = new Scanner(System.in)) {
            int age = keyboard.nextInt();
            int fare;

            if (age < 11) {
                fare = 3;
                System.out.println("The fare is $" + fare);
            } else if (age > 11 && age < 65) {
                fare = 5;
                System.out.println("The fare is $" + fare);
            } else {
                fare = 3;
                System.out.println("The fare is $" + fare);
            }
        }
    }
}
