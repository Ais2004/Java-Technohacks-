import java.util.Random;
import java.util.Scanner;

public class Password{
    // Character sets
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for password length and complexity
        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();
        System.out.println("Select complexity level:");
        System.out.println("1. Lowercase only");
        System.out.println("2. Lowercase and Uppercase");
        System.out.println("3. Lowercase, Uppercase, and Digits");
        System.out.println("4. Lowercase, Uppercase, Digits, and Special Characters");
        int complexity = scanner.nextInt();

        // Generate and print the password
        String password = generatePassword(length, complexity);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    private static String generatePassword(int length, int complexity) {
        String characterSet = "";

        // Build the character set based on complexity level
        switch (complexity) {
            case 1:
                characterSet = LOWERCASE;
                break;
            case 2:
                characterSet = LOWERCASE + UPPERCASE;
                break;
            case 3:
                characterSet = LOWERCASE + UPPERCASE + DIGITS;
                break;
            case 4:
                characterSet = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
                break;
            default:
                throw new IllegalArgumentException("Invalid complexity level");
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate the password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }

        return password.toString();
    }
}
