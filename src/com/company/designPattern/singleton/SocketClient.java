package com.company.designPattern.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient() {      // singleton 일 경우
//    public SocketClient() {         // singleton 이 아닌 경우

    }

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
