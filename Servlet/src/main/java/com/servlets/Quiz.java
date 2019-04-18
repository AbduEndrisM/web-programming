package com.servlets;

public class Quiz {

    private static String[] questions={ "3,1,4,1,5", "1,1,2,3,5", "1,4,9,16,25", "2,3,5,7,11", "1,2,4,8,16"};

    private static int[] answers={9,8,36,13,32};

    private int counter=0;
    public void incrementCounter(){
        counter++;
    }
    public void resetCounter(){
        counter=0;
    }
    public int getCounter(){
        return counter;
    }
}
