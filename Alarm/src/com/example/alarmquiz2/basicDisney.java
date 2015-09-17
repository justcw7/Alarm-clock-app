package com.example.alarmquiz2;

public class basicDisney
{
    private Question[] group;


    public basicDisney()
    {
        group = new Question[10];
        group[0] = new Question("Where is Disney World located?", "Orlando, Florida", "Anaheim, California",
         "Alexandria, Virginia", "Miami, Florida", 0);
        group[1] = new Question("Which princess stars in Sleeping Beauty?", "Snow White", "Cinderella",
        "Aurora", "Ariel", 2);
        group[2] = new Question("Which movie has the song 'Can you feel the love tonight'? ", "The Little Mermaid",
        "The Lion King", "Lion King II", "Sleeping Beatuy", 1);
        group[3] = new Question("How many sisters does Ariel have?", "0", "7", "2", "6", 3);
        group[4] = new Question("What is Stich's experiment number?", "626", "24", "611",
        "He doesn't have a number", 0);
        group[5] = new Question("Which friendship pairing is incorrect?", "Timon and Pumbaa", "Jacques and Gus",
         "Flounder and Flotsam", "Lumiere and Cogsworth", 2);
        group[6] = new Question("What contenent is Simba from?", "North America", "Asia", "Australia", "Africa", 3);
        group[7] = new Question("According to Marry Poppins, what helps the medicine go down?", "Water", "A smile",
         "A spoonful of sugar", "Magic", 2);
        group[8] = new Question("What is the Disney's Logo?", "Mickey Mouse Ears only", "Mickey Mouse",
        "The Cinderella Castle", "Curly Letters", 2);
        group[9] = new Question("What Anastasia's royal family name?", "The Romanovs", "The Buchannans", "The Baskovs",
        "Thacker", 0);
    }


    public Question[] getGroup()
    {
        return group;
    }

}
