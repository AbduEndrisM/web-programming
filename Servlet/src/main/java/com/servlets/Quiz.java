package com.servlets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quiz {

//    private static String[] questions = {"3,1,4,1,5", "1,1,2,3,5", "1,4,9,16,25", "2,3,5,7,11", "1,2,4,8,16"};
//    private static int[] answers = {9, 8, 36, 13, 32};

    List<Question> questionAndAnswer = new ArrayList<Question>();

    Quiz quiz;

    public Quiz() {
        this.questionAndAnswer = Arrays.asList(new Question("3,1,4,1,5", "9"),
                new Question("1,1,2,3,5", "8"),
                new Question("1,4,9,16,25", "36"),
                new Question("2,3,5,7,11", "13"),
                new Question("1,2,4,8,16", "32")

        );

//        this.questionAndAnswer.add(new Question("3,1,4,1,5", "9"));
//        this.questionAndAnswer.add(new Question("1,1,2,3,5","8"));
//        this.questionAndAnswer.add(new Question("1,4,9,16,25","36"));
//        this.questionAndAnswer.add(new Question("2,3,5,7,11","13"));

        Collections.shuffle(questionAndAnswer);
    }


    private int counter = 0;
    private int questionNumber = 0;


    public void checkAnswer(String answer) {
        if (questionAndAnswer.get(questionNumber).getAnswer().equals(answer)) {
            counter++;
        }

    }

    public String getNextQuestion() {
        if (questionNumber >= questionAndAnswer.size()) {
            return null;
        }
        else{
            return questionAndAnswer.get(questionNumber++).getQuestion();
        }
    }

    public int getTotalScore() {
        return this.questionAndAnswer.size();
    }

    public int getScore() {
        return counter;
    }
}
