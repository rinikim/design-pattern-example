package com.company.designPattern.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);   // 자기 자신을 변경하지 않고, 어댑터로 인해 인터페이스를 변경시키려는 것을 어댑터 패턴이라 한다.
//        connect(cleaner);   // 220v에 바로 110v을 연결하려니 error

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
//        connect(airConditioner);
    }

    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerON();
    }
}
