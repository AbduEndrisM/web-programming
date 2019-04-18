package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.annotation.WebServlet;


//@WebServlet("/calculator")
public class CalculatorServletOne extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        PrintWriter out = res.getWriter();


        out.println("<!DOCTYPE html\">\n" +
                "<html> <head> <title> Lab One - Calculator </title> </head> \n" +
                "<body> \n" +
                "<font size=\"12px\" color=\"" + "blue" + "\">");

        try {
            res.setContentType("text/html");
            String num1 = req.getParameter("num1");
            String num2 = req.getParameter("num2");
            String num3 = req.getParameter("num3");
            String num4 = req.getParameter("num4");

            if (!("".equals(num1) && "".equals(num2))) {

                out.println(num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2)) + "\n");
                out.println("<br>");
            }

            if (!("".equals(num3) && "".equals(num4))) {

                out.println(num3 + " * " + num4 + " = " + (Integer.parseInt(num3) * Integer.parseInt(num4)) + "\n");
            }


        } catch (Exception e) {
            out.println("Something is going wrong ...");
        }

        out.println("</font>  </body> </html>" );
    }
}
