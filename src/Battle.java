import java.util.Scanner;

/**
 * The turn-based battle loop.
 *
 * SKELETON: the signature below is the frozen contract from
 * PROGRAM DESIGN.md section 7. Do not rename it.
 */
public class Battle {

    // Result codes returned by fight().
    public static final int WON = 0;
    public static final int FLED = 1;
    public static final int LOST = 2;

    /**
     * Run one battle to its end.
     * Returns WON (0), FLED (1), or LOST (2).
     * canRun is false only in the boss room.
     */
    public static int fight(Player p, Monster m, boolean canRun, Scanner sc) {
        // TODO: loop while both are alive: show HP, offer Attack / Use Item / Run,
        // apply damage (player damage is attack plus a random 0 to 2),
        // and return the matching result code.
        throw new UnsupportedOperationException("TODO: Battle.fight");
    }
