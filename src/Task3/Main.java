package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.h
        ArrayList<Room> rooms = new ArrayList<>();
        // 3.g
        Room room1 = new Room(1, 5);
        Room room2 = new Room(2, 5);
        Room room3 = new Room(3, 5);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 3.i
        Building build1 = new Building(rooms, 20);

        // call methoed 3.j
        int lampcounter = countLampsInBuilding(build1);
        System.out.println("number of lamp in a room: " + lampcounter);

        int countRoomsInBuilding = countRoomsInBuilding(build1);
        System.out.println("number of rooms in a build: " + countRoomsInBuilding);

        int countWindowsInBuilding = countWindowsInBuilding(build1);
        System.out.println("number of windows in a build: " + countWindowsInBuilding);

        //------------------- 3.j end

        // prints out boolean for floors greater then rooms
        boolean normalNumberOfRoom = isNormal(build1);
        System.out.println("normal number of room: " + normalNumberOfRoom);
    }

    // 3.j
    public static int countLampsInBuilding(Building building) {
        int counter = 0;
        for (Room room : building.getRooms()) {
            counter += room.getNumberOfLamps();
        }
        return counter;
    }

    // 3.j
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    // 3.j
    public static int countWindowsInBuilding(Building building) {
        int counter = 0;
        for (Room room : building.getRooms()) {
            counter += room.getNumberOfWindows();
        }
        return counter;
    }

    // 3.k
    public static boolean isNormal(Building building) {
        return (building.getNumberOfFloors() >= countRoomsInBuilding(building));
    }
}


