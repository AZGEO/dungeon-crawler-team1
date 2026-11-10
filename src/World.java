import java.util.Scanner;

/**
 * PART 2 - World.java (kauban sa Room.java)
 * Owner: [pasulat ra sa pangalan]
 *
 * Trabaho sa class nani: e form ang 6 ka room sa map (kung asa mahitabo ang dul),
 count kung pilang kuwarto na ang cleared, then ipakita ang exit menu para makapili ang 
 * player sa susunod na room. Diri sad ang lock kung asang boss room.
 *
 * Ang mga "STARTER" kay example. Ang mga "TODO" kay ikaw ang magsusulat (ikaw bahala)
 * Ayaw baguhi ang pangalan & parameters sa method pls
 * idelete ang guide comments and e change into saimong comment (ikaw bahala) 
 bago mag-commit
 *
 * Ang mapa kay nasa PROGRAM_DESIGN.md section 3. Ang type number ng monster
 * kay nasa section 4: Goblin 0, Skeleton 1, Bat 2, Ghoul 3, Dungeon Lord 4.
 */
public class World {

    // Shared constants. Gamiton  ni, ayaw lang pag-type ng 5 o 3 sa lain code.
    public static final int BOSS_ROOM = 5;
    public static final int ROOMS_TO_UNLOCK = 3;

    // Create ng 6 ka rooms. Ang index ng array kay ang number sa room
    public static Room[] createRooms() {
        Room[] rooms = new Room[6];

        // STARTER: kuwarto 0 ug 1. Walay monster ang 0, entrance hall man, dira magsugod ang player kaya null.
        rooms[0] = new Room("Entrance Hall",
                "A cold stone hall with two doorways.",
                new int[]{1, 2}, null, null);
        rooms[1] = new Room("Armory",
                "Rusty weapons hang on the walls.",
                new int[]{0, 3}, new Monster(0), Player.POTION);

        // TODO: create ang rooms[2] hantod rooms[5] gamit ang mapa sa
        // PROGRAM_DESIGN.md section 3. Isulat ang sarili nimong description.
        // Para sa Boss Chamber, ang monster ay new Monster(4) ug wala nana siyay loot.

        return rooms;
    }

    // TODO: count ang mga rooms cleared na.
    // like: int count = 0, for loop sa rooms, kung rooms[i].isCleared()
    // dagdagan ang count. Ibalik ang count.
    public static int countCleared(Room[] rooms) {
        throw new UnsupportedOperationException("TODO: World.countCleared");
    }

    // TODO: ipakita ang exits ng current na kuwarto and ibalik ang napili.
    // Mga steps:
    //  1. int[] exits = rooms[current].getExits();
    //  2. for loop: i-print ang "1. Armory", "2. Cellar" ... gamit ang
    //     rooms[exits[i]].getName(). Menu ay mag start sa 1, array sa 0.
    //  3. int choice = InputHelper.readInt(sc, 1, exits.length);
    //  4. int chosen = exits[choice - 1];
    //  5. Kung chosen == BOSS_ROOM at clearedCount < ROOMS_TO_UNLOCK:
    //     mag-print na naka-lock pa ang room, and then mag return sa current.
    //  6. Kung dili, return chosen.
    public static int chooseExit(Room[] rooms, int current, int clearedCount,
                                 Scanner sc) {
        throw new UnsupportedOperationException("TODO: World.chooseExit");
    }
}
