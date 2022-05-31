package com.hty.web03;

import com.alibaba.fastjson.JSON;
import com.hty.web03.pojo.Book;
import com.hty.web03.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet01 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String sex = req.getParameter("sex");
        String[] loves = req.getParameterValues("loves");
        String city = req.getParameter("city");
        User user = new User(name,age,sex,loves,city);
        Book book = new Book("123",123);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(JSON.toJSONString("123"));
    }
}
