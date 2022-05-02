package com.basic.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClientDemo1 {

    public static void main(String[] args) throws IOException {

        // 1 . 创建 socket 对象
        Socket socket = new Socket("127.0.0.1", 10000);

        // 2. 获取 IO 输出流
        OutputStream os = socket.getOutputStream();

        // 3. 输出内容
        os.write("test".getBytes());
        socket.shutdownOutput();  // 结束标记

        // 4. 接收服务器的响应
        InputStream inputStream = socket.getInputStream();

        // 5. 打印响应
        int len = -1;
        while ((len = inputStream.read()) != -1) {
            System.out.print((char)len);
        }

        // 6. 关闭资源
        os.close();  // 会向服务器写入一个结束标记
        socket.close();



    }
}
