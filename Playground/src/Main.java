public class Main {
    public static void main(String args[]) {

        Init initialize = new Init();
        initialize.beginIntro();
        RoomSystem roomsys = new RoomSystem();
        roomsys.myBiome();
        initialize.enemyEncountered();
        initialize.enterCombat();
        initialize.earnEXP();


        }



    }





