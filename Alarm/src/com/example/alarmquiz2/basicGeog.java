package com.example.alarmquiz2;

public class basicGeog
{
    private Question[] group;


    public basicGeog()
    {
        group = new Question[10];
        group[0] =
            new Question(
                "What 'Chinese' City used to be a colony of the British empire?",
                "Bejing",
                "Tiawon",
                "Hong Kong",
                "Singapore",
                2);
        group[1] =
            new Question(
                "Who is the number one exporter of oil in the world?",
                "Russia",
                "U.S.A",
                "Iran",
                "Saudi Arabia",
                3);
        group[2] =
            new Question(
                "What country is larger?",
                "Canada",
                "China",
                "U.S.A.",
                "Australia",
                0);
        group[3] =
            new Question(
                "What is the Largest Economic entity in term of G.D.P?",
                "U.S.A",
                "The African League",
                "The European Union",
                "China",
                2);
        group[4] =
            new Question(
                "What country spends the highest percentage of their budget on their military?",
                "North Korea",
                "U.S.A",
                "Iran",
                "Russia",
                0);
        group[5] =
            new Question(
                "What is the approximate elevation of Mt.Everest?",
                "32,000",
                "27,000",
                "29,000",
                "37,000",
                2);
        group[6] =
            new Question(
                "What is the vast majority ethnicity in Iran?",
                "Turkish",
                "Arab",
                "Kurdish",
                "Persian",
                3);
        group[7] =
            new Question(
                "Who is not a member of the U.N.?",
                "Vatican City",
                "North Korea",
                "Iran",
                "Serbia",
                0);
        group[8] =
            new Question(
                "Who is the number one producer of oil?",
                "Russia",
                "Saudi Arabia",
                "U.S.A.",
                "Iran",
                0);
        group[9] =
            new Question(
                "What is the ethnicity of the 'Average' person?",
                "African",
                "Asian",
                "Caucasian",
                "Jewish",
                1);
    }


    public Question[] getGroup()
    {
        return group;
    }

}
