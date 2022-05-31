package com.hty.web01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//测试HttpServletRequest对象
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求头  这里我们获取的是主机和端口号
        String host = req.getHeader("host");
        System.out.println("请求头="+host);

        //获取上下文路径
        String contextPath = req.getContextPath();
        System.out.println("上下文路径="+contextPath);

        //获取servlet中的映射路径
        String servletPath = req.getServletPath();
        System.out.println("servlet中的映射路径="+servletPath);

        //获取请求方式
        String method = req.getMethod();
        System.out.println("请求方式="+method);

        //获取url和uri
        StringBuffer url = req.getRequestURL();
        String uri = req.getRequestURI();
        System.out.println("url="+url);
        System.out.println("uri="+uri);

        //获取请求的数据 这里我们需要自己在浏览器地址栏加上参数
        //http://localhost:8080/servlet01?name=zhangsan&age=18
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        System.out.println("name="+name+"  "+"age="+age);
    }
}
