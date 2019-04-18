package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NumberQuizServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        Quiz quiz = new Quiz();

        PrintWriter out = response.getWriter();
        int x = quiz.getCounter();
        if (x==0){
            out.println("Erorrrrrrrrrrrrr");
        }

//        String x = request.getParameter("answer");

//        Quiz counter;
//
//        counter = (Quiz) request.getSession().getAttribute("counter");
//        if (counter == null) {
//            counter = new Quiz();
//            request.getSession().setAttribute("counter", counter);
//        }
//
//        String increment = request.getParameter("counter");
//        if (increment != null)
//        {
//            counter.incrementCounter();
//        }
//
//        request.setAttribute("counter", counter.getCounter());
//        request.getRequestDispatcher("/labtwo.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
