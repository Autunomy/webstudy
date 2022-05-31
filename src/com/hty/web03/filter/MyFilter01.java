package com.hty.web03.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器MyFilter01被初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行MyFilter01过滤器------------");

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        if(req.getMethod().equals("POST")){
            req.setCharacterEncoding("utf-8");
        }

        filterChain.doFilter(servletRequest,servletResponse);//放行
        System.out.println("filter01放行之后");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器MyFilter01被销毁");
    }
}
