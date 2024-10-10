package Task3;

import java.util.ArrayList;

public class Building {
    // 3.d
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    // 3.e
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "rooms=" + rooms +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}