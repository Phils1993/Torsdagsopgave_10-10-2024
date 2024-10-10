package Task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private static ArrayList<String> coffeeMenu = new ArrayList<>();


    // 2.c
    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    // 2.d
   public static void loadMenuData(){
        try {
            File file = new File("Coffees.txt");
            Scanner scan = new Scanner(file);
            // 2.e
            while (scan.hasNextLine())
                coffeeMenu.add(scan.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found - check the pathway IDIOT :P " + e.getMessage());
        }
    }
}
