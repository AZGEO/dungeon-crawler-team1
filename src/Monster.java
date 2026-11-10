/**
 * PART 3 - Monster.java (kauban sa Battle.java (akoa)), na nasa repo na)
 * Owner: mamalias
 * Trabaho sa class nani: e stire ang stats sa isa ka monster (name, HP,
 * attack). Ang stats ay gikan sa mga parallel array sa ubos. Ang "type"
 * number kay ang index sa mga array. Wala nay menu or input diri
 *
 * Ang mga "STARTER" kay tapos na. Ang mga "TODO" may ikaw ang magbutang.
 * Ayaw jud baguhi ang pangalan at parameters sa mga method pls
 * idelete ang guide comments nani ug at e swap ang sarili nimong short comment
 * bago mag-commit.
 *
 * NOTE: Wala na ang gold (kwarta sa player na feautr). Walay GOLD array & walang getGold().
 * Ang Battle.java ang magsusulat sa battle loop.
 */
public class Monster {

    // Parallel arrays: pare-pareho ang index. Index 0 = Goblin, 1 = Skeleton,
    // 2 = Bat, 3 = Ghoul, 4 = Dungeon Lord (boss).
    // Placeholder pa ang numbers, puwede i-tune habang nagtetest.
    private static final String[] NAMES = {
        "Goblin", "Skeleton", "Bat", "Ghoul", "Dungeon Lord"
    };
    private static final int[] HP = {12, 15, 10, 20, 35};
    private static final int[] ATTACK = {3, 4, 5, 5, 6};

    private String name;
    private int hp;
    private int maxHp;     // para sa resetHp() kapag ang player kay mag choose na muhawa
    private int attack;

    // STARTER: constructor. Ginakuha ang stats sa array gamit ang type.
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

    // TODO: ibalik ang current HP.
    public int getHp() {
        throw new UnsupportedOperationException("TODO: Monster.getHp");
    }

    // TODO: ibalik ang attack value.
    public int getAttack() {
        throw new UnsupportedOperationException("TODO: Monster.getAttack");
    }

    // TODO: ibawas ang amount sa HP pero DILI mubaba sa 0. lain sad negative ang hp
    // btw: awa kung giunsa gihimo ang Player.takeDamage.
    public void takeDamage(int amount) {
        throw new UnsupportedOperationException("TODO: Monster.takeDamage");
    }

    // TODO: true kung HP is above sa 0.
    public boolean isAlive() {
        throw new UnsupportedOperationException("TODO: Monster.isAlive");
    }

    // TODO: ibalik ang HP sa maxHp. Gamiton if the player chooses na muhawa sa monster
    public void resetHp() {
        throw new UnsupportedOperationException("TODO: Monster.resetHp");
    }
}
