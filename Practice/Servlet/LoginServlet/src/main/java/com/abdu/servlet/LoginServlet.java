package com.abdu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Normally we check the username and password from the database and if exists we create the session id
        if (!(username.equals(""))) {
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(10 * 60);
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
        }
        else{

            request.setAttribute("error", "Login Error ...");
            response.sendRedirect("login.jsp");
        }
    }
}
