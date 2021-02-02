public class CombatSystem {
    AttributeStats gatherStat = new AttributeStats();
    boolean combatVictory = false;


    public void enemyEncountered() {

        System.out.println("You have encountered a " + EnemyType.values()[EnemyType.chosenEn.nextInt(EnemyType.values().length)]);


    }
    public void avoidCombat(){
        if(gatherStat.mylvl <= EnemyType.chosenEn.nextInt(gatherStat.enlvl = gatherStat.mylvl)){
            System.out.println("Encounter was stronger so you fled!");

        }
    }

    public void enterCombat(){


        if (gatherStat.mylvl >= EnemyType.chosenEn.nextInt(gatherStat.enlvl = gatherStat.mylvl)) {
            System.out.println("You have entered combat!");
            System.out.println("");
            System.out.println("Current Stats: " + "Lvl. " + gatherStat.mylvl + " | Str. " + gatherStat.mystr + " | Def. " + gatherStat.mydef + " | Spd. " + gatherStat.myspd);
            System.out.println("");
            System.out.println("Enemy Stats: " + "Typ. " + EnemyType.Zombie + " | Str. " + gatherStat.enstr + " | Def. " + gatherStat.endef + " | Spd. " + gatherStat.enspd);
            if (gatherStat.enlvl < gatherStat.mylvl) {
                combatVictory = true;
                System.out.println("You were stronger so the " + EnemyType.values()[EnemyType.chosenEn.nextInt(EnemyType.values().length)] + " fled.");


            }

        }

    }

}
