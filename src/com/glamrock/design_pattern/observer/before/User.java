package com.glamrock.design_pattern.observer.before;

import java.util.List;

public class User {
    private List<Room> rooms;

    public void setRooms(List<Room> rooms){
        this.rooms = rooms;
    }

    public void talk(String msg) {
        for(Room room : rooms) {
            room.receive(msg);
        }
    }
}
