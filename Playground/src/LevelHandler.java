public class LevelHandler {
    AttributeStats gatherStat = new AttributeStats();
    public boolean combatVictory = false;

    public void earnEXP() {
        while (combatVictory) {
            if (this.gatherStat.enhp > gatherStat.mylvl) {
                gatherStat.myexp = gatherStat.myexp + gatherStat.gainEXP;
                System.out.println("You have earned " + gatherStat.gainEXP + " EXP");
                if (gatherStat.myexp >= gatherStat.exptonext) {
                    gatherStat.mylvl = gatherStat.mylvl + 1;
                    System.out.println("You have leveled up! You are now level " + gatherStat.mylvl);

                }
            }
            return;
        }
    }
}