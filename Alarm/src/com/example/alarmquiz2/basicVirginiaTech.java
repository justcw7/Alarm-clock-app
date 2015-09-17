package com.example.alarmquiz2;

public class basicVirginiaTech
{
    private Question[] group;


    public basicVirginiaTech()
    {
        group = new Question[10];
        group[0] =
            new Question(
                "What are VT's school colors?",
                "maroon and orange",
                "purple and pink",
                "blue and orange",
                "purple and black",
                0);
        group[1] =
            new Question(
                "What is the VT mascot?",
                "turkey",
                "ostrich",
                "emu",
                "Hokie",
                3);
        group[2] =
            new Question(
                "What is in the center of the VT campus?",
                "Drill Field",
                "Lane Stadium",
                "Mccomas",
                "Surge",
                0);
        group[3] =
            new Question(
                "What is the buffet style dining hall at VT called?",
                "West End",
                "Owens",
                "D2",
                "Lavory",
                2);
        group[4] =
            new Question(
                "What is the name of the VT football stadium?",
                "Castle",
                "Lane",
                "Burress",
                "Lavory",
                1);
        group[5] =
            new Question(
                "What is the name of the VT basketball arena?",
                "Castle",
                "Lane",
                "Burress",
                "Lavory",
                0);
        group[6] =
            new Question(
                "Where can you find Chic-fil-a at VT?",
                "West End",
                "Owens",
                "Hokie Grille",
                "D2",
                2);
        group[7] =
            new Question(
                "Which of the following is not open on saturday?",
                "West End",
                "Owens",
                "Hokie Grille",
                "D2",
                3);
        group[8] =
            new Question(
                "What is the most photographed place on the appalachian trail?",
                "Macafee's Knob",
                "Cascades",
                "Dragon's Tooth",
                "The Highest peak",
                0);
        group[9] =
            new Question(
                "What is the tallest point on the VT campus?",
                "Slusher",
                "AJ",
                "Burress",
                "War Memorial",
                0);
    }


    public Question[] getGroup()
    {
        return group;
    }

}
