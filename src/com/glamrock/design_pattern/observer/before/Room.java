package com.glamrock.design_pattern.observer.before;

public class Room {
    public String roomName;

    public void receive(String msg) {
        System.out.println(this.roomName + "에서 메시지를 받음 : " + msg);
    }
}
