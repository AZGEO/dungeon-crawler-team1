import java.util.Scanner;

/**
 * PART 2 - World.java (kasama ng Room.java)
 * Owner: [isulat ang pangalan mo dito]
 *
 * Trabaho ng class na ito: buuin ang 6 na kuwarto (ang mapa), bilangin kung
 * ilang kuwarto na ang cleared, at ipakita ang exit menu para makapili ang
 * player ng susunod na kuwarto. Dito rin ang lock ng boss room.
 *
 * Ang mga "STARTER" ay halimbawa. Ang mga "TODO" ay ikaw ang magsusulat.
 * Huwag baguhin ang pangalan at parameters ng method (kontrata, section 7).
 * Burahin ang guide comments at palitan ng sarili mong maikling comment
 * bago mag-commit.
 *
 * Ang mapa ay nasa PROGRAM_DESIGN.md section 3. Ang type number ng monster
 * ay nasa section 4: Goblin 0, Skeleton 1, Bat 2, Ghoul 3, Dungeon Lord 4.
 */
public class World {

    // Shared constants. Gamitin ang mga ito, huwag mag-type ng 5 o 3 sa ibang code.
    public static final int BOSS_ROOM = 5;
    public static final int ROOMS_TO_UNLOCK = 3;

    // Gagawa ng 6 na kuwarto. Ang index ng array ay ang numero ng kuwarto.
    public static Room[] createRooms() {
        Room[] rooms = new Room[6];

        // STARTER: kuwarto 0 at 1. Walang monster ang 0, kaya null.
        rooms[0] = new Room("Entrance Hall",
                "A cold stone hall with two doorways.",
                new int[]{1, 2}, null, null);
        rooms[1] = new Room("Armory",
                "Rusty weapons hang on the walls.",
                new int[]{0, 3}, new Monster(0), Player.POTION);

        // TODO: gawin ang rooms[2] hanggang rooms[5] gamit ang mapa sa
        // PROGRAM_DESIGN.md section 3. Isulat ang sarili mong description.
        // Para sa Boss Chamber, ang monster ay new Monster(4) at walang loot.

        return rooms;
    }

    // TODO: bilangin ang mga kuwartong cleared na.
    // Hint: int count = 0, for loop sa rooms, kung rooms[i].isCleared()
    // dagdagan ang count. Ibalik ang count.
    public static int countCleared(Room[] rooms) {
        throw new UnsupportedOperationException("TODO: World.countCleared");
    }

    // TODO: ipakita ang exits ng kasalukuyang kuwarto at ibalik ang napili.
    // Mga hakbang:
    //  1. int[] exits = rooms[current].getExits();
    //  2. for loop: i-print ang "1. Armory", "2. Cellar" ... gamit ang
    //     rooms[exits[i]].getName(). Menu ay nagsisimula sa 1, array sa 0.
    //  3. int choice = InputHelper.readInt(sc, 1, exits.length);
    //  4. int chosen = exits[choice - 1];
    //  5. Kung chosen == BOSS_ROOM at clearedCount < ROOMS_TO_UNLOCK:
    //     mag-print na naka-lock pa ito, at return current.
    //  6. Kung hindi, return chosen.
    public static int chooseExit(Room[] rooms, int current, int clearedCount,
                                 Scanner sc) {
        throw new UnsupportedOperationException("TODO: World.chooseExit");
    }
}
