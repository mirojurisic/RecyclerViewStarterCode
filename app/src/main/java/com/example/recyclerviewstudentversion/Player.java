package com.example.recyclerviewstudentversion;

public class Player
{
    private String name;
    private int age;
    private double worth;
    private String mainSport;
    private int imageResource;

    public Player(String name, int age, double worth, String mainSport, int imageResource)
    {
        this.name = name;
        this.age = age;
        this.worth = worth;
        this.mainSport = mainSport;
        this.imageResource = imageResource;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getWorth()
    {
        return worth;
    }

    public void setWorth(double worth)
    {
        this.worth = worth;
    }

    public String getMainSport()
    {
        return mainSport;
    }

    public void setMainSport(String mainSport)
    {
        this.mainSport = mainSport;
    }

    public int getImageResource()
    {
        return imageResource;
    }

    public void setImageResource(int imageResource)
    {
        this.imageResource = imageResource;
    }
}
