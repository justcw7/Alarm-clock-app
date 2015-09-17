package com.example.alarmquiz2;

public class basicHistory
{
    private Question[] group;


    public basicHistory()
    {
        group = new Question[10];
        group[0] =
            new Question(
                "Who sailed the ocean blue in 1492?",
                "Alexander the Great",
                "Vasco da Gama",
                "Christopher Columbus",
                "King Ragnar",
                2);
        group[1] =
            new Question(
                "What empire was split apart at the end of WWI?",
                "The Prussian",
                "The Austrian",
                "The Russian",
                "The Ottoman",
                3);
        group[2] =
            new Question(
                "What year did WWII end?",
                "1942",
                "1946",
                "1948",
                "1945",
                3);
        group[3] =
            new Question(
                "Who's assasination lead to the beginning of WWI?",
                "Abraham Lincoln",
                "Winston Churchill",
                "Archduke Ferdinand",
                "Woodrow Willson",
                2);
        group[4] =
            new Question(
                "What infamous event in American history lead to it's entry into WWII?",
                "Bombing of Pearl Harbor",
                "The sinking of the SS Listanie",
                "Bombing of the U.S.S Maine",
                "There was no such event",
                0);
        group[5] =
            new Question(
                "What battle marked the begining of the end for Napolean's empire?",
                "Iwo Jima",
                "Gettysburg",
                "Waterloo",
                "Stalingrad",
                2);
        group[6] =
            new Question(
                "What was the name of the first human launched satellite?",
                "Kosmos",
                "Athenia",
                "Voyager",
                "Sputnick",
                3);
        group[7] =
            new Question(
                "What marked the turning point for WWII Pacific Campaign?",
                "Battle of Midway",
                "Giant Hurrcaine that crippled the Japenese fleet",
                "cival unrest thoughout Japan",
                "rebel unprising in Korea and China",
                0);
        group[8] =
            new Question(
                "What 'effect' did the American Government use to justify the Vietnam and Korean wars?",
                "Macarthur",
                "Cheerleader",
                "Domino",
                "Iron Curtain",
                2);
        group[9] =
            new Question(
                "What State was founded at the end of WWII as recompense for the genocide that the Jews faced?",
                "Jerusalem",
                "Isreal",
                "Palestine",
                "Kurdistan",
                1);
    }


    public Question[] getGroup()
    {
        return group;
    }

}
