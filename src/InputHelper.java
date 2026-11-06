import java.util.Scanner;

/**
Every method reads whole line with nextLine(),
 * no leftover newline left behind 
 */
public class InputHelper {

    /*
      Read  whole line and keep asking until its a number min to max.
      if Blank, non-numeric, out-of-range lines, print to ask again.
     */
    public static int readInt(Scanner sc, int min, int max) {
        while (true) {
            if (!sc.hasNextLine()) {
                System.out.println("Input ended while waiting for text.");
                System.exit(0);
            }

            String line = sc.nextLine().trim();

            if (line.isEmpty()) {
                System.out.println("Please type a number.");
                continue;
            }

            int value;
            try {
                value = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("\"" + line + "\" is not a whole number. Try again.");
                continue;
            }

            if (value < min || value > max) {
                System.out.println("Please choose a number from " + min + " to " + max + ".");
                continue;
            }

            return value;
        }
    }

    // Read line and keep asking until it is not blank (Used para sa player name)
    public static String readText(Scanner sc) {
        while (true) {
            if (!sc.hasNextLine()) {
                System.out.println("Input ended while waiting for text.");
                System.exit(0);
            }

            String line = sc.nextLine().trim();

            if (!line.isEmpty()) {
                return line;
            }

            System.out.println("Please type something.");
        }
    }
}
