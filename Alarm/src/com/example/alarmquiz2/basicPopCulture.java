package com.example.alarmquiz2;

public class basicPopCulture
{
    private Question[] group;


    public basicPopCulture()
    {
        group = new Question[10];
        group[0] =
            new Question(
                "Who is the artist behind 'Poker Face'?",
                "Beyonce",
                "Lady Gaga",
                "Justin Bieber",
                "Katy Perry",
                1);
        group[1] =
            new Question(
                "What is the highest grossing movie of all time?",
                "The Dark Night",
                "The Avenger's",
                "Titanic",
                "Avatar",
                3);
        group[2] =
            new Question(
                "What Miley Cyrus music video has become infamous online?",
                "Firework",
                "Timber",
                "Counting Stars",
                "Wrecking ball",
                3);
        group[3] =
            new Question(
                "Who is the current Pope?",
                "John Paul II",
                "Benedict IX",
                "Francis",
                "Mathew V",
                2);
        group[4] =
            new Question(
                "Where will the 2016 Olympics be?",
                "Rio de Janiero",
                "New York City",
                "Berlin",
                "Soeul",
                0);
        group[5] =
            new Question(
                "Who is not from Canada?",
                "Ryan Reynolds",
                "Justin Beiber",
                "Tom Cruise",
                "Seth Rogan",
                2);
        group[6] =
            new Question(
                "Where was most of the Lord of the Rings' Movies shot?",
                "U.S.A.",
                "Austraila",
                "South Africa",
                "New Zealand",
                3);
        group[7] =
            new Question(
                "'With great power comes great _________ '?",
                "responsibility",
                "abs",
                "parties",
                "times",
                0);
        group[8] =
            new Question(
                "Who gifted the United States with the Statue of Liberty?",
                "Britain",
                "Germany",
                "France",
                "U.S.A.",
                2);
        group[9] =
            new Question(
                "What is the best selling video game to date?",
                "Halo 3",
                "Tetris",
                "GTA V",
                "Call of Duty: Black ops 2",
                1);
    }


    public Question[] getGroup()
    {
        return group;
    }
}
