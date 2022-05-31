package com.hty.web02;

import com.alibaba.fastjson.JSON;
import com.hty.web02.pojo.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

//后端返回给浏览器json字符串
public class Servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = new Book();
        book.setId(1);
        book.setName("西游记");
        book.setAuthor("吴承恩");
        book.setDate(new Date());

        req.setCharacterEncoding("utf-8");
        resp.setHeader("Content-Type","application/json;charset=utf-8");
        //将book序列化为json字符串
        String bookJson = JSON.toJSONString(book);
        resp.getWriter().write(bookJson);
    }
}
