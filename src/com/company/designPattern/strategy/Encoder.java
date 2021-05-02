package com.company.designPattern.strategy;

// 이 Encoder는 전략을 주입받기 때문에 그때그떄의 전략을 알아야 한다.
public class Encoder {
    private EncodingStrategy encodingStrategy;

    // 각각의 전략에 따라서 encode가 달라질 수 있다.
    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
