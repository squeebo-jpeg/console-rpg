public class Main {
    public static void main(String args[]) {

        Init initialize = new Init();
        CombatSystem combatNew = new CombatSystem();
        initialize.beginIntro();
        RoomSystem roomsys = new RoomSystem();
        roomsys.myBiome();
        combatNew.avoidCombat();
        combatNew.enemyEncountered();
        combatNew.enterCombat();
        LevelHandler lvlbehaviour = new LevelHandler();
        lvlbehaviour.earnEXP();


        }



    }





