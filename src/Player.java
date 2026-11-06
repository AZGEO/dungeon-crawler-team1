/**
 * Player stats and inventory.
 *
 * The signatures are the frozen contract from PROGRAM DESIGN.md section 7.
 * Do not rename them: Main, Battle and World all call these.
 */
public class Player {

    // Starting stats and item values (PROGRAM DESIGN.md section 2).
    // These numbers are placeholders to tune during testing.
    public static final int STARTING_HP = 40;
    public static final int STARTING_ATTACK = 5;
    public static final int INVENTORY_SIZE = 3;
    public static final int POTION_HEAL = 15;
    public static final int WHETSTONE_BONUS = 2;

    // Item names. Use these constants everywhere so the spelling always matches.
    public static final String POTION = "Potion";
    public static final String WHETSTONE = "Whetstone";

    private String name;
    private int hp;
    private int maxHp;
    private int attack;
    private String[] inventory; // null in a slot means empty

    public Player(String name) {
        this.name = name;
        this.maxHp = STARTING_HP;
        this.hp = STARTING_HP;
        this.attack = STARTING_ATTACK;
        this.inventory = new String[INVENTORY_SIZE];
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    /** Current attack value, including the Whetstone bonus. */
    public int getAttack() {
        return attack;
    }

    /** Lower HP by amount, never below 0. */
    public void takeDamage(int amount) {
        hp = hp - amount;
        if (hp < 0) {
            hp = 0;
        }
    }

    /** Raise HP by amount, never above max HP. */
    public void heal(int amount) {
        hp = hp + amount;
        if (hp > maxHp) {
            hp = maxHp;
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }

    /** Add the item to the first empty slot. Returns false if the inventory is full. */
    public boolean addItem(String item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * Use the item in slot 0 to 2, print its effect, and remove it.
     * Returns false if the slot is empty (nothing is used, nothing is lost).
     */
    public boolean useItem(int slot) {
        // A slot that does not exist, or is empty, uses up nothing.
        if (slot < 0 || slot >= inventory.length || inventory[slot] == null) {
            return false;
        }

        String item = inventory[slot];

        if (POTION.equals(item)) {
            int before = hp;
            heal(POTION_HEAL);
            System.out.println("You drink a " + POTION + " and recover " + (hp - before) + " HP.");
        } else if (WHETSTONE.equals(item)) {
            attack = attack + WHETSTONE_BONUS;
            System.out.println("You sharpen your weapon with a " + WHETSTONE + ".");
            System.out.println("Attack is now " + attack + ".");
        } else {
            // Loot added later should not break the menu.
            System.out.println("You use the " + item + ".");
        }

        inventory[slot] = null;
        return true;
    }

    /** Print the 3 slots, showing "empty" for unused ones. */
    public void showInventory() {
        System.out.println("Inventory:");
        for (int i = 0; i < inventory.length; i++) {
            String item = inventory[i];
            if (item == null) {
                item = "empty";
            }
            // Slots are 0 to 2 in code but shown as 1 to 3.
            System.out.println("  " + (i + 1) + ". " + item);
        }
    }

    /** Print the player's name, HP, attack, and inventory. */
    public void showStats() {
        System.out.println("Name:    " + name);
        System.out.println("HP:      " + hp + " / " + maxHp);
        System.out.println("Attack:  " + attack);
        showInventory();
    }
}
