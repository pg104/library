package com.pg.filter;

import com.pg.entity.Reader;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/book")
public class ReaderFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //判断是否有读者登录
        HttpSession session = ((HttpServletRequest)request).getSession();
        Reader reader =(Reader) session.getAttribute("reader");
        if (reader == null){
            ((HttpServletResponse)response).sendRedirect("login.jsp");
        } else {
            chain.doFilter(request,response);
        }
    }
}
