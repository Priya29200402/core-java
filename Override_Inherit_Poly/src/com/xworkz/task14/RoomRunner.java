package com.xworkz.task14;

public class RoomRunner {
    public static void main(String[] args) {
        Room room = new Room("Living Room", 20.5, "Wooden", true);
        System.out.println(room);
        room.info();
        room.use();
        Building building = new Building("Skyline Apartments", "123 Main St", 10, new String[]{"Gym", "Pool"});

        Room room1 = new Room(new String[]{"Master Bedroom", "Guest Bedroom"}, Type.BEDROOM, 15.0, building,2);
        System.out.println(room1);

        BedRoom bedRoom = new BedRoom("Master Bedroom", 15.0, "Wooden", true, "King Size", true);
        System.out.println(bedRoom);
        bedRoom.info();
        bedRoom.use();
    }
}
