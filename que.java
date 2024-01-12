import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your new password: ");
        String password = scanner.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("Strong password, well done. Your new password is: " + password);
            System.out.println("Save it somewhere.");

            int countdown = 5;
            System.out.println("The program will exit in...");

            while (countdown > 0) {
                System.out.println(countdown + " seconds");
                try {
                    Thread.sleep(1000);=
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countdown--;
            }

            System.out.println("Goodbye!");
        } else {
            System.out.println("Weak password, try again.");
        }
    }

    private static boolean isStrongPassword(String password) {
        return hasUppercase(password) && hasLowercase(password) && hasSpecialSymbol(password) && hasNumber(password);
    }

    private static boolean hasUppercase(String password) {
        return !password.equals(password.toLowerCase());
    }

    private static boolean hasLowercase(String password) {
        return !password.equals(password.toUpperCase());
    }

    private static boolean hasSpecialSymbol(String password) {
        return password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>/?].*");
    }

    private static boolean hasNumber(String password) {
        return password.matches(".*\\d.*");
    }
}
