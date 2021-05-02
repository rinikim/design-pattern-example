package com.company.designPattern.facade;

public class FacadeMain {

    public static void main(String[] args) {

        // ** Facade를 사용하기 전
//        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();

        // ** Facade 사용
        // 의존성이 있는 객체들은 facade객체 안에 넣어 간략하게 호출할 수 있다. (복잡한 코드들을 안쪽에 숨겨준다.
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
