import java.util.Random;

public class RoomSystem {
    public static void myBiome() {
        String[] currentBiome = {"Forest", "Cave", "Desert", "Mountains"};
        Random biomeSelection = new Random();
        int bioIndex = biomeSelection.nextInt(currentBiome.length);
        System.out.println("You are in a " + currentBiome[bioIndex]);

    }
}
