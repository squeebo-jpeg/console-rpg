import java.util.Random;
import java.util.Scanner;

public class RoomSystem {
    public static void myBiome() {
        String[] currentBiome = {"Forest", "Cave", "Desert", "Mountains", "Tundra"};
        Random biomeSelection = new Random();
        int bioIndex = biomeSelection.nextInt(currentBiome.length);
        System.out.println("You are in a " + currentBiome[bioIndex] + " Biome!");

    }
    public static void roomChoices() {
        Scanner roomChoice = new Scanner(System.in);

    }

}
