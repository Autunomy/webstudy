package com.hty.web03;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//域对象
public class Servlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //给全局域对象设置值
//        ServletContext servletContext = this.getServletContext();
//        servletContext.setAttribute("name","zhangsan");

        //请求转发
        req.setAttribute("name","张三");
        System.out.println("servlet03");
        req.getRequestDispatcher("/web03/servlet04").forward(req,resp);

    }
}
