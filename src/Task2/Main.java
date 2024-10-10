package Task2;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;

// 2.b
public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        // 2.g
        cafe.loadMenuData();

        // 2.h
        ArrayList menu = cafe.getCoffeeMenu();
        System.out.println("Coffee menu looks like this: " + menu);

    }
}
