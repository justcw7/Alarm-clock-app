package com.example.alarmquiz2;

public class basicTechnology
{
    private Question[] group;


    public basicTechnology()
    {
        group = new Question[10];
        group[0] =
            new Question(
                "What does GUI stand for?",
                "Graphical User Interface",
                "Google Universal Information",
                "Refers to type of brownie",
                "Good Update Index",
                0);
        group[1] =
            new Question(
                "How many bits are there in a byte?",
                "2",
                "1024",
                "8",
                "64",
                2);
        group[2] =
            new Question(
                "Who created Windows?",
                "Steve Jobs",
                "Bill Gates",
                "Barack Obama",
                "Eric Schmidt",
                1);
        group[3] =
            new Question(
                "Which mathematician is the word algorithm named after?",
                "Leonard Algo Euler",
                "Al Gore",
                "al-a¸´warizmi",
                "Agathias Pythagoras",
                2);
        group[4] =
            new Question(
                "What did the first computers use instead of transistors?",
                "Magnetic Cells",
                "Vacuum Tubes",
                "Switch Cables",
                "Constant State Diodes",
                1);
        group[5] =
            new Question(
                "Which mobile OS has the largest market share?",
                "Android",
                "IOS",
                "Windows",
                "Symbian",
                0);
        group[6] =
            new Question(
                "What is the name of the most popular virtual reality goggles?",
                "RealitEE",
                "Logitech Vision",
                "NextGenSee",
                "Oculus Rift",
                3);
        group[7] =
            new Question(
                "What does BIOS stand for?",
                "Basic Input Output System",
                "Block Image Order Standard",
                "Blind Idea Object Sort",
                "Bluetooth Interface Overwrite Slave",
                0);
        group[8] =
            new Question(
                "What system/software was the security bug 'HeartBleed' recently found in?",
                "OpenSSL",
                "OpenBSD",
                "Windows",
                "email",
                0);
        group[9] =
            new Question(
                "Which computer component is responsible for rendering to the screen?",
                "ALU",
                "GPU",
                "Hard Drive",
                "RAM",
                1);
    }


    public Question[] getGroup()
    {
        return group;
    }
}
