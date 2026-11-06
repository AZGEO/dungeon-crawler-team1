import java.util.Scanner;

/**
 * Validated console input. Every method reads a whole line with nextLine(), so
 * no leftover newline is ever left behind - that is the bug described in
 * PROGRAM DESIGN.md section 9 (reading a number and then a name with the same
 * Scanner).
 *
 * The signatures are the frozen contract from PROGRAM DESIGN.md section 7.
 * Do not rename them: Main, World and Battle all call these.
 */
public class InputHelper {

    /**
     * Read a whole line and keep asking until it is a number from min to max.
     * Blank, non-numeric and out-of-range lines print a short message and ask
     * again. The caller prints the menu itself; this only reports mistakes.
     */
    public static int readInt(Scanner sc, int min, int max) {
        while (true) {
            if (!sc.hasNextLine()) {
                throw new IllegalStateException("Input ended while waiting for a number.");
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

    /** Read a line and keep asking until it is not blank. Used for the player name. */
    public static String readText(Scanner sc) {
        while (true) {
            if (!sc.hasNextLine()) {
                throw new IllegalStateException("Input ended while waiting for text.");
            }

            String line = sc.nextLine().trim();

            if (!line.isEmpty()) {
                return line;
            }

            System.out.println("Please type something.");
        }
    }
}
