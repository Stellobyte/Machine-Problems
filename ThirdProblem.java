import java.util.Scanner;

public class ThirdProblem {
    public static void MachineProblemThree() {
        try (Scanner get = new Scanner(System.in)) {
            int num1, num2, num3, num4;
            System.out.println("Enter 4 numbers: ");
            num1 = get.nextInt();
            num2 = get.nextInt();
            num3 = get.nextInt();
            num4 = get.nextInt();

            if (num1 > num2 && num1 > num3 && num1 > num4) {
                System.out.print("The highest number is " + num1);
            } else if (num2 > num1 && num2 > num3 && num2 > num4) {
                System.out.print("The highest number is " + num2);
            } else if (num3 > num1 && num3 > num2 && num3 > num4) {
                System.out.print("The highest number is " + num3);
            } else {
                System.out.print("The highest number is " + num4);
            }

            if (num1 < num2 && num1 < num3 && num1 < num4) {
                System.out.print(" and the lowest is " + num1);
            } else if (num2 < num1 && num2 < num3 && num2 < num4) {
                System.out.print(" and the lowest is " + num2);
            } else if (num3 < num1 && num3 < num2 && num3 < num4) {
                System.out.print(" and the lowest is " + num3);
            } else {
                System.out.print(" and the lowest is " + num4);
            }
        }
    }
}
