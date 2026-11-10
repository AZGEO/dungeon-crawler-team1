/**
 * PART 1 - Player.java
 * Owner: eugene
 *
 * Trabaho sa class nani: e store ang stats sa player (HP, attack) ug ang
 * inventory niya. Wala nay input/menu or unsa diri. Ang Main.java ug Battle.java ang mutawag
 * sa mga method nimo
 *
 * UNSAON GAMITON ANG FILE NANI:
 * 1. Ang mga method nga naay "STARTER" kay humana (basahi ra para masabtan gamay)
 * 2. Ang mga naay "TODO" kay ikaw ang magsulst. idelete ang throw line
 *    kapag naa nakay sarili na code.
 * 3. AYAW JUD baguhi ang pangalan sa method o ang parameters. 
 * 4. idelete ang mga guide comment nani then iswap sa sarili nimong mga comment
 *   bago mag-commit
 *
 * NOTE: Wala nay gold(kwarta sa player) na e code or unsa. Walay addGold() at getGold(), ug ayaw ibutang ang
 * gold sa showStats().
 */
public class Player {

    // Item names. Gamita ni bisan asa para always same ang spelling
    public static final String POTION = "Potion";
    public static final String WHETSTONE = "Whetstone";

    // Mga variable sa player. "private" para sa sulod lang sa class nani.
    private String name;
    private int hp;
    private int maxHp;
    private int attack;
    private String[] inventory;   // 3 slots. null ang ibig sabihin ay empty

    // STARTER: constructor. Diri magstart ang hero sa 40 HP, 5 ang attack niya
    public Player(String name) {
        this.name = name;
        this.maxHp = 40;
        this.hp = maxHp;
        this.attack = 5;
        this.inventory = new String[3];
    }

    // STARTER: mga getter. Gina balik lang nila ang value sa variable.
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

    // STARTER (example kung paunsa e stop na mubaba sa 0 ang HP)
    // (lain sad ma negative iyang health noh):
    public void takeDamage(int amount) {
        hp = hp - amount;
        if (hp < 0) {
            hp = 0;
        }
    }

    // TODO: Dagdaga ang HP ug "amount" pero AYAW ilagpas sa maxHp.
    // Hint: kapareho sa takeDamage pero baliktad. Gamiton rana ug if statement)
    public void heal(int amount) {
        throw new UnsupportedOperationException("TODO: Player.heal");
    }

    // TODO: Ibalik ang true kung HP kay mas mataas sa 0. Isa ka linya rani.
    public boolean isAlive() {
        throw new UnsupportedOperationException("TODO: Player.isAlive");
    }

    // TODO: Ibutang ang item sa first empty slot sa inventory.
    // Btw: for loop sa inventory. Kung inventory[i] == null, ibutang didto
    // ug return true. Kung finished ang loop and walang empty, return false.
    public boolean addItem(String item) {
        throw new UnsupportedOperationException("TODO: Player.addItem");
    }

    // TODO: Gamiti ang item sa slot (0 hanggang 2).
    // Mga steps dawg:
    //  1. Kung ang slot kay wala sa 0-2 o inventory[slot] == null, return false.
    //  2. switch sa item. case POTION: heal(15) and mag-print ug message.
    //     case WHETSTONE: attack = attack + 2 unya mag-print.
    //     (Puwede ang POTION sa case kay static final String siya.)
    //  3. Himosg null ang slot ( inig nahurot na ang item) at return true.
    public boolean useItem(int slot) {
        throw new UnsupportedOperationException("TODO: Player.useItem");
    }

    // TODO: I-print ang 3 slots, ex:. "1. Potion", "2. empty", "3. empty".
    // btw: for loop. Ang slot 0 kay "1" sa menu, mao i + 1 ang ipakita.
    public void showInventory() {
        throw new UnsupportedOperationException("TODO: Player.showInventory");
    }

    // TODO: I-print ang pangalan, HP (ex:. 25/40), attack, ug inventory.
    // also: puwede gamiton ang showInventory() diri.
    public void showStats() {
        throw new UnsupportedOperationException("TODO: Player.showStats");
    }
}
