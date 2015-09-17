package com.example.alarmquiz2;

public class basicBiology
{
    private Question[] group;


    public basicBiology()
    {
        group = new Question[10];
        group[0] =
            new Question(
                "Which of these is not like the others?",
                "Spiders",
                "Scorpions",
                "Mites",
                "Flies",
                3);
        group[1] =
            new Question(
                "What is the largest living thing ever to live on this planet?",
                "your mama",
                "Brontisorus",
                "Blue Whale",
                "Megalodon",
                2);
        group[2] =
            new Question(
                "What is ussually refered to as the 'power plant' of the cell?",
                "Nucleus",
                "Ribosomes",
                "Lisosomes",
                "Mitochondria",
                3);
        group[3] =
            new Question(
                "What is a unique feature of plant cells?",
                "Lisosomes",
                "Cell Membrane",
                "Cell Wall",
                "+50 Fire Resistence",
                2);
        group[4] =
            new Question(
                "What species will change their sex if their female mate dies?",
                "Sea horse",
                "Shark",
                "Clown Fish",
                "Puffer Fish",
                2);
        group[5] =
            new Question(
                "What hormone is largly abused by  many Amphetamine?",
                "Testastorone",
                "Globulins",
                "Dopamine",
                "Estrogen",
                2);
        group[6] =
            new Question(
                "What isnt true about the Platypus?",
                "They lay eggs",
                "They are mammals",
                "They are Poisonous",
                "They hunt in packs",
                3);
        group[7] =
            new Question(
                "How many Chromosomes to humans typically have?",
                "46",
                "23",
                "128",
                "17",
                0);
        group[8] =
            new Question(
                "Scorpians are:?",
                "Crustaceans",
                "Insects",
                "Arachnids",
                "Scopios",
                2);
        group[9] =
            new Question(
                "What Cellular Oragan is directly responsible in Programmed cell-death?",
                "Mitochondria",
                "Lisosomes",
                "Ribosomes",
                "TNTisomes",
                1);
    }


    public Question[] getGroup()
    {
        return group;
    }

}
