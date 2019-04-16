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
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        double a = Double.parseDouble(req.getParameter("num1"));
        double b = Double.parseDouble(req.getParameter("num2"));
        double c = Double.parseDouble(req.getParameter("num3"));
        double d = Double.parseDouble(req.getParameter("num4"));

        req.setAttribute(Double.toString(a+b), "result1");
        req.setAttribute(Double.toString(c*d), "result2");

    }
}
