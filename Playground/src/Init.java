import java.util.Scanner;

public class Init {
    public boolean combatVictory = false;
    AttributeStats gatherStat = new AttributeStats();
    LevelHandler gatherLvlHandler = new LevelHandler();

    public static void beginIntro() {

        Scanner usernameStored = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter Stuff Now");
        String username = usernameStored.nextLine();
        System.out.println(" ");
        System.out.println("You entered: " + username);
    }

    public static void enemyEncountered() {

        System.out.println("You have encountered a ");


    }
    public void enterCombat(){
        System.out.println("You have entered combat!");
        System.out.println("Level: " + gatherStat.mylvl);
        if(gatherStat.enstr < gatherStat.mystr) {
            combatVictory = true;
        System.out.println("You were stronger so the "  + " fled.");
        }

    }
    public void earnEXP() {
        while (combatVictory) {
            if (gatherStat.enlvl > gatherStat.mylvl) {
                gatherStat.myexp = gatherStat.myexp + gatherStat.gainEXP;
                System.out.println("You have earned " + gatherStat.gainEXP + " EXP");
                if (gatherStat.myexp >= gatherStat.explvlup) {
                    gatherStat.mylvl = gatherStat.mylvl + 1;
                    System.out.println("You have leveled up! You are now level " + gatherStat.mylvl);

                }
            }
            return;
        }
    }
}