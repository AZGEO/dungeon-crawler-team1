/**
 * PART 1 - Player.java
 * Owner: [isulat ang pangalan mo dito]
 *
 * Trabaho ng class na ito: iimbak ang stats ng player (HP, attack) at ang
 * inventory niya. Walang input/menu dito. Ang Main at Battle ang tatawag
 * sa mga method mo.
 *
 * PAANO GAMITIN ANG FILE NA ITO:
 * 1. Ang mga method na may "STARTER" ay tapos na. Basahin mo para maintindihan.
 * 2. Ang mga may "TODO" ay ikaw ang magsusulat. Burahin ang throw line
 *    kapag may sarili ka nang code.
 * 3. HUWAG baguhin ang pangalan ng method o ang parameters. Yan ang kontrata
 *    ng buong grupo (PROGRAM_DESIGN.md section 7).
 * 4. Burahin ang mga guide comment na ito at palitan ng sarili mong maikling
 *    comment bago mag-commit. Dapat maipaliwanag mo ang bawat linya.
 *
 * NOTE: Wala na ang gold. Walang addGold() at getGold(), at huwag ilagay ang
 * gold sa showStats().
 */
public class Player {

    // Item names. Gamitin ito kahit saan para laging pareho ang spelling.
    public static final String POTION = "Potion";
    public static final String WHETSTONE = "Whetstone";

    // Mga variable ng player. "private" para sa loob lang ng class na ito.
    private String name;
    private int hp;
    private int maxHp;
    private int attack;
    private String[] inventory;   // 3 slots. null ang ibig sabihin ay empty

    // STARTER: constructor. Dito nagsisimula ang player sa 40 HP, 5 attack.
    public Player(String name) {
        this.name = name;
        this.maxHp = 40;
        this.hp = maxHp;
        this.attack = 5;
        this.inventory = new String[3];
    }

    // STARTER: mga getter. Ibinabalik lang nila ang value ng variable.
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttack() {
        return attack;
    }

    // STARTER (halimbawa kung paano pigilan na bumaba sa 0 ang HP):
    public void takeDamage(int amount) {
        hp = hp - amount;
        if (hp < 0) {
            hp = 0;
        }
    }

    // TODO: Dagdagan ang HP ng "amount" pero HINDI lalampas sa maxHp.
    // Hint: kapareho ng takeDamage pero baliktad. Gumamit ng if.
    public void heal(int amount) {
        throw new UnsupportedOperationException("TODO: Player.heal");
    }

    // TODO: Ibalik ang true kung HP ay mas mataas sa 0. Isang linya lang ito.
    public boolean isAlive() {
        throw new UnsupportedOperationException("TODO: Player.isAlive");
    }

    // TODO: Ilagay ang item sa unang empty slot ng inventory.
    // Hint: for loop sa inventory. Kung inventory[i] == null, ilagay doon
    // at return true. Kung natapos ang loop at walang empty, return false.
    public boolean addItem(String item) {
        throw new UnsupportedOperationException("TODO: Player.addItem");
    }

    // TODO: Gamitin ang item sa slot (0 hanggang 2).
    // Mga hakbang:
    //  1. Kung ang slot ay wala sa 0-2 o inventory[slot] == null, return false.
    //  2. switch sa item. case POTION: heal(15) at mag-print ng mensahe.
    //     case WHETSTONE: attack = attack + 2 at mag-print.
    //     (Puwede ang POTION sa case dahil static final String siya.)
    //  3. Gawing null ang slot (naubos na ang item) at return true.
    public boolean useItem(int slot) {
        throw new UnsupportedOperationException("TODO: Player.useItem");
    }

    // TODO: I-print ang 3 slots, hal. "1. Potion", "2. empty", "3. empty".
    // Hint: for loop. Ang slot 0 ay "1" sa menu, kaya i + 1 ang ipapakita.
    public void showInventory() {
        throw new UnsupportedOperationException("TODO: Player.showInventory");
    }

    // TODO: I-print ang pangalan, HP (hal. 25/40), attack, at inventory.
    // Hint: puwede mong tawagin ang showInventory() dito.
    public void showStats() {
        throw new UnsupportedOperationException("TODO: Player.showStats");
    }
}
