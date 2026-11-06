import java.util.Scanner;

/**
 * The dungeon map: building the rooms, counting cleared rooms, and choosing an exit.
 *
 * SKELETON: the signatures below are the frozen contract from
 * PROGRAM DESIGN.md section 7. Do not rename them.
 */
public class World {

    public static final int BOSS_ROOM = 5;
    public static final int ROOMS_TO_UNLOCK = 3;

    /** Build the 6 rooms from the map table (PROGRAM DESIGN.md section 3). */
    public static Room[] createRooms() {
        // TODO: return a Room[] of the 6 rooms, with exits and contents from the map table.
        throw new UnsupportedOperationException("TODO: World.createRooms");
    }

    /** Number of cleared rooms. Main passes this to chooseExit. */
    public static int countCleared(Room[] rooms) {
        // TODO: loop over the rooms and count the cleared ones.
        throw new UnsupportedOperationException("TODO: World.countCleared");
    }

    /**
     * Show the exits of the current room and return the chosen room number.
     * If the boss room is chosen while still locked, print a message and return current.
     */
    public static int chooseExit(Room[] rooms, int current, int clearedCount, Scanner sc) {
        // TODO: print the numbered exits, read a choice with InputHelper,
        // check the boss lock, and return the chosen room number.
        throw new UnsupportedOperationException("TODO: World.chooseExit");
    }
}
