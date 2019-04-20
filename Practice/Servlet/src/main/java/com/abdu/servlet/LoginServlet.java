package com.abdu.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


//        String username = request.getParameter("username");
//        String password = request.getParameter("password");

//        PrintWriter out = response.getWriter();
//        out.println(username + " "+ password);

//        request.setAttribute("username", username);
//        request.setAttribute("password", password);


        List<User> studentList = Arrays.asList(new User("Abdu", "Edris", "abdu@edris.com", 20),
                new User("Sobah", "Edris", "sobah@edris.com", 25),
                new User("Alexa", "Amazon", "alexa@amazon.com", 15),
                new User("Siri", "Apple", "siri@apple.com", 10));

        User abdu = new User("Siri", "Apple", "siri@apple.com", 10);

        request.setAttribute("user", studentList);
//        request.setAttribute("user", abdu);
//        response.sendRedirect("user.jsp");



        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
