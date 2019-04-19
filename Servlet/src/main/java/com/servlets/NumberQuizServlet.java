package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class NumberQuizServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Quiz quiz;
        // seesion id is object of the Quiz
        if (session.getAttribute("quiz") == null) {
            quiz = new Quiz();
            session.setAttribute("quiz", new Quiz());

        } else {
            String answer = request.getParameter("answer");
            quiz = (Quiz) session.getAttribute("quiz");
            quiz.checkAnswer(answer);
            session.setAttribute("quiz", quiz);
        }
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String question = quiz.getNextQuestion();
        out.println("<h1>The Number Quiz</h1>");
        out.println("<p>Your current score: </p>" + quiz.getScore());
        if (quiz.getNextQuestion() == null) {
            out.println("You have completed the quiz, wiht a score" + quiz.getScore() + " out of " + quiz.getTotalScore());
        } else {
            out.println("Guess the next number in the sequence.");
            out.println(quiz.getNextQuestion());
            out.println("<form action=\"NumberQuiz\" method=\"POST\">");
            out.println("Your answer <input name=\"answer\"/>");
            out.println("<input type=\"submit\" name=\"submit\"/>");
            out.println("</form");
        }


    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
