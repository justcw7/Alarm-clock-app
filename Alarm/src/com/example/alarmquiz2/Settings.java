package com.example.alarmquiz2;

public class Settings
{
    private static int     needed       = 5;
    private static int     numWrong     = 0;
    private static boolean forFun       = false;
    private static int     highScore    = 0;
    private static int     currentScore = 0;
    private static boolean group1       = true;
    private static boolean group2       = true;
    private static boolean group3       = true;
    private static boolean group4       = true;
    private static boolean group5       = true;
    private static boolean group6       = true;
    private static boolean group7       = true;
    private static boolean group8       = true;
    private static int     numChecked   = 8;
    private static boolean needsUpdate  = false;
    private static boolean alarmOff     = false;
    private static boolean hasGivenUp   = false;
    private static boolean gameWon      = false;


    public Settings()
    {
    }


    public boolean getAlarmOff()
    {
        return alarmOff;
    }




    public void setAlarmOff(boolean x)
    {
        alarmOff = x;
    }


    public int getNeed()
    {
        return needed;
    }


    public void setNeeded(int x)
    {
        needed = x;
    }


    public void setForFun(boolean x)
    {
        forFun = x;
        numWrong = 0;
    }


    public boolean getforFun()
    {
        return forFun;
    }


    public int getHigh()
    {
        return highScore;
    }


    public void setHigh(int x)
    {
        highScore = x;
    }


    public int getCurr()
    {
        return currentScore;
    }


    public void setCurr(int x)
    {
        currentScore = x;
    }


    public boolean getGroup1()
    {
        return group1;
    }


    public void setGroup1(boolean x)
    {
        boolean temp = group1;
        group1 = x;
        needsUpdate = true;
        if (x && x != temp)
        {
            numChecked++;
        }
        else if (!x && x != temp)
        {
            numChecked--;
        }
    }


    public boolean getGroup7()
    {
        return group7;
    }


    public void setGroup7(boolean x)
    {
        boolean temp = group7;
        group7 = x;
        needsUpdate = true;
        if (x && x != temp)
        {
            numChecked++;
        }
        else if (!x && x != temp)
        {
            numChecked--;
        }
    }


    public boolean getGroup8()
    {
        return group8;
    }


    public void setGroup8(boolean x)
    {
        boolean temp = group8;
        group8 = x;
        needsUpdate = true;
        if (x && x != temp)
        {
            numChecked++;
        }
        else if (!x && x != temp)
        {
            numChecked--;
        }
    }


    public void updated()
    {
        needsUpdate = false;
    }


    public boolean getGroup2()
    {
        return group2;
    }


    public void setGroup2(boolean x)
    {
        boolean temp = group2;
        group2 = x;
        needsUpdate = true;
        if (x && x != temp)
        {
            numChecked++;
        }
        else if (!x && x != temp)
        {
            numChecked--;
        }
    }


    public boolean getGroup3()
    {
        return group3;
    }


    public void setGroup3(boolean x)
    {
        boolean temp = group3;
        group3 = x;
        needsUpdate = true;
        if (x && x != temp)
        {
            numChecked++;
        }
        else if (!x && x != temp)
        {
            numChecked--;
        }
    }


    public boolean getGroup4()
    {
        return group4;
    }


    public void setGroup4(boolean x)
    {
        boolean temp = group4;
        group4 = x;
        needsUpdate = true;
        if (x && x != temp)
        {
            numChecked++;
        }
        else if (!x && x != temp)
        {
            numChecked--;
        }
    }


    public boolean getGroup5()
    {
        return group5;
    }


    public void setGroup5(boolean x)
    {
        boolean temp = group5;
        group5 = x;
        needsUpdate = true;
        if (x && x != temp)
        {
            numChecked++;
        }
        else if (!x && x != temp)
        {
            numChecked--;
        }
    }


    public boolean getGroup6()
    {
        return group6;
    }


    public void setGroup6(boolean x)
    {
        boolean temp = group6;
        group6 = x;
        needsUpdate = true;
        if (x && x != temp)
        {
            numChecked++;
        }
        else if (!x && x != temp)
        {
            numChecked--;
        }
    }


    public boolean getUpdate()
    {
        return needsUpdate;
    }


    public int getNum()
    {
        return numChecked;
    }


    public void setGivenUp(boolean x)
    {
        hasGivenUp = x;
    }


    public boolean getGivenUp()
    {
        return hasGivenUp;
    }


    public void setWrong(int x)
    {
        numWrong = x;
    }


    public int getWrong()
    {
        return numWrong;
    }


    public void wrong()
    {
        numWrong++;
    }


    public void setGameWon(boolean a)
    {
        gameWon = a;
    }


    public boolean getGameWon()
    {
        return gameWon;
    }

}
