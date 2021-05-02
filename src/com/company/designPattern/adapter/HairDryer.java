package com.company.designPattern.adapter;

public class HairDryer implements Electronic110V {

    @Override
    public void powerON() {
        System.out.println("헤어 드라이기 110v on");
    }
}
