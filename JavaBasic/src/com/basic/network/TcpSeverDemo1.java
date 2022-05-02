package com.basic.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSeverDemo1 {

    public static void main(String[] args) throws IOException {

        // 1. 创建 ServerSocket 对象
        ServerSocket serverSocket = new ServerSocket(10000);

        // 2. 监听,阻塞
        Socket accept = serverSocket.accept();

        // 3. 获得输入流
        InputStream inputStream = accept.getInputStream();
        // 4. 打印接收内容
        int len = -1;
        while ((len = inputStream.read()) != -1) {
            System.out.print((char)len);
        }

        // 5. 响应
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("OK".getBytes());
        accept.shutdownOutput();

        System.out.println("");
        System.out.println("OVER");

        // 6. 关闭资源
        inputStream.close();
        outputStream.close();
        accept.close();
        serverSocket.close();


    }
}
