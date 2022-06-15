package com.hty.web05;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//cookie
public class Servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //触发浏览器的存储Cookie数据的功能
        Cookie cookie = new Cookie("name", "admin");
        //设置注释 不在浏览器中显示 一般是用在程序中
        cookie.setComment("我是Comment注释");
        //设置Cookie的主机域名(一般不需要设置,默认就是此服务部署的服务器的域名)
        cookie.setDomain("localhost");
        //Cookie的作用域(/:代表当前服务下的所有子服务都有效),一般都会设置为/
        cookie.setPath("/");
        cookie.setMaxAge(60 * 60 * 24 * 7);//设置Cookie的有效期,单位为s,默认为-1,-1代表浏览器关闭之后失效
        resp.addCookie(cookie);
    }
}
