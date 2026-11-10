/**
 * PART 2 - Room.java (kasama ng World.java)
 * Owner: [isulat ang pangalan mo dito]
 *
 * Trabaho ng class na ito: iimbak ang impormasyon ng isang kuwarto: pangalan,
 * description, mga labasan (exits), monster, loot, at kung cleared na.
 * Walang menu o input dito. Datos lang.
 *
 * Gamitin ang "starter" bilang gabay. Ang mga "TODO" ay ikaw ang magsusulat.
 * Huwag baguhin ang pangalan ng mga method (kontrata ng grupo, section 7).
 * Burahin ang guide comments at palitan ng sarili mong maikling comment
 * bago mag-commit.
 *
 * NOTE: Kailangan nito ang Monster class (Part 3). Habang wala pa siya,
 * magre-red ang "Monster" sa IntelliJ. Normal yan, hintayin ang push.
 */
public class Room {

    private String name;
    private String description;
    private int[] exits;        // mga numero ng kuwartong puwedeng puntahan
    private Monster monster;    // null kung walang monster
    private String loot;        // null kung walang loot
    private boolean cleared;    // false sa simula

    // STARTER: constructor. Ito ang tatawagin ng World.createRooms().
    public Room(String name, String description, int[] exits,
                Monster monster, String loot) {
        this.name = name;
        this.description = description;
        this.exits = exits;
        this.monster = monster;
        this.loot = loot;
        this.cleared = false;
    }

    // STARTER: halimbawa ng getter.
    public String getName() {
        return name;
    }

    // TODO: ibalik ang description.
    public String getDescription() {
        throw new UnsupportedOperationException("TODO: Room.getDescription");
    }

    // TODO: ibalik ang exits array.
    public int[] getExits() {
        throw new UnsupportedOperationException("TODO: Room.getExits");
    }

    // TODO: ibalik ang monster. Null kung walang monster. Okay lang yan.
    public Monster getMonster() {
        throw new UnsupportedOperationException("TODO: Room.getMonster");
    }

    // TODO: ibalik ang loot. Null kung walang loot.
    public String getLoot() {
        throw new UnsupportedOperationException("TODO: Room.getLoot");
    }

    // TODO: ibalik ang cleared (true o false).
    public boolean isCleared() {
        throw new UnsupportedOperationException("TODO: Room.isCleared");
    }

    // TODO: gawing true ang cleared.
    public void setCleared() {
        throw new UnsupportedOperationException("TODO: Room.setCleared");
    }
}
