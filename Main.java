import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner get = new Scanner(System.in)) {

            System.out.println("1. Calculates four number inputs.");
            System.out.println("2. See if the number is odd or even.");
            System.out.println("3. Determines the highest and lowest number.");
            System.out.println("4. Fare price per age bracket.");

            int choice = get.nextInt();

            switch (choice) {
                case 1:
                    FirstProblem.MachineProblemOne();
                    break;
                case 2:
                    SecondProblem.MachineProblemTwo();
                    break;
                case 3:
                    ThirdProblem.MachineProblemThree();
                    break;
                case 4:
                    ForthProblem.MachineProblemFour();
                    break;

            }
        }
    }
}