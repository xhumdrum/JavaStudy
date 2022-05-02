package com.basic.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetaddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress id = InetAddress.getByName("192.168.0.100");
        System.out.println(id.getHostName());  // 主机名
        System.out.println(id.getHostAddress());  // IP地址
        System.out.println(Arrays.toString(id.getAddress()));
        System.out.println(id.getCanonicalHostName());  // 主机名


    }
}
