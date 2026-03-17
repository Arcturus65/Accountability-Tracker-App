import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("What are we doing today?");
            System.out.println("1. Start new project.");
            System.out.println("2. Resume project.");
            System.out.println("3. End project.");
            System.out.println("4. Quit");
            int   userInput = input.nextInt(); input.nextLine();
            break;
        }
    }
}
