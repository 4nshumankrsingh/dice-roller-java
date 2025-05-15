import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the # of dice: ");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0) {
            for(int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDice(roll);
                System.out.printf("You got: %d\n", roll);
                total += roll;
            }
            System.out.printf("Total = %s", total);

        }
        else {
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();
    }
    static void printDice(int roll) {
        String dice1 = """
        +-------+
        |       |
        |   o   |
        |       |
        +-------+
        """;
        String dice2 = """
        +-------+
        | o     |
        |       |
        |     o |
        +-------+
        """;
        String dice3 = """
        +-------+
        | o     |
        |   o   |
        |     o |
        +-------+
        """;
        String dice4 = """
        +-------+
        | o   o |
        |       |
        | o   o |
        +-------+
        """;
        String dice5 = """
        +-------+
        | o   o |
        |   o   |
        | o   o |
        +-------+
        """;
        String dice6 = """
        +-------+
        | o   o |
        | o   o |
        | o   o |
        +-------+
        """;
        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}