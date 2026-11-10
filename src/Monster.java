/**
 * PART 3 - Monster.java (kasama ng Battle.java, na nasa repo na)
 * Owner: [isulat ang pangalan mo dito]
 *
 * Trabaho ng class na ito: iimbak ang stats ng isang monster (pangalan, HP,
 * attack). Ang stats ay galing sa mga parallel array sa baba. Ang "type"
 * number ay ang index sa mga array. Walang menu o input dito.
 *
 * Ang mga "STARTER" ay tapos na. Ang mga "TODO" ay ikaw ang magsusulat.
 * Huwag baguhin ang pangalan at parameters ng method (kontrata, section 7).
 * Burahin ang guide comments at palitan ng sarili mong maikling comment
 * bago mag-commit.
 *
 * NOTE: Wala na ang gold. Walang GOLD array at walang getGold().
 * Ang Battle.java ang magsusulat ng battle loop. Hindi niya hahawakan ang gold.
 */
public class Monster {

    // Parallel arrays: pare-pareho ang index. Index 0 = Goblin, 1 = Skeleton,
    // 2 = Bat, 3 = Ghoul, 4 = Dungeon Lord (boss).
    // Placeholder pa ang numbers, puwedeng i-tune habang nagte-test.
    private static final String[] NAMES = {
        "Goblin", "Skeleton", "Bat", "Ghoul", "Dungeon Lord"
    };
    private static final int[] HP = {12, 15, 10, 20, 35};
    private static final int[] ATTACK = {3, 4, 5, 5, 6};

    private String name;
    private int hp;
    private int maxHp;     // para sa resetHp() kapag tumakbo ang player
    private int attack;

    // STARTER: constructor. Kinukuha ang stats sa array gamit ang type.
    public Monster(int type) {
        this.name = NAMES[type];
        this.maxHp = HP[type];
        this.hp = maxHp;
        this.attack = ATTACK[type];
    }

    // STARTER: halimbawa ng getter.
    public String getName() {
        return name;
    }

    // TODO: ibalik ang kasalukuyang HP.
    public int getHp() {
        throw new UnsupportedOperationException("TODO: Monster.getHp");
    }

    // TODO: ibalik ang attack value.
    public int getAttack() {
        throw new UnsupportedOperationException("TODO: Monster.getAttack");
    }

    // TODO: ibawas ang amount sa HP pero HINDI bababa sa 0.
    // Hint: tingnan kung paano ginawa ang Player.takeDamage.
    public void takeDamage(int amount) {
        throw new UnsupportedOperationException("TODO: Monster.takeDamage");
    }

    // TODO: true kung HP ay mas mataas sa 0.
    public boolean isAlive() {
        throw new UnsupportedOperationException("TODO: Monster.isAlive");
    }

    // TODO: ibalik ang HP sa maxHp. Ginagamit kapag tumakbo ang player.
    public void resetHp() {
        throw new UnsupportedOperationException("TODO: Monster.resetHp");
    }
}
