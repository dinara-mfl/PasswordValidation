import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String specials = "!@#$%&*?";

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        ValidationResult result = PasswordValidator.validate(password, specials);

        if (result.isValid()) {
            System.out.println("Password is valid");
        } else {
            result.getErrors().forEach(System.out::println);
        }
    }
}