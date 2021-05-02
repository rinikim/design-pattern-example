package com.company.designPattern.adapter;

import com.company.designPattern.singleton.SocketClient;

// 이는 220v -> 110v로 변환해줄 것이기에 implements는 110v로 해주어야 한다.
public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerON() {
        electronic220V.connect();
    }
}
