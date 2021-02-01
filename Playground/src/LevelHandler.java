public class LevelHandler {
    AttributeStats gatherStat = new AttributeStats();
    public boolean combatVictory = false;

    public void earnEXP(){
         while(combatVictory == true) {
             if (gatherStat.enlvl > gatherStat.mylvl) {
                gatherStat.myexp = gatherStat.myexp + gatherStat.gainEXP;

                if(gatherStat.myexp >= gatherStat.explvlup){
                    gatherStat.mylvl = gatherStat.mylvl+ 1;
                    System.out.println("You have leveled up! You are now level " + gatherStat.mylvl);

                 }
             }
         return;
         }
    }

}
