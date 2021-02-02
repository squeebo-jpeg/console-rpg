import java.util.Scanner;

public class Init {

    public static void beginIntro() {

        Scanner usernameStored = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter Stuff Now");
        String username = usernameStored.nextLine();
        System.out.println(" ");
        System.out.println("You entered: " + username);
    }




}