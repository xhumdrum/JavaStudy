package com.basic.network;

import java.io.IOException;
import java.net.*;

public class UpdReceiveDemo1 {

    public static void main(String[] args) throws IOException {

        // 1. 接收器,注意需要输入端口号
        DatagramSocket ds = new DatagramSocket(1000);

        // 2. 数据包
        byte[] buff = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buff, buff.length);

        // 3. 接收数据
        ds.receive(dp);
        int l = dp.getLength();  // 接收数据的长度

        // 4. 输出数据
        System.out.println(new String(buff, 0, l));

        // 5. 关闭资源
        ds.close();

    }
}
