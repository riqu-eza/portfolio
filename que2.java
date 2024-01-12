import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (true) {
            System.out.println("Enter a number or type 's' to stop and 'c' to continue: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("s")) {
                break;
            } else if (input.equalsIgnoreCase("c")) {
                continue;
            } else {
                try {
                    double number = Double.parseDouble(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please try again");
                }
            }
        }
        System.out.println("The sum of all the numbers is: " + sum);
    }
}