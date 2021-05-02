package com.company.designPattern.observer;

public class ObserverMain {

    public static void main(String[] args) {
        Button button = new Button("버튼");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        // click()가 실행되면 addListener에 각각의 message가 전달되어 출력된다.
        button.click("메세지 전달 : click 1");
        button.click("메세지 전달 : click 2");
        button.click("메세지 전달 : click 3");
        button.click("메세지 전달 : click 4");

    }
}
