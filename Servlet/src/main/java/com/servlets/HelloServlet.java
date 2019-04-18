package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet  {
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        // reading the user input
        String color= req.getParameter("color");
        PrintWriter out = res.getWriter();
        out.println ("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\n" +
                        "<html> \n" +
                        "<head> \n" +
                        "<title> Hello World! </title> \n" +
                        "</head> \n" +

                        "<body> \n" +
                        "<font size=\"12px\" color=\"" + color + "\">" +
                        "Hello World" +
                        "</font> \n" +
                        "</body> \n" +

                        "</html>"
        );
    }
}
