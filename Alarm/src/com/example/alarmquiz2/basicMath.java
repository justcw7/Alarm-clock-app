package com.example.alarmquiz2;

public class basicMath
{
    private Question[] group;


    public basicMath()
    {
        group = new Question[10];
        group[0] = new Question("51 + 49?", "102", "100", "99", "101", 1);
        group[1] = new Question("23 * 4?", "102", "100", "99", "92", 3);
        group[2] = new Question("2*17?", "42", "38", "28", "34", 3);
        group[3] = new Question("28 + 52?", "84", "88", "80", "78", 2);
        group[4] = new Question("6*3?", "18", "24", "12", "16", 0);
        group[5] = new Question("8*5?", "32", "45", "40", "42", 2);
        group[6] = new Question("2^3?", "4", "2", "16", "8", 3);
        group[7] = new Question("9*3?", "27", "34", "63", "64", 0);
        group[8] = new Question("9+6+3+6?", "17", "23", "24", "29", 2);
        group[9] = new Question("18/2?", "6", "9", "3", "8", 1);
    }


    public Question[] getGroup()
    {
        return group;
    }

}
