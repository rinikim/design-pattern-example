package com.company.designPattern.facade;

public class SftpClient {

    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    public SftpClient(Ftp ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }

    // 다른 방식의 오버로딩, ftp 객체가 아니라도 객체를 생성할 수 있음.
    public SftpClient(String host, int port, String path, String fileName) {
        this.ftp = new Ftp(host, port, path);
        this.reader = new Reader(fileName);
        this.writer = new Writer(fileName);
    }

    public void connect() {
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void disConnect() {
        ftp.disConnect();
        writer.fileDisconnect();
        reader.fileDisconnect();
    }

    public void read() {
        reader.fileRead();
    }

    public void write() {
        writer.write();
    }
}
