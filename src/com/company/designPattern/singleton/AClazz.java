package com.company.designPattern.singleton;

// class는 예약어이기 때문에 class를 사용할 때는 통상적으로 clazz로 사용한다.
public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance();   // singleton 인 경우
//        this.socketClient = new SocketClient();             // singleton 이 아닌 경우
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
