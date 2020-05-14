package com.glamrock.design_pattern.observer.after;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        ChatRoom chatRoom = new ChatRoom("채팅방");
        GameRoom gameRoom = new GameRoom("게임방");
        DevRoom devRoom = new DevRoom("개발방");

        user.attach(chatRoom);
        user.attach(gameRoom);
        user.attach(devRoom);

        String msg = "안녕하세요~";
        user.notifyObservers(msg);

        user.detach(chatRoom);
        msg = "수고하세요~";

        user.notifyObservers(msg);
    }
}
