package com.hty.web03;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//域对象
public class Servlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取全局域对象的值
//        ServletContext servletContext = this.getServletContext();
//        String name = servletContext.getAttribute("name").toString();
//        System.out.println(name);

        String name = req.getAttribute("name").toString();
        System.out.println(name);

        System.out.println("servlet04");
    }
}
