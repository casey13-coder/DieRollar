import java.util.Random;
import java.util.Scanner;
public class Main {
    static void main() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        boolean foundTriple;
        int firstRoll;
        int secondRoll;
        int thirdRoll;
        int counter;
        do {
            counter = 0;
            foundTriple = false;
            System.out.printf("%s", "Roll");
            System.out.printf("\t%s", "Die1");
            System.out.printf("\t%s", "Die2");
            System.out.printf("\t%s", "Die3");
            System.out.printf("\t%s\n", "Sum");
            System.out.printf("%s\n", "----------------------------------------------------------");
            do {
                firstRoll = random.nextInt(1, 6);
                secondRoll = random.nextInt(1, 6);
                thirdRoll = random.nextInt(1, 6);
                counter += 1;
                if (firstRoll == secondRoll && secondRoll == thirdRoll) {
                    foundTriple = true;
                }
                System.out.printf("%d", counter);
                System.out.printf("\t\t%d", firstRoll);
                //System.out.printf("\t\t");
                System.out.printf("\t\t%d", secondRoll);
                //System.out.printf("\tt");
                System.out.printf("\t\t%d", thirdRoll);
                System.out.printf("\t\t%d\n", firstRoll+secondRoll+thirdRoll);
            } while (!foundTriple);
            System.out.print("Play again [Y/N] ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("n")) {
                done = true;
            }
            else {
                System.out.println("Continuing");
            }

        } while (!done);
    }
}
