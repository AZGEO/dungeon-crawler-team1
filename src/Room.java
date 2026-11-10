/**
 * PART 2 - Room.java (kauban sa World.java)
 * Owner: [pasulat lang sa pangalan]
 *
 * Trabaho sa class nani: store ang info sa isa ka room: pangalan,
 * description, mga magawasan na room (exits), monster, loot, or kung cleared na.
 * Walay menu o e input diria, data lang jud sa room (check ang PROGRAM_DESIGN.md na file para makita nimo ang gamiton)
 *
 * Gamita ang "starter" as guide. Ang mga "TODO" kay ikaw ang magbuhat.
 * Ataw ra baguha ang pangalan sa mga methoddd
 * Tanggali rani ang guide comments ug butang ang sarili nga short comments about sa code
 bago mag commit ug change
 *
 * NOTE: Need ani na file ang Monster class (Part 3). Habang wala pato,
 * magre-red ang "Monster" sa IntelliJ. Normal rana hulata ra ang push sa imong kauban. 
 as long as ma save lang ni and ako ra bahala mag adjust
 */
public class Room {

    private String name;
    private String description;
    private int[] exits;        // mga numero sa room puwede sudlan sa player
    private Monster monster;    // null if no monster
    private String loot;        // null if no loot
    private boolean cleared;    // false pani sa start sa room

    // STARTER: constructor. Kani ang tawagon na World.createRooms()
    public Room(String name, String description, int[] exits,
                Monster monster, String loot) {
        this.name = name;
        this.description = description;
        this.exits = exits;
        this.monster = monster;
        this.loot = loot;
        this.cleared = false;
    }

    // STARTER: example ng getter
    public String getName() {
        return name;
    }
// btw TODO kay simply mga method na wala pa nabuhat. 
    // Ang "throw new UnsupportedOperationException(...)" kay ginabutang nako
// *aron mo-error ang program kung gamiton na ang method nga wala pa nahuman.
// * Ang error mo-ingon unsa nga method ang kulang.
//UNSAON NI PAGHUMAN:
// * 1. Basaha ang hint sa taas sa method
// * 2. idelete ang throw nga linya
// * 3. Isulat ang imong kaugalingong code
// * 4. idelete pud ang TODO nga comment kung humana 
 // * Kung naay TODO nga nahabilin sa katapusan, dili mo-gana ang program
// Pangitaa ang "TODO" na nabilin (Ctrl+Shift+F sa IntelliJ if mag search)
   
    
    // TODO: ibalik ang description
    public String getDescription() {
        throw new UnsupportedOperationException("TODO: Room.getDescription");
    }

    // TODO: ibalik ang exits array.
    public int[] getExits() {
        throw new UnsupportedOperationException("TODO: Room.getExits");
    }

    // TODO: ibalik ang monster. Null kung walay monster. Okay rana
    public Monster getMonster() {
        throw new UnsupportedOperationException("TODO: Room.getMonster");
    }

    // TODO: ibalik ang loot. Null kung walay loot.
    public String getLoot() {
        throw new UnsupportedOperationException("TODO: Room.getLoot");
    }

    // TODO: ibalik ang cleared (true o false).
    public boolean isCleared() {
        throw new UnsupportedOperationException("TODO: Room.isCleared");
    }

    // TODO: himoon true ang cleared.
    public void setCleared() {
        throw new UnsupportedOperationException("TODO: Room.setCleared");
    }
}
