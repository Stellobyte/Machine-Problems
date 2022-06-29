import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner get = new Scanner(System.in)) {
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