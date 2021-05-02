package com.company.designPattern.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = SocketClient.getInstance();   // singleton 인 경우
//        this.socketClient = new SocketClient();             // singleton 이 아닌 경우
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
