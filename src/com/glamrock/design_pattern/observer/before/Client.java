package com.glamrock.design_pattern.observer.before;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]){
        User user = new User();
        List<Room> rooms = new ArrayList<>();
        rooms.add(new ChatRoom("채팅방"));
        rooms.add(new GameRoom("게임방"));
        rooms.add(new DevRoom("개발방"));

        user.setRooms(rooms);

        String msg = "안녕하세요~";
        user.talk(msg);
    }
}
