package com.abdu.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/login")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(username.length()<3){
            chain.doFilter(req, resp);
        }
        else {
            req.setAttribute("error", "Username Length should be not less than 3");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req, resp);
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
