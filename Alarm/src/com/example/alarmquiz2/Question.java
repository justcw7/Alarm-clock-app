package com.example.alarmquiz2;

/**
 * This is a helper class for a alarm quiz app. The question class is designed
 * to hold a question, it's answer and other possible choices.
 *
 * @author Justin Whitt
 * @author Nicholas Kilmer
 * @version Apr 6, 2014
 */
public class Question
{
    private String[] choices;
    private String   question;
    private int      answer;


    public Question()
    {
        choices = new String[4];
        question = "What is the capital of Virginia?";
        answer = 1;
        choices[0] = "Annapolis";
        choices[1] = "Richmond";
        choices[2] = "Washington DC";
        choices[3] = "New York";
    }


    public Question(
        String ques,
        String ans,
        String ans2,
        String ans3,
        String ans4,
        int corr)
    {
        choices = new String[4];
        int set =(int) (Math.random()*4);
        question = ques;
        choices[0] = ans;
        choices[1] = ans2;
        choices[2] = ans3;
        choices[3] = ans4;
        String temp = choices[set];
        choices[set] = choices[corr];
        choices[corr] = temp;
        answer = set;


    }


    public int getAnswer()
    {
        return answer;
    }


    public String getPossible(int x)
    {
        return choices[x];
    }


    public String getQuestion()
    {
        return question;
    }


    public String getFirst()
    {
        return choices[0];
    }


    public String getSecond()
    {
        return choices[1];
    }


    public String getThird()
    {
        return choices[2];
    }


    public String getFourth()
    {
        return choices[3];
    }
}
