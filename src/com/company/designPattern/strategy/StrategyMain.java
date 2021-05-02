package com.company.designPattern.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        // base64
        EncodingStrategy base64 = new Base64Strategy();

        // normal
        EncodingStrategy normal = new NormalStrategy();

        // 그 외 base32, hashCode, 암호화 해서 줄 수 있다.
        // Encoder 객체는 변하지 않은채로 전략에 따라 결과가 달라지도록

        String message = "Hello Java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }
}
