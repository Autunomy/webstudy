package com.hty.web01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//servlet的生命周期
public class Servlet03 extends HttpServlet {
    public Servlet03() {
        System.out.println("servlet03被创建了");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("servlet03");
    }

    @Override
    public void destroy() {
        System.out.println("servlet03被销毁了");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("servlet03被初始化了");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        String name = config.getInitParameter("name");
        String age = config.getInitParameter("age");
        System.out.println("name="+name+"  "+"age="+age);
    }
}
