import java.util.*;

public class Rock {
    
    static int comp = 0;
    static int you = 0;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = "rock";
        String str2 = "paper";
        String str3 = "scissor";
        
        // No need to generate the computer's choice here
        
        while (true) {
            // Generate computer's choice for each game iteration
            String random = generate(str1, str2, str3,1);
            //System.out.println("computer has choosen: "+random);
            System.out.println("Enter your choice (rock, paper, or scissor): ");
            String str = sc.next();
            
            if (str.equals("rock")) {
                if (random.equals("paper")) {
                    System.out.println("You lost!");
                    comp++;
                } else if (random.equals("scissor")) {
                    System.out.println("You WON!");
                    you++;
                } else {
                    System.out.println("It's a tie!");
                }
            } else if (str.equals("paper")) {
                if (random.equals("rock")) {
                    System.out.println("You win!");
                    you++;
                } else if (random.equals("scissor")) {
                    System.out.println("You lost!");
                    comp++;
                } else {
                    System.out.println("It's a tie!");
                }
            } else if (str.equals("scissor")) {
                if (random.equals("rock")) {
                    System.out.println("You lost!");
                    comp++;
                } else if (random.equals("paper")) {
                    System.out.println("You win!");
                    you++;
                } else {
                    System.out.println("It's a tie!");
                }
            } else {
                System.out.println("Invalid input! Please enter rock, paper, or scissor.");
            }
            
            // Print the score after each game
            System.out.println("Your score is " + you);
            
            // Prompt to end the game
            System.out.println("Enter 'false' to end the game 1 to continue");
            
            // Break the loop if input is "false"
            if (sc.next().equals("false")) {
                break;
            }
        }
        sc.close();
    }

    // Moved this method outside of the main method
    public static String generate(String str1, String str2, String str3, int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int choice = random.nextInt(3);
            switch (choice) {
                case 0:
                    sb.append(str1);
                    break;
                case 1:
                    sb.append(str2);
                    break;
                case 2:
                    sb.append(str3);
                    break;
            }
        }
        return sb.toString();
    }
}
