package com.hty.web03.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter02 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("myfilter02...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter02放行之后");
    }

    @Override
    public void destroy() {

    }
}
