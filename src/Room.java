/**
 * One room of the dungeon.
 *
 * SKELETON: the signatures below are the frozen contract from
 * PROGRAM DESIGN.md section 7. Do not rename them.
 */
public class Room {

    private String name;
    private String description;
    private int[] exits;      // room numbers the player can move to
    private Monster monster;  // null if the room has no monster
    private String loot;      // null if the room has no loot
    private boolean cleared;

    public Room(String name, String description, int[] exits, Monster monster, String loot) {
        this.name = name;
        this.description = description;
        this.exits = exits;
        this.monster = monster;
        this.loot = loot;
        this.cleared = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    /** Room numbers the player can move to. */
    public int[] getExits() {
        return exits;
    }

    /** The room's monster, or null if it has none. */
    public Monster getMonster() {
        return monster;
    }

    /** The room's loot item name, or null if it has none. */
    public String getLoot() {
        return loot;
    }

    public boolean isCleared() {
        return cleared;
    }

    public void setCleared() {
        this.cleared = true;
    }
}
