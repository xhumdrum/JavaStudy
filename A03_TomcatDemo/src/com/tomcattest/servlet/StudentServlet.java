package com.tomcattest.servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class StudentServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        // 接收请求
        String name = servletRequest.getParameter("name");
        System.out.println("您输入的姓名是：" + name);

        // 响应
        servletResponse.setCharacterEncoding("gbk");
        PrintWriter writer = servletResponse.getWriter();
        writer.write("您输入的姓名是：" + name);
        writer.close();


    }
}
