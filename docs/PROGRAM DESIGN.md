# Final Programming Design: Dungeon Crawler

Status: Numbers (HP, damage) are placeholders to tune during testing. If ever mugamit ug AI for assistance, attach this file as reference and context to the code/flow sa program

Change log:
- Nov 5, 2026: Gold feature removed (it had no gameplay use). Removed: Player gold stat, addGold, getGold, Monster gold reward, GOLD array, gold in View Stats. Confirm the whole group agreed before coding.

## 1. Game summary

A console, turn-based dungeon game. The player explores a small dungeon of 6 rooms, choosing which connected room to enter next. Monster rooms trigger a battle. The boss room unlocks after 3 rooms are cleared. The player wins by defeating the boss and loses if HP reaches 0. After the game ends, the player may play again.

## 2. Basic rules (proposed)

- Player starts with 40 HP, attack 5, and 3 empty inventory slots.
- Items: Potion (heals 15 HP) and Whetstone (+2 attack, used once).
- Battle options: Attack, Use Item, Run. The boss cannot be escaped.
- Player damage is attack plus a random 0 to 2. Monster damage is its attack value.
- Using an item in battle takes your turn, unless the slot is empty (then nothing is lost).
- Running returns the player to the previous room, and the monster heals fully.
- HP never goes below 0 or above max HP. Cleared rooms stay cleared.

## 3. Dungeon map

| Room | Name | Monster | Loot | Exits to |
|---|---|---|---|---|
| 0 | Entrance Hall | None | None | 1, 2 |
| 1 | Armory | Goblin | Potion | 0, 3 |
| 2 | Crypt | Skeleton | Whetstone | 0, 4 |
| 3 | Library | Bat | Potion | 1, 4, 5 (boss, locked) |
| 4 | Cellar | Ghoul | Potion | 2, 3, 5 (boss, locked) |
| 5 | Boss Chamber | Dungeon Lord | None | 3, 4 |

Rooms 1 to 4 have monsters, so the player must clear at least 3 of them to unlock room 5.

## 4. Monster stats (proposed)

| Type | Monster | HP | Attack |
|---|---|---|---|
| 0 | Goblin | 12 | 3 |
| 1 | Skeleton | 15 | 4 |
| 2 | Bat | 10 | 5 |
| 3 | Ghoul | 20 | 5 |
| 4 | Dungeon Lord (boss) | 35 | 6 |

The type number is the index in the monster arrays, and it is what you pass to Monster(int type).

## 5. Files and owners

All files go in one folder (src) with no package statements. Each member edits only their own files, which avoids Git conflicts.

//PARTS: Diri atoa mga parts na e code. Wala pa final na work split 
| Part | Files (storage sa mga class) | Contents | Owner |
|---|---|---|---|
| 1 | Player.java | Stats, inventory array, using items | [Member] |
| 2 | Room.java, World.java | Room data, map, exit menu, unlock check | [Member] |
| 3 | Monster.java, Battle.java | Monster stats arrays, battle loop | [Member] |
| 4 | Main.java, InputHelper.java | Title menu, main loop, validated input, play again | [Member] |

Every member also writes test cases for their own part and must be able to explain the whole game.

## 6. Where the arrays are

- Player: String[] inventory (3 slots, null means empty).
- World: Room[] rooms (the 6 rooms).
- Room: int[] exits (room numbers the player can move to).
- Monster: parallel arrays NAMES, HP, ATTACK, indexed by monster type.

## 7. Agreed method names na gamiton

Everyone codes gamit ni na mga names as references para same tanan. Use these as reference/contexts once mag code sa inyong parts

| Class | Method | Purpose |
|---|---|---|
| Player | Player(String name) | Create a player with starting stats |
| Player | static final String POTION, WHETSTONE | Item names ("Potion", "Whetstone"). Use these everywhere so the spelling always matches |
| Player | String getName() | Player name for messages |
| Player | int getHp() / int getMaxHp() | Current HP / maximum HP |
| Player | int getAttack() | Current attack value (includes the Whetstone bonus) |
| Player | void takeDamage(int amount) | Lower HP, never below 0 |
| Player | void heal(int amount) | Raise HP, never above max |
| Player | boolean isAlive() | True if HP is above 0 |
| Player | boolean addItem(String item) | Add to inventory, false if full |
| Player | boolean useItem(int slot) | Use the item in slot 0 to 2, print its effect, remove it. False if the slot is empty |
| Player | void showInventory() | Print the 3 slots, showing "empty" for unused ones |
| Player | void showStats() | Print name, HP, attack, inventory |
| Monster | Monster(int type) | Create a monster from the stats arrays (type numbers in Section 4) |
| Monster | String getName() | Monster name for messages |
| Monster | int getHp() | Current HP |
| Monster | int getAttack() | Attack value |
| Monster | void takeDamage(int amount) | Lower HP, never below 0 |
| Monster | boolean isAlive() | True if HP is above 0 |
| Monster | void resetHp() | Heal to full (used when the player runs) |
| Room | Room(String name, String description, int[] exits, Monster monster, String loot) | Used by World.createRooms |
| Room | String getName() / getDescription() | Room info |
| Room | int[] getExits() | Room numbers the player can move to |
| Room | Monster getMonster() / String getLoot() | Room contents. Each returns null if the room has none |
| Room | boolean isCleared(), void setCleared() | Cleared state |
| World | static final int BOSS_ROOM = 5, ROOMS_TO_UNLOCK = 3 | Shared constants, so nobody hard-codes these numbers |
| World | static Room[] createRooms() | Build the 6 rooms |
| World | static int countCleared(Room[] rooms) | Number of cleared rooms (Main passes it to chooseExit) |
| World | static int chooseExit(Room[] rooms, int current, int clearedCount, Scanner sc) | Show exits, return the chosen room. If the boss room is chosen while locked, print a message and return current |
| Battle | static int fight(Player p, Monster m, boolean canRun, Scanner sc) | Run a battle. Returns 0 = won, 1 = fled, 2 = lost |
| InputHelper | static int readInt(Scanner sc, int min, int max) | Read a whole line and keep asking until it is a number from min to max |
| InputHelper | static String readText(Scanner sc) | Read a line and keep asking until it is not blank (for the player name) |

Conventions that prevent mismatches:

- Create only one Scanner (in Main) and pass it to every method that needs it.
- Inventory slots are 0 to 2 in code. Menus show 1 to 3, so subtract 1 before calling useItem.
- Yes/No questions (like Play again?) use readInt with a menu: 1. Yes, 2. No.
- Private helper methods inside one class (for example in Main) do not need to be listed here. Only methods that other files call do.

## 8. Game flow

1. Title menu: Start, How to Play, Quit.
2. Ask for the player name and create the Player and the rooms.
3. Enter the current room and show its description.
4. If the room has an uncleared monster, call Battle.fight (canRun is false only in the boss room). If the player lost, go to Game Over. If the player fled, return to the previous room.
5. If the monster was beaten, mark the room cleared and offer the loot.
6. Show the action menu: Move, Use Item, View Stats, Quit.
7. On Move, call World.chooseExit. The boss room stays locked until 3 rooms are cleared.
8. Defeating the boss shows the win screen. HP reaching 0 shows Game Over.
9. Ask "Play again?". If yes, rebuild everything from scratch.

## 9. Edge cases to handle and test

- Invalid menu input: letters, symbols, blank lines, numbers out of range.
- Reading a number and then a name with the same Scanner (the leftover newline bug).
- HP going below 0 or healing above max HP.
- Inventory full when picking up loot. Using an empty slot, including during a battle.
- Entering the locked boss room before 3 rooms are cleared.
- Revisiting a cleared room, which must not trigger another battle.
- Running from battle, then re-entering the same room.
- Play again must reset the player, the rooms, and the cleared count.

## 10. Required concepts

| Requirement | Where makita ni na mga concepts |
|---|---|
| Input / Output | Scanner and System.out in menus, battle messages, room text |
| Data types | int (HP, attack, damage), String (names, items), boolean (isAlive, cleared) |
| Repetition | Main game loop, battle loop, input validation loops, for loops listing exits and inventory, play-again loop |
| Selection | switch for menus and item effects, if/else for battle results, the boss lock, and input checks |
| Arrays | Inventory String[], Room[] rooms, int[] exits, monster stats arrays |

## 11. Decisions sa group

1. Assign an owner to each of the 4 parts.
2. Choose a story theme and a game title.
