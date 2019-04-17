package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.annotation.WebServlet;


//@WebServlet("/calculatorTwo")
public class CalculatorServletTwo extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        PrintWriter out = res.getWriter();
        try {
            res.setContentType("text/html");

            String num1 = req.getParameter("num1");
            String num2 = req.getParameter("num2");
            String num3 = req.getParameter("num3");
            String num4 = req.getParameter("num4");


            if (!("".equals(num1)) && ("".equals(num2))) {
                int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
//                out.println(num1 + " + " + num2 + " = " + Integer.parseInt(num1) + Integer.parseInt(num2));
                out.println("  <input name=\"num1\" value=" + num1 + "> " + " <input name=\"num1\" value=" + num2 + "> +   <input type=\"text\" name=\"result1\" readonly value=" + sum + " >");
            }

            if (!("".equals(num3)) && ("".equals(num4))) {
                out.println(num3 + " + " + num4 + " = " + Integer.parseInt(num3) + Integer.parseInt(num4));
            }


        } catch (Exception e) {
            out.println("Something is going wrong ...");
        }
    }
}
