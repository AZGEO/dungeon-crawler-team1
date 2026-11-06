/**
 * A monster built from the parallel stat arrays.
 *
 * SKELETON: the signatures below are the frozen contract from
 * PROGRAM DESIGN.md section 7. Do not rename them.
 */
public class Monster {

    // Parallel arrays indexed by monster type (PROGRAM DESIGN.md section 4).
    // The type number is the index; that is what you pass to Monster(int type).
    private static final String[] NAMES = {"Goblin", "Skeleton", "Bat", "Ghoul", "Dungeon Lord"};
    private static final int[] HP = {12, 15, 10, 20, 35};
    private static final int[] ATTACK = {3, 4, 5, 5, 6};

    private int type;
    private String name;
    private int hp;
    private int maxHp;
    private int attack;

    public Monster(int type) {
        this.type = type;
        this.name = NAMES[type];
        this.maxHp = HP[type];
        this.hp = HP[type];
        this.attack = ATTACK[type];
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    /** Lower HP by amount, never below 0. */
    public void takeDamage(int amount) {
        // TODO: subtract amount and clamp the result at 0.
        throw new UnsupportedOperationException("TODO: Monster.takeDamage");
    }

    public boolean isAlive() {
        return hp > 0;
    }

    /** Heal back to full HP. Used when the player runs away. */
    public void resetHp() {
        // TODO: set hp back to maxHp.
        throw new UnsupportedOperationException("TODO: Monster.resetHp");
    }
}
