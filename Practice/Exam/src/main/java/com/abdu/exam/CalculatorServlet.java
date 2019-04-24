package com.abdu.exam;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/claculator")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String op = request.getParameter("operand");

        int x = 0;

        switch (op) {
            case "+":
                x = num1 + num2;
                break;
            case "-":
                x = num1 - num2;
                break;

            case "*":
                x = num1 * num2;
                break;

            case "/":
                x = num1 / num2;
                break;
            default:
                num1 = 0;
                num2 = 0;
        }

        out.println("<html> <head> <body>");
        out.println("<input type='text' value="+num1+" />");
        out.println("<input type='text' value="+op+" />");
        out.println("<input type='text' value="+num2+" />");
        out.println("<input type='text' value="+x+" />");
        out.println("</body> </head> </html>");
    }
}
