package com.basic.network;

import java.io.IOException;
import java.net.*;

public class UpdSendDemo1 {
    public static void main(String[] args) throws IOException {

        // 1. 发送器
        DatagramSocket ds = new DatagramSocket();

        // 2. 数据包
        String s = "Test send data by upd";
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 1000;
        DatagramPacket dp = new DatagramPacket(s.getBytes(),s.length(),address,port);

        // 3. 发送
        ds.send(dp);

        // 4. 关闭资源
        ds.close();

    }

}
