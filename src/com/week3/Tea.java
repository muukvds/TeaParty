package com.week3;

public class Tea {
    String name;
    Boolean sugar;
    Boolean milk;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMilk(Boolean yesPlease) {
        this.milk = yesPlease;
    }

    public Boolean getMilk() {
        return milk;
    }

    public Boolean getSugar() {
        return sugar;
    }

    public void setSugar(Boolean yesPlease) {
        this.sugar = yesPlease;
    }

    public void printTeaContent()
    {
        if(sugar && milk)
        {
            System.out.println("I’d like both milk and sugar please");
        }
        else if(sugar)
        {
            System.out.println("I’d like some sugar, please.");
        }
        else if (milk)
        {
            System.out.println("I’d like some milk, please.");
        }
        else
        {
            System.out.println("No milk nor sugar, please.");
        }
    }
}

