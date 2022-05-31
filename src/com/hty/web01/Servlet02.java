package com.hty.web01;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//测试HttpServletResponse对象
public class Servlet02 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //给响应数据包设置响应头
        resp.setHeader("mydata","data");
        //设置数据类型
        resp.setContentType("application/json");
        //设置响应实体编码(默认为)  另一种设置方式为resp.setContentType("application/json;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        //给响应数据包设置状态码,一般不用自己设置，由系统自动判断
        resp.setStatus(200);
        //设置页面输出的数据
        resp.getWriter().write("servlet02你好");
        try (PrintWriter printWriter = resp.getWriter()) {
        }
    }
}
